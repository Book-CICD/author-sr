package com.example.Author_info.repo;

import com.example.Author_info.model.Author;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutherRepo extends MongoRepository<Author,String> {
}
