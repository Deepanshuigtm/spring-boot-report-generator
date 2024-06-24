package com.crud.cruddemo.Controller;

import com.crud.cruddemo.DTO.UserDTO;
import com.crud.cruddemo.Entity.User;
import com.crud.cruddemo.Mapper.UserMapper;
import com.crud.cruddemo.Repository.UserRepo;
import com.crud.cruddemo.Service.ServiceInterfaceImpl.UserServiceImplementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {

    private UserMapper userMapper;
    private UserRepo userRepo;
    @Autowired
    private UserServiceImplementer userServiceImplementer;

    private List<User> users ;

    @GetMapping("/get-users")
    public List<User> getAllUser(){
        List<User> users = userServiceImplementer.getAllUser();

        return users;
    }

    @PostMapping("/create-user")
    public UserDTO createUser(@RequestBody UserDTO userDto){
        return userServiceImplementer.createUser(userDto);
    }

    @PutMapping("/update-user")
    public UserDTO updateUser(UserDTO userDto, Long id){
        System.out.println(userDto.getUserName());
        System.out.println(userDto);
        return userServiceImplementer.updateUser(userDto, id);
    }


    @GetMapping("/get-users/{Id}")
    public UserDTO getUserById(@PathVariable Long Id){
        return userServiceImplementer.getUserById(Id);
    }

}
