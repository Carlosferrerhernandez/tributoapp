/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;

import com.tributo.api.modelo.FrUsuTributo;
import com.tributo.api.service.FrUsuTributoService;
import java.util.List;
import java.util.Optional;
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
public class FrUsuTributoRestController {
    @Autowired
    FrUsuTributoService frUsuTributoService;
    
    
    @RequestMapping (value="/rest/frusutributo/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<FrUsuTributo> listarFrUsuTributo() {
        return frUsuTributoService.getFrUsuTributo();
    }
    
    
    @RequestMapping (value="/rest/frusutributo/id/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public Optional<FrUsuTributo> listarFrUsuTributoById(@PathVariable("id") final Integer id) {
        return frUsuTributoService.getFrUsuTributoById(id);
    }
    
    
    @RequestMapping (value="/rest/frusutributo/idusuario/{idusuario}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<FrUsuTributo> listarFrUsuTributoByIdusuario(@PathVariable("idusuario") final Integer idusuario) {
        return frUsuTributoService.getFrUsuTributoByIdusuario(idusuario);
    }
    
    
    @RequestMapping (value="/rest/frusutributo/filter/{idusuario}/{identidad}/{idtributo}/{estado}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<FrUsuTributo> filterFrUsuTributo(@PathVariable("idusuario") final Integer idusuario,
              @PathVariable("identidad") final Integer identidad,
              @PathVariable("idtributo") final Integer idtributo,
              @PathVariable("estado") final String estado) {
        return frUsuTributoService.filterFrUsuTributo(idusuario, identidad, idtributo, estado);
    }   
    
     //POST
    
    @RequestMapping (value="/rest/frusutributo/save", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
    public FrUsuTributo saveFrUsuTributo(@RequestBody FrUsuTributo frUsuTributo) {
       return frUsuTributoService.saveFrUsuTributo(frUsuTributo);
    }  
    
    
}
