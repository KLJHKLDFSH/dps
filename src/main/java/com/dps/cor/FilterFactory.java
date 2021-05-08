package com.dps.cor;

public class FilterFactory {

    public Filter factory(String flag){
        return new Filter() {
            @Override
            public void init() {
                System.out.println("生成一个Filter");
            }

            @Override
            public void doFilter(Event event, FilterChain filterChain) {

            }
        };
    }

}
