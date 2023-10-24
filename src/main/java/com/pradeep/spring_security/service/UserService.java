package com.pradeep.spring_security.service;

import com.pradeep.spring_security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();
    public UserService(){
        store.add(
                new User(
                        UUID.randomUUID().toString(),
                        "Pradeep",
                        "pradeep@gmail.com"
                )

        );
        store.add(
                new User(
                        UUID.randomUUID().toString(),
                        "Sohan",
                        "sohan@gmail.com"
                )

        );
        store.add(
                new User(
                        UUID.randomUUID().toString(),
                        "Varun",
                        "varun@gmail.com"
                )

        );
    }

    public List<User> getUsers(){
        return this.store;
    }
}
