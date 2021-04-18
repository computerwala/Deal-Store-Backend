package com.computerwala.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.computerwala.model.Deals;

public interface DealsRepository extends JpaRepository<Deals, Long> {
}