package com.dps.cor;

public interface Filter {

    public default void init(){}

    void doFilter(Event event, FilterChain filterChain);

    public default void destroy(){}
}
