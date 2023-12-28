package com.laptopshop.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptopshop.work.entity.AdminDetails;

public interface AdminRepo extends JpaRepository<AdminDetails, Long>{

}