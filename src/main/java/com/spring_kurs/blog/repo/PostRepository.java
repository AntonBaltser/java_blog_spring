package com.spring_kurs.blog.repo;

import com.spring_kurs.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
