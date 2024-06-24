package com.crud.cruddemo.Service.ServiceInterface;

import com.crud.cruddemo.DTO.UserDTO;
import com.crud.cruddemo.Entity.User;

import java.util.List;

public interface UserServiceInterface {

    public List<User> getAllUser();
    public UserDTO getUserById(Long id);
    public UserDTO createUser(UserDTO userDto);
    public UserDTO updateUser(UserDTO userDto, Long id);
    public UserDTO deleteUser(UserDTO userDto);
    public UserDTO deleteAllUser();
    public UserDTO deleteUserById(long id);
}