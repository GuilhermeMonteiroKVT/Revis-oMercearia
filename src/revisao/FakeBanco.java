package revisao;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FakeBanco {

    private static Vector<Produto> produtos;

    //Leitura dos arquivos do Excel
    private static void cargaArquivo() {

        //Ajuste na criação do vetor de produtos static
        if (produtos == null) {

            produtos = new Vector<>();

        } else {

            produtos.clear();

        }

        File arquivocsv = new File("C:\\Users\\gui\\Desktop\\produtos.csv");

        try {
            //Estrutura de leitura do arquivo

            FileReader marcaLeitura = new FileReader(arquivocsv);

            BufferedReader bufLeitura = new BufferedReader(marcaLeitura);

            //Leitura de cada linha
            //Leitura da primeira linha(cabeçalho) devemos joga-la fora
            bufLeitura.readLine();
            String linha = bufLeitura.readLine();

            while (linha != null) {
                //Linhas seguintes até a ultima linha do arquivo

                //78564213;Carne Churrasco;1.26;178 (split) que divide o texto baseado em determinado padrão
                String infos[] = linha.split(";");

                //Separar as informações e fazer as devidas conversões
                int cod = Integer.parseInt(infos[0]);
                String nome = infos[1];
                double preco = Double.parseDouble(infos[2]);
                int quantidade = Integer.parseInt(infos[3]);

                //Armazenar todos produtos da merceária no Vetor dinâmico
                produtos.add(new Produto(cod, nome, preco, quantidade));

                //Ler agora a próxima linha do arquivo
                linha = bufLeitura.readLine();

            }

            //Liberando o arquivo para outros processos
            bufLeitura.close();

        } catch (FileNotFoundException ex) {
            System.err.println("O arquivo selecionado não existe");

        } catch (IOException e) {
            System.err.println("O arquivo está corrompido");

        }

    }

    public static Produto consultaProdutoCod(int cod) {

        //Se o arquivo ainda não foi carregado, precisamos carrega-lo
        if (produtos == null) {
            cargaArquivo();
        }
        
        
        //Busca pelo produto com código especificado 
        for(Produto prodI : produtos){        
            if(prodI.getCodigo() == cod){
                return prodI;
            }
                
        }
        //Caso não exista nenhum produto com o cod especificado no parametro 
        return null;
    }

    public static void atualizaArquivo(){
        
        File arquivo = new File("C:\\Users\\gui\\Desktop\\produtos.csv");
        
        
        try {
            FileWriter escritor = new FileWriter(arquivo);
            
            BufferedWriter bufEscrita = new BufferedWriter(escritor);
            
            for(int i = 0; i  < produtos.size(); i++){
                
                bufEscrita.write(produtos.get(i)+"\n");
            }
            
            bufEscrita.flush();
            bufEscrita.close();
            
        } catch (IOException ex) {
            System.err.println("Dispositivo com falha");
        }
        
        
    }
}
