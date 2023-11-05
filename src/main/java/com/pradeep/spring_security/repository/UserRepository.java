package com.pradeep.spring_security.repository;

import com.pradeep.spring_security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    public Optional<User> findByEmail(String email);

}
