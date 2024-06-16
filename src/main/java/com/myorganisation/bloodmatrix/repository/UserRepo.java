package com.myorganisation.bloodmatrix.repository;

import com.myorganisation.bloodmatrix.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
