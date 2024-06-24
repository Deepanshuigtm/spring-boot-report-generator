package com.crud.cruddemo.Repository;

import com.crud.cruddemo.Entity.HealthCondition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthConditionRepo extends JpaRepository<HealthCondition, Long> {

}