import java.util.ArrayList;

import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class Main {
    public static void main(String[] args) {
        Grafo<cidade> grafo = new Grafo<>();

        //criacao do grafo

    cidade campinas = new cidade("Campinas", 1200000);
    cidade santos = new cidade("Santos", 430000);
    cidade saoPaulo = new cidade("São Paulo", 11000000);

    grafo.adicionarVertice(campinas);
    grafo.adicionarVertice(santos);
    grafo.adicionarVertice(saoPaulo);

    EstradaAresta A = new EstradaAresta(1556.0, 15.0);
    EstradaAresta B = new EstradaAresta(12565.0, 23.0);
    EstradaAresta C = new EstradaAresta(1220.0, 23.0);

    grafo.adicionarArestaeVertice(campinas, santos, A);
    grafo.adicionarArestaeVertice(saoPaulo, santos, B);
    grafo.adicionarArestaeVertice(saoPaulo, campinas, C);

    //CidadesDesejadas do cliente
    //aqui ele digitaria oque quais cidades ele desejaria visitar 
     
    //colocar a data de embarque do Brasil aos EUA, ou seja, quando comecar a viagem


    ArrayList<String> CidadesDesejadas= new ArrayList<>(String);
    //aq ele decidiria quantos dias ele ficaria em cada estado
    //temporiamente:

    CidadesDesejadas.add("Campinas");
    CidadesDesejadas.add("Santos");

    //execicio 5

    String primeiracidade="campinas";
    String segundacidade= "sao  paulo";
    float distanciaTotal=0.0;
    ArrayList<Float> ListaDeDistancia = new ArrayList<>();
    boolean achou= false;


     for (int IdasCidades=0; i<=grafo.getCidadesdoGrafo().size(); IdasCidades++){
        String CidadeAtual= primeiracidade;
            if (CidadeAtual.equals(grafo.getCidadesdoGrafo().get(IdasCidades).getNome())){
                    for(int linha= 0; coluna<=grafo[coluna].legth; coluna++){
                            if(grafo[linha][IdasCidades]!=null){
                                distanciaTotal+=grafo[linha][IdasCidades].getComprimento()*10;
                                for(int acharcidadesegundaria=0; acharcidadesegundaria<=grafo.getCidadesdoGrafo().size(); acharcidadesegundaria++){
                                    if(grafo.getCidadesdoGrafo().get(acharcidadesegundaria).getNome()==segundacidade){
                                        if(acharcidadesegundaria==linha){
                                            achou=true;
                                            break;
                                            
                                        }else{
                                            CidadeAtual=getCidadesdoGrafo.get(linha); 
                                            ListaDeDistancia.add(distanciaTotal);
                                        }
                                    }
                                }
                                

                            }
                        }

                    }
                  

                }



    
        /*
        for (int IdetodososVertices=0; i<=grafo.getCidadesdoGrafo().size(); IdetodososVertices++){
            if (primeiracidade== grafo.getCidadesdoGrafo().get(IdetodososVertices).getNome()){

                EstradaAresta<> ListadeArestaDeSaiadaCidadeAtual= grafo.getCidadesdoGrafo().get(IdetodososVertices).arestaSaida();
                
                //ver se a saida da cidade atual e igual a resta de entrada de outro atributo
                for(int iquesai =0; i<=ListadeArestaDeSaiadaCidadeAtual.size(); iquesai++){
                    for (int IdetdsV=0; i<=grafo.getCidadesdoGrafo().size(); IdetdsV++){
                        if(ListadeArestaDeSaiadaCidadeAtual.get(iquesai).equals(grafo.getCidadesdoGrafo().get(IdetdsV).getArestaEntrada()))
                            distanciaTotal+= grafo.getCidadesdoGrafo().get(IdetdsV).getArestaEntrada().getComprimento();
                            primeiracidade= grafo.getCidadesdoGrafo().get(IdetdsV); //é como se a primeira cidade fosse o atual


                
                 */
                
            }
    }

 