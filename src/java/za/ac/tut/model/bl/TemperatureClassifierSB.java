/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import javax.ejb.Stateless;

/**
 *
 * @author MemaniV
 */
@Stateless
public class TemperatureClassifierSB implements TemperatureClassifierSBLocal {

    @Override
    public String classifyTemperature(Double temp) {
        String category = "High";
        
        if(temp <=38){
            category = "Low";
        }
        
        return category;
    }

    @Override
    public String advice(String category) {
        String empAdvice = "Normal temperature. Keep it up!";
        
        if(category.equals("High")){
            empAdvice = "High temperature. Please see a doctor!";
        }
        
        return empAdvice;
    }
    
}
