package com.example.backendfamily.data.repository;

import com.example.backendfamily.data.entity.Testimony;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TestimonyRepository extends CrudRepository<Testimony , Long> {
}
