package com.example.employeeMS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private int empId;
    private String empName;
    private String empAddress;
    private String empNumber;
}
