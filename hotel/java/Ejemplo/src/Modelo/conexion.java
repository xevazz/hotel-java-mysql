/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author brand
 */
public class conexion {

    public String consultarNumeroColumnas() {
        String numeroColumnas = "";
        String dbURL = "jdbc:mysql://localhost:3306/hotel";
        String username = "root";
        String password = ""; // conectar
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conectado");
                //consulta

                String consultar = "SELECT TABLE_NAME, count( COLUMN_NAME ) FROM INFORMATION_SCHEMA.COLUMNS WHERE table_schema = 'hotel' group by table_name";

                //ejecutar una sentencia en SQL
                Statement sentenciaSQL = conn.createStatement();
                ResultSet resultado = sentenciaSQL.executeQuery(consultar);
                while (resultado.next()) {
                    numeroColumnas = resultado.getString(2);
                    return numeroColumnas;
                }
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return numeroColumnas;

    }

    public String consultarDatos(String tabla) {

        String datosFinales = "";
        conexion objconec = new conexion();
        String numero = objconec.consultarNumeroColumnas();
        String dbURL = "jdbc:mysql://localhost:3306/hotel";
        String username = "root";
        String password = ""; // conectar
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conectado");
                //consulta

                String consultar = "select * from " + tabla;

                //ejecutar una sentencia en SQL
                Statement sentenciaSQL = conn.createStatement();
                ResultSet resultado = sentenciaSQL.executeQuery(consultar);
                while (resultado.next()) {

                    for (int i = 1; i <= Integer.parseInt(numero); i++) {
                        datosFinales = datosFinales + " " + resultado.getString(i) + "---";
                    }
                    datosFinales = datosFinales + "\n";
                }
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datosFinales;

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void crearCliente(String nombre, String fechaI, String fechaF, int precio) {

        String dbURL = "jdbc:mysql://localhost:3306/hotel";
        String username = "root";
        String password = ""; // conectar
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conectado");
                //consulta

                String consultar = "INSERT INTO `reserva` (`nombre`, `dia_inicio`, `dia_fin`, `precio`) VALUES('" + nombre + "', '" + fechaI + "', '" + fechaF + "', '" + precio + "')";

                //ejecutar una sentencia en SQL
                Statement sentenciaSQL = conn.createStatement();
                //sentenciaSQL.executeQuery(consultar);
                int i = sentenciaSQL.executeUpdate(consultar);
                if (i == 1) {

                    System.out.println("creado");
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }

    ///////////////////////////////////////////////////////////////////////////////
    public void actualizarCliente(String nombre, String fechaI, String fechaF, int precio, int id) {

        String dbURL = "jdbc:mysql://localhost:3306/hotel";
        String username = "root";
        String password = ""; // conectar
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conectado");
                //consulta
                String consultar = "UPDATE `reserva` SET `nombre` = '" + nombre + "', `dia_inicio` = '" + fechaI + "', `dia_fin` = '" + fechaF + "', `precio` = '" + precio + "' WHERE `reserva`.`id` = " + id + "";

                //ejecutar una sentencia en SQL
                Statement sentenciaSQL = conn.createStatement();
                //sentenciaSQL.executeQuery(consultar);
                int i = sentenciaSQL.executeUpdate(consultar);
                if (i == 1) {

                    System.out.println("actualizado");
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }

  //////////////////////////////////////////////////////////////////////////

    public void borrarCliente(int buscarId) {

        String dbURL = "jdbc:mysql://localhost:3306/hotel";
        String username = "root";
        String password = ""; // conectar
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conectado");
                //consulta
                String consultar = "DELETE FROM `reserva` WHERE `reserva`.`id` = " + buscarId + "";

                //ejecutar una sentencia en SQL
                Statement sentenciaSQL = conn.createStatement();
                //sentenciaSQL.executeQuery(consultar);
                int i = sentenciaSQL.executeUpdate(consultar);
                if (i == 1) {

                    System.out.println("Borrado");
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }

}
