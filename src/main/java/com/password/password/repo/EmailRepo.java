package com.password.password.repo;

import com.password.password.model.MasterEmailConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepo extends JpaRepository<MasterEmailConfiguration,Integer> {

}
