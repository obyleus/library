package com.onur.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onur.library.model.Author;
import com.onur.library.repository.IAuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private IAuthorRepository authorRepository;

    public AuthorService(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Optional<Author> getAuthorById(int id) {
        return authorRepository.findById(id);
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author updateAuthor(int id, Author author) {
        if (authorRepository.existsById(id)) {
            author.setId(id);
            return authorRepository.save(author);
        }
        return null;
    }

    public boolean deleteAuthor(int id) {
        if (authorRepository.existsById(id)) {
            authorRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
