package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.DTO.ResponseDTO;
import com.bridgelabz.addressbookapp.entity.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @RequestMapping(value = {"","/" ,"/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> addDataList = addressBookService.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Successfull", addDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{addId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("addId") int addId) {
        AddressBookData addData = addressBookService.getAddressBookDataById();
        ResponseDTO respDT0 = new ResponseDTO("Get Call For ID Successful", addData);
        return new ResponseEntity<ResponseDTO>(respDT0, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody AddressBookDTO addDT0) {
        AddressBookData addData  = addressBookService.createAddressBookData(addDT0);
        ResponseDTO respDTO = new ResponseDTO("Created Address Book Data Successfully", addData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody AddressBookDTO addDTO) {
        AddressBookData addData = addressBookService.updateAddressBookData(addDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Address Book Data Successfully", addData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("addId") int addId) {
        addressBookService.deleteAddressBookData(addId);
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted id: " + addId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
