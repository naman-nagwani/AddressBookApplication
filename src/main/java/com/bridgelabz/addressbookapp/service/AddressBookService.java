package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBookData;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.exception.AddressBookExceptionHandler;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookRepository.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int addId) {
        return addressBookRepository.findById(addId).orElseThrow(()->new AddressBookException("Data not found"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addDTO) {
        AddressBookData addData = new AddressBookData(addDTO);
        addressBookRepository.save(addData);
        return addData;
    }

    @Override
    public AddressBookData updateAddressBookData(int addId, AddressBookDTO addDTO) {
        AddressBookData addData = this.getAddressBookDataById(addId);
        addData.updateAddressBookData(addDTO);
        addressBookRepository.save(addData);
        return addData;
    }

    @Override
    public void deleteAddressBookData(int addId) {
        addressBookRepository.deleteById(addId);
    }
}
