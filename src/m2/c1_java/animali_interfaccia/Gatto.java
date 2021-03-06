package m2.c1_java.animali_interfaccia;

import java.time.Year;

public class Gatto implements IAnimale {

    public Gatto(String n) {
        nome = n;
        nascita = Year.now();
    }
    
    public Gatto(String n, Year a) {
        nome = n;
        nascita = a;
    }

    @Override
    public String toString() {
        return nome + ": \"" + verso() + "!\", " +
               zampe() + " zampe, " + anni() + " anni";
    }

    @Override
    public int compareTo(IAnimale a) {
        return anni() - a.anni();
    }

    public int anni() {
        return Year.now().getValue() - nascita.getValue();
    }

    @Override
    public String verso() {
        return "Miao";
    }

    @Override
    public int zampe() {
        return 4;
    }
    
    private String nome;
    private Year nascita;
}
