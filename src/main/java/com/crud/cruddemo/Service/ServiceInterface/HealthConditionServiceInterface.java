package com.crud.cruddemo.Service.ServiceInterface;

import com.crud.cruddemo.DTO.HealthConditionDTO;
import com.crud.cruddemo.DTO.UserDTO;
import com.crud.cruddemo.Entity.HealthCondition;
import com.crud.cruddemo.Entity.User;

import java.util.List;

public interface HealthConditionServiceInterface {

//    public List<HealthCondition> getAllHealthCondition();
    public HealthConditionDTO getHealthConditionByUserId(Long user_id);
    public HealthConditionDTO getHealthConditionByHealthId(Long health_id);
    public HealthConditionDTO createHealthCondition(HealthConditionDTO healthConditionDto);
    public HealthConditionDTO updateHealthCondition(HealthConditionDTO HealthConditionDto, Long health_id);
    public HealthConditionDTO deleteHealthCondition(UserDTO userDto);
    public HealthConditionDTO deleteAllHealthCondition();
    public HealthConditionDTO deleteHealthConditionByUserId(Long user_id);
    public HealthConditionDTO deleteHealthConditionByHealthId(Long health_id);
}