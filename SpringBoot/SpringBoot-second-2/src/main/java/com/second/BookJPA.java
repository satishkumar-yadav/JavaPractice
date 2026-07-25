package com.second;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookJPA extends JpaRepository<Book, Integer> {

}
