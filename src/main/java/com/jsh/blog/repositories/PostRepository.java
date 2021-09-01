package com.jsh.blog.repositories;

import com.jsh.blog.entities.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}