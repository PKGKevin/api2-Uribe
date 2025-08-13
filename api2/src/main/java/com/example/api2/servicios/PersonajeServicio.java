package com.example.api2.servicios;

import com.example.api2.modelos.Personajes;
import com.example.api2.repositorios.PersonajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServicio {
@Autowired
PersonajeRepositorio repositorio;
    public boolean guardarPersonaje(Personajes datosDelPersonaje) throws Exception{
        try{
            repositorio.save(datosDelPersonaje);
            return true;
        } catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
