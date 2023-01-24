package com.alexandrazbant.SpringDataPJAHibernateDAO.repositories;

import com.alexandrazbant.SpringDataPJAHibernateDAO.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
