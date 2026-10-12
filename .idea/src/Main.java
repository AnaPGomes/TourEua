public class Main {
    public static void main(String[] args) {
        Grafo<cidade> grafo = new Grafo<>();

    cidade campinas = new cidade("Campinas", 1200000);
    cidade santos = new cidade("Santos", 430000);
    cidade saoPaulo = new cidade("São Paulo", 11000000);

    grafo.adicionarVertice(campinas);
    grafo.adicionarVertice(santos);
    grafo.adicionarVertice(saoPaulo);

    EstradaAresta A = new EstradaAresta(1220.0, 2324.0);
    EstradaAresta B = new EstradaAresta(1220.0, 2324.0);
    EstradaAresta C = new EstradaAresta(1220.0, 2324.0);

    grafo.adicionarArestaeVertice(campinas, santos, A);
    grafo.adicionarArestaeVertice(saoPaulo, santos, B);
    grafo.adicionarArestaeVertice(saoPaulo, campinas, C);




            }
}