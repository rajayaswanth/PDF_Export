package com.pdf.creator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdf.creator.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
