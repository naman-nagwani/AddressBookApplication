package com.bridgelabz.addressbookapp.entity;

import com.bridgelabz.addressbookapp.DTO.UserLoginDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_login")
public class UserLoginData {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String eMail;

    @Column(name = "password")
    private String password;

    public UserLoginData(UserLoginDTO userLoginDTO) {
        this.userName = userLoginDTO.getUsername();
        this.eMail = userLoginDTO.getEMail();
        this.password = userLoginDTO.getPassword();
    }
}
