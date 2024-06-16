package com.myorganisation.bloodmatrix.service;

import com.myorganisation.bloodmatrix.dto.UserReq;
import com.myorganisation.bloodmatrix.dto.UserRes;

public interface UserService {
    UserRes addUser(UserReq userReq);
}
