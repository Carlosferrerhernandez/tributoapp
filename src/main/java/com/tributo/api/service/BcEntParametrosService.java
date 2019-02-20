/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.BcEntParametros;
import com.tributo.api.repository.BcEntParametrosRepository;
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
public class BcEntParametrosService {
    
@Autowired
BcEntParametrosRepository bcEntParametrosRepository;

    public List<BcEntParametros> getBcEntParametros () {

        return bcEntParametrosRepository.findAll();
    }
    
    public BcEntParametros saveBcEntParametros (BcEntParametros bcEntParametros) {

        return bcEntParametrosRepository.save(bcEntParametros);
    }
    
    
    
}
