package com.example.demo.behavioral.chainOfResponsibility;

abstract class Filter {
    private Filter nextFilter;

    public Filter(Filter filter)
    {
        this.nextFilter = filter;
    }

    public int process(int number) {
        if(nextFilter != null)
            return nextFilter.process(number);
        return Integer.MAX_VALUE;
    }
}

