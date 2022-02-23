package springBootInitialDemo.repository;



import springBootInitialDemo.Model.EmployeeModel;
import springBootInitialDemo.Model.ResponseDto;

public interface IRepository {
	
	public ResponseDto getAll();
	
	public ResponseDto findById(Integer id);
	
	public void addEmployee(EmployeeModel e);
	
	

	
	
     
    
}
