package com.pinnoocle.weshare.event;

public class PriceSortEvent {
    public String getSort() {
        return sort;
    }

    String sort;
    public PriceSortEvent(boolean priceFlag) {
        if(priceFlag){
            sort = "price "+"asc";
        }else {
            sort = "price "+"desc";
        }
    }
}
