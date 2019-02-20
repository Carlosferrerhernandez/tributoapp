/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.FrUsuLog;
import com.tributo.api.repository.FrUsuLogRepository;
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
public class FrUsuLogService {
    
    @Autowired
    FrUsuLogRepository frUsuLogRepository;
    
    public List<FrUsuLog> getFrUsuLog() {
        return frUsuLogRepository.findAll();
    }
    
    public FrUsuLog saveFrUsuLog(FrUsuLog frUsuLog) {
        return frUsuLogRepository.save(frUsuLog);
    }
    
}
