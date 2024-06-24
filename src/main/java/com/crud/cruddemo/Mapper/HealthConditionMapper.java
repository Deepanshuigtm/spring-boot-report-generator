package com.crud.cruddemo.Mapper;

import com.crud.cruddemo.DTO.HealthConditionDTO;
import com.crud.cruddemo.DTO.UserDTO;
import com.crud.cruddemo.Entity.HealthCondition;
import com.crud.cruddemo.Entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HealthConditionMapper {
    @Autowired
    private ModelMapper modelMapper;

    public HealthCondition healthConditionDTOToHealthCondition(HealthConditionDTO healthConditionDTO){
        HealthCondition healthCondition = modelMapper.map(healthConditionDTO, HealthCondition.class);

        return healthCondition;
    }

    public HealthConditionDTO healthConditionToHealthConditionDTO(HealthCondition healthCondition){
        HealthConditionDTO healthConditionDto = modelMapper.map(healthCondition, HealthConditionDTO.class);

        return healthConditionDto;
    }
}
