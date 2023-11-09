package org.cours.springboot.coursspringboot.services;

import org.cours.springboot.coursspringboot.Repositories.ModuleRepository;
import org.cours.springboot.coursspringboot.models.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {
   private List<Module> modules =new ArrayList<>(Arrays
            .asList(
                        new Module(1, "La plateforme Java Standard Edition", "Description de la plateforme Java SE"),
                        new Module(2,"La plateforme Java Enterprise Edition", "Description de la plateforme Java EE")
            ));


    @Autowired
    private ModuleRepository moduleRepository;
    public List<Module> getAllModules(){
        List<Module> mods = new ArrayList<>();
        moduleRepository.findAll().forEach(mods::add);
        return mods;
    }


    public Optional<Module> getModule(Integer id) {
        /*
        for (Module module : modules) {
            if (id.equals(module.getId())) {
                return module;
            }
        }
        return null;

         */
        return moduleRepository.findById(id);
    }

    public void addModule(Module module){
        //modules.add(module);
        moduleRepository.save(module);
    }

    public void updateModule(Integer id, Module module) {
        /*
        for (int i=0; i<modules.size(); i++) {
            Module m = modules.get(i);
            if (id.equals(m.getId())) {
                modules.set(i, module);
                return;
            }
        }

         */
        moduleRepository.save(module);

    }

    public void deleteModule(Integer id) {
        //modules.removeIf(m -> id.equals(m.getId()));
        moduleRepository.deleteById(id);
    }
}
