/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.util.Vector;
import javax.swing.JOptionPane;

public class CompraGUI extends javax.swing.JPanel {

    //Armazena temporariamente o produto com código informado
    private Produto produtoSelecionado;
    private ModeloTabelaCompra carrinhoComprasTab;
    private double precoCompra;

    public CompraGUI() {
        initComponents();
        precoCompra = 0.0;
        meuInitComponents();
    }

    private void meuInitComponents() {

        this.carrinhoComprasTab = new ModeloTabelaCompra(this);

        //Criar a conexão dos dados (comportamento) do obj da classe com a tabela GUI
        tabelaCarrinho.setModel(carrinhoComprasTab);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        codtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nometxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        quantidadetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        precounittxt = new javax.swing.JTextField();
        removerbuton = new javax.swing.JButton();
        finalizarbuton = new javax.swing.JButton();
        estoquebuton = new javax.swing.JButton();
        addprodutobuton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JLabel();

        tabelaCarrinho.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaCarrinho);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Código");

        codtxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        codtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codtxtActionPerformed(evt);
            }
        });
        codtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codtxtKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        nometxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nometxt.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Quantidade");

        quantidadetxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        quantidadetxt.setText("1");
        quantidadetxt.setEnabled(false);
        quantidadetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadetxtActionPerformed(evt);
            }
        });
        quantidadetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantidadetxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantidadetxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantidadetxtKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Preço Parcial");

        precounittxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        precounittxt.setEnabled(false);
        precounittxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precounittxtActionPerformed(evt);
            }
        });

        removerbuton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        removerbuton.setText("Remover");
        removerbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerbutonActionPerformed(evt);
            }
        });

        finalizarbuton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finalizarbuton.setText("Finalizar");
        finalizarbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarbutonActionPerformed(evt);
            }
        });

        estoquebuton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estoquebuton.setText("Estoque");
        estoquebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoquebutonActionPerformed(evt);
            }
        });

        addprodutobuton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addprodutobuton.setText("Add produto");
        addprodutobuton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addprodutobutonMouseClicked(evt);
            }
        });
        addprodutobuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addprodutobutonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Valor total R$:");

        totalTxt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalTxt.setText("00,00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(codtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nometxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quantidadetxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(precounittxt, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addprodutobuton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(estoquebuton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalTxt)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removerbuton, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(finalizarbuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removerbuton)
                        .addGap(40, 40, 40)
                        .addComponent(finalizarbuton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nometxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidadetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precounittxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(totalTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addprodutobuton)
                    .addComponent(estoquebuton))
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void precounittxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precounittxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precounittxtActionPerformed

    private void removerbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerbutonActionPerformed

        int linha = tabelaCarrinho.getSelectedRow();

        if (linha > -1) {

            //Ok posso remover o produto
            int op = JOptionPane.showConfirmDialog(null, "Deseja remover o produto selecionado",
                    "Confirmação de exclusão", JOptionPane.YES_NO_OPTION);

            if (op == JOptionPane.YES_OPTION) {

                String senha = JOptionPane.showInputDialog(null, "Informe a senha do gerente", "operação restrita", JOptionPane.INFORMATION_MESSAGE);

                if (senha != null && senha.equals("ifmg")) {

                    //Remover o produto e atualizar quantidades
                    carrinhoComprasTab.removeProdutoCarrinho(linha);
                    atualizaQuantidades();
                }
            }
        } else {
            //Produto não foi selecionado para remoção
            JOptionPane.showMessageDialog(null, "É preciso selecionar algum produto",
                    "selecionar!!!", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_removerbutonActionPerformed

    private void estoquebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoquebutonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estoquebutonActionPerformed

    private void quantidadetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadetxtActionPerformed

    private void codtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codtxtActionPerformed

    private void codtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codtxtKeyTyped

        //Definindo que a tecla pressionada foi enter para ai sim executar os códigos abaixo
        if (evt.getKeyChar() == '\n') {

            //Avalindo se existe informação  no campo do código
            if (!codtxt.getText().isEmpty()) {

                try {

                    //Avaliando se o dado informado é numérico
                    int cod = Integer.parseInt(codtxt.getText());

                    //Efetua a busca do produto com o código informado
                    produtoSelecionado = FakeBanco.consultaProdutoCod(cod);

                    //Avalindo se existe produto com o código informado 
                    if (produtoSelecionado != null) {

                        //Atualizamos os campos com dados do produto
                        nometxt.setText(produtoSelecionado.getNome());
                        precounittxt.setText(produtoSelecionado.getPreco() + "");
                        quantidadetxt.setEnabled(true);
                    } else {
                        //Não cadastrado
                        JOptionPane.showMessageDialog(null, "Produto não cadastrado", "Código", JOptionPane.INFORMATION_MESSAGE);

                    }

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null, "O código deve ser um valor numérico", "erro no código", JOptionPane.WARNING_MESSAGE);
                }

            }
        }

    }//GEN-LAST:event_codtxtKeyTyped

    private void quantidadetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadetxtKeyPressed

        //evento ocorre após apertar a tecla por um tempo

    }//GEN-LAST:event_quantidadetxtKeyPressed

    private void quantidadetxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadetxtKeyReleased

        //O operador do caixa, vai informar uma nova quantidade
        //calcular o preço parcial do produtos(lote)
        if (!quantidadetxt.getText().isEmpty()) {

            try {
                int quantidade = Integer.parseInt(quantidadetxt.getText());

                double parc = produtoSelecionado.getPreco() * quantidade;
                precounittxt.setText(String.format("%.2f", parc));
            } catch (NumberFormatException ex) {

                precounittxt.setText("N/A");

            }
        } else {

            //Campo da quantidade sem informação
            precounittxt.setText("N/A");

        }


    }//GEN-LAST:event_quantidadetxtKeyReleased

    private void quantidadetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadetxtKeyTyped
        // evento ocorre antes mesmo da tecla que pressionamos ser inserida no campo
    }//GEN-LAST:event_quantidadetxtKeyTyped

    private void addprodutobutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addprodutobutonActionPerformed

        if (produtoSelecionado != null && !precounittxt.getText().equals("N/A")) {
            //Esse produto está apto a ser adicionado na tabela 

            int quantidade = Integer.parseInt(quantidadetxt.getText());
            if (quantidade <= produtoSelecionado.getQuantidade()) {

                Produto vendido = new Produto(produtoSelecionado.getCodigo(), produtoSelecionado.getNome(),
                        produtoSelecionado.getPreco(), quantidade);

                //produtoSelecionado.setQuantidade(produtoSelecionado.getQuantidade() - quantidade);

                //Aqui estamos atualizando o valor total do cliente
                precoCompra += produtoSelecionado.getPreco() * quantidade;
                totalTxt.setText(String.format("%.2f", precoCompra));

                //Limpando as informações para que um novo produto seja informado
                codtxt.setText("");
                quantidadetxt.setText("1");
                precounittxt.setText("");
                produtoSelecionado = null;
                quantidadetxt.setEnabled(false);
                nometxt.setText("");

                //Adicionar o produto vendido ao carinho de compras(tabela)
                this.carrinhoComprasTab.addNovoProduto(vendido);
                tabelaCarrinho.updateUI();

            } else {
                //Não temos a quantidade suficiente para concretizar a venda
                JOptionPane.showMessageDialog(null, "Não temos quantidade suficiente para realizar a venda deste produto",
                        "quantidade insuf.",JOptionPane.INFORMATION_MESSAGE);
                
            }

        } else {

            //Produto que não existe ou a quantidade não condiz com o padrão esperado
            JOptionPane.showMessageDialog(null, "A quantidade de produtos informada deve ser um valor númerico",
                        "entrade de quantidade inválida",JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_addprodutobutonActionPerformed

    public void atualizaQuantidades() {
        //Atualiza as informações da tabela
        tabelaCarrinho.updateUI();

        //Atualizamos o valor da compra com os produtos no carrinho
        double preco = carrinhoComprasTab.calculaPrecoParcialCompra();
        totalTxt.setText(String.format("%.2f", preco));

    }


    private void addprodutobutonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addprodutobutonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addprodutobutonMouseClicked

    private boolean verificaQuantidades(){
        Vector<Produto> produtos = carrinhoComprasTab.produtosCarrinho();
        
        for(int i = 0 ; i < produtos.size(); i++){
            Produto estoque = FakeBanco.consultaProdutoCod(produtos.get(i).getCodigo());
            if(produtos.get(i).getQuantidade() > estoque.getQuantidade()){
                
                JOptionPane.showMessageDialog(null, "A quantidade do produto: "+estoque.getNome()+ " Não é suficiente para"
                        + " realizar a venda ", "Quantidade insuf.", JOptionPane.INFORMATION_MESSAGE);
                              
                return false;
            }
                
        }
        return true;
    }
    
    
    
    private void finalizarbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarbutonActionPerformed
       //Verificar se temos as quantidades do produtos que estão sendo vendidos
        if(verificaQuantidades() == true){
            //Atualizar o nosso banco de dados fake(memória RAM)
            Vector <Produto>  produtos = carrinhoComprasTab.produtosCarrinho();
            
            for(int i  = 0; i < produtos.size(); i++){
                
                Produto estoque = FakeBanco.consultaProdutoCod(produtos.get(i).getCodigo());
                estoque.setQuantidade(estoque.getQuantidade() - produtos.get(i).getQuantidade());
                
            }
            
            //Zerando o valor total para próxima compra
            precoCompra = 0.0;
            totalTxt.setText("0.0");
            
            //Remover os produtos do carrinho de compra(da compra finalizada)
            carrinhoComprasTab.limpaCarrinho();
            tabelaCarrinho.updateUI();
            
        }
       
       
       
    }//GEN-LAST:event_finalizarbutonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addprodutobuton;
    private javax.swing.JTextField codtxt;
    private javax.swing.JButton estoquebuton;
    private javax.swing.JButton finalizarbuton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nometxt;
    private javax.swing.JTextField precounittxt;
    private javax.swing.JTextField quantidadetxt;
    private javax.swing.JButton removerbuton;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JLabel totalTxt;
    // End of variables declaration//GEN-END:variables

}
