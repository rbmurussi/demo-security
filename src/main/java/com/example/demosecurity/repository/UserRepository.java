//package com.example.demosecurity.repository;
//
//import com.example.demosecurity.model.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface UserRepository extends JpaRepository<User, Long> {
//    User findByUsername(String username);
//
//    @Query("SELECT u FROM User u JOIN FETCH u.authorities WHERE u.username = :username")
//    User findByUsernameWithAuthorities(String username);
//}
