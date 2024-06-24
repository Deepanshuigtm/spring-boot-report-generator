package com.crud.cruddemo.Configurations;

import com.crud.cruddemo.Entity.HealthCondition;
import com.crud.cruddemo.Entity.Report;
import com.crud.cruddemo.Service.ServiceInterfaceImpl.HealthConditionServiceImplementer;
import com.crud.cruddemo.Service.ServiceInterfaceImpl.UserServiceImplementer;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfigs {

    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }



    @Bean
    public UserServiceImplementer userServiceImplementer(){
        return new UserServiceImplementer();
    }

    @Bean
    public HealthConditionServiceImplementer healthConditionServiceImplementer(){return new HealthConditionServiceImplementer();}
    @Bean
    public HealthCondition healthCondition(){
        return new HealthCondition();
    }
}
