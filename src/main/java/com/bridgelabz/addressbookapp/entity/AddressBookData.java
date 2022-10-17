package com.bridgelabz.addressbookapp.entity;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;

public class AddressBookData {

    private int addId;
    private String name;
    private String address;

    public AddressBookData() {}

    public AddressBookData(int addId, AddressBookDTO addDTO) {
        this.addId = addId;
        this.name = addDTO.name;
        this.address = addDTO.address;
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
