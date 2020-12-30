package com.pinnoocle.weshare.event;

public class OrderSearchEvent {
    public String getSearchName() {
        return searchName;
    }

    private String searchName;

    public OrderSearchEvent(String searchName) {
        this.searchName = searchName;
    }
}
