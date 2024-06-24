package com.crud.cruddemo.Service.ServiceInterfaceImpl;

import com.crud.cruddemo.Controller.UserNotFoundException;
import com.crud.cruddemo.DTO.UserDTO;
import com.crud.cruddemo.Entity.User;
import com.crud.cruddemo.Mapper.UserMapper;
import com.crud.cruddemo.Repository.UserRepo;
import com.crud.cruddemo.Service.ServiceInterface.UserServiceInterface;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementer implements UserServiceInterface {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRepo userRepo;


    @Override
    public List<User> getAllUser() {

        List<User> users = userRepo.findAll();
        return users;
    }

    @Override
    public UserDTO getUserById(Long id) {
        User existingUser = userRepo.findById(id).orElseThrow(
                ()->new UserNotFoundException("User Not Found"+id)
        );

        UserDTO ans = userMapper.userToUserDTO(existingUser);

        System.out.println(ans.getId());
        return ans;
    }

    @Override
    public UserDTO createUser(UserDTO userDto) {

        User user = userMapper.userDTOToUser(userDto);
        User saveduser=userRepo.save(user);
        return userMapper.userToUserDTO(saveduser);
    }

    @Override
    public UserDTO updateUser(UserDTO userDto, Long id) {


        Optional<User> existingUser = userRepo.findById(id);
        if (existingUser.isPresent()) {
            User updatedUser = userMapper.userDTOToUser(userDto);
           // updatedUser.setId(userDto.getId());
            updatedUser.setUserName(userDto.getUserName());
            updatedUser.setEmail(userDto.getEmail());
            updatedUser.setPassword(userDto.getPassword());
            updatedUser.setFirstName(userDto.getFirstName());
            updatedUser.setLastName(userDto.getLastName());
            updatedUser.setDate_of_birth(userDto.getDate_of_birth());
            updatedUser.setGender(userDto.getGender());
            userRepo.save(updatedUser);

            return userMapper.userToUserDTO(updatedUser);

        }else {

            throw new IllegalArgumentException("User Does Not Exist");

        }
    }

    @Override
    public UserDTO deleteUser(UserDTO userDto) {

//        User deleteUser = userMapper.ma
        return null;
    }

    @Override
    public UserDTO deleteAllUser() {
        return null;
    }

    @Override
    public UserDTO deleteUserById(long id) {
        return null;
    }
}
