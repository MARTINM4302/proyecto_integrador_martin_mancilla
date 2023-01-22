/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.MEM.Controller;

import com.portafolio.MEM.Entity.Persona;
import com.portafolio.MEM.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Martin
 */
@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    //depede de la url el metodo que va a utilizar
    
    @GetMapping("personas/traer")
    public List<Persona> getPersonas(){
        return ipersonaService.GetPersona();
    }
    //guardar esto en la base de datos 
    @PostMapping("/personas/crear")
    
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "la pesona fue creada corectamente ";
    }
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        
        ipersonaService.deletePersona(id);
        return "la persona fue eliminada corectamente";
        
    }
@PutMapping("/personas/editar/{id}")   
public Persona editPersona(@PathVariable Long id,
                            @RequestParam("nombre") String nuevoNombre,
                            @RequestParam("apellido")String nuevoApellido,
                            @RequestParam("Img") String nuevoImg){
    Persona persona =ipersonaService.findPersona(id);
    
    persona.setNombre(nuevoNombre);
    persona.setNombre(nuevoApellido);
    persona.setNombre(nuevoImg);
    return persona;
}
    //para editar 
    
}
