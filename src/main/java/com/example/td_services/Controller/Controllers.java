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



    }



    }

    }

