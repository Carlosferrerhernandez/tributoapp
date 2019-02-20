/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.BcTriTributo;
import com.tributo.api.repository.BcTriTributoRepository;
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
public class BcTriTributoService {
    
  @Autowired
  BcTriTributoRepository bcTriTributoRepository;  
  
  public List<BcTriTributo> getBcTriTributo(){
      return bcTriTributoRepository.findAll();
  }
  
  public BcTriTributo saveBcTriTributo(BcTriTributo bcTriTributo) {
      return bcTriTributoRepository.save(bcTriTributo);
  }
  
  
  
    
}
