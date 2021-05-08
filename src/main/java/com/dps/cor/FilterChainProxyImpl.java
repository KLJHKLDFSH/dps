package com.dps.cor;

import java.util.List;

public class FilterChainProxyImpl implements FilterChainProxy{

    private List<FilterChain> filterChainList;

    @Override
    public boolean match() {
        return false;
    }

    @Override
    public List<Filter> getFilterList() {
        return null;
    }

}
