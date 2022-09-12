package io.agileintelligence.ppmtool.repositories;

import io.agileintelligence.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

//    @java.lang.Override
//    default java.lang.Iterable<T> findAllById(java.lang.Iterable<ID> ids) {
//        return null;
//    }
}