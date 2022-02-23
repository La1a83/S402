package springBootInitialDemo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootInitialDemo.Model.EmployeeModel;
import springBootInitialDemo.repository.EmployeeRepository;
import springBootInitialDemo.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

	@Override
	public EmployeeModel findById(Integer id) {
		
		return employeeRepository.findById(id);
	}

	@Override
	public List<EmployeeModel> getAll() {
		
		return employeeRepository.getEmployees();
	}

	@Override
	public List<EmployeeModel> getByJob(String job) {
		
		return employeeRepository.findByJob(job);
	}

	@Override
	public void addEmployee(EmployeeModel e) {
		
		 employeeRepository.addEmployee(e);
	}

	@Override
	public void deleteEmployee(EmployeeModel e) {
		 employeeRepository.deleteEmployee(e);
		
	}

	@Override
	public void updateEmployee(EmployeeModel e, Integer id) {
		 employeeRepository.update(e, id);
		
	}
	
	
    

}
