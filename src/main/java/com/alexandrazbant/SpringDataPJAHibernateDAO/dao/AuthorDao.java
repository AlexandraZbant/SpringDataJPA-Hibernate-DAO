package com.alexandrazbant.SpringDataPJAHibernateDAO.dao;

import com.alexandrazbant.SpringDataPJAHibernateDAO.entity.Author;

public interface AuthorDao {
    Author getById(Long id);

    Author findAuthorByName(String firstName, String lastName);

    Author saveNewAuthor(Author author);

    Author updateAuthor(Author author);

    void deleteAuthorById(Long id);

}
