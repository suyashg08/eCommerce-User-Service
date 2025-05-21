package com.example.ecommerceuser1.security.models;

import com.example.ecommerceuser1.models.Role;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.security.core.GrantedAuthority;

@JsonDeserialize
public class CustomGrantedAuthority implements GrantedAuthority {

    String authority;

    public CustomGrantedAuthority() {}

    public CustomGrantedAuthority(Role role) {
        this.authority = role.getValue();
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
