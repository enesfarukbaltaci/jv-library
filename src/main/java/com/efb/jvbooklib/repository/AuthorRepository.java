package com.efb.jvbooklib.repository;

import com.efb.jvbooklib.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository  extends JpaRepository<Author,Long> {
}
