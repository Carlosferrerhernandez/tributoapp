/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;


import com.tributo.api.modelo.BcUsuLog;
import com.tributo.api.service.BcUsuLogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ricardo
 */
@Service
public class BcUsuLogRestController {
    
    @Autowired
    BcUsuLogService bcUsuLogService;
    
    
    @RequestMapping (value="/rest/bcusulog/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<BcUsuLog> listarBcUsuLog () {
        return bcUsuLogService.getBcUsuLog();
    }
    
     //POST
    
    @RequestMapping (value="/rest/bcusulog/save", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
    public BcUsuLog saveBcUsuLog(@RequestBody BcUsuLog bcUsuLog) {
        return bcUsuLogService.saveBcUsuLog(bcUsuLog);
    }
            
    
}
