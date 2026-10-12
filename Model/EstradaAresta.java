package Model;

class EstradaAresta{
    private Float custo;
    private  Float comprimento;

    public void EStradaAresta(Floa custo, Float comprimento){
        this.custo= custo;
        this.comprimento= comprimento;
    }

    public void setCusto(Float custo){
        this.custo= custo;
    }

    public Float getCusto(){
        return  this.custo;
    }

    public void setComprimento(Float  comprimento){
        this.comprimento= comprimento;
    }

    public Float getComprimento(){
        return  this.comprimento;
    }

}