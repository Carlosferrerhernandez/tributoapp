/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;

import com.tributo.api.service.TpEstadoService;
import com.tributo.api.modelo.TpEstado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricardo
 */
@RestController
public class TpEstadoRestController {
    
    @Autowired
    TpEstadoService estadoService;
    
    
    
    @RequestMapping (value="/rest/estados/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<TpEstado> listarEstados() {
        return estadoService.listaEstados();
    }
    
    
    
    @RequestMapping (value="/rest/estados/grupo/{grupo}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<TpEstado>  findByGrupo(@PathVariable("grupo") final String grupo) {
        return estadoService.findByGrupo(grupo);
    }
    
    
    @RequestMapping (value="/rest/estados/subgrupo/{subgrupo}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<TpEstado>  findBySubGrupo(@PathVariable("subgrupo") final String subgrupo) {
        return estadoService.findBySubGrupo(subgrupo);
    }
    
    
    @RequestMapping (value="/rest/estados/distinctsubgrupo/{grupo}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<String>  findDistinctSubGrupo(@PathVariable("grupo") final String grupo) {
        return estadoService.findDistinctSubGrupo(grupo);
    }
    
        
    
    @RequestMapping (value="/rest/estados/id/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<TpEstado>  findById(@PathVariable("id") final Integer id) {
        return estadoService.findById(id);
    }
    
    
    //POST
    
    @RequestMapping (value="/rest/estados/save", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
    public TpEstado saveTpEstado(@RequestBody TpEstado tpEstado) {
        return estadoService.saveTpEstado(tpEstado);
    }
    
}
