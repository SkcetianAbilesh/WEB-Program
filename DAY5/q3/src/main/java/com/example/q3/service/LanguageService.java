package com.example.q3.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q3.model.Language;
import com.example.q3.repository.LanguageRepo;

import java.util.List;
import java.util.Optional;
@Service
public class LanguageService {
    @Autowired
    LanguageRepo obj;
    public Language postLanguage(Language newLanguage)
    {
         return obj.save(newLanguage);
    }
    public List<Language> getLanguage()
    {
        return obj.findAll();
    }
    public Optional<Language> getLanguageById(int Id)
    {
        return obj.findById(Id);
    }
    public Language updatebyId(int Id,Language newLanguage)
    {
        Language language=obj.findById(Id).orElse(null);
        if(language!=null){
            language.setLanguageName(newLanguage.getLanguageName());
            language.setLanguageComplexity(newLanguage.getLanguageComplexity());
            return obj.saveAndFlush(language);
        }
        else{
            return null;
        }
    }
    public Boolean deleteById(int Id)
    {
        obj.deleteById(Id);
        return true;
    }
}

