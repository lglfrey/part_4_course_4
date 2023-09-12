package com.example.communications_prac.repo;

import com.example.communications_prac.models.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
    Department findByNameDep(String nameDep);
}
