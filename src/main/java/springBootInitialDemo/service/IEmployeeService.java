package springBootInitialDemo.service;

import java.util.List;

import springBootInitialDemo.Model.EmployeeModel;

public interface IEmployeeService {
	
	EmployeeModel findById(Integer id);
	
	List<EmployeeModel> getAll();
	
	List<EmployeeModel> getByJob(String job);
	
    void addEmployee(EmployeeModel e);
    
    void deleteEmployee(EmployeeModel e);
    
    void updateEmployee(EmployeeModel e, Integer id);
    
}
