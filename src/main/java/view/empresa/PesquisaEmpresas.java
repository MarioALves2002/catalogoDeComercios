package view.empresa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dao.EmpresaDAO;
import modelo.entidades.Empresa;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.dao.CategoriaDAO;
import modelo.entidades.Categoria;
import util.Informacoes;
import view.administrador.Login;

/**
 *
 * @author mario
 */
public class PesquisaEmpresas extends javax.swing.JFrame {

    /**
     * Creates new form telaPesquisa
     */
    public PesquisaEmpresas() {
        initComponents();
        
        if (Informacoes.temUsuarioLogado()) {
            btnCadastrar.setVisible(true);
        } else {
            btnCadastrar.setVisible(false);
        }
        preencherCategorias();
        
               
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbFiltro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelalojas = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        cboCategoria = new javax.swing.JComboBox<>();

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtro", "Lojas Automotivas", "Supermercados e Mercearias", "Lojas de Roupas", "Restaurantes e Lanchonetes", "Farmácias", "Lojas de Eletrônicos", "Lojas de Móveis", "Padarias", "Lojas de Artigos Esportivos", "Livrarias", "Lojas de Brinquedos", "Joalherias", "Lojas de Calçados", "Lojas de Beleza e Cosméticos", "Pet Shops", "Lojas de Material de Construção", "Floriculturas" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catalogo de comércio");
        setBackground(new java.awt.Color(255, 255, 255));

        tabelalojas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome do Comércio", "Email", "Telefone", "Endereço", "Bairro", "Cidade", "Complemento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelalojas.setEnabled(false);
        jScrollPane1.setViewportView(tabelalojas);

        btnVoltar.setBackground(new java.awt.Color(102, 204, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(102, 204, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        cboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnCadastrar)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(992, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Login tela = new Login();
        tela.setVisible(true);
        
        Informacoes.limparUsuarioLogado();
        
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastroEmpresa TelaCadastro = new CadastroEmpresa();
        TelaCadastro.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_cboCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaEmpresas().setVisible(true);
                
            }
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<Categoria> cboCategoria;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelalojas;
    // End of variables declaration//GEN-END:variables

    public void listar() {
        try {
            EmpresaDAO dao = new EmpresaDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelalojas.getModel();
            model.setNumRows(0);
            
            List<Empresa> lista = dao.listar();
            
            for (Empresa e : lista) {
                model.addRow(new Object[]{
                    e.getId(),
                    e.getNome(),
                    e.getEmail(),
                    e.getTelefone(),
                    e.getEndereco(),
                    e.getBairro(),
                    e.getCidade(),
                    e.getComplemento(),});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listagem de lojas: " + erro);
        }
    }
    CategoriaDAO categoriaDAO = new CategoriaDAO();
    EmpresaDAO dao = new EmpresaDAO();
    
    private void preencherCategorias() {
        try {
            CategoriaDAO categoriaDAO = new CategoriaDAO();
            List<Categoria> lista = categoriaDAO.listar();
            
            for (Categoria c : lista) {
                cboCategoria.addItem(c);
            }
            cboCategoria.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Categoria categoriaSelecionada = (Categoria) cboCategoria.getSelectedItem();
                    int idCategoria = categoriaSelecionada.getId();
                    
                    try {
                        dao.listarPorCategoria(idCategoria);
                        
                                DefaultTableModel model = (DefaultTableModel) tabelalojas.getModel();
            model.setNumRows(0);
            
            List<Empresa> listaPorCategoria = dao.listarPorCategoria(idCategoria);
            
            for (Empresa lc : listaPorCategoria) {
                model.addRow(new Object[]{
                    lc.getId(),
                    lc.getNome(),
                    lc.getEmail(),
                    lc.getTelefone(),
                    lc.getEndereco(),
                    lc.getBairro(),
                    lc.getCidade(),
                    lc.getComplemento(),});
            }
                        System.out.println("a" + dao.listarPorCategoria(idCategoria));
                        
                        
                        
                    } catch (Exception ex) {
                        Logger.getLogger(PesquisaEmpresas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro na coneção com o banco de dados");
        }
    }
    
}
