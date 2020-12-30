package com.pinnoocle.weshare.event;

public class GoodsSearchEvent {
    private String searchName;

    public GoodsSearchEvent(String searchName) {
        this.searchName = searchName;
    }

    public String getSearchName() {
        return searchName;
    }
}
