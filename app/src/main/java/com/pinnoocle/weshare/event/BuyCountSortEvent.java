package com.pinnoocle.weshare.event;

public class BuyCountSortEvent {
    public String getSort() {
        return sort;
    }

    String sort;
    public BuyCountSortEvent(boolean countFlag) {
        if(countFlag){
            sort = "buy_count "+"asc";
        }else {
            sort = "buy_count "+"desc";
        }
    }
}
