package com.evana.jpasample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evana.jpasample.model.Tutorial;
import org.springframework.data.jpa.repository.Query;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);

  @Query("SELECT t FROM Tutorial t WHERE t.published = 1")
  List<Tutorial> getAllTitle();

}
