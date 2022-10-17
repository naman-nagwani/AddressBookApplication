package com.bridgelabz.addressbookapp.DTO;

public class AddressBookDTO {

    public String name;
    public String address;

    public AddressBookDTO(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}