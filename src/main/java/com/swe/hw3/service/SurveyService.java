package com.swe.hw3.service;

import com.swe.hw3.models.Survey;
import com.swe.hw3.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public Survey addSurvey(Survey survey){
        return surveyRepository.save(survey);
    }

    public Survey updateSurvey(Survey survey, long id) {
        if(surveyRepository.existsById(id)){
            survey.setId(id);
            return surveyRepository.save(survey);
        }
        return null;
    }

    public void deleteSurvey(long id){
        surveyRepository.deleteById(id);
    }
}
