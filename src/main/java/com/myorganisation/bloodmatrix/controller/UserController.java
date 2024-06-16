package com.myorganisation.bloodmatrix.controller;

import com.myorganisation.bloodmatrix.dto.UserReq;
import com.myorganisation.bloodmatrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody UserReq userReq) {
        return new ResponseEntity<>(userService.addUser(userReq), HttpStatusCode.valueOf(201));
    }
}
