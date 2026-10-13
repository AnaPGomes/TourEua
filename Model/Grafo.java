package Model;

import java.util.ArrayList;

class Grafo<X>{
    private ArrayList<X> CidadesVerticesIndices;
    private X[][] GrafoMatriz;

    public Grafo(){
        this.CidadesVerticesIndices= new arrayList<X>();
        this.GrafoMatriz=new arrayList<X>();

    }

    public void adicionarVertice(X a){
        CidadesVerticesIndices.add(a);
    }

    public void adicionarArestaeVertice(X partida, X chegada, X estrada ){
        //partida e coluna e chagada e linha 

    
        if(partida.getVertices()!=null & chegada.getVertices!=null)
           
            GrafoMatriz[chegada.posicaoDoVertice()][partida.posicaoDoVertice()] = estrada;
            GrafoMatriz[partida.posicaoDoVertice()][chegada.posicaoDoVertice()] = estrada;
            partida.adicionarArestaSaida(estrada);
            chegada.adicionarArestaEntrada(estrada);
    }

    public int posicaoDoVertice(X vertice){
        int posicao=0;
        for(int i =0; i<= CidadesVerticesIndices.size(); i++){
            
            if(CidadesVerticesIndices.get(i).equals(vertice)){//no arraylist vc usa .get(i)
                posicao=i;
                break;
            }
        }
        return posicao;

    }
    public X getVertices(X dado){
        X vertice= null;
        for(int i; i<=CidadesVerticesIndices.size(); i++){
            if(this.vertices[i].equals(dado)){
                vertice=this.vertices[i];
                break; //fecha o for

            }
        return vertice;
        }
    }

    public arrayList<X> getCidadesdoGrafo(){
        return this.CidadesVerticesIndices;
    }
    public X[][] getGrafoMatriz(){
        return this.GrafoMatriz;
    }

}
