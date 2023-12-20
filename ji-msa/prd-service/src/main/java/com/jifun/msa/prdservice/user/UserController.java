package com.jifun.msa.prdservice.user;

import com.jifun.productmaster.TestInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
@Slf4j
public class UserController {
    private final TestInterface testInterface;

    @GetMapping
    public void testController(){
        testInterface.test();
    }

}
