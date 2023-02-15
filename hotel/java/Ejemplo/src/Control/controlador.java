/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.principal;
import Modelo.conexion;
import Modelo.converciones;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author brand
 */
public class controlador implements ActionListener {

    principal objv = new principal();
    conexion objconex = new conexion();
    converciones objconver = new converciones();

    public controlador() {
        
        //
        this.objv.getBtnConsultar().addActionListener(this);
        this.objv.getBtnCrear().addActionListener(this);
        this.objv.getBtnEntrar().addActionListener(this);
        this.objv.getBtnGenerar().addActionListener(this);
        this.objv.getBtnGenerarBack().addActionListener(this);
        this.objv.getBtnReservasBack().addActionListener(this);
        this.objv.getBtnActualizar().addActionListener(this);
        this.objv.getBtnActualizarReser().addActionListener(this);
        this.objv.getBtnBorrar().addActionListener(this);
        this.objv.getBtnGenerarBack1().addActionListener(this);
        this.objv.getBtnReservasBack().addActionListener(this);
        
    }

    public void iniciar() {

        objv.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == objv.getBtnEntrar()) {
            if("bn".equals(objv.getTxtnombre().getText())){
            objv.setVisible(false);
            objv.getMenuPrincipal().setVisible(true);
            objv.getMenuPrincipal().setSize(400,300);
            }
        }
        if (e.getSource() == objv.getBtnConsultar()){
            objv.getMenuPrincipal().setVisible(false);
            objv.getConsultarReservas().setVisible(true);
            objv.getConsultarReservas().setSize(500,400);
            
            objv.getTxtAreaReservas().setText(objconex.consultarDatos("reserva"));
            
        } 
        if (e.getSource() == objv.getBtnGenerar()) {
            objv.getMenuPrincipal().setVisible(false);
            objv.getGenerarReservas().setVisible(true);
            objv.getGenerarReservas().setSize(400,300);
            
        }
        if (e.getSource() == objv.getBtnCrear()) {
            objv.getTxtPrecio().setText(""+objconver.precio(Integer.parseInt(objv.getTxtDias().getText())));
            objconex.crearCliente(objv.getTxtNombre().getText(), objv.getTxtDiaInicial().getText(), objv.getTxtDiaFinal().getText(), Integer.parseInt(objv.getTxtPrecio().getText()));
        }
        if (e.getSource() == objv.getBtnBorrar()) {
            objconex.borrarCliente(Integer.parseInt(objv.getTxtBorar().getText()));
        }
        if (e.getSource() == objv.getBtnActualizar()) {
            objv.getConsultarReservas().setVisible(false);
            objv.getActualizarReservas().setVisible(true);
            objv.getActualizarReservas().setSize(400,300);
            
        }
        if (e.getSource() == objv.getBtnActualizarReser()) {
        objconex.actualizarCliente(objv.getTxtNombreAct().getText(), objv.getTxtDiaInicialAct().getText(), objv.getTxtDiaFinalAct().getText(), Integer.parseInt(objv.getTxtPrecioAct().getText()), Integer.parseInt(objv.getTxtId().getText()));
        }
        
        if (e.getSource() == objv.getBtnGenerarBack()) {
            objv.getMenuPrincipal().setVisible(true);
            objv.getConsultarReservas().setVisible(false);
        }
        if (e.getSource() == objv.getBtnReservasBack()) {
            objv.getMenuPrincipal().setVisible(true);
            objv.getGenerarReservas().setVisible(false);
        }
        if (e.getSource() == objv.getBtnGenerarBack1()) {
            objv.getConsultarReservas().setVisible(true);
            objv.getActualizarReservas().setVisible(false);
        }
        
    }

}
