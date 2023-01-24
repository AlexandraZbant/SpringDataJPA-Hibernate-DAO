package com.alexandrazbant.SpringDataPJAHibernateDAO.repositories;

import com.alexandrazbant.SpringDataPJAHibernateDAO.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
