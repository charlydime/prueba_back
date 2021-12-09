/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.crojo.prueba.services;

import mx.crojo.prueba.dao.LanguagesDAO;
import mx.crojo.prueba.domain.Languages;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author charlysama
 */
@Service
public class LanguageServiceImp implements LanguageService {
  @Autowired
    private LanguagesDAO dao;

    @Override
    public List<Languages> listar() {
         return (List<Languages>) dao.findAll();
    }

    @Override
    public void guardar(Languages ef) {
            dao.save(ef);
    }

    @Override
    public void eliminar(Languages ef) {
            dao.delete(ef);
    }

    @Override
    public Languages encontrar(Languages ef) {
        return dao.findById(ef.getId()).orElse(null);
    }
    
    
}
