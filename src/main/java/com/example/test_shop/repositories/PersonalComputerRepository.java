package com.example.test_shop.repositories;

import com.example.test_shop.entities.PersonalComputer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalComputerRepository extends JpaRepository<PersonalComputer, Long> {
}
