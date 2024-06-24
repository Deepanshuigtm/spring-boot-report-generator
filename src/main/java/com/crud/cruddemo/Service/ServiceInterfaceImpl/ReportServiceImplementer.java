package com.crud.cruddemo.Service.ServiceInterfaceImpl;

import com.crud.cruddemo.Controller.UserNotFoundException;
import com.crud.cruddemo.DTO.ReportDTO;
import com.crud.cruddemo.DTO.UserDTO;
import com.crud.cruddemo.Entity.HealthCondition;
import com.crud.cruddemo.Entity.Report;
import com.crud.cruddemo.Entity.User;
import com.crud.cruddemo.Mapper.ReportMapper;
import com.crud.cruddemo.Mapper.UserMapper;
import com.crud.cruddemo.Repository.ReportRepo;
import com.crud.cruddemo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.cruddemo.Service.ServiceInterface.ReportServiceInterface;

import java.util.List;

@Service
public class ReportServiceImplementer implements ReportServiceInterface{
    @Autowired
    private HealthCondition healthCondition;

    @Autowired
    private ReportMapper reportMapper;
    @Autowired
    private ReportRepo reportRepo;

    @Override
    public List<Report> getAllReport() {

        List<Report> reports = reportRepo.findAll();
        return reports;
    }

    @Override
    public ReportDTO getReportByReportId(Long report_id) {
        Report existingReport = reportRepo.findById(report_id).orElseThrow(
                ()->new UserNotFoundException("User Not Found"+report_id)
        );

        ReportDTO ans = reportMapper.reportToReportDTO(existingReport);

        return ans;
    }

    @Override
    public ReportDTO getReportByUserId(Long user_id) {
        return null;
    }

    @Override
    public ReportDTO createReport() {

        Long healtId = healthCondition.getHealth_id();

        ReportDTO reportDTO = null;

        reportDTO.setGenerated_at(System.currentTimeMillis());
        reportDTO.setCondition_summary("Health is Not good");
        return null;
    }

    @Override
    public ReportDTO deleteReport(ReportDTO reportDto) {
        return null;
    }

    @Override
    public ReportDTO deleteAllReport() {
        return null;
    }

    @Override
    public ReportDTO deleteReportByReportId(Long report_id) {
        return null;
    }
}
