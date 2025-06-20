package view;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Tarefa;
import dao.DAOTarefa;
import java.awt.Component;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import util.ConversorData;

/**
 *
 * @author User Master
 */
public class ViewTarefas extends javax.swing.JFrame {

    DAOTarefa dAOTarefa = new DAOTarefa();
    Tarefa tarefa = new Tarefa();
    ArrayList<Tarefa> lista = dAOTarefa.listarTarefaDAO();
    String cadAlt = "Cad";

    /**
     * Creates new form viewTarefas
     */
    public ViewTarefas() {
        initComponents();
        setLocationRelativeTo(this);
        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFtarefa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFdescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabTarefas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTFid = new javax.swing.JTextField();
        jDateTarefa = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFhoraInicio = new javax.swing.JFormattedTextField();
        jTFhoraFim = new javax.swing.JFormattedTextField();
        jCBStatus = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jBtPesquisarView = new javax.swing.JButton();

        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5actionEditar(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Tarefas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                windowFechar(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Tarefas");

        jLabel2.setText("Tarefa:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Tarefas:");

        jTabTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tarefas", "Descrição", "Data", "H. Início", "H. Fim", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabTarefas);
        if (jTabTarefas.getColumnModel().getColumnCount() > 0) {
            jTabTarefas.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTabTarefas.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTabTarefas.getColumnModel().getColumn(2).setPreferredWidth(300);
        }

        jLabel5.setText("ID:");

        jTFid.setEditable(false);
        jTFid.setEnabled(false);

        jDateTarefa.setDateFormatString("dd '/'MM '/'y");

        jLabel6.setText("Data:");

        jLabel7.setText("Hora Fim:");

        jLabel8.setText("Hora Início:");

        try {
            jTFhoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTFhoraFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jCBStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "PENDENTE", "EM ANDAMENTO", "CONCLUÍDA" }));

        jLabel9.setText("Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jDateTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFhoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFhoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(155, 155, 155))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFdescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTFtarefa, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFtarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFhoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFhoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-add-25.png"))); // NOI18N
        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionAddTarefas(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-broom-25.png"))); // NOI18N
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionLimparCampos(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-close-25.png"))); // NOI18N
        jButton3.setText("Fechar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionSair(evt);
            }
        });

        jBtPesquisarView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-google-web-search-25.png"))); // NOI18N
        jBtPesquisarView.setText("Pesquisar");
        jBtPesquisarView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPesquisarView(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtPesquisarView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jBtPesquisarView))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actionAddTarefas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionAddTarefas
        adicionatTarefas();
        limparCampos();
    }//GEN-LAST:event_actionAddTarefas

    private void actionLimparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionLimparCampos
        limparCampos();
    }//GEN-LAST:event_actionLimparCampos

    private void actionSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionSair
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");
        int op = JOptionPane.showConfirmDialog(null, "Encerrar Cadastro?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (op == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_actionSair

    private void jButton5actionEditar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5actionEditar
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5actionEditar

    private void actionPesquisarView(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionPesquisarView
    ViewPrincipal.pesquisarView();
    }//GEN-LAST:event_actionPesquisarView

    private void windowFechar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowFechar
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");
        int op = JOptionPane.showConfirmDialog(null, "Deseja Sair da Janela?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (op == 0) {
        this.dispose();
        }
    }//GEN-LAST:event_windowFechar

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
            java.util.logging.Logger.getLogger(ViewTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTarefas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtPesquisarView;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jCBStatus;
    private com.toedter.calendar.JDateChooser jDateTarefa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFdescricao;
    private javax.swing.JFormattedTextField jTFhoraFim;
    private javax.swing.JFormattedTextField jTFhoraInicio;
    private javax.swing.JTextField jTFid;
    private javax.swing.JTextField jTFtarefa;
    private javax.swing.JTable jTabTarefas;
    // End of variables declaration//GEN-END:variables

    private void adicionatTarefas() {
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm");

        Date dataSelecionada = jDateTarefa.getDate();
        String horaInicioText = jTFhoraInicio.getText();
        String horaFimText = jTFhoraFim.getText();

        //Verificação de hora no formato correto !
        LocalTime horaInicio;
        LocalTime horaFim;

        try {
            horaInicio = LocalTime.parse(horaInicioText, formatadorHora);
            horaFim = LocalTime.parse(horaFimText, formatadorHora);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hora inválida! use o formato HH:mm.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tarefa.setTitulo(jTFtarefa.getText());
        tarefa.setDescricao(jTFdescricao.getText());
        tarefa.setDataTarefa(ConversorData.converterDateParaLocalDate(dataSelecionada));
        tarefa.setHoraInicio(LocalTime.parse(jTFhoraInicio.getText()));
        tarefa.setHoraFim(LocalTime.parse(jTFhoraFim.getText()));
        tarefa.setStatus(String.valueOf(jCBStatus.getSelectedItem()));

        if (cadAlt.equals("Cad")) {
            if (dAOTarefa.salvarTarefaDAO(tarefa) > 0) {

                JOptionPane.showMessageDialog(null, "Cadastro OK.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                limparcampos();
                atualizarTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {

            tarefa.setId(Integer.parseInt(jTFid.getText()));
            if (dAOTarefa.editarTarefaDAO(tarefa)) {
                JOptionPane.showMessageDialog(null, "Tarefa atualizada com sucesso.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                limparcampos();
                atualizarTabela();
                cadAlt = "Cad";

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao Atualizar.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void limparCampos() {
        jTFid.setText("");
        jTFtarefa.setText("");
        jTFdescricao.setText("");
        jTFhoraInicio.setText("");
        jTFhoraFim.setText("");
        jDateTarefa.setDate(null);
        jCBStatus.setSelectedIndex(0);

    }

    /**
     * Método carrega tabela preenchida com os dados do banco.
     */
    private void atualizarTabela() {
        DAOTarefa dao = new DAOTarefa();
        lista = dao.listarTarefaDAO();
        DefaultTableModel model = (DefaultTableModel) jTabTarefas.getModel();
        model.setRowCount(0);

        for (Tarefa t : lista) {
            model.addRow(new Object[]{
                t.getId(),
                t.getTitulo(),
                t.getDescricao(),
                t.getDataTarefa(),
                t.getHoraInicio(),
                t.getHoraFim(),
                t.getStatus()
            });
            aplicarFormatoDataBR(jTabTarefas, 3);
        }
    }

    private void limparcampos() {
        jTFid.setText("");
        jTFtarefa.setText("");
        jTFdescricao.setText("");
        jTFhoraInicio.setText("");
        jTFhoraFim.setText("");
        jDateTarefa.setDate(null);
        jCBStatus.setSelectedIndex(0);

    }

    private void aplicarFormatoDataBR(JTable tabela, int indiceColunaData) {
        tabela.getColumnModel().getColumn(indiceColunaData).setCellRenderer(new DefaultTableCellRenderer() {
            private final DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                if (value instanceof LocalDate) {
                    value = ((LocalDate) value).format(formatoBR);
                }
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        });
    }

    private void pesquisarView() {
        ViewPesquisar viewPesquisar = new ViewPesquisar();

        this.dispose(); //Fechar viewTarefas

        int op = 0;
        if (op == 0) {
            viewPesquisar.setVisible(true);
            viewPesquisar.setLocationRelativeTo(this);
        }
    }
}
