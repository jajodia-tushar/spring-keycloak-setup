package com.keycloak.org.springkeycloaksetup.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/free")
    @PreAuthorize("hasAuthority('SCOPE_email')")
    public String getPublicContent(){
        return "Free Content";
    }

    @GetMapping("/paid")
    public String getPaidContent(){
        return "Paid Content";
    }
}
