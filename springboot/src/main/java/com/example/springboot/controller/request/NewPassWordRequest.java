package com.example.springboot.controller.request;

import lombok.Data;

@Data
public class NewPassWordRequest {
    private String username;
    private String password;
    private String newPass;
}
