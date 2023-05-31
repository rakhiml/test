package com.example.test_shop.repositories;

import com.example.test_shop.entities.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotebookRepository extends JpaRepository<Notebook, Long> {
}
