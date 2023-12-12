package com.example.productmaster;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Test implements TestInterface{

    public void test(){
        System.out.println("domain test");
    }
}
