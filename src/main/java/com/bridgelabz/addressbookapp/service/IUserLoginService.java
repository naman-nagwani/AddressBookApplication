package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.DTO.UserLoginDTO;
import com.bridgelabz.addressbookapp.entity.UserLoginData;

public interface IUserLoginService {
    UserLoginData createUserLoginData(UserLoginDTO userLoginDTO);

    String validateUserLoginData(UserLoginDTO loginDTO);
}
