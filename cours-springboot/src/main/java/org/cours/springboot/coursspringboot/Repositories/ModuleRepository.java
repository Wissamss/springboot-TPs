package org.cours.springboot.coursspringboot.Repositories;
import org.cours.springboot.coursspringboot.models.Module;
import org.springframework.data.repository.CrudRepository;

public interface ModuleRepository extends CrudRepository<Module, Integer> {
}
