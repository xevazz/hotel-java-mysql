/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Control.controlador;
/**
 *
 * @author brand
 */
public class Ejemplo {

        public static void main(String[] args) {

            controlador objc = new controlador();
            
            objc.iniciar();

    }

}
