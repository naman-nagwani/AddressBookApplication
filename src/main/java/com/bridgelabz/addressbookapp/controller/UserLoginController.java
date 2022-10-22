package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.DTO.ResponseDTO;
import com.bridgelabz.addressbookapp.DTO.UserLoginDTO;
import com.bridgelabz.addressbookapp.entity.UserLoginData;
import com.bridgelabz.addressbookapp.service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/userloginservice")
public class UserLoginController {
    @Autowired
    private IUserLoginService userLoginService;


    @PostMapping("/registration")
    public ResponseEntity<ResponseDTO> addUserLoginData(@Valid @RequestBody UserLoginDTO userLoginDTO) {
        UserLoginData userLoginData  = userLoginService.createUserLoginData(userLoginDTO);
        ResponseDTO respDTO = new ResponseDTO("Created User Login Data Successfully", userLoginData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseDTO> userLogin(@RequestBody UserLoginDTO loginDTO) {
        String message  = userLoginService.validateUserLoginData(loginDTO);
        ResponseDTO respDTO = new ResponseDTO(message, loginDTO);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }


}
