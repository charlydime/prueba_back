/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.crojo.prueba.controller;

import mx.crojo.prueba.domain.Countries;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import mx.crojo.prueba.services.CountriesServiceImp;

/**
 *
 * @author charlysama
 */
@RestController
@Slf4j
public class CountriesController {

    @Autowired
    private CountriesServiceImp countriesSrv;

    @GetMapping("/countries/")
    List<Countries> getall(){
    return countriesSrv.listar();
    }

    @GetMapping("/countries/{id}")
    Countries getOne( @PathVariable Long id ){
        Countries con = new Countries();
        con.setId(id);
        return countriesSrv.encontrar(con);
    }

    @DeleteMapping("/countries/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteOne(@PathVariable Long id){
        Countries con = new Countries();
        con.setId(id);
        countriesSrv.eliminar(con);
    }

    @PostMapping("/countries/")
    @ResponseStatus(HttpStatus.CREATED)
    public void newOne( @RequestBody Countries con){
         countriesSrv.guardar(con);
    }

    @PutMapping("/countries/")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Countries> upOne(  @RequestBody Countries con   ){

        Countries conEncontrado;
        conEncontrado = countriesSrv.encontrar(con);

        if (conEncontrado != null){
            countriesSrv.guardar(con);
            return new ResponseEntity<>(con, HttpStatus.CREATED);
        }

        return  new ResponseEntity<>(con, HttpStatus.BAD_REQUEST);

    }

    
}
