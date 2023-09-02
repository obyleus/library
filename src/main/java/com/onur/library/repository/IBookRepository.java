package com.onur.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onur.library.model.Book;

public interface IBookRepository extends JpaRepository<Book, Integer> {}
