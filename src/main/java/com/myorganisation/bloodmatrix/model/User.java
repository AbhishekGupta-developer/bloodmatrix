package com.myorganisation.bloodmatrix.model;

import com.myorganisation.bloodmatrix.enums.Sex;
import com.myorganisation.bloodmatrix.enums.TestType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String address;
    private Integer age;
    private String phone;
    private String email;

    @Enumerated(EnumType.STRING)
    private Sex sex;
    @Enumerated(EnumType.STRING)
    private TestType test;
}
