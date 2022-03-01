package com.example.crudtutorial.repository;

import com.example.crudtutorial.Model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepositoty extends JpaRepository<Tutorial,Long> {

    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
