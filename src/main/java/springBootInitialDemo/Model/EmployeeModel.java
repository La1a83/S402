package springBootInitialDemo.Model;

import org.springframework.stereotype.Component;

@Component
public class EmployeeModel extends ResponseDto{
    
	
	private Integer id;
    private String name;
    private String surname;
    private String job;
    private Double salary;
    
    
    
    public void setId(Integer id ) {
    	this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void  setJob(String job) {
    	this.job = job;
    	
    	if (job.equalsIgnoreCase("accountant")) {
    		this.salary = 20000.00;
    	} else if (job.equalsIgnoreCase("developer")) {
    		this.salary = 50000.00;
    	} else if (job.equalsIgnoreCase("recepcionist")) {
    		this.salary = 18000.00;
    	} else {
    		this.salary= 15000.00;
    	}
    }
    
   /*public void setSalary(double Salary) {
	   this.salary = salary;
   }*/

    public int getId() {
    	return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    
    public String getJob() {
    	return job;
    }
    
    public Double getSalary() {
    	return this.salary;
    	
    }
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", surname=" + surname + ", job=" + job + ", salary="
				+ salary + "]";
	}
    
    
    
    
}