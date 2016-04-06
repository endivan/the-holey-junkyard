/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cleancreditsclient;

import javax.swing.JOptionPane;

/**
 *
 * @author shardul
 */
public class CleanCreditsClient extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private static String server = "localhost";
    private static int PORT = 40404;

    /**
     * Creates new form CleanCreditsClient
     */
    public CleanCreditsClient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin = new javax.swing.JDialog();
        citizenLabel = new javax.swing.JLabel();
        citizen = new javax.swing.JTextField();
        changeLabel = new javax.swing.JLabel();
        change = new javax.swing.JTextField();
        changeButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        getButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        admin.setTitle("Update Credits");
        admin.setLocationByPlatform(true);
        admin.setMinimumSize(new java.awt.Dimension(316, 110));
        admin.setResizable(false);

        citizenLabel.setText("Citizen:");

        changeLabel.setText("Change:");

        changeButton.setText("Update");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin.getContentPane());
        admin.getContentPane().setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(citizenLabel)
                            .addComponent(changeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(citizen)
                            .addComponent(change, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                    .addGroup(adminLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(changeButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminLayout.setVerticalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(citizenLabel)
                    .addComponent(citizen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeLabel)
                    .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        admin.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CleanCreditsClient");
        setLocationByPlatform(true);
        setResizable(false);

        usernameLabel.setText("Username:");

        passwordLabel.setText("Password:");

        getButton.setText("Get Credits");
        getButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update Credits");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(getButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(updateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getButton)
                    .addComponent(updateButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        try (java.net.Socket sock = new java.net.Socket(server, PORT);
                java.io.DataOutputStream dos = new java.io.DataOutputStream(sock.getOutputStream())) {
            dos.writeUTF(username.getText());
            dos.writeUTF(String.valueOf(password.getPassword()));
            dos.writeUTF("update");
            dos.writeUTF(citizen.getText());
            dos.writeInt(Integer.parseInt(change.getText()));
            java.io.DataInputStream dis = new java.io.DataInputStream(sock.getInputStream());
            if (dis.readInt() != 0) {
                JOptionPane.showMessageDialog(this, "Update successful",
                        "Update", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "You need to be an admin to update!",
                        "Update", JOptionPane.WARNING_MESSAGE);
            }
        } catch (java.io.IOException ex) {
            System.err.println("Caught IOException: " + ex.getLocalizedMessage());
        }
        admin.setVisible(false);
        citizen.setText(null);
        change.setText(null);
        username.setText(null);
        password.setText(null);
    }//GEN-LAST:event_changeButtonActionPerformed

    private void getButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getButtonActionPerformed
        try (java.net.Socket sock = new java.net.Socket(server, PORT);
                java.io.DataOutputStream dos = new java.io.DataOutputStream(sock.getOutputStream())) {
            dos.writeUTF(username.getText());
            dos.writeUTF(String.valueOf(password.getPassword()));
            dos.writeUTF("get");
            java.io.DataInputStream dis = new java.io.DataInputStream(sock.getInputStream());
            JOptionPane.showMessageDialog(this, "You have " + dis.readInt() + " credits.",
                    "Get Credits", JOptionPane.INFORMATION_MESSAGE);
        } catch (java.io.IOException ex) {
            System.err.println("Caught IOException: " + ex.getLocalizedMessage());
        }
        username.setText(null);
        password.setText(null);
    }//GEN-LAST:event_getButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        admin.setVisible(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CleanCreditsClient().setVisible(true);
            }
        });

        if (args.length > 0) {
            server = args[0];
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog admin;
    private javax.swing.JTextField change;
    private javax.swing.JButton changeButton;
    private javax.swing.JLabel changeLabel;
    private javax.swing.JTextField citizen;
    private javax.swing.JLabel citizenLabel;
    private javax.swing.JButton getButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}