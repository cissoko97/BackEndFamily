package com.example.backendfamily.data.repository;

import com.example.backendfamily.data.entity.Camp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CampRepository extends CrudRepository<Camp , Long> {
}
