package com.example.demo.settimana3.ess5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.example.demo.settimana3.ess5.entities.ProgrammingLanguage;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceRel = "languages")
public interface ProgrammingLanguageRepositories extends JpaRepository<ProgrammingLanguage, Long> {
    
}
