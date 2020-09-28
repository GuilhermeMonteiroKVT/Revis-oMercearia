package revisao;

import javax.swing.*;
import java.awt.*;

public class JanelaPrincipal extends javax.swing.JFrame {

    //Representa a barra de rolagem
    private static JScrollPane barraRolagem;

    //Auxilia na transição dos paineis existentes
    private static JPanel trocaInformacao;

    //Gerencia qual painel estará visível
    private static CardLayout paineisLayout;

    public JanelaPrincipal() {
        initComponents();
        meuInitComponents();

    }

    private void meuInitComponents() {
        //Ocupar toda area do frame com a barra de rolagem
        barraRolagem = new JScrollPane();

        //Desse modo a barra de rolagem ocupará todo espaço do frame
        this.setLayout(new BorderLayout());
        this.add(barraRolagem);

        //Configuração do painel que receberá os paineis apresentados para o usuário
        paineisLayout = new CardLayout();
        trocaInformacao = new JPanel(paineisLayout);

        /*Definindo que na área reservada a apresentação de informação ao usuário
         iremos mostrar as informações do painel de trocaInformacao */
        barraRolagem.setViewportView(trocaInformacao);

        //Qual o primeiro painel eu desejo mostrar para o usuário
        trocaInformacao.add(new CompraGUI(), "compra");
        paineisLayout.show(trocaInformacao, "compra");
    }

    //Metodo para fazer a transição de telas
    public static void efetuaTransicao(JPanel novoPainel, String nome) {
        
        trocaInformacao.add(novoPainel, nome);
        paineisLayout.show(trocaInformacao, nome);
        
        //Resolve o bug no tamanho das tela, pois sem isso ele so prioriza a 
        //maior tela deixando telas menores no tamanho das maiores
        trocaInformacao.setPreferredSize(novoPainel.getPreferredSize());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FakeBanco.atualizaArquivo();
        
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
