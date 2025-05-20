package com.example.ecommerceuser1.services;

import com.example.ecommerceuser1.models.Token;
import com.example.ecommerceuser1.models.User;

public interface UserService {

    User signup(String name, String email, String password);

    Token login(String email, String password);

    void logout(String tokenValue);

    User validateToken(String token);
}
