/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.awt.EventQueue;
import java.beans.Beans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tiiko
 */
public class Medicos extends JPanel {
    
//    null //private
//            public String nomb;

    public Medicos() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
        cargarBD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("cia?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Medico_1 m");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        mstbleMedico = new javax.swing.JTable();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblAPater = new javax.swing.JLabel();
        lblAMater = new javax.swing.JLabel();
        lblEspec = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNomb = new javax.swing.JTextField();
        txtAPater = new javax.swing.JTextField();
        txtAMater = new javax.swing.JTextField();
        txtEsp = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        cmdGuardar = new javax.swing.JButton();
        cmdActua = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        lblIdent = new javax.swing.JLabel();
        cmbLista = new javax.swing.JComboBox<>();
        cmdConfir = new javax.swing.JButton();
        lblLista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConfir = new javax.swing.JTextArea();

        FormListener formListener = new FormListener();

        setToolTipText("Formulario de Médicos");
        setName("Foromulario de Médicos"); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, mstbleMedico);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idMedico}"));
        columnBinding.setColumnName("Id Medico");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${MNombre}"));
        columnBinding.setColumnName("MNombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${MAPaterno}"));
        columnBinding.setColumnName("MAPaterno");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${MAMaterno}"));
        columnBinding.setColumnName("MAMaterno");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${especialidad}"));
        columnBinding.setColumnName("Especialidad");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cedula}"));
        columnBinding.setColumnName("Cedula");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);

        masterScrollPane.setViewportView(mstbleMedico);

        lblId.setText("Id Medico:");

        lblNombre.setText("Nombre:");

        lblAPater.setText("Apellido Paterno:");

        lblAMater.setText("Apellido Materno:");

        lblEspec.setText("Especialidad:");

        lblCedula.setText("Cédula Profesional:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idMedico}"), txtId, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), txtId, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.MNombre}"), txtNomb, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), txtNomb, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.MAPaterno}"), txtAPater, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), txtAPater, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.MAMaterno}"), txtAMater, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), txtAMater, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.especialidad}"), txtEsp, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), txtEsp, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cedula}"), txtCedula, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), txtCedula, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        cmdGuardar.setText("Registrar nuevo médico");
        cmdGuardar.addActionListener(formListener);

        cmdActua.setText("Actualizar");
        cmdActua.addActionListener(formListener);

        cmdNuevo.setText("Nuevo");
        cmdNuevo.addActionListener(formListener);

        cmdBorrar.setText("Borrar");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, mstbleMedico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), cmdBorrar, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        cmdBorrar.addActionListener(formListener);

        lblIdent.setText("Seleccione su identidad:");

        cmbLista.addMouseListener(formListener);
        cmbLista.addPropertyChangeListener(formListener);

        cmdConfir.setText("Confirmar");
        cmdConfir.addActionListener(formListener);

        lblLista.setText("Lista de médicos regristrados:");

        txtConfir.setColumns(20);
        txtConfir.setRows(5);
        jScrollPane1.setViewportView(txtConfir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdActua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId)
                                    .addComponent(lblNombre)
                                    .addComponent(lblAPater)
                                    .addComponent(lblAMater)
                                    .addComponent(lblEspec)
                                    .addComponent(lblCedula))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId)
                                    .addComponent(txtNomb)
                                    .addComponent(txtAPater)
                                    .addComponent(txtAMater)
                                    .addComponent(txtEsp)
                                    .addComponent(txtCedula)))
                            .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLista)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmdConfir)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblIdent)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbLista, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmdActua, cmdBorrar, cmdGuardar, cmdNuevo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdent)
                            .addComponent(cmbLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmdConfir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(masterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAPater)
                    .addComponent(txtAPater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAMater)
                    .addComponent(txtAMater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspec)
                    .addComponent(txtEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdGuardar)
                    .addComponent(cmdActua)
                    .addComponent(cmdBorrar)
                    .addComponent(cmdNuevo))
                .addContainerGap())
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener, java.beans.PropertyChangeListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == cmdGuardar) {
                Medicos.this.cmdGuardarActionPerformed(evt);
            }
            else if (evt.getSource() == cmdActua) {
                Medicos.this.cmdActuaActionPerformed(evt);
            }
            else if (evt.getSource() == cmdNuevo) {
                Medicos.this.cmdNuevoActionPerformed(evt);
            }
            else if (evt.getSource() == cmdBorrar) {
                Medicos.this.cmdBorrarActionPerformed(evt);
            }
            else if (evt.getSource() == cmdConfir) {
                Medicos.this.cmdConfirActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == cmbLista) {
                Medicos.this.cmbListaMousePressed(evt);
            }
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }

        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            if (evt.getSource() == cmbLista) {
                Medicos.this.cmbListaPropertyChange(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    private void cmdActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActuaActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_cmdActuaActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        int[] selected = mstbleMedico.getSelectedRows();
        List<datos.Medico_1> toRemove = new ArrayList<datos.Medico_1>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            datos.Medico_1 m = list.get(mstbleMedico.convertRowIndexToModel(selected[idx]));
            toRemove.add(m);
            entityManager.remove(m);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        datos.Medico_1 m = new datos.Medico_1();
        entityManager.persist(m);
        list.add(m);
        int row = list.size() - 1;
        mstbleMedico.setRowSelectionInterval(row, row);
        mstbleMedico.scrollRectToVisible(mstbleMedico.getCellRect(row, 0, true));
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<datos.Medico_1> merged = new ArrayList<datos.Medico_1>(list.size());
            for (datos.Medico_1 m : list) {
                merged.add(entityManager.merge(m));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdConfirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConfirActionPerformed
        
//        String pass = JOptionPane.showInputDialog(this, "Introduzca contraseña");
//        JOptionPane.showMessageDialog(null, pass);
        
        JFrame frame = new JFrame();
                frame.setContentPane(new Paciente());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
       setVisible(false);
        
    }//GEN-LAST:event_cmdConfirActionPerformed

    private void cmbListaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbListaPropertyChange
        //consultas();
    }//GEN-LAST:event_cmbListaPropertyChange

    private void cmbListaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbListaMousePressed
        consultas();
    }//GEN-LAST:event_cmbListaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbLista;
    private javax.swing.JButton cmdActua;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdConfir;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdNuevo;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAMater;
    private javax.swing.JLabel lblAPater;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblEspec;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdent;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblNombre;
    private java.util.List<datos.Medico_1> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable mstbleMedico;
    private javax.persistence.Query query;
    private javax.swing.JTextField txtAMater;
    private javax.swing.JTextField txtAPater;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextArea txtConfir;
    private javax.swing.JTextField txtEsp;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomb;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new Medicos());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    Statement st = null;

    public void cargarBD() {

        try {
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/cia", "root", "sdf3s2gg");
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select mAPAterno from medico");
            cmbLista.removeAllItems();
            while (rs.next()) {
                cmbLista.addItem(rs.getString(1));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Medicos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Medicos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void consultas(){
    
    try {
            // combo = mAPaterno
            String nombre = (String) cmbLista.getSelectedItem();
            // Conexión a la base de datos
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/cia", "root", "sdf3s2gg");
            Class.forName("com.mysql.jdbc.Driver");
            // Consultas
            ResultSet rNomb = st.executeQuery("select * from medico where mAPaterno like " + "'" + nombre + "';");
            rNomb.next();
            nomb = rNomb.getString("mNombre");
            String aPater = rNomb.getString("mAPaterno");
            String aMater = rNomb.getString("mAMaterno");
            String espe = rNomb.getString("especialidad");
            String cedu = rNomb.getString("cedula");
            String espacio = " ";
            String salto = "\n";
            // Se envían las consultas al text area
            txtConfir.setText(nomb + espacio + aPater + espacio + aMater 
                    +  salto + espe + salto + cedu);
           
           
//            String[] mDatos = new String[5];
//            mDatos[0] = nomb;
//            mDatos[1] = aPater;
//            mDatos[2] = aMater;
//            mDatos[3] = espe;
//            mDatos[4] = cedu;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Medicos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    
    String nomb;
//    public String getNombre() {
//        return  nomb;
//    }
    
    
}
