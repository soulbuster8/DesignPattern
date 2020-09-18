package com.example.demo.behavioral.chainOfResponsibility;

class NegativeFilter extends Filter {

    public NegativeFilter(Filter filter) {
        super(filter);
    }

    @Override
    public int process(int number) {
        if (number < 0)
        {
            System.out.println("Negative filter is applied.");
            return -1;
        }
        return super.process(number);
    }
}
