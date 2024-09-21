/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import javax.ejb.Local;

/**
 *
 * @author MemaniV
 */
@Local
public interface TemperatureClassifierSBLocal {

    String classifyTemperature(Double temp);

    String advice(String category);
    
}
