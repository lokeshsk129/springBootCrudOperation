package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Employee;


//do not required @Repositary and @Transactional annotation in service class becouse jpaRepositary internally @depositary 
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
