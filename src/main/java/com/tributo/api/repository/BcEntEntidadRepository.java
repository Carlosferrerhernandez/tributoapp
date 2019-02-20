/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.repository;

import com.tributo.api.modelo.BcEntEntidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ricardo
 */
public interface BcEntEntidadRepository extends JpaRepository <BcEntEntidad, Integer>{
    
    List<BcEntEntidad> findByNit(String nit);
    
    @Query("SELECT b FROM BcEntEntidad b WHERE b.idpais.id = :idpais")
    List<BcEntEntidad> findByIdpais(@Param("idpais") Integer idpais);
    
    @Query("SELECT b FROM BcEntEntidad b WHERE b.idpais.id = :idpais and b.iddepartamento.id = :iddepartamento")
    List<BcEntEntidad> findByIdpaisAndIddepartamento(@Param("idpais") Integer idpais, @Param("iddepartamento") Integer iddepartamento);
    
    
    
}
