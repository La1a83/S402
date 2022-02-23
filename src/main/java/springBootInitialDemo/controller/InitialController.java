package springBootInitialDemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springBootInitialDemo.Model.EmployeeModel;
import springBootInitialDemo.service.IEmployeeService;

@RestController
@RequestMapping("/employees")
public class InitialController {

    private final IEmployeeService employeeService;
    
    

    @Autowired
    public InitialController(IEmployeeService employeeService){
        this.employeeService = employeeService;
    }
    
    
    //Petició Get per testejar que funciona la conexió amb el servidor.
    @GetMapping("/test")
    public String helloGradle() {
        return "Hello Gradle!";
    }
    
    //Petició Get que mostra tots els empleats.
    @GetMapping
    public List<EmployeeModel> getAll() {
    	return employeeService.getAll();
    }
    
    //Petició Get que retorna empleat amb l'id corresponent
    @GetMapping("/{id}")
    public EmployeeModel find(@PathVariable String id) {
    	EmployeeModel e = employeeService.findById(Integer.parseInt(id));
    	return e;
    	
    }
    //Petició Get per llistar els empleats per feina:
    @GetMapping("/job/{job}")
    public List<EmployeeModel> findJob(@PathVariable String job) {
    	List <EmployeeModel> list = employeeService.getByJob(job);
    	return list;
    	
    }
    
    
    //Petició Post per afegir un nou empleat.
    @PostMapping
    public void addEmployee(@RequestBody EmployeeModel employee) {
    	employeeService.addEmployee(employee);
    	
    }
    
    //Petició Put per actualitzar l'empleat amb l'id indicat.
    @PutMapping("/{id}")
    public void updateEmployee(@RequestBody EmployeeModel employee, @PathVariable String id) {
    	employeeService.updateEmployee(employee, Integer.parseInt(id));
    }
    
    
    //Peticio Delete per eliminar un empleat per id.
    @DeleteMapping(path="/{id}")
    public void deleteEmployee(@PathVariable String id) {
    	EmployeeModel emp = employeeService.findById(Integer.parseInt(id));
    	if (emp != null) {
    		employeeService.deleteEmployee(emp);
    		System.out.println("Employee deleted.");
    	} else {
    		System.out.println("Employee not found.");
    	}
    	
     }
    
    

}
