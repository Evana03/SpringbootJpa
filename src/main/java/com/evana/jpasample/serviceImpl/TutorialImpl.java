package com.evana.jpasample.serviceImpl;

import com.evana.jpasample.model.Tutorial;
import com.evana.jpasample.repository.TutorialRepository;
import com.evana.jpasample.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialImpl implements TutorialService {

    @Autowired
    TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> getAllTutorial() {
        return tutorialRepository.getAllTitle();
    }
}
