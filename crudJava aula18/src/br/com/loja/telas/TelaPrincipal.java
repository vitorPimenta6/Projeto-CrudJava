/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Silvia
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        Desktop = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadastroCliente = new javax.swing.JMenuItem();
        menuCadastroOS = new javax.swing.JMenuItem();
        menuCadastroUsuarios = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuServicos = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 550));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Desktop.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblUsuario.setText("Usuário");

        lblData.setText("Data");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/loja/ícones/icones/perfil.png"))); // NOI18N

        menuCadastro.setText("Cadastro");

        menuCadastroCliente.setText("Cliente");
        menuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroCliente);

        menuCadastroOS.setText("OS");
        menuCadastroOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroOSActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroOS);

        menuCadastroUsuarios.setText("Usuários");
        menuCadastroUsuarios.setEnabled(false);
        menuCadastroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroUsuariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroUsuarios);

        jMenuBar1.add(menuCadastro);

        menuRelatorio.setText("Relatório");
        menuRelatorio.setEnabled(false);

        menuServicos.setText("Serviços");
        menuRelatorio.add(menuServicos);

        jMenuBar1.add(menuRelatorio);

        menuAjuda.setText("Ajuda");

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        jMenuBar1.add(menuAjuda);

        menuOpcoes.setText("Opções");

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuSair);

        jMenuBar1.add(menuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(lblData)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblUsuario)
                .addGap(31, 31, 31)
                .addComponent(lblData)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(200, Short.MAX_VALUE))
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION){
           System.exit(0); 
            
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        TelaSobre sobre = new TelaSobre ();
        sobre.setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date data_atual = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data_atual));
    }//GEN-LAST:event_formWindowActivated

    private void menuCadastroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroUsuariosActionPerformed
        TelaUsuarios usuarios = new TelaUsuarios();
        usuarios.setVisible(true);
        Desktop.add(usuarios);
    }//GEN-LAST:event_menuCadastroUsuariosActionPerformed

    private void menuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroClienteActionPerformed
        // chamar a tela clientes
        TelaClientes clientes = new TelaClientes();
        clientes.setVisible(true);
        Desktop.add(clientes);
    }//GEN-LAST:event_menuCadastroClienteActionPerformed

    private void menuCadastroOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroOSActionPerformed
        TelaOS os = new TelaOS();
        os.setVisible(true);
        Desktop.add(os);
    }//GEN-LAST:event_menuCadastroOSActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCadastroCliente;
    private javax.swing.JMenuItem menuCadastroOS;
    public static javax.swing.JMenuItem menuCadastroUsuarios;
    private javax.swing.JMenu menuOpcoes;
    public static javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuServicos;
    private javax.swing.JMenuItem menuSobre;
    // End of variables declaration//GEN-END:variables
}