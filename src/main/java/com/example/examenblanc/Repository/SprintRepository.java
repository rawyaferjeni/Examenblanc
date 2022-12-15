package com.example.examenblanc.Repository;

import com.example.examenblanc.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
