package com.example.test.service.department;

import com.example.test.model.Department;
import com.example.test.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService implements IDepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> findALl() {
        return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public Department findById(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void remove(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public List<Department> findByName(String name) {
        return null;
    }


    @Override
    public List<Department> findAllByName(String name) {
        return departmentRepository.findAllByName(name);
    }
}
