package com.password.password.repo;

import com.password.password.model.PasswordPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordPolicyRepo extends JpaRepository<PasswordPolicy,Integer> {

}
