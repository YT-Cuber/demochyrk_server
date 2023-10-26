package com.expchyrk.demochyrk;

import com.expchyrk.demochyrk.model.User;
import com.expchyrk.demochyrk.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepo repo;

    @PostMapping("/adduser")
    public void addUser(@RequestBody User users){
        User save = repo.save(users);
    }

}
