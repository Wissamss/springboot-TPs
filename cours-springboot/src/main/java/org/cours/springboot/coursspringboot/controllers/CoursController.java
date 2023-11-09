package org.cours.springboot.coursspringboot.controllers;

import org.cours.springboot.coursspringboot.models.Cours;
import org.cours.springboot.coursspringboot.models.Module;
import org.cours.springboot.coursspringboot.services.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CoursController {
    @Autowired
    private CoursService coursService;

    @RequestMapping("/modules/{moduleId}/cours")
    public List<Cours> getAllCours(@PathVariable Integer moduleId){
        return coursService.getAllCours(moduleId);
    }

    @RequestMapping("/modules/{moduleId}/cours/{id}")
    public Optional<Cours> getCours(@PathVariable Integer id){
        return coursService.getCours(id);
    }
    @RequestMapping(method= RequestMethod.POST, value="/modules/{moduleId}/cours")
    public void addCours(@RequestBody Cours cours, @PathVariable Integer moduleId) {
        cours.setModule(new Module(moduleId, "", ""));
        coursService.addCours(cours);
    }
    @RequestMapping(method=RequestMethod.PUT, value="/modules/{moduleId}/cours/{id}")
    public void updateCours(@RequestBody Cours cours, @PathVariable Integer moduleId, @PathVariable Integer id) {
        cours.setModule(new Module(moduleId, "", ""));
        coursService.updateCours(cours);
    }
    @RequestMapping(method=RequestMethod.DELETE, value="/modules/{moduleId}/cours/{id}")
    public void deleteCours(@PathVariable Integer id) {
        coursService.deleteCours(id);
    }
}

