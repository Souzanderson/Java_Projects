package geradordecurriculo;
import java.awt.Desktop;
import java.io.IOException;

/**
 *
 * @author Anderson Souza
 */
public class DadosFormacao extends javax.swing.JFrame {

    /**
     * Creates new form DadosFormacao
     */
    public DadosFormacao() {
        initComponents();
        String dados="<h3>Dados de Formação</h3><hr>";
        try {
            Gerador.corpo(dados);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ltitulo = new javax.swing.JLabel();
        lcurso = new javax.swing.JLabel();
        linstituicao = new javax.swing.JLabel();
        linicio = new javax.swing.JLabel();
        lconclusao = new javax.swing.JLabel();
        ldescricao = new javax.swing.JLabel();
        textarea = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        datainicio = new javax.swing.JFormattedTextField();
        dataconclusao = new javax.swing.JFormattedTextField();
        instituicao = new javax.swing.JTextField();
        curso = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();
        linicio1 = new javax.swing.JLabel();
        situacao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ltitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ltitulo.setText("DADOS DE FORMAÇÃO");

        lcurso.setText("Curso:");

        linstituicao.setText("Instituição:");

        linicio.setText("Inicio:");

        lconclusao.setText("Conclusão:");

        ldescricao.setText("Descrição:");

        descricao.setColumns(20);
        descricao.setRows(5);
        textarea.setViewportView(descricao);

        datainicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        dataconclusao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        linicio1.setText("Situação:");

        situacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Concluído", "Cursando", "Interrompido" }));
        situacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                situacaoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(ltitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linstituicao)
                            .addComponent(linicio)
                            .addComponent(lcurso)
                            .addComponent(ldescricao)
                            .addComponent(linicio1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textarea)
                            .addComponent(instituicao)
                            .addComponent(curso)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(situacao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(datainicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lconclusao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(dataconclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(adicionar)
                        .addGap(18, 18, 18)
                        .addComponent(salvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ltitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcurso)
                    .addComponent(curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linstituicao)
                    .addComponent(instituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linicio1)
                    .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linicio)
                    .addComponent(lconclusao)
                    .addComponent(datainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataconclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ldescricao)
                    .addComponent(textarea, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(adicionar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        
        String dados="Curso: "+curso.getText()+
                " - "+situacao.getSelectedItem().toString()+
                "<br/>Instuição: "+instituicao.getText()+
                "<br/>Data de início: "+datainicio.getText()+
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Data de conclusão: "+dataconclusao.getText()+
                "<br/>Descrição: "+descricao.getText()+"<br/><br/>";
        try {
           
            Gerador.corpo(dados);
        } catch (Exception e) {
            e.printStackTrace();
        }
        curso.setText("");
        instituicao.setText("");
        datainicio.setText("");
        dataconclusao.setText("");
        descricao.setText("");
        curso.requestFocus();
    }//GEN-LAST:event_adicionarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        String dados="Curso: "+curso.getText()+" - "+
                situacao.getSelectedItem().toString()+
                "<br/>Instuição: "+instituicao.getText()+
                "<br/>Data de início: "+datainicio.getText()+
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Data de conclusão: "+dataconclusao.getText()+
                "<br/>Descrição: "+descricao.getText()+"<br/><br/>";
        if(curso.getText().trim().isEmpty()==false){
            try {
           
                Gerador.corpo(dados);
            } catch (Exception e) {
                e.printStackTrace();
                }
        }
        setVisible(false);
        DadosProfissionais cad = new DadosProfissionais();
        cad.setVisible(true);
        
    }//GEN-LAST:event_salvarActionPerformed

    private void situacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_situacaoFocusLost
         if(situacao.getSelectedItem().toString()=="Interrompido"){
            dataconclusao.setEnabled(false);
        }else{
             dataconclusao.setEnabled(true);
         }
    }//GEN-LAST:event_situacaoFocusLost

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
            java.util.logging.Logger.getLogger(DadosFormacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosFormacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosFormacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosFormacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosFormacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JTextField curso;
    private javax.swing.JFormattedTextField dataconclusao;
    private javax.swing.JFormattedTextField datainicio;
    private javax.swing.JTextArea descricao;
    private javax.swing.JTextField instituicao;
    private javax.swing.JLabel lconclusao;
    private javax.swing.JLabel lcurso;
    private javax.swing.JLabel ldescricao;
    private javax.swing.JLabel linicio;
    private javax.swing.JLabel linicio1;
    private javax.swing.JLabel linstituicao;
    private javax.swing.JLabel ltitulo;
    private javax.swing.JButton salvar;
    private javax.swing.JComboBox<String> situacao;
    private javax.swing.JScrollPane textarea;
    // End of variables declaration//GEN-END:variables
}
