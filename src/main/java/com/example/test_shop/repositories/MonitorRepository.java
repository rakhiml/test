package com.example.test_shop.repositories;

import com.example.test_shop.entities.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
}
