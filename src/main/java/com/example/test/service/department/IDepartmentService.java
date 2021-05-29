package com.example.test.service.department;

import com.example.test.model.Department;
import com.example.test.service.IService;

import java.util.List;

public interface IDepartmentService extends IService<Department> {
    List<Department> findAllByName(String name);
}
