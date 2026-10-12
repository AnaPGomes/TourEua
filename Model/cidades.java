package Model;

class cidade{
    private String nome;
    private Integer populacao;
    private Integer dias;
    private ArrayList<EstradaAresta> arestaEntrada;
    private ArrayList<EstradaAresta> arestaSaida;


    public cidade(String nome, Integer populacao, Integer dias){
        this.nome= nome;
        this.populacao= populacao;
        this.dias= dias;
        this.arestaEntrada = new ArrayList<EstradaAresta>();
        this.arestaSaida = new ArrayList<EstradaAresta>();
    }

    
    public cidade(String nome, Integer populacao){
        this.nome= nome;
        this.populacao= populacao;
        this.dias= 0;
        this.arestaEntrada = new ArrayList<EstradaAresta>();
        this.arestaSaida = new ArrayList<EstradaAresta>();
    }

    public void adicionarArestaEntrada( EstradaAresta A){
        arestaEntrada.add(A);
    }

    public void adicionarArestaSaida( EstradaAresta A){
        arestaSaida.add(A);
    }

    public ArrayList<EstradaAresta> getArestaEntrada() {
    return arestaEntrada;
    }

    public ArrayList<EstradaAresta> getArestaSaida() {
    return arestaSaida;
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