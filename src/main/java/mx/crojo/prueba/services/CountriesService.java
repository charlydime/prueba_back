/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.crojo.prueba.services;

import mx.crojo.prueba.domain.Countries;
import java.util.List;

/**
 *
 * @author charlysama
 */
public interface CountriesService {

    public List<Countries> listar();
    
    public void guardar(Countries ef);
    
    public void eliminar(Countries ef);
    
    public Countries encontrar(Countries ef);
    
}
