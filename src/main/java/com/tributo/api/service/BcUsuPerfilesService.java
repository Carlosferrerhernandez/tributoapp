/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.BcUsuPerfiles;
import com.tributo.api.repository.BcUsuPerfilesRepository;
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
public class BcUsuPerfilesService {
    
    @Autowired
    BcUsuPerfilesRepository bcUsuPerfilesRepository;
    
    public List<BcUsuPerfiles> getBcUsuPerfiles() {
        
        return bcUsuPerfilesRepository.findAll();
    }
    
    public BcUsuPerfiles saveBcUsuPerfiles(BcUsuPerfiles bcUsuPerfiles) {
        return bcUsuPerfilesRepository.save(bcUsuPerfiles);
    }
            
    
}
