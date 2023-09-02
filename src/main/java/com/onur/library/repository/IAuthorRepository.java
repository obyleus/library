package com.onur.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onur.library.model.Author;

public interface IAuthorRepository extends JpaRepository<Author, Integer> {}
