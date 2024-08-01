package com.example.demo.mapper;

import com.example.demo.dto.dto;
import com.example.demo.entity.entity;

public class mapper {

    // convert department jpa entity into department dto
    public static dto mapToDepartmentDto(entity department){
        return new dto(
                department.getId(),
                department.getUsername(),
                department.getEmail(),
                department.getPassword()
        );
    }

    // convert department dto into department jpa entity
    public static entity mapToDepartment(dto departmentDto){
        return new entity(
                departmentDto.getId(),
                departmentDto.getUsername(),
                departmentDto.getEmail(),
                departmentDto.getPassword()
        );
    }
}