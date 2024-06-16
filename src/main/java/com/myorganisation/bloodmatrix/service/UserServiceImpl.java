package com.myorganisation.bloodmatrix.service;

import com.myorganisation.bloodmatrix.dto.UserReq;
import com.myorganisation.bloodmatrix.dto.UserRes;
import com.myorganisation.bloodmatrix.model.User;
import com.myorganisation.bloodmatrix.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserRes addUser(UserReq userReq) {

        User user = new User();
        user.setName(userReq.getName());
        user.setAddress(userReq.getAddress());
        user.setAge(userReq.getAge());
        user.setPhone(userReq.getPhone());
        user.setEmail(userReq.getEmail());
        user.setSex(userReq.getSex());
        user.setTest(userReq.getTest());

        User savedUser = userRepo.save(user);

        UserRes registeredUser = new UserRes();
        registeredUser.setId(savedUser.getId());
        registeredUser.setName(savedUser.getName());
        registeredUser.setAddress(savedUser.getAddress());
        registeredUser.setAge(savedUser.getAge());
        registeredUser.setPhone(savedUser.getPhone());
        registeredUser.setEmail(savedUser.getEmail());
        registeredUser.setSex(savedUser.getSex());
        registeredUser.setTest(savedUser.getTest());

        return registeredUser;
    }

}
