package view.createNew;

import exceptions.DataNaoInformadaException;
import exceptions.DescricaoObrigatoriaNaoInformadaException;
import exceptions.NomeNaoInformadoException;
import formularios.Formulario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class NewForm extends javax.swing.JFrame {

    public NewForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTitle1 = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        txtInitDate = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndDate = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo questionário");
        setResizable(false);

        jLabel1.setText("Título do questionário:");

        jLabel2.setText("Descrição do questionário:");

        submitBtn.setText("Continuar");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        txtInitDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));

        jLabel3.setText("Data de início:");

        txtEndDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));

        jLabel4.setText("Data de término:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(179, 179, 179));
        jLabel5.setText("Ex: 12/07/2010");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitle)
                    .addComponent(txtTitle1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtInitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndDate)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 94, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInitDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(submitBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // Implementar exceções de criação do formulário
        boolean excecao = true;//verificar se houve excecoes -> true = nao houve
        try{
            if( txtTitle.getText().equals("") == true ){
                excecao = false;
                throw new NomeNaoInformadoException();
            }
        }catch(NomeNaoInformadoException e){
            JOptionPane.showMessageDialog(null, "O titulo do formulário deve ser informado.");
        }//excecao de nome
        try{
            if( txtTitle1.getText().equals("") == true ){
                excecao = false;
                throw new DescricaoObrigatoriaNaoInformadaException();
            }
       }catch(DescricaoObrigatoriaNaoInformadaException e){
            JOptionPane.showMessageDialog(null, "A descrição do formulário deve ser informada.");

       }//excecao de enunciado
       try{
            if(txtInitDate.getText().equals("") == true || txtEndDate.getText().equals("") == true){
                excecao = false;
                throw new DataNaoInformadaException();
            }
       }catch(DataNaoInformadaException e){
           JOptionPane.showMessageDialog(null,"As datas do formulário devem ser informadas.");
       }//excecao de data
       if(excecao){
        SimpleDateFormat init = new SimpleDateFormat(txtInitDate.getText());//pega a data inicial
        SimpleDateFormat end = new SimpleDateFormat(txtEndDate.getText());//pega a data final
        Formulario form = new Formulario(txtTitle.getText(), txtTitle1.getText(), init, end);//cria o formulario com nome, enun, dataIni, dataFin
        SelectQuestion selectQuestion = new SelectQuestion();
        selectQuestion.setVisible(true);
       }
    }//GEN-LAST:event_submitBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton submitBtn;
    private javax.swing.JFormattedTextField txtEndDate;
    private javax.swing.JFormattedTextField txtInitDate;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtTitle1;
    // End of variables declaration//GEN-END:variables
}
