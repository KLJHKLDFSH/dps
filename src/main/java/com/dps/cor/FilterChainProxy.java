package com.dps.cor;

import java.util.List;

public interface FilterChainProxy {

    boolean match();

    List<Filter> getFilterList();
}
