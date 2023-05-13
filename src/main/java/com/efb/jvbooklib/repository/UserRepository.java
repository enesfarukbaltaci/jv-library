package com.efb.jvbooklib.repository;

import com.efb.jvbooklib.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
