package br.com.felix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.felix.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}
