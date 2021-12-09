/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.crojo.prueba.services;


import mx.crojo.prueba.domain.Languages;
import java.util.List;

/**
 *
 * @author charlysama
 */
public interface LanguageService {

    public List<Languages> listar();
    
    public void guardar(Languages ef);
    
    public void eliminar(Languages ef);
    
    public Languages encontrar(Languages ef);
    
}
