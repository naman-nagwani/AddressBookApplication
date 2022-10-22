package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBookData;

import java.util.List;

public interface IAddressBookService {

    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int addId);

    AddressBookData createAddressBookData(AddressBookDTO addDTO);

    AddressBookData updateAddressBookData(int addId, AddressBookDTO addDTO);

    void deleteAddressBookData(int addId);

    List<AddressBookData> getAddressBookDataOrderByCity();
}
