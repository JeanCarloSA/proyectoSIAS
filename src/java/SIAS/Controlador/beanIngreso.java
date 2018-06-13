/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIAS.Controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Jean Carlo
 */
@Named(value = "beanIngreso")
@SessionScoped
public class beanIngreso implements Serializable {

    /**
     * Creates a new instance of beanIngreso
     */
    public beanIngreso() {
    }
    
}
