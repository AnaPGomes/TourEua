package Model;

class cidade{
    private String nome;
    private Integer populacao;
    private Integer dias;

    public cidade(String nome, Integer populacao, Integer dias){
        this.nome= nome;
        this.populacao= populacao;
        this.dias= dias;
    }

    
    public cidade(String nome, Integer populacao){
        this.nome= nome;
        this.populacao= populacao;
        this.dias= 1;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public String getNome(){
        return  this.nome;
    }

    public void setPopulacao(Integer  populacao){
        this.populacao= populacao;
    }

    public Integer getPopulacao(){
        return  this.Populacao;
    }

     public void setDias(Integer  dias){
        this.dias= dias;
    }

    public Integer getDias(){
        return  this.dias;
    }

}