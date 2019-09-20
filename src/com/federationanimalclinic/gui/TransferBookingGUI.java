/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.federationanimalclinic.gui;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.federationanimalclinic.beans.Appointment;
import com.federationanimalclinic.beans.Veterinarian;
/**
 *
 * @author Moiz Ahmad Mughal
 */
public class TransferBookingGUI extends javax.swing.JFrame {

    Appointment appointment;
    /**
     * Creates new form TransferBookingGUI
     */
    public TransferBookingGUI() {
        initComponents();
    }

    public TransferBookingGUI(Appointment appointment){
        this();
        this.appointment = appointment;
        setAppointmentData();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomNumber = new javax.swing.JTextField();
        appointmentType = new javax.swing.JTextField();
        petName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        veterinarianName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nurseCheckBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        bedCheckBox = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        cageCheckBox = new javax.swing.JCheckBox();
        closeButton = new javax.swing.JButton();
        transferButton = new javax.swing.JButton();
        dateAndTime = new javax.swing.JTextField();
        transferComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        roomNumber.setEditable(false);
        roomNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        appointmentType.setEditable(false);
        appointmentType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        petName.setEditable(false);
        petName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Pet Name");

        veterinarianName.setEditable(false);
        veterinarianName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Veterinarian Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Special");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Room Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Appointment Type");

        nurseCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nurseCheckBox.setText("Nurse");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Appointment Details");

        bedCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bedCheckBox.setText("Bed");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Date and Time");

        cageCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cageCheckBox.setText("Cage");

        closeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        transferButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        transferButton.setText("Transfer");
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });

        dateAndTime.setEditable(false);
        dateAndTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        transferComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        transferComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select Veterinarian---" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Transfer to");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(veterinarianName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(40, 40, 40)
                                    .addComponent(appointmentType, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addGap(70, 70, 70)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(petName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(roomNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(68, 68, 68)
                                        .addComponent(dateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(26, 26, 26)
                                            .addComponent(transferComboBox, 0, 1, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(36, 36, 36)
                                            .addComponent(nurseCheckBox)
                                            .addGap(18, 18, 18)
                                            .addComponent(bedCheckBox)
                                            .addGap(18, 18, 18)
                                            .addComponent(cageCheckBox))))))))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transferButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(petName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(veterinarianName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(appointmentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nurseCheckBox)
                    .addComponent(bedCheckBox)
                    .addComponent(cageCheckBox))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
        // TODO add your handling code here:
        if(transferComboBox.getSelectedItem().equals(transferComboBox.getItemAt(0))){
            JOptionPane.showMessageDialog(null,"Select Veterinary to which you wish to transfer ");
            return;
        }
        
        int input = JOptionPane.showConfirmDialog(null,
            "Are you sure to transfer the appointment to Mr "+
                    transferComboBox.getSelectedItem().toString()+" ? ", "Warning",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        // 0=ok, 2=cancel
        if(input == 0){
            updateAppointmentList();
            JOptionPane.showMessageDialog(null,"Appointment Updated Successfully! ");
        }   this.dispose();
    }//GEN-LAST:event_transferButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TransferBookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferBookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferBookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferBookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferBookingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField appointmentType;
    private javax.swing.JCheckBox bedCheckBox;
    private javax.swing.JCheckBox cageCheckBox;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField dateAndTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JCheckBox nurseCheckBox;
    private javax.swing.JTextField petName;
    private javax.swing.JTextField roomNumber;
    private javax.swing.JButton transferButton;
    private javax.swing.JComboBox<String> transferComboBox;
    private javax.swing.JTextField veterinarianName;
    // End of variables declaration//GEN-END:variables

    private void setAppointmentData(){
        ArrayList<Veterinarian> vetList = MainGUI.getVetList();
        petName.setText(appointment.getPetName());
        veterinarianName.setText(appointment.getVetName());
        roomNumber.setText(appointment.getRoomNumber()+"");
        appointmentType.setText(appointment.getAppoinmentType());
        dateAndTime.setText(appointment.getDate());
        if(appointment.isNURSE() == true){
         
            
            nurseCheckBox.setSelected(true);
        }
        if(appointment.isCAGE()){

                        
            cageCheckBox.setSelected(true);
        }
        if(appointment.isBED()){

            bedCheckBox.setSelected(true);
        }
        
        for(int i=0;i<vetList.size();i++){
            Veterinarian veterinarian = vetList.get(i);
            transferComboBox.addItem(veterinarian.getName());
        }
        if(transferComboBox.getItemCount() == 1){
            messageLabel.setText("No Veterinarian Available");
            transferButton.setEnabled(false);
            
        }
        
    }

    private void updateAppointmentList(){
        ArrayList<Appointment> appointmentList = MainGUI.getAppointmentList();
        ArrayList<Veterinarian> vetList = MainGUI.getVetList();
        
        for(int i=0;i<appointmentList.size();i++){
            Appointment appointment = appointmentList.get(i);
            if(appointment.getVetName().equals(veterinarianName.getText().toString())){
                appointmentList.remove(i);
                appointment.setVetName(transferComboBox.getSelectedItem().toString());
                appointmentList.add(appointment);
                break;
            }
            
        }
        
        for(int i=0;i<vetList.size();i++){
            Veterinarian veterinarian = vetList.get(i);
            if(veterinarian.getName().equals(transferComboBox.getSelectedItem().toString())){
            vetList.remove(i);
            veterinarian.setVeterinarianName(veterinarianName.getText().toString());
            vetList.add(veterinarian);
            break;
            }
           
        }
        MainGUI.setVetList(vetList);
        MainGUI.setAppointmentList(appointmentList);
        
    }
}
