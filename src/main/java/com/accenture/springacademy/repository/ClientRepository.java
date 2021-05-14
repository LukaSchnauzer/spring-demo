package com.accenture.springacademy.repository;

import com.accenture.springacademy.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, String> {

    ClientEntity findClientByFirstName(String firstName);
}
