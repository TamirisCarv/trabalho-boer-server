package com.server.trabalhoboer.controller;

import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public class LoginController {
    
    @PostMapping
    public void redirectToClient(@RequestBody MultiValueMap<String, String> formData, HttpServletResponse response) {
       // response.setHeader("Location", "https://appdashboard-ybv0.onrender.com/#/login?token=" + formData.getFirst("credential"));
       response.setHeader("Location", "http://localhost:3000/cadastro?token=" + formData.getFirst("credential"));
        response.setStatus(302);
    }

}
