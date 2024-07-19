package com.revature.services;

import com.revature.models.LoginDTO;
import com.revature.models.User;

public class AuthService {

    // Validate login credentials and return User if valid
    public User login(LoginDTO loginDTO) {
        if (loginDTO.getUsername().equals("luis_vazquez") && loginDTO.getPassword().equals("passwordluis")) {
            return new User(11, "luis_vazquez", "passwordluis", "luis@example.com");
        }
        return null;
    }
}
