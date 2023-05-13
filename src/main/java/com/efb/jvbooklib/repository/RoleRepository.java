package com.efb.jvbooklib.repository;

import com.efb.jvbooklib.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role, Long> {
}
