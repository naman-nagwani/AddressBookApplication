package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.entity.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{

    private List<AddressBookData> addressBookDataList = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int addId) {
        AddressBookData addData = addressBookDataList.get(addId-1);
        return addData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addDTO) {
        AddressBookData addData = new AddressBookData(addressBookDataList.size()+1,addDTO);
        addressBookDataList.add(addData);
        return addData;
    }

    @Override
    public AddressBookData updateAddressBookData(int addId, AddressBookDTO addDTO) {
        AddressBookData addData = this.getAddressBookDataById(addId);
        addData.setName(addDTO.name);
        addData.setAddress(addDTO.address);
        addressBookDataList.set(addId-1,addData);
        return addData;
    }

    @Override
    public void deleteAddressBookData(int addId) {
        addressBookDataList.remove(addId-1);
    }
}
