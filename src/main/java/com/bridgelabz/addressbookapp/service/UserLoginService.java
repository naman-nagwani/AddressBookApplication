package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.DTO.UserLoginDTO;
import com.bridgelabz.addressbookapp.entity.UserLoginData;
import com.bridgelabz.addressbookapp.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService implements IUserLoginService{

    @Autowired
    private UserLoginRepository userLoginRepository;

    @Override
    public UserLoginData createUserLoginData(UserLoginDTO userLoginDTO) {
        UserLoginData userLoginData = new UserLoginData(userLoginDTO);
        userLoginRepository.save(userLoginData);
        return userLoginData;
    }

    @Override
    public String validateUserLoginData(UserLoginDTO loginDTO) {
        UserLoginData userLoginData = userLoginRepository.findUserLoginDataByEMail(loginDTO.getEMail());
        String message;
        if (userLoginData==null)
            message = "Login error : Not a valid email";
        else if (userLoginData.getPassword().equals(loginDTO.getPassword())){
            message = "Login Successful";
        } else
            message = "Login error : enter a valid password";
        return message;
    }
}
