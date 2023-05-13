package com.efb.jvbooklib.repository;

import com.efb.jvbooklib.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
