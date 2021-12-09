package mx.crojo.prueba.dao;

import mx.crojo.prueba.domain.Countries;
import org.springframework.data.repository.CrudRepository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author charlysama
 */
public interface CountriesDAO extends CrudRepository<Countries,Long>{
    
}
