package com.nikhilsable.studentmanagementsystem.repository;

import com.nikhilsable.studentmanagementsystem.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long> {
    boolean existsByUsername(String username);
}
