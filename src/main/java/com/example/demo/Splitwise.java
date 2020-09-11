package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Splitwise {
    public static void main(String[] args) {
        User user1 = new User("1", "Aman");
        User user2 = new User("2", "Bharat");
        User user3 = new User("3", "Shivam");

        Context context = new Context(new EqualShareStrategy());
        context.split(Double.valueOf(20000), user2, Arrays.asList(user1, user3), null);

        user1.showAllBorrower();
        user2.showAllBorrower();
        user3.showAllBorrower();
        user1.showBorrowerWithId(user2);
    }
}

class User {
    private final String user_id;
    private final String user_name;
    private Map<User, Double> userWithMonies;

    public User(String user_id, String user_name) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.userWithMonies = new HashMap<>();
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public Map<User, Double> getUserWithMonies() {
        return userWithMonies;
    }

    public void showAllBorrower()
    {
        Map<User, Double> borrowers = this.getUserWithMonies();
        if(borrowers.isEmpty())
        {
            System.out.println("No borrower for : " + this.getUser_name());
            return;
        }
        System.out.println("Borrower for : " + this.getUser_name());
        for(Map.Entry<User, Double> user: borrowers.entrySet())
        {
            System.out.println(user.getKey().getUser_name() + " : " + user.getValue());
        }

    }

    public void showBorrowerWithId(User user)
    {
        Map<User, Double> borrowers = this.getUserWithMonies();
        if(borrowers.get(user) == null)
        {
            System.out.println("No money left for : " + user.getUser_name());
        }
        else
        {
            System.out.println("Left money for : " + user.getUser_name() + " : " + borrowers.get(user));
        }
        return;
    }
}

interface Strategy {
    public void execute(Double amount, User payer, List<User> users, List<Double> sharePortion);
}

class EqualShareStrategy implements Strategy {
    @Override
    public void execute(Double amount, User payer, List<User> users, List<Double> sharePortion) {
        Map<User, Double> userWithMonies = payer.getUserWithMonies();
        int size = users.size();
        Double share = amount/size;
        for(User user: users)
        {
            if(userWithMonies.get(user) == null)
            {
                userWithMonies.put(user, share);
            }
            else
            {
                Double money = userWithMonies.get(user);
                userWithMonies.put(user, money + share);
            }
        }
        return;
    }
}

class ExactShareStrategy implements Strategy {
    @Override
    public void execute(Double amount, User payer, List<User> users, List<Double> sharePortion) {
        Map<User, Double> userWithMonies = payer.getUserWithMonies();
        for(int i=0;i<users.size();i++)
        {
            if(userWithMonies.get(users.get(i)) == null)
            {
                userWithMonies.put(users.get(i), sharePortion.get(i));
            }
            else
            {
                Double money = userWithMonies.get(users.get(i));
                userWithMonies.put(users.get(i), money + sharePortion.get(i));
            }
        }
        return;
    }
}

class PercentageShareStrategy implements Strategy {
    @Override
    public void execute(Double amount, User payer, List<User> users, List<Double> sharePortion) {
        Map<User, Double> userWithMonies = payer.getUserWithMonies();
        for(int i=0;i<users.size();i++)
        {
            Double share = (sharePortion.get(i)*amount)/100;
            if(userWithMonies.get(users.get(i)) == null)
            {
                userWithMonies.put(users.get(i), share);
            }
            else
            {
                Double money = userWithMonies.get(users.get(i));
                userWithMonies.put(users.get(i), money + share);
            }
        }
        return;
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void split(Double amount, User payer, List<User> users, List<Double> sharePortion)
    {
        this.strategy.execute(amount, payer, users, sharePortion);
    }
}