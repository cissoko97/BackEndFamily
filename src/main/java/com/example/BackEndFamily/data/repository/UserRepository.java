package com.example.backendfamily.data.repository;

import com.example.backendfamily.data.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT t FROM User t WHERE t.email = :email AND t.password = :password")
    User findByEmailAndPassword(@Param("email") String email,@Param("password") String password);

}
