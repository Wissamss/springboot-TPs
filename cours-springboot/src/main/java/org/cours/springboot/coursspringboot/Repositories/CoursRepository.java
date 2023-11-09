package org.cours.springboot.coursspringboot.Repositories;

import org.cours.springboot.coursspringboot.models.Cours;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CoursRepository<V, I extends Number> extends CrudRepository<Cours, Integer> {
    public List<Cours> findByModuleId(Integer moduleId);
}
