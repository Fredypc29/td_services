package com.example.td_services.Controller;

import com.example.td_services.Model.Persona;
import com.example.td_services.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    public class Controllers {

    @Autowired
    private Repository repo;

    @GetMapping()
    public String index() {

        return "CONECTADO";
    }
    @GetMapping("personas")
    public List<Persona> getPersonas(){
        return repo.findAll();
    }
    @PutMapping ("crear")
    public String save(@RequestBody Persona persona){
    repo.save(persona);
    return "Grabado";
    }




    }
<<<<<<< HEAD
    @PutMapping("editar/{id}")
    public String update(@PathVariable Long id, @RequestBody Persona persona){
    Persona updatePersona = repo.findById(id).get();
    updatePersona.setNombre(persona.getNombre());
    updatePersona.setTelefono(persona.getTelefono());
    repo.save(updatePersona);
    return ("Editado correctamente");
=======
    @DeleteMapping("delete/{id}")

>>>>>>> c178e7b3158588a73ac3a87dce93b47513541f34


    }



    }

    

