package com.sl.rowset;

import javax.sql.RowSet;
import javax.sql.rowset.Predicate;

class PriceFilter implements Predicate {

    private final float minPrice;

    public PriceFilter(float minPrice) {
        this.minPrice = minPrice;
    }

    @Override
    public boolean evaluate(RowSet rs) {
        try {
            return rs.getFloat("price") > minPrice;
        } catch (Exception e) {
            return false;
        }
    }

    // Required but not used in most cases
    @Override
    public boolean evaluate(Object value, int column) {
        return true;
    }

    @Override
    public boolean evaluate(Object value, String columnName) {
        return true;
    }
}
