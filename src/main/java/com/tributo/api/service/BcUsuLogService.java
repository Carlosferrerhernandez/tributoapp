/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.service;

import com.tributo.api.modelo.BcUsuLog;
import com.tributo.api.repository.BcUsuLogRepository;
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
public class BcUsuLogService {
    
    @Autowired
    BcUsuLogRepository bcUsuLogRepository;
    
    public List<BcUsuLog> getBcUsuLog() {
        return bcUsuLogRepository.findAll();
    }
    
    public BcUsuLog saveBcUsuLog(BcUsuLog bcUsuLog) {
        return bcUsuLogRepository.save(bcUsuLog);
    }
    
    
}
