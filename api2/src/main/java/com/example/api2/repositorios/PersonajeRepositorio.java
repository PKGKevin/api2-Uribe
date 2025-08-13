package com.example.api2.repositorios;

import com.example.api2.modelos.Personajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonajeRepositorio extends JpaRepository<Personajes, Integer> {


}
