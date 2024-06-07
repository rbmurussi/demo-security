//package com.example.demosecurity.model;
//
//import jakarta.persistence.*;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Table(name = "users", schema = "sa")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String password;
//
//    private String username;
//
//    private boolean enabled;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Set<Authority> authorities = new HashSet<>();
//
//    public User() {}
//
//    public User(UserDetails userDetails) {
//        this.username = userDetails.getUsername();
//        this.password = userDetails.getPassword();
//        this.enabled = userDetails.isEnabled();
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public boolean isEnabled() {
//        return enabled;
//    }
//
//    public void setEnabled(boolean enabled) {
//        this.enabled = enabled;
//    }
//
//    public void setAuthorities(Set<Authority> authorities) {
//        this.authorities = authorities;
//    }
//
//    public Set<Authority> getAuthorities() {
//        return authorities;
//    }
//}
