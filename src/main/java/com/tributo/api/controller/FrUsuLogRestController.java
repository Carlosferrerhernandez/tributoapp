/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tributo.api.controller;

import com.tributo.api.modelo.FrUsuLog;
import com.tributo.api.service.FrUsuLogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricardo
 */
@RestController
public class FrUsuLogRestController {
    @Autowired
    FrUsuLogService frUsuLogService;
    
    
    @RequestMapping (value="/rest/frusulog/list", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE  )
    public List<FrUsuLog> listarFrUsuLog() {
        return frUsuLogService.getFrUsuLog();
    }
    
    //POST
    
    @RequestMapping (value="/rest/frusulog/save", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE  )
    public FrUsuLog saveFrUsuLog(@RequestBody FrUsuLog frUsuLog) {
        return frUsuLogService.saveFrUsuLog(frUsuLog);
    }
    
    
}
