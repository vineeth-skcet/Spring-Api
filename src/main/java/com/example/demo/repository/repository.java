package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.entity;

public interface repository extends JpaRepository<entity, Long> {
}
