package com.example.demo.behavioral.chainOfResponsibility;

public class PosotiveFilter extends Filter{

    public PosotiveFilter(Filter filter) {
        super(filter);
    }

    @Override
    public int process(int number) {
        if(number > 0)
        {
            System.out.println("Positive filter is applied.");
            return 1;
        }
        return super.process(number);
    }
}
