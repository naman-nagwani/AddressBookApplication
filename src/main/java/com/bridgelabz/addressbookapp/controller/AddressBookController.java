package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapp.DTO.ResponseDTO;
import com.bridgelabz.addressbookapp.entity.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @RequestMapping(value = {"","/" ,"/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> addDataList = addressBookService.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful", addDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{addId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("addId") int addId) {
        AddressBookData addData = addressBookService.getAddressBookDataById(addId);
        ResponseDTO respDT0 = new ResponseDTO("Get Call For ID Successful", addData);
        return new ResponseEntity<ResponseDTO>(respDT0, HttpStatus.OK);
    }

    @GetMapping("/city")
    public ResponseEntity<ResponseDTO> getAddressBookDataOrderByCity() {
        List<AddressBookData> addDataList = addressBookService.getAddressBookDataOrderByCity();
        ResponseDTO respDTO = new ResponseDTO("Get call order by city successful",addDataList);
        return new ResponseEntity<>(respDTO,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@Valid @RequestBody AddressBookDTO addDT0) {
        AddressBookData addData  = addressBookService.createAddressBookData(addDT0);
        ResponseDTO respDTO = new ResponseDTO("Created Address Book Data Successfully", addData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{addId}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("addId") int addId,
            @Valid @RequestBody AddressBookDTO addDTO) {
        AddressBookData addData = addressBookService.updateAddressBookData(addId,addDTO);
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
