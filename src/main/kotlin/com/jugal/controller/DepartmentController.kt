package com.jugal.controller

import com.jugal.data.Department
import com.jugal.service.DepartmentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

class DepartmentController(private val departmentService: DepartmentService) {

    @GetMapping("/department/{deptID}")
    fun getDepartmentByID(@PathVariable(value = "deptID") deptID: Int): Department {
        return departmentService.getDepartmentByID(deptID)
    }

}