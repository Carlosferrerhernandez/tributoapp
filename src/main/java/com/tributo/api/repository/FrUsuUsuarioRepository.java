/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.repository;

import com.tributo.api.modelo.FrUsuUsuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ricardo
 */
public interface FrUsuUsuarioRepository extends JpaRepository<FrUsuUsuario, Integer> {
    
    
    //Usuarios Por Email    
    @Query( "SELECT f FROM FrUsuUsuario f WHERE f.email = :email")
    public List<FrUsuUsuario> getUsuUsuariosByEmail (@Param("email") String email); 
    
    
        
    
    
}
