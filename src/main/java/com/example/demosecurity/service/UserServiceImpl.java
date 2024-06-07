//package com.example.demosecurity.service;
//
//import com.example.demosecurity.model.User;
//import com.example.demosecurity.repository.UserRepository;
//import org.springframework.security.access.AccessDeniedException;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.context.SecurityContextHolderStrategy;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceImpl implements UserDetailsManager {
//
//    private SecurityContextHolderStrategy securityContextHolderStrategy = SecurityContextHolder
//            .getContextHolderStrategy();
//
//    private final PasswordEncoder passwordEncoder;
//    private final UserRepository userRepository;
//
//    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//        return org.springframework.security.core.userdetails.User.builder()
//                .username(user.getUsername())
//                .password(user.getPassword())
//                .disabled(!user.isEnabled())
//                .roles("USER") // Add roles as needed
//                .build();
//    }
//
//    public User save(User user) {
//        return userRepository.save(user);
//    }
//
//    public void delete(User user) {
//        userRepository.delete(user);
//    }
//
//    @Override
//    public void createUser(UserDetails user) {
//        userRepository.save(new User(user));
//    }
//
//    @Override
//    public void updateUser(UserDetails user) {
//        userRepository.save(new User(user));
//    }
//
//    @Override
//    public void deleteUser(String username) {
//        User user = userRepository.findByUsername(username);
//        userRepository.delete(user);
//    }
//
//    @Override
//    public void changePassword(String oldPassword, String newPassword) {
//        Authentication currentUser = this.securityContextHolderStrategy.getContext().getAuthentication();
//        if (currentUser == null) {
//            // This would indicate bad coding somewhere
//            throw new AccessDeniedException(
//                    "Can't change password as no Authentication object found in context " + "for current user.");
//        }
//        String username = currentUser.getName();
//        User user = userRepository.findByUsername(username);
//        // The password is equals
//        if(user.getPassword().equals(passwordEncoder.encode(oldPassword))) {
//            user.setPassword(newPassword);
//            userRepository.save(user);
//        }
//    }
//
//    @Override
//    public boolean userExists(String username) {
//        return userRepository.findByUsername(username) != null;
//    }
//}
