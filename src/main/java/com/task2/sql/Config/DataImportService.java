package com.task2.sql.Config;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.task2.sql.Entity.Department;
import com.task2.sql.Entity.Employee;
import com.task2.sql.Repository.DepartmentRepository;
import com.task2.sql.Repository.EmployeeRepository;

import jakarta.annotation.PostConstruct;


@Component
public class DataImportService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private Environment env;
	
	@PostConstruct
	public void DataImportFromExcel() {
		try {
			InputStream inputStream = new FileInputStream(env.getProperty("spring.datasource.excelfilepath"));
			Workbook workbook = WorkbookFactory.create(inputStream);
			
			//System.out.println(workbook.getNumberOfSheets());
			
			Sheet employeeSheet = workbook.getSheetAt(0);
			Sheet departmentSheet = workbook.getSheetAt(1);
			
			for(Row row : departmentSheet) {
				if(row.getRowNum()==0) {	// Header Row Skipper
					continue;
				}
				
				Integer dept_id = (int) row.getCell(0).getNumericCellValue();
				String name = row.getCell(1).getStringCellValue();
				String location = row.getCell(2).getStringCellValue();
				
				Department department = new Department();
				department.setDepartmentId(dept_id);
				department.setName(name);
				department.setLocation(location);
                departmentRepository.save(department);
			}
			
			for(Row row : employeeSheet) {
				if(row.getRowNum()==0) {
					continue;
				}
				
				Integer emp_id = (int) row.getCell(0).getNumericCellValue();
				String name = row.getCell(1).getStringCellValue();
				String email = row.getCell(2).getStringCellValue();
				Integer dept_id = (int) row.getCell(3).getNumericCellValue();
				
				Employee employee = new Employee();
				employee.setEmployeeId(emp_id);
                employee.setName(name);
                employee.setEmail(email);
                Department department = departmentRepository.findById(dept_id).orElseThrow(() -> new RuntimeException("Department not found with ID: " + dept_id));
                employee.setDepartment(department);
                employeeRepository.save(employee);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
