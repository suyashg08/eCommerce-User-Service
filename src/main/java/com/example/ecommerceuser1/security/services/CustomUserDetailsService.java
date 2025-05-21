package com.example.ecommerceuser1.security.services;

import com.example.ecommerceuser1.models.User;
import com.example.ecommerceuser1.repositories.UserRepository;
import com.example.ecommerceuser1.security.models.CustomUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User>  optionalUser = userRepository.findByEmail(username);

        if(optionalUser.isEmpty()) {
             throw new UsernameNotFoundException("User not found");
        }

        User user = optionalUser.get();

        return new CustomUserDetails(user);


    }
}
