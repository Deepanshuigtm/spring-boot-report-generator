package com.crud.cruddemo.Service.ServiceInterface;

import com.crud.cruddemo.DTO.ReportDTO;
import com.crud.cruddemo.Entity.Report;

import java.util.List;

public interface ReportServiceInterface{


    public List<Report> getAllReport();
    public ReportDTO getReportByReportId(Long report_id);
    public ReportDTO getReportByUserId(Long user_id);
    public ReportDTO createReport();
    public ReportDTO deleteReport(ReportDTO reportDto);
    public ReportDTO deleteAllReport();
    public ReportDTO deleteReportByReportId(Long report_id);

}