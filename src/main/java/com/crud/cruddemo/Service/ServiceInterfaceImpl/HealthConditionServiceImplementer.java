package com.crud.cruddemo.Service.ServiceInterfaceImpl;

import com.crud.cruddemo.Controller.UserNotFoundException;
import com.crud.cruddemo.DTO.HealthConditionDTO;
import com.crud.cruddemo.DTO.UserDTO;
import com.crud.cruddemo.Entity.HealthCondition;
import com.crud.cruddemo.Entity.User;
import com.crud.cruddemo.Mapper.HealthConditionMapper;
import com.crud.cruddemo.Mapper.UserMapper;
import com.crud.cruddemo.Repository.HealthConditionRepo;
import com.crud.cruddemo.Repository.UserRepo;
import com.crud.cruddemo.Service.ServiceInterface.HealthConditionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class HealthConditionServiceImplementer implements HealthConditionServiceInterface {
    @Autowired
    private HealthConditionMapper healthMapper;
    @Autowired
    private HealthConditionRepo healthRepo;

    @Override
    public HealthConditionDTO getHealthConditionByUserId(Long user_id) {
        return null;
    }

    @Override
    public HealthConditionDTO getHealthConditionByHealthId(Long health_id) {
        HealthCondition existingHealth = healthRepo.findById(health_id).orElseThrow(
                ()->new UserNotFoundException("User Not Found"+health_id)
        );

        HealthConditionDTO res = healthMapper.healthConditionToHealthConditionDTO(existingHealth);

        return res;

    }

    @Override
    public HealthConditionDTO createHealthCondition(HealthConditionDTO healthConditionDto) {
        HealthCondition healthCondition = healthMapper.healthConditionDTOToHealthCondition(healthConditionDto);

        HealthCondition saveHealth =healthRepo.save(healthCondition);
        return healthMapper.healthConditionToHealthConditionDTO(saveHealth);
    }

    @Override
    public HealthConditionDTO updateHealthCondition(HealthConditionDTO HealthConditionDto, Long health_id) {
        return null;
    }

    @Override
    public HealthConditionDTO deleteHealthCondition(UserDTO userDto) {
        return null;
    }

    @Override
    public HealthConditionDTO deleteAllHealthCondition() {
        return null;
    }

    @Override
    public HealthConditionDTO deleteHealthConditionByUserId(Long user_id) {
        return null;
    }

    @Override
    public HealthConditionDTO deleteHealthConditionByHealthId(Long health_id) {
        return null;
    }
}
