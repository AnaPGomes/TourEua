package Model;

import java.util.ArrayList;

class Grafo<X>{
    private ArrayList<X> CidadesDesejadas;
    private X[][] GrafoMatriz;

    public Grafo(){
        this.CidadesDesejadas= new arrayList<X>();
        this.GrafoMatriz=new arrayList<X>();

    }

    public void adicionarVertice(X a){
        CidadesDesejadas.add(a);
    }

    public void adicionarAresta(X partida, X chegada, X estrada ){

    
        if(partida.getVertices()!=null & chegada.getVertices!=null)
            GrafoMatriz[partida][chegada] = estrada;
    }

    public int posicaoDoVertice(X vertice){
        int posicao=0;
        for(int i =0; i<= CidadesDesejadas.size(); i++){
            
            if(CidadesDesejadas.get(i).equals(vertice)){//no arraylist vc usa .get(i)
                posicao=i;
                break;
            }
        }
        return posicao;

    }
    public X getVertices(X dado){
        X vertice= null;
        for(int i; i<=CidadesDesejadas.size(); i++){
            if(this.vertices[i].equals(dado)){
                vertice=this.vertices[i];
                break; //fecha o for

            }
        return vertice;
        }

        


    }
}