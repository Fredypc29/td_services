package com.example.td_services.Repository;

import com.example.td_services.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface Repository extends JpaRepository<Persona, Long> {

    }

