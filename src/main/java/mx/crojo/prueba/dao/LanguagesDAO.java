/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.crojo.prueba.dao;

import mx.crojo.prueba.domain.Languages;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author charlysama
 */
public interface LanguagesDAO extends CrudRepository<Languages,Long> {
    
}
