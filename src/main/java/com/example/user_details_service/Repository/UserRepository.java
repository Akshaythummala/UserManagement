package com.example.user_details_service.Repository;

import com.example.user_details_service.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
