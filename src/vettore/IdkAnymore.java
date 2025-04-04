package vettore;

import java.util.ArrayList;

import persone.Persona8A;

public class IdkAnymore {

    private Object[] pompi = new Object[10];

    public IdkAnymore() {
    }

    public void riempi(Persona8A a) {
        int temp = a.getNome().hashCode();
        temp = temp % pompi.length;
        pompi[temp] = a;
        temp = 0;
    }

    public void riempi1(Persona8A a) {
        int cont = 0;
        int temp = a.getNome().hashCode();
        temp = temp % pompi.length;
        if (pompi[temp] == null) {
            pompi[temp] = a;
        } else {
            while (pompi[temp] != null && cont != pompi.length) {
                cont++;
                temp++;
                if (temp >= pompi.length && cont != pompi.length) {
                    temp = 0;
                }
            }
        }

        temp = 0;
    }

    public void riempi2(Persona8A a) {
        int temp = a.getNome().hashCode();
        temp = temp % pompi.length;

        if (pompi[temp] == null) {
            ArrayList<Persona8A> temp1 = new ArrayList<>();
            temp1.add(a);
            pompi[temp] = temp1;
        } else {
            ArrayList<Persona8A> temp1 = (ArrayList<Persona8A>) pompi[temp];
            temp1.add(a);
        }
    }

    @Override
    public String toString() {
        String testo = "";
        for (Object pompi1 : pompi) {
            testo += pompi1;
        }
        return testo;
    }

    public static void main(String[] args) {
        IdkAnymore a = new IdkAnymore();

        try {

            Persona8A pe = new Persona8A(1.4, "Rossi", "Marco", 21f, "22/12/2000", "ciao@afff.net", "Termo$123%aaaaa");
            Persona8A pe1 = new Persona8A(1.4, "Roiss", "Sburo", 21f, "22/12/2000", "ciao@afff.net", "Termo$123%aaaaa");
            Persona8A pe2 = new Persona8A(1.4, "Bossi", "Ciccio", 21f, "22/12/2000", "ciao@afff.net", "Termo$123%aaaaa");
            a.riempi(pe);
            a.riempi(pe1);
            a.riempi1(pe2);
            a.riempi1(pe1);
            a.riempi2(pe2);
            a.riempi2(pe);

           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
 System.out.println(a.toString());
    }

}


