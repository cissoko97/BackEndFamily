package com.example.backendfamily.data.repository;

import com.example.backendfamily.data.entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MediaRepository extends CrudRepository<Media, Long>{

}
