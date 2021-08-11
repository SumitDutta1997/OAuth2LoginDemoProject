package com.gfg.Oauth2_Login_Demo_Project;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/secured")
    public String secured(Authentication authentication) {
        return "To see this text you need to be logged in.";
    }
}
