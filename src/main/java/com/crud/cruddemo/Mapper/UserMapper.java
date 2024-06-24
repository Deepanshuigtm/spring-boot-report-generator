package com.crud.cruddemo.Mapper;

import com.crud.cruddemo.DTO.UserDTO;
import com.crud.cruddemo.Entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    @Autowired
    private ModelMapper modelMapper;

    public User userDTOToUser(UserDTO userDTO){
        User user = modelMapper.map(userDTO, User.class);

        return user;
    }

    public UserDTO userToUserDTO(User user){
        UserDTO userDto = modelMapper.map(user, UserDTO.class);

        return userDto;
    }
}
