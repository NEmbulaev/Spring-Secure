package com.luxoft.spingsecurity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpperCaseService {

    public String UpperCaseLogin(String str) {
        return str.toUpperCase();
    }
}
