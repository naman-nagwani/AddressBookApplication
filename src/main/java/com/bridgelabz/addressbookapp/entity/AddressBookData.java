package com.bridgelabz.addressbookapp.entity;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "address_book")
public class AddressBookData {

    @Id
    @GeneratedValue
    @Column(name = "address_id")
    private int addId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    private String phoneNo;
    private String eMail;
    private String address;
    private String city;
    private String state;
    private String pin;


    public AddressBookData(AddressBookDTO addDTO) {
        this.firstName = addDTO.getFirstName();
        this.lastName = addDTO.getLastName();
        this.phoneNo = addDTO.getPhoneNo();
        this.eMail = addDTO.getEMail();
        this.address = addDTO.getAddress();
        this.city = addDTO.getCity();
        this.state = addDTO.getState();
        this.pin = addDTO.getPin();
    }

    public void updateAddressBookData(AddressBookDTO addDTO) {
        this.firstName = addDTO.getFirstName();
        this.lastName = addDTO.getLastName();
        this.phoneNo = addDTO.getPhoneNo();
        this.eMail = addDTO.getEMail();
        this.address = addDTO.getAddress();
        this.city = addDTO.getCity();
        this.state = addDTO.getState();
        this.pin = addDTO.getPin();
    }
}
