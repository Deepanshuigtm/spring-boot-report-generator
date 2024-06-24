package com.crud.cruddemo.Repository;

import com.crud.cruddemo.Entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepo extends JpaRepository<Report, Long> {

}