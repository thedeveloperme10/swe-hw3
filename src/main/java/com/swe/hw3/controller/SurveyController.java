package com.swe.hw3.controller;

import com.swe.hw3.models.Survey;
import com.swe.hw3.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/surveys")
public class SurveyController {
    @Autowired
    private SurveyService service;

    @GetMapping
    public List<Survey> getAllSurveys(){
        return service.getAllSurveys();
    }

    @PostMapping(path = "/new")
    public Survey addSurvey(@RequestBody Survey survey){
        return service.addSurvey(survey);
    }

    @PutMapping(path = "/{id}")
    public Survey updateSurvey(@PathVariable long id, @RequestBody Survey survey){
        return service.updateSurvey(survey, id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteSurvey(@PathVariable long id){
        service.deleteSurvey(id);
    }
}
