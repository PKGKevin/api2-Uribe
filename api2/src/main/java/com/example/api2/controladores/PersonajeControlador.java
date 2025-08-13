package com.example.api2.controladores;
import com.example.api2.modelos.Personajes;
import com.example.api2.servicios.PersonajeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping ("/Personajes")
public class PersonajeControlador {
    @Autowired
    PersonajeServicio servicio;
    @PostMapping
    public ResponseEntity <?> responderAlGuardado (@RequestBody Personajes datosDelFront) {
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.guardarPersonaje(datosDelFront));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }
}