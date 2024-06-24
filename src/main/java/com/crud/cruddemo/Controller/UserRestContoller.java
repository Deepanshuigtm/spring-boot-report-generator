package com.crud.cruddemo.Controller;

import com.crud.cruddemo.Entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserRestContoller {
    private List<User> list ;

    @PostConstruct
    public void loadData(){

        list = new ArrayList<>();
//
//        list.add(new User(2,"2207deep","123","2207deepanshu@gmail.com","deepanshu","singh",22072004,"male"));
//        list.add(new User(1,"00teep","123","002deepanshu@gmail.com","Picachu","rion",22072004,"male"));
    }

    @GetMapping("users")
    public List<User> getUser(){
        return list;
    }

    @GetMapping("users/{userId}")
    public User getUserById(@PathVariable int userId){

        if ((userId >= list.size()) || (userId < 0)){
            throw new UserNotFoundException("user not found - " + userId);
        }
        return list.get(userId);
    }
}
