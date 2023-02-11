public class Libro extends Prodotto{

    private String isbn;
    private String titolo;
    private String categoria;
    double peso;
    double prezzo;
    private int numeroPagine;
    Libro(String isbn,String titolo,String categoria,double peso, double prezzo, int numeroPagine){
        this.isbn = isbn;
        this.titolo = titolo;
        this.categoria = categoria;
        this.peso = peso;
        this.prezzo = prezzo;
        this.numeroPagine = numeroPagine;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public double getPeso() {
        return peso;
    }
    @Override
    public double getPrezzo() {
        return prezzo;
    }
    @Override
    public String toString(){
        return titolo;
    }

}
