package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{
    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addList = new ArrayList<>();
        addList.add(new AddressBookData(1,new AddressBookDTO("Naman","Jagdalpur")));
        return addList;
    }

    @Override
    public AddressBookData getAddressBookDataById() {
        AddressBookData addData = new AddressBookData(1,new AddressBookDTO("Naman","Jagdalpur"));
        return addData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addDTO) {
        AddressBookData addData = new AddressBookData(1,addDTO);
        return addData;
    }

    @Override
    public AddressBookData updateAddressBookData(AddressBookDTO addDTO) {
        AddressBookData addData = new AddressBookData(1,addDTO);
        return addData;
    }

    @Override
    public void deleteAddressBookData(int addId) {

    }
}
