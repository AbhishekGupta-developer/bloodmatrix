package com.myorganisation.bloodmatrix.dto;

import com.myorganisation.bloodmatrix.enums.Sex;
import com.myorganisation.bloodmatrix.enums.TestType;
import lombok.Data;

@Data
public class UserReq {
    private String name;
    private String address;
    private Integer age;
    private String phone;
    private String email;
    private Sex sex;
    private TestType test;
}
