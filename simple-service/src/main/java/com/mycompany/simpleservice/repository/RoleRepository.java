package com.mycompany.simpleservice.repository;

import com.mycompany.simpleservice.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by suman.das on 11/28/18.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
