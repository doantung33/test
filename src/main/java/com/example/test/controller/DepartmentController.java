package com.example.test.controller;

import com.example.test.model.Department;
import com.example.test.service.department.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @GetMapping("")
    public ResponseEntity<Iterable<Department>>getAll(){
        return new ResponseEntity<>(departmentService.findALl(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Department> create(@RequestBody Department department){
        departmentService.save(department);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<Department> edit(@PathVariable Long id, @RequestBody Department department){
        department.setId(id);
        departmentService.save(department);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Department> delete(@PathVariable Long id){
        departmentService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("/search")
    public ResponseEntity<List<Department>> findDepartmentByName(@RequestParam String name) {
        String nameDepartment = "%" + name + "%";
        List<Department> departments = departmentService.findAllByName(nameDepartment);
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }
}
