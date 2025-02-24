package org.example;

public class Main {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        System.out.println("Résultat : " + metier.calcul());
    }
}
