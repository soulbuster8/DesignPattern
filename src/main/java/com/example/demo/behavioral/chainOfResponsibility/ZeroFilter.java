package com.example.demo.behavioral.chainOfResponsibility;

public class ZeroFilter extends Filter {

    public ZeroFilter(Filter filter) {
        super(filter);
    }

    @Override
    public int process(int number) {

        if (number == 0)
        {
            System.out.println("Zero filter is applied.");
            return 0;
        }
        return super.process(number);
    }
}
