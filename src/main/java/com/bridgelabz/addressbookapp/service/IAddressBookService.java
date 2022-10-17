package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBookData;

import java.util.List;

public interface IAddressBookService {

    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById();

    AddressBookData createAddressBookData(AddressBookDTO addDTO);

    AddressBookData updateAddressBookData(AddressBookDTO addDTO);

    void deleteAddressBookData(int addId);

}
