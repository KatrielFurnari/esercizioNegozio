import javax.security.sasl.RealmChoiceCallback;
import java.util.ArrayList;
import java.util.Scanner;

public class JetMarket {
    public static ArrayList<Prodotto> arrProdotti = new ArrayList<>();
    public static ArrayList<RacchettaPadel> arrRacchetteDeluxe = new ArrayList<>();
    public static void main(String[] args) {


        Libro libro1 = new Libro("ABC0123","Il Silmarillion","Fantasy", 0.30, 12.50, 650);
        Libro libro2 = new Libro("DEF4567","Dune","Sci-fi", 0.20, 11.50, 760);
        Libro libro3 = new Libro("GHI8912","La Torre Nera","Fantasy", 1.20, 11.50, 850);

        Dvd dvd1 = new Dvd("Leon","Drammatico",0.20,20 ,120);
        Dvd dvd2 = new Dvd("Fantozzi","Comico",0.20,10 ,90);
        Dvd dvd3 = new Dvd("The Thing","Horror",0.20,20 ,100);

        RacchettaPadel racPad1 = new RacchettaPadel("Beniamino",0.4,400,"Goccia");
        RacchettaPadel racPad2 = new RacchettaPadel("Beniamino",0.5,320,"Diamante");
        RacchettaPadel racPad3 = new RacchettaPadel("Volante",0.9,60,"Rotonda");
        RacchettaPadel racPad4 = new RacchettaPadel("Augello",0.7,90,"Goccia");

        arrProdotti.add(libro1);
        arrProdotti.add(libro2);
        arrProdotti.add(libro3);
        arrProdotti.add(dvd1);
        arrProdotti.add(dvd2);
        arrProdotti.add(dvd3);
        arrProdotti.add(racPad1);
        arrProdotti.add(racPad2);
        arrProdotti.add(racPad3);
        arrProdotti.add(racPad4);

        pesoTot(arrProdotti);
        highestPrice(arrProdotti);
        libriFantasy(arrProdotti);

        System.out.println("Nel JetMarket ci sono " + arrProdotti.size() + " prodotti!");
        System.out.println("Il Peso totale dei prodotti del JetMarket è: " + pesoTot(arrProdotti) + "kg");
        System.out.println("L'oggetto più costoso del JetMarket costa: " + highestPrice(arrProdotti) + " euro!");
        System.out.println("Al JetMarket ci sono " + libriFantasy(arrProdotti) + " libri Fantasy!");



    }
    public static double pesoTot(ArrayList x){
        double totPeso = 0;
        for (Prodotto p : arrProdotti){
           totPeso += p.getPeso();
        }
        return totPeso;
    }

    public static double highestPrice(ArrayList x){
        double prezzoMassimo = 0;
        for (Prodotto p : arrProdotti ){
            if(p.getPrezzo() > prezzoMassimo){
                prezzoMassimo = p.getPrezzo();
            }
        }
        return prezzoMassimo;
    }

    public static int libriFantasy(ArrayList x){
        int count = 0;
        for (Prodotto p : arrProdotti ){
            if(p instanceof Libro) {
                Libro libro1 = (Libro)p;
                if (libro1.getCategoria().equalsIgnoreCase("Fantasy")) {
                    count++;
                }
            }
        }
        return count;
    }

    public void addProdotto(){
        Scanner sc = new Scanner(System.in);
        String answer1;
        System.out.println("Che tipo prodotto vuoi aggiungere? Digita: ");
        System.out.println("Libro - Dvd - Racchetta");
        answer1 = sc.nextLine();
        if (answer1.equalsIgnoreCase("Libro")) {
            System.out.println("Inserisci: ISBN, Titolo, Categoria, Peso, Prezzo, Numero Pagine");
            String isbn = sc.nextLine();
            String titolo = sc.nextLine();
            String  categoria = sc.nextLine();
            double peso = sc.nextDouble();
            double prezzo = sc.nextDouble();
            int numPagine = sc.nextInt();
            Libro libroX = new Libro(isbn, titolo, categoria, peso, prezzo,numPagine);
            arrProdotti.add(libroX);
        } else if (answer1.equalsIgnoreCase("Dvd")) {
            System.out.println("Inserisci: Titolo, Categoria, Peso, Prezzo, Durata");
            String titolo = sc.nextLine();
            String categoria = sc.nextLine();
            double peso = sc.nextDouble();
            double prezzo = sc.nextDouble();
            double durata = sc.nextInt();
            Dvd dvdX = new Dvd(titolo, categoria, peso, prezzo,durata);
            arrProdotti.add(dvdX);
        }
        else if (answer1.equalsIgnoreCase("Racchetta")) {
            System.out.println("Inserisci: Marca, Peso, Prezzo, Tipo");
            String marca = sc.nextLine();
            double peso = sc.nextDouble();
            double prezzo = sc.nextDouble();
            String tipo = sc.nextLine();
            RacchettaPadel racchettaX = new RacchettaPadel(marca, peso, prezzo,tipo);
            arrProdotti.add(racchettaX);
        }
        else {
            System.out.println("Errore durante inserimento Tipo di Prodotto");
        }
    }
    public void racchetteDeluxe() {
        for( Prodotto r : arrProdotti ){
            if(r instanceof RacchettaPadel){
                    RacchettaPadel raccGoccia = (RacchettaPadel) r;
                    if (raccGoccia.getTipo().equalsIgnoreCase("Goccia") && raccGoccia.getPrezzo() > 100 ){
                    arrRacchetteDeluxe.add(raccGoccia);
                    }
                }
        }
    }
}