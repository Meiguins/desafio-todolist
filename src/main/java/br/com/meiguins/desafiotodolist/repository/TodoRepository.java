package br.com.meiguins.desafiotodolist.repository;

import br.com.meiguins.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meiguins.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}