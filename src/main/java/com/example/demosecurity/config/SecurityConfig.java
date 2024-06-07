//package com.example.demosecurity.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorizeRequests ->
//                        authorizeRequests
//                                .requestMatchers("/hello").permitAll()
//                                .requestMatchers("/**").authenticated()
//                )
//                .formLogin(withDefaults())
//                .httpBasic(withDefaults());
//        return http.build();
//    }
//
////    @Bean
////    public UserDetailsService userDetailsService() {
////        UserDetails user = User.withUsername("user")
////                .password(passwordEncoder().encode("password"))
////                .roles("USER")
////                .build();
////
////        UserDetails admin = User.withUsername("admin")
////                .password(passwordEncoder().encode("admin"))
////                .roles("ADMIN")
////                .build();
////
////        return new InMemoryUserDetailsManager(user, admin);
////    }
//
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
