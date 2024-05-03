package ci.sidem.miniMaxSum;

import java.math.BigInteger;
import java.util.List;

public class AlgorithmesTri {
    /*
    Procédure de tri par sélection
    procedure triSelection(entier[] tab)
      entier i, k;
      entier min;
      entier tmp;
      pour (i de 1 à N-1 en incrémentant de 1) faire
            recherche du numero du minimum
            min <- i;
            pour (k de i+1 à N en incrémentant de 1) faire
                si (tab[k] < tab[min]) alors
                min <- k;
                fin si
            fin pour
            echange des valeurs entre la case courante et le minimum
            tmp <- tab[i];
            tab[i] <- tab[min];
            tab[min] <- tmp;
      fin pour
     fin procedure
    */
    public static void triParSelection(List<BigInteger> tab){
        System.out.println("TABLEAU NON TRIER ====={}\n"+tab);
        for (int i = 0; i < tab.size() - 1; i++) {
            int min = i;
            for (int j = i+1; j < tab.size(); j++) {
                if ( tab.get(j).compareTo(tab.get(min)) < 0) {
                    min = j;
                }
            }
            BigInteger tmp = tab.get(i);
            tab.set(i,tab.get(min));
            tab.set(min,tmp);
        }
        System.out.println("TABLEAU  TRIER PAR SELECTION====={}   "+tab);
    }



    /*
    Procédure de tri bulle
        procedure triBulle(entier[] tab)
            entier i, k;
            entier tmp;
            pour (i de N à 2 en décrémentant de 1) faire
                pour (k de 1 à i-1 en incrémentant de 1) faire
                    si (tab[k] > tab[k+1]) alors
                    tmp <- tab[k];
                    tab[k] <- tab[k+1];
                    tab[k+1] <- tmp;
                    fin si
                fin pour
            fin pour
        fin procedure
    */
    public static void triBulle(List<Integer> tab){
        System.out.println("TABLEAU NON TRIER ====={}\n"+tab);
        for (int i = tab.size(); i < 2; i--) {
            System.out.println("ELEMENT PRINCIPAL COURANTE =====index =="+i +"  VALEUR  "+tab.get(i));
            for (int j = 1; j < i-1; j++) {
                System.out.println("ELEMENT SECONDAIRE ==index =="+j +"VALEUR  "+tab.get(j));
                if (tab.get(j) > tab.get(j+1)) {
                    System.out.println("IL YA ECHANGE ENTRE  =="+tab.get(j) +"VALEUR  "+tab.get(j+1));
                    Integer tmp = tab.get(j);
                    tab.set(j,tab.get(j+1));
                    tab.set(j+1,tmp);
                }
            }
            System.out.println("ELEMENT PRINCIPAL COURANTE =====index =="+i +"  VALEUR  "+tab.get(i));
        }
        System.out.println("TABLEAU  TRIER PAR TRI BULLE====={}   "+tab);
    }
    public static void triBulle2(List<Integer> tab) {
        System.out.println("TABLEAU NON TRIÉ ====={}\n" + tab);
        for (int i = tab.size() - 1; i > 0; i--) {
            System.out.println("ELEMENT PRINCIPAL COURANT =====index ==" + i + "  VALEUR  " + tab.get(i));
            for (int j = 0; j < i; j++) {
                System.out.println("ELEMENT SECONDAIRE ==index ==" + j + " VALEUR  " + tab.get(j));
                if (tab.get(j) > tab.get(j + 1)) {
                    System.out.println("IL YA ECHANGE ENTRE  ==" + tab.get(j) + " VALEUR  " + tab.get(j + 1));
                    Integer tmp = tab.get(j);
                    tab.set(j, tab.get(j + 1));
                    tab.set(j + 1, tmp);
                }
            }
            System.out.println("ELEMENT PRINCIPAL COURANT =====index ==" + i + "  VALEUR  " + tab.get(i));
        }
        System.out.println("TABLEAU TRIÉ PAR TRI BULLE ====={}   " + tab);
    }



}
