/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.crojo.prueba.services;

import mx.crojo.prueba.dao.CountriesDAO;
import mx.crojo.prueba.domain.Countries;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author charlysama
 */
@Service
public class CountriesServiceImp implements CountriesService {

  @Autowired
    private CountriesDAO dao;

    @Override
    public List<Countries> listar() {
         return (List<Countries>) dao.findAll();
    }

    @Override
    public void guardar(Countries ef) {
            dao.save(ef);
    }

    @Override
    public void eliminar(Countries ef) {
            dao.delete(ef);
    }

    @Override
    public Countries encontrar(Countries ef) {
        return dao.findById(ef.getId()).orElse(null);
    }
    
    
}
