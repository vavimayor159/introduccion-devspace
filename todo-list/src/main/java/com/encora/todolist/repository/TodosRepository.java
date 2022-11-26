package com.encora.todolist.repository;

import com.encora.todolist.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TodosRepository extends JpaRepository<Todo, Integer> {

}
