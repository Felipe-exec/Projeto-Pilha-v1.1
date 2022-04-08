package javapallet;

import java.util.*;
import javax.swing.JOptionPane;

public class FormSistema extends javax.swing.JFrame 
{

    Stack<Pallet> pilha = new Stack<>();          //declarando pilha principal;
    Stack<Pallet> paux = new Stack<>();           //declarando pilha auxiliar do delete;
    
    public FormSistema() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAux = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listPilha = new javax.swing.JTextArea();
        txtProduto = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        lblTopo = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Java de Controle de Pallets");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listAux.setColumns(20);
        listAux.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listAux.setRows(5);
        jScrollPane1.setViewportView(listAux);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 350, 420));

        listPilha.setColumns(20);
        listPilha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listPilha.setRows(5);
        jScrollPane2.setViewportView(listPilha);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 350, 420));

        txtProduto.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));
        jPanel2.add(txtProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 230, 60));

        txtQtd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtQtd.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade"));
        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });
        jPanel2.add(txtQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 230, 58));

        lblTopo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTopo.setForeground(new java.awt.Color(255, 255, 255));
        lblTopo.setText("Topo:");
        jPanel2.add(lblTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 270, 40));

        btnRemove.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRemove.setText("Remover");
        btnRemove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 110, 50));

        btnAdd.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 110, 50));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javapallet/fundodetela.jpg"))); // NOI18N
        jPanel2.add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void mostra()
    {
       //Mostrando a pilha principal-----------------
       listPilha.setText("");
       for(Pallet p: pilha)
            {
                listPilha.append(p.toString()+"\n");
            }
       
       //Mostrando a pilha Aux-----------------------
       listAux.setText("");
       for(Pallet p: paux)
       {
           listAux.append(p.toString() + "\n");
       }
       //--------------------------------------------
       if(pilha.isEmpty())
       {
           lblTopo.setText("Topo -> Vazio");
       }
       else
       {
           lblTopo.setText("Topo -> "+pilha.peek());
       }
    }
    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        
    }//GEN-LAST:event_txtQtdActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Pallet p = new Pallet();
        p.setProduto(txtProduto.getText());
        p.setQtd( Integer.parseInt(txtQtd.getText()) );
        pilha.push(p);
        System.out.println(pilha);
        System.out.println("Topo :"+pilha.peek());
        mostra();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
    Pallet p = new Pallet();
    while(!pilha.isEmpty())
    {
        p = pilha.peek();
        if(p.getProduto().equals(txtProduto.getText()))
        {
            //Testar se a quantidade é o que quero remover
            if ((Integer.parseInt(txtQtd.getText())) >= p.getQtd()) //Se for >= pop apenas - fala que removeu tudo
            {
                pilha.pop();
            }
            else //se for < decrementa do p.getQtd a quantidade da caixa
            {
                p.setProduto(txtProduto.getText());
                p.setQtd( Integer.parseInt(txtQtd.getText()));
                pilha.pop();
                pilha.push(p);
            }
            //e devolve - push(p)
            JOptionPane.showMessageDialog(null, "Encontrado com Sucesso!");
            mostra();
            break;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Movendo para auxiliar: " + p.getProduto());
            paux.push(pilha.pop());
            mostra();
        }
    }
    }//GEN-LAST:event_btnRemoveActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new FormSistema().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTopo;
    private javax.swing.JTextArea listAux;
    private javax.swing.JTextArea listPilha;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
