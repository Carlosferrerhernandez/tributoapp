/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.repository;

import com.tributo.api.modelo.BcUsuObjeto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ricardo
 */
public interface BcUsuObjetoRepository extends JpaRepository<BcUsuObjeto, Integer>{
    
}
