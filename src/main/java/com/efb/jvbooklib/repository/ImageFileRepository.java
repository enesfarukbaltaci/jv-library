package com.efb.jvbooklib.repository;

import com.efb.jvbooklib.domain.ImageFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageFileRepository extends JpaRepository<ImageFile, String>
{
}
