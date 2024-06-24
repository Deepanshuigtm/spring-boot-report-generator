package com.crud.cruddemo.Controller;

import com.crud.cruddemo.DTO.HealthConditionDTO;
import com.crud.cruddemo.Entity.User;
import com.crud.cruddemo.Mapper.HealthConditionMapper;
import com.crud.cruddemo.Repository.HealthConditionRepo;
import com.crud.cruddemo.Service.ServiceInterfaceImpl.HealthConditionServiceImplementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/health")
public class HealthController {

    private HealthConditionMapper healthMapper;
    private HealthConditionRepo healthRepo;

    @Autowired
    private HealthConditionServiceImplementer healthConditionServiceImplementer;

    private List<User> users ;

    @PostMapping("/create-health")
    public HealthConditionDTO createHealth(@RequestBody HealthConditionDTO healthConditionDTO){

        return healthConditionServiceImplementer.createHealthCondition(healthConditionDTO);
    }

//    @PutMapping("/update-user")
//    public UserDTO updateUser(UserDTO userDto, Long id){
//        System.out.println(userDto.getUserName());
//        System.out.println(userDto);
//        return healthImplementer.updateUser(userDto, id);
//    }

    @GetMapping("/get-health-by-health-id/{Id}")
    public HealthConditionDTO getHealthByHealthId(@PathVariable Long Id){

        return healthConditionServiceImplementer.getHealthConditionByHealthId(Id);
    }


    @GetMapping("/get-health-by-user-id/{Id}")
    public HealthConditionDTO getHealthByUserId(@PathVariable Long Id){

        return healthConditionServiceImplementer.getHealthConditionByUserId(Id);
    }

}
