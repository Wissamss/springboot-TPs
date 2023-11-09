package org.cours.springboot.coursspringboot.services;

import org.cours.springboot.coursspringboot.Repositories.CoursRepository;
import org.cours.springboot.coursspringboot.models.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoursService {

    @Autowired
    CoursRepository coursRepository;

    public List<Cours> getAllCours(Integer moduleId){
        List<Cours> cours = new ArrayList<>();
        coursRepository.findByModuleId(moduleId).forEach(c -> cours.add((Cours) c));
        return cours;
    }

    public Optional<Cours> getCours(Integer id){
        return coursRepository.findById(id);
    }

    public void addCours(Cours cours) {
        coursRepository.save(cours);
    }
    public void updateCours(Cours cours) {
        coursRepository.save(cours);
    }
    public void deleteCours(Integer id) {
        coursRepository.deleteById(id);
    }

}
