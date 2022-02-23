package springBootInitialDemo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springBootInitialDemo.Model.EmployeeModel;
import springBootInitialDemo.Model.ResponseDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository

public class EmployeeRepository implements IRepository {
	
    private List<EmployeeModel> employees = new ArrayList<>();

    @Autowired
    private EmployeeModel employeeModel;
 
    public EmployeeModel getEmployee(int id) {
    	
    	return employeeModel;
    }
    
    //Mètode per llistar tots els empleats.
    public List<EmployeeModel> getEmployees() {
		return employees;
	}
    
    
    
    //Mètode per afegir empleats:
    
    public void addEmployee(EmployeeModel e) {
    	this.employees.add(e);
    }
    
    
    //Mètode per buscar l'empleat per id.
    public EmployeeModel  findById(Integer id) {
    	EmployeeModel x = null;
    	for (EmployeeModel e: employees) {
    		if (e.getId()==id) {
    			x = e;
    		}
    	}
    	return x;
    }
    
    
    //Mètode per buscar empleats per feina:
    public List<EmployeeModel> findByJob(String job) {
    	List <EmployeeModel> list = new ArrayList<EmployeeModel>();
    	for (EmployeeModel e : this.employees) {
    		if (e.getJob().equalsIgnoreCase(job)) {
    			list.add(e);
    		}
    	}
    	
    	return list;
    	
    }
    
    //Mètode per actualitzar empleat:
    public void update(EmployeeModel emp, int id) {
    	
    	for (EmployeeModel e : this.employees) {
    		if (e.getId()==id) {
    			employees.remove(e);
    			employees.add(emp);
    		}
    	}
    }
    //Mètode per eliminar l'empleat de la llista.
    public void deleteEmployee(EmployeeModel emp) {
    	employees.remove(emp);
    }

	@Override
	public ResponseDto getAll() {
		// TODO Auto-generated method stub
		return null;
	}

    
	
	
}
