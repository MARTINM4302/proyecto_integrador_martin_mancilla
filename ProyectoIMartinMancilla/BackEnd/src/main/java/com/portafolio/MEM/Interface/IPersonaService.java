 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.MEM.Interface;

import com.portafolio.MEM.Entity.Persona;
import java.util.List;

/**
 *
 * @author Martin
 */
public interface IPersonaService {
    //traer Peronas
    public List<Persona> GetPersona();
    
    //guardar un objeto de tipo persona 
    public void savePersona(Persona persona );
    
    //eliminar un objeto pero los busacmos por ID
    public void deletePersona(Long id);
    
    //buscar una persona por ID
    
    public Persona findPersona(Long id);
    
}
