package view.telaPesquisa;
/**
 *
 * @author Marta
 */

import controller.MedicoController;
import controller.PacienteController;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.telaMedico.telaEdicaoExclusaoMedico.TelaEdicaoExclusaoMedico;
import view.telaPaciente.telaEdicaoExclusaoPaciente.TelaEdicaoExclusaoPaciente;

public class TelaPesquisa extends javax.swing.JFrame {
    
    private final MedicoController medicoController;
    private final PacienteController pacienteController;
    private final TelaEdicaoExclusaoPaciente pacienteEdicaoExclusao;;
    private final TelaEdicaoExclusaoMedico medicoEdicaoExclusao;
    
    

    public TelaPesquisa() {
        initComponents();
        
        medicoController = new MedicoController();
        pacienteController = new PacienteController();
        pacienteEdicaoExclusao = new TelaEdicaoExclusaoPaciente();
        medicoEdicaoExclusao = new TelaEdicaoExclusaoMedico();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputBuscarPaciente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        painelImagemFundo1 = new view.PainelImagemFundo();
        jLabel2 = new javax.swing.JLabel();
        txtTituloMedico2 = new javax.swing.JLabel();
        inputPesquisaNome = new javax.swing.JTextField();
        comboBoxPesquisa = new javax.swing.JComboBox<>();
        btnPesquisar = new javax.swing.JButton();
        panelTabelaPaciente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPacientes = new javax.swing.JTable();
        panelTabelaMedico = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaMedicos = new javax.swing.JTable();
        panelBtns = new javax.swing.JPanel();
        btSair = new javax.swing.JButton();
        btVisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        painelImagemFundo1.setImg(new ImageIcon("src/imagemFundo/imagem_fundo2.png"));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo2.png"))); // NOI18N

        txtTituloMedico2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        txtTituloMedico2.setForeground(new java.awt.Color(102, 102, 102));
        txtTituloMedico2.setText("PESQUISAR");

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTituloMedico2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTituloMedico2))
        );

        comboBoxPesquisa.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboBoxPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médico", "Paciente" }));
        comboBoxPesquisa.setSelectedIndex(-1);
        comboBoxPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPesquisaActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        panelTabelaPaciente.setBackground(new java.awt.Color(255, 255, 255));
        panelTabelaPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("Pacientes cadastrados"));

        tabelaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Data de Nascimento", "Telefone", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPacientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaPacientes);

        javax.swing.GroupLayout panelTabelaPacienteLayout = new javax.swing.GroupLayout(panelTabelaPaciente);
        panelTabelaPaciente.setLayout(panelTabelaPacienteLayout);
        panelTabelaPacienteLayout.setHorizontalGroup(
            panelTabelaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaPacienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTabelaPacienteLayout.setVerticalGroup(
            panelTabelaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaPacienteLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelTabelaMedico.setBackground(new java.awt.Color(255, 255, 255));
        panelTabelaMedico.setBorder(javax.swing.BorderFactory.createTitledBorder("Médicos cadastrados"));

        tabelaMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "CRM", "Especialidade", "Período", "Consultório"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaMedicos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaMedicos);

        javax.swing.GroupLayout panelTabelaMedicoLayout = new javax.swing.GroupLayout(panelTabelaMedico);
        panelTabelaMedico.setLayout(panelTabelaMedicoLayout);
        panelTabelaMedicoLayout.setHorizontalGroup(
            panelTabelaMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaMedicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTabelaMedicoLayout.setVerticalGroup(
            panelTabelaMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaMedicoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBtns.setBackground(new java.awt.Color(255, 255, 255));

        btSair.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btVisualizar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btVisualizar.setText("Visualizar");
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnsLayout = new javax.swing.GroupLayout(panelBtns);
        panelBtns.setLayout(panelBtnsLayout);
        panelBtnsLayout.setHorizontalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnsLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btVisualizar))
        );
        panelBtnsLayout.setVerticalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnsLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTabelaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(inputPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(comboBoxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisar))
                        .addComponent(panelTabelaPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(panelTabelaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTabelaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void mostrarTelaPesquisa() {
        panelTabelaPaciente.setVisible(false);
        panelBtns.setVisible(false);
        panelTabelaMedico.setVisible(false);
        
        setVisible(true);
    }
    
    
    private void mostrarTabelaPaciente() {
        panelTabelaPaciente.setVisible(true);
        panelBtns.setVisible(true);
        panelTabelaMedico.setVisible(false);
    }
    
    private void mostrarTabelaMedico() {
        panelTabelaMedico.setVisible(true);
        panelBtns.setVisible(true);
        panelTabelaPaciente.setVisible(false);
    }
    
    
    public void carregaTabelaMedico(String[][] linhasMatriz) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaMedicos.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < linhasMatriz.length; i++) {
            modelo.addRow(new Object[]{
                linhasMatriz[i][0],
                linhasMatriz[i][1],
                linhasMatriz[i][2],
                linhasMatriz[i][3],
                linhasMatriz[i][4]
            });
        }
    }
    
    public void carregaTabelaPaciente(String[][] linhasMatriz) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaPacientes.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < linhasMatriz.length; i++) {
            modelo.addRow(new Object[]{
                linhasMatriz[i][0],
                linhasMatriz[i][1],
                linhasMatriz[i][2],
                linhasMatriz[i][3],
            });
        }
    }
    
    // precisa validar se o input é de paciente e o combobox é de paciente
    // precisa validar se o input é de médico e o combobox é de médico
    private boolean validaInput(String input) {
        if (input.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Informe um texto válido");
            return false;
        }
        return true;
        
    }
    
 
    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btSairActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        
        // fazer as validações
        String inputPesquisa = inputPesquisaNome.getText();

        boolean valido = validaInput(inputPesquisa);
        if (valido != true) {
            return;
        }
        
        Object inputComboBox = comboBoxPesquisa.getSelectedItem();
        String inputComboBoxString = (String) inputComboBox;
        
        if (inputComboBoxString.equals("Médico")) {
            mostrarTabelaMedico();
            String[][] linhasMatriz = medicoController.getMinhaMatrizTexto();
            medicoController.getMinhaMatrizTexto();
            carregaTabelaMedico(linhasMatriz);
        }
        else {
            mostrarTabelaPaciente();
            String[][] linhasMatriz = pacienteController.getMinhaMatrizTexto(inputPesquisa);
            pacienteController.getMinhaMatrizTexto(inputPesquisa);
            carregaTabelaPaciente(linhasMatriz);
        }     
    }//GEN-LAST:event_btnPesquisarActionPerformed
    
    private void visualizarPaciente() {
        if (this.tabelaPacientes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um paciente");
        } else {
            String nome = this.tabelaPacientes.getValueAt(this.tabelaPacientes.getSelectedRow(),1).toString();
            String dataNascimento = this.tabelaPacientes.getValueAt(this.tabelaPacientes.getSelectedRow(), 2).toString();
            String telefone = this.tabelaPacientes.getValueAt(this.tabelaPacientes.getSelectedRow(), 3).toString();
            String endereco = this.tabelaPacientes.getValueAt(this.tabelaPacientes.getSelectedRow(), 3).toString();
            pacienteEdicaoExclusao.setVisible(true);
        }
    }
    
    private void visualizaMedico() {
        // fazer igual do paciente
    }
    
    
    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarActionPerformed

        Object inputComboBox = comboBoxPesquisa.getSelectedItem();
        String inputComboBoxString = (String) inputComboBox;

        if (inputComboBoxString.equals("Médico")) {
            visualizaMedico();
        } else {
            visualizarPaciente();
        }
    }//GEN-LAST:event_btVisualizarActionPerformed

    private void comboBoxPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPesquisaActionPerformed
        Object inputComboBox = comboBoxPesquisa.getSelectedItem();
        String inputComboBoxString = (String) inputComboBox;

        if (inputComboBoxString.equals("Médico")) {
            mostrarTabelaMedico();
        } else {
            mostrarTabelaPaciente();
        }
        
    }//GEN-LAST:event_comboBoxPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVisualizar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> comboBoxPesquisa;
    private javax.swing.JTextField inputBuscarPaciente;
    private javax.swing.JTextField inputPesquisaNome;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private view.PainelImagemFundo painelImagemFundo1;
    private javax.swing.JPanel panelBtns;
    private javax.swing.JPanel panelTabelaMedico;
    private javax.swing.JPanel panelTabelaPaciente;
    private javax.swing.JTable tabelaMedicos;
    private javax.swing.JTable tabelaPacientes;
    private javax.swing.JLabel txtTituloMedico2;
    // End of variables declaration//GEN-END:variables
}
