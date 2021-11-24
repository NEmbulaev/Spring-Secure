package com.luxoft.spingsecurity.rest;

import com.luxoft.spingsecurity.dto.UserDto;
import com.luxoft.spingsecurity.service.UpperCaseService;
import com.luxoft.spingsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserUpperCaseController {
    private final UserService userService;
    private final UpperCaseService upperCaseService;

    @GetMapping("/upper")
    public String Upper(String login) {
        return upperCaseService.UpperCaseLogin(login);
    }


}
