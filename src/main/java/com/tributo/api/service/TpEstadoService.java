/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.repository.TpEstadoRepository;
import com.tributo.api.modelo.TpEstado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ricardo
 */
@Service
@Transactional
public class TpEstadoService {
    
    @Autowired
    TpEstadoRepository estadoRepository;
    
    
    public List<TpEstado> listaEstados()  {
        return  estadoRepository.findAll();
      }
    
    public List<TpEstado>  findByGrupo(String grupo) {
        return estadoRepository.findByGrupo(grupo);
    }
    
     public List<TpEstado>  findBySubGrupo(String subgrupo) {
        return estadoRepository.findBySubGrupo(subgrupo);
    }
     
      public List<String>  findDistinctSubGrupo(String grupo) {
        return estadoRepository.findDistinctSubGrupo(grupo);
    }
    
    public List<TpEstado> findById (Integer id) {
        return estadoRepository.findTpEstadoById(id);
    }
    
    public TpEstado saveTpEstado(TpEstado tpEstado){
        return estadoRepository.save(tpEstado);
    }
    
}
