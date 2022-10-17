package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.DTO.ResponseDTO;
import com.bridgelabz.addressbookapp.entity.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping(value = {"","/" ,"/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData addData = new AddressBookData(1, new AddressBookDTO("Naman", "Bastar"));
        ResponseDTO respDTO = new ResponseDTO("Get Call Successfull", addData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{addId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("addId") int addId) {
        AddressBookData addData = new AddressBookData(1, new AddressBookDTO("Naman", "Jagdalpur"));
        ResponseDTO respDT0 = new ResponseDTO("Get Call For ID Successful", addData);
        return new ResponseEntity<ResponseDTO>(respDT0, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody AddressBookDTO addDT0) {
        AddressBookData addData  = new AddressBookData(1, addDT0);
        ResponseDTO respDTO = new ResponseDTO("Created Address Book Data Successfully", addData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody AddressBookDTO addDTO) {
        AddressBookData addData = new AddressBookData(1, addDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Address Book Data Successfully", addData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("addId") int addId) {
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted id: " + addId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
