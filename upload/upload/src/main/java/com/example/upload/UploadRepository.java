package com.example.upload;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadRepository extends JpaRepository<UploadEntity, Long>{
    
}
