package com.pinnoocle.weshare.bean;

import java.io.Serializable;

public class AddressBean implements Serializable {
    String name;
    String phone;
    String address;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public AddressBean(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
}
