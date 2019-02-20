/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.repository;

import com.tributo.api.modelo.TpEstado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ricardo
 */

public interface TpEstadoRepository extends JpaRepository<TpEstado, Integer>{
    
    
    @Query("SELECT t FROM TpEstado t WHERE t.grupo = :grupo")
    public List<TpEstado> findByGrupo(@Param("grupo") String grupo);
    
    @Query("SELECT t FROM TpEstado t WHERE t.subgrupo = :subgrupo")
    public List<TpEstado> findBySubGrupo(@Param("subgrupo") String subgrupo);
    
    @Query( "SELECT t FROM TpEstado t WHERE t.id = :id")
    public List<TpEstado> findTpEstadoById (@Param("id") Integer id);
    
    @Query( "SELECT DISTINCT t.subgrupo FROM TpEstado t WHERE t.grupo = :grupo")
    public List<String> findDistinctSubGrupo(@Param("grupo") String grupo);
    
}
