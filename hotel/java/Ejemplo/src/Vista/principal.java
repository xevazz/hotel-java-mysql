/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author brand
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    public JButton getBtnConsultar() {
        return btnConsultar;
    }

    public void setBtnConsultar(JButton btnConsultar) {
        this.btnConsultar = btnConsultar;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnEntrar() {
        return btnEntrar;
    }

    public void setBtnEntrar(JButton btnEntrar) {
        this.btnEntrar = btnEntrar;
    }

    public JButton getBtnGenerar() {
        return btnGenerar;
    }

    public void setBtnGenerar(JButton btnGenerar) {
        this.btnGenerar = btnGenerar;
    }

    public JButton getBtnGenerarBack() {
        return btnGenerarBack;
    }

    public void setBtnGenerarBack(JButton btnGenerarBack) {
        this.btnGenerarBack = btnGenerarBack;
    }

    public JButton getBtnReservasBack() {
        return btnReservasBack;
    }

    public void setBtnReservasBack(JButton btnReservasBack) {
        this.btnReservasBack = btnReservasBack;
    }

    public JFrame getConsultarReservas() {
        return consultarReservas;
    }

    public void setConsultarReservas(JFrame consultarReservas) {
        this.consultarReservas = consultarReservas;
    }

    public JFrame getGenerarReservas() {
        return generarReservas;
    }

    public void setGenerarReservas(JFrame generarReservas) {
        this.generarReservas = generarReservas;
    }

    public JFrame getMenuPrincipal() {
        return menuPrincipal;
    }

    public void setMenuPrincipal(JFrame menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    public JTextArea getTxtAreaReservas() {
        return txtAreaReservas;
    }

    public void setTxtAreaReservas(JTextArea txtAreaReservas) {
        this.txtAreaReservas = txtAreaReservas;
    }

    public JTextField getTxtContra() {
        return txtContra;
    }

    public void setTxtContra(JTextField txtContra) {
        this.txtContra = txtContra;
    }

    public JTextField getTxtDiaFinal() {
        return txtDiaFinal;
    }

    public void setTxtDiaFinal(JTextField txtDiaFinal) {
        this.txtDiaFinal = txtDiaFinal;
    }

    public JTextField getTxtDiaInicial() {
        return txtDiaInicial;
    }

    public void setTxtDiaInicial(JTextField txtDiaInicial) {
        this.txtDiaInicial = txtDiaInicial;
    }

    public JTextField getTxtDias() {
        return txtDias;
    }

    public void setTxtDias(JTextField txtDias) {
        this.txtDias = txtDias;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JFrame getActualizarReservas() {
        return actualizarReservas;
    }

    public void setActualizarReservas(JFrame actualizarReservas) {
        this.actualizarReservas = actualizarReservas;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnActualizarReser() {
        return btnActualizarReser;
    }

    public void setBtnActualizarReser(JButton btnActualizarReser) {
        this.btnActualizarReser = btnActualizarReser;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public JButton getBtnGenerarBack1() {
        return btnGenerarBack1;
    }

    public void setBtnGenerarBack1(JButton btnGenerarBack1) {
        this.btnGenerarBack1 = btnGenerarBack1;
    }

    public JTextField getTxtBorar() {
        return txtBorar;
    }

    public void setTxtBorar(JTextField txtBorar) {
        this.txtBorar = txtBorar;
    }

    public JTextField getTxtDiaFinalAct() {
        return txtDiaFinalAct;
    }

    public void setTxtDiaFinalAct(JTextField txtDiaFinalAct) {
        this.txtDiaFinalAct = txtDiaFinalAct;
    }

    public JTextField getTxtDiaInicialAct() {
        return txtDiaInicialAct;
    }

    public void setTxtDiaInicialAct(JTextField txtDiaInicialAct) {
        this.txtDiaInicialAct = txtDiaInicialAct;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombreAct() {
        return txtNombreAct;
    }

    public void setTxtNombreAct(JTextField txtNombreAct) {
        this.txtNombreAct = txtNombreAct;
    }

    public JTextField getTxtPrecioAct() {
        return txtPrecioAct;
    }

    public void setTxtPrecioAct(JTextField txtPrecioAct) {
        this.txtPrecioAct = txtPrecioAct;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JFrame();
        btnConsultar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        consultarReservas = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReservas = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnReservasBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBorar = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        generarReservas = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDiaInicial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDiaFinal = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDias = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnGenerarBack = new javax.swing.JButton();
        actualizarReservas = new javax.swing.JFrame();
        txtNombreAct = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnActualizarReser = new javax.swing.JButton();
        btnGenerarBack1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtDiaInicialAct = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDiaFinalAct = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPrecioAct = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtContra = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();

        btnConsultar.setText("Consultar reservas");

        btnGenerar.setText("generar reserva");

        javax.swing.GroupLayout menuPrincipalLayout = new javax.swing.GroupLayout(menuPrincipal.getContentPane());
        menuPrincipal.getContentPane().setLayout(menuPrincipalLayout);
        menuPrincipalLayout.setHorizontalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerar)
                    .addComponent(btnConsultar))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        menuPrincipalLayout.setVerticalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnGenerar)
                .addGap(90, 90, 90))
        );

        txtAreaReservas.setColumns(20);
        txtAreaReservas.setRows(5);
        jScrollPane1.setViewportView(txtAreaReservas);

        jLabel3.setText("Reservas");

        btnReservasBack.setText("menu anterior");

        jLabel9.setText("id");

        jLabel10.setText("nombre");

        jLabel11.setText("fecha de inicio");

        jLabel12.setText("fecha de fin");

        jLabel13.setText("precio");

        jLabel14.setText("escribir el id del que desea eliminar");

        txtBorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBorarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");

        btnActualizar.setText("actualizar");

        javax.swing.GroupLayout consultarReservasLayout = new javax.swing.GroupLayout(consultarReservas.getContentPane());
        consultarReservas.getContentPane().setLayout(consultarReservasLayout);
        consultarReservasLayout.setHorizontalGroup(
            consultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultarReservasLayout.createSequentialGroup()
                .addGroup(consultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultarReservasLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel3))
                    .addGroup(consultarReservasLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(consultarReservasLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(consultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(consultarReservasLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(consultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(consultarReservasLayout.createSequentialGroup()
                                        .addComponent(btnActualizar)
                                        .addGap(154, 154, 154)
                                        .addComponent(btnReservasBack))
                                    .addGroup(consultarReservasLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBorar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBorrar)))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        consultarReservasLayout.setVerticalGroup(
            consultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultarReservasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(consultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtBorar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(consultarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservasBack)
                    .addComponent(btnActualizar))
                .addContainerGap())
        );

        jLabel4.setText("nombre ");

        jLabel5.setText("dias a quedarse");

        jLabel6.setText("dia inicial");

        jLabel7.setText("dia final");

        txtPrecio.setEditable(false);

        jLabel8.setText("precio");

        btnCrear.setText("Crear reserva");

        btnGenerarBack.setText("menu anterior");

        javax.swing.GroupLayout generarReservasLayout = new javax.swing.GroupLayout(generarReservas.getContentPane());
        generarReservas.getContentPane().setLayout(generarReservasLayout);
        generarReservasLayout.setHorizontalGroup(
            generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generarReservasLayout.createSequentialGroup()
                .addGroup(generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(generarReservasLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addGroup(generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txtDiaFinal)
                            .addComponent(txtDiaInicial)
                            .addComponent(txtDias)
                            .addComponent(txtNombre)))
                    .addGroup(generarReservasLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnCrear)
                        .addGap(69, 69, 69)
                        .addComponent(btnGenerarBack)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        generarReservasLayout.setVerticalGroup(
            generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generarReservasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(39, 39, 39)
                .addGroup(generarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnGenerarBack))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel15.setText("nombre ");

        jLabel16.setText("id a actualizar");

        btnActualizarReser.setText("actualizar reserva");

        btnGenerarBack1.setText("menu anterior");

        jLabel18.setText("dia inicial");

        jLabel19.setText("dia final");

        jLabel20.setText("precio");

        javax.swing.GroupLayout actualizarReservasLayout = new javax.swing.GroupLayout(actualizarReservas.getContentPane());
        actualizarReservas.getContentPane().setLayout(actualizarReservasLayout);
        actualizarReservasLayout.setHorizontalGroup(
            actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarReservasLayout.createSequentialGroup()
                .addGroup(actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actualizarReservasLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16))
                    .addGroup(actualizarReservasLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(actualizarReservasLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnActualizarReser)
                                .addGap(41, 41, 41)
                                .addComponent(btnGenerarBack1))
                            .addGroup(actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(actualizarReservasLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(45, 45, 45)
                                    .addComponent(txtDiaInicialAct))
                                .addGroup(actualizarReservasLayout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrecioAct, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(actualizarReservasLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(52, 52, 52)
                                    .addComponent(txtDiaFinalAct, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(actualizarReservasLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(55, 55, 55)
                                    .addComponent(txtNombreAct, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(397, Short.MAX_VALUE))
        );
        actualizarReservasLayout.setVerticalGroup(
            actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarReservasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNombreAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDiaInicialAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtDiaFinalAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtPrecioAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(actualizarReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarReser)
                    .addComponent(btnGenerarBack1))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Escribir su nombre de usuario ej: bn");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel2.setText("contraseña ej: bn");

        btnEntrar.setText("Entrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(btnEntrar))))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(txtContra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnEntrar)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtBorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBorarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBorarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame actualizarReservas;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarReser;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGenerarBack;
    private javax.swing.JButton btnGenerarBack1;
    private javax.swing.JButton btnReservasBack;
    private javax.swing.JFrame consultarReservas;
    private javax.swing.JFrame generarReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFrame menuPrincipal;
    private javax.swing.JTextArea txtAreaReservas;
    private javax.swing.JTextField txtBorar;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtDiaFinal;
    private javax.swing.JTextField txtDiaFinalAct;
    private javax.swing.JTextField txtDiaInicial;
    private javax.swing.JTextField txtDiaInicialAct;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreAct;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioAct;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
