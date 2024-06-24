package com.crud.cruddemo.Mapper;

import com.crud.cruddemo.DTO.ReportDTO;
import com.crud.cruddemo.Entity.Report;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportMapper {
    @Autowired
    private ModelMapper modelMapper;

    public Report reportDTOToReport(ReportMapper reportDTO){
        Report report = modelMapper.map(reportDTO, Report.class);

        return report;
    }

    public ReportDTO reportToReportDTO(Report report){
        ReportDTO reportDto = modelMapper.map(report, ReportDTO.class);

        return reportDto;
    }
}
