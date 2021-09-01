package com.jsh.blog.repositories;

import com.jsh.blog.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}