package com.bridgelabz.addressbookapp.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
public class AddressBookDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid first name")
    private String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid last name")
    private String lastName;

    @Pattern(regexp = "^[0-9]{2} [0-9]{10}$",message = "Invalid phone number")
    private String phoneNo;

    @Email
    private String eMail;
    private String address;
    private String city;
    private String state;
    private String pin;
}
