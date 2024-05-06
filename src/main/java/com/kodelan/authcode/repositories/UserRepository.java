package com.kodelan.authcode.repositories;

import com.kodelan.authcode.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UserRepository extends  JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
