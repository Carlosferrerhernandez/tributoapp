/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.repository;

import com.tributo.api.modelo.FrUsuTributo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ricardo
 */
public interface FrUsuTributoRepository extends JpaRepository<FrUsuTributo, Integer>{
    
    @Query("SELECT f FROM FrUsuTributo f WHERE f.idusuario = :idusuario")
    List<FrUsuTributo> findByIdusuario(@Param("idusuario") Integer idusuario);
    
   
    @Query("SELECT f FROM FrUsuTributo f WHERE (f.idusuario = :idusuario OR :idusuario = 0) AND (f.identtributo.identidad.id = :identidad OR :identidad = 0) AND ( f.identtributo.idtributo.id = :idtributo OR :idtributo = 0 ) AND (f.estado = :estado or :estado = '0')  ")
    List<FrUsuTributo> findByIdusuarioOrIdentidadOrIdtributoOrEstado(@Param("idusuario") Integer idusuario, @Param("identidad") Integer identidad,@Param("idtributo") Integer idtributo, @Param("estado") String estado );
    
}
