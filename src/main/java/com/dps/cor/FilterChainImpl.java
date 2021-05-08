package com.dps.cor;

import java.util.List;

public class FilterChainImpl implements FilterChain{

    private final FilterChain originalChain;

    private final List<Filter> additionalFilters;
    private final int size;

    private int currentPosition = 0;

    private FilterChainImpl(FilterChain originalChain, List<Filter> additionalFilters) {
        this.originalChain = originalChain;
        this.additionalFilters = additionalFilters;
        this.size = additionalFilters.size();
    }

    @Override
    public void doFilter(Event event) {

        if (this.currentPosition == this.size) {
            this.originalChain.doFilter(event);
            return;
        }
        this.currentPosition++;
        Filter nextFilter = this.additionalFilters.get(this.currentPosition - 1);
        nextFilter.doFilter(event, this);
    }
}
