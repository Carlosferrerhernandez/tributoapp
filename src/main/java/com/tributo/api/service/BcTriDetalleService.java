/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.BcTriDetalle;
import com.tributo.api.repository.BcTriDetalleRepository;
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
public class BcTriDetalleService {
    
   @Autowired
   BcTriDetalleRepository bcTriDetalleRepository;
   
   public List<BcTriDetalle> getBcTriDetalle() {
       return bcTriDetalleRepository.findAll();
   }
   
   public BcTriDetalle saveBcTriDetalle(BcTriDetalle bcTriDetalle) {
       return bcTriDetalleRepository.save(bcTriDetalle);
   }
    
}
