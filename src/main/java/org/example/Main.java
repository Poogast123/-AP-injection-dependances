package org.example;

import java.io.FileInputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        // Charger le fichier de config
        Properties properties = new Properties();
        properties.load(new FileInputStream("config.txt"));

        // Instancier les classes dynamiquement
        IDao dao = (IDao) Class.forName(properties.getProperty("dao")).newInstance();
        MetierImpl metier = (MetierImpl) Class.forName(properties.getProperty("metier")).newInstance();

        metier.setDao(dao); // Injection dynamique

        System.out.println("Résultat : " + metier.calcul());
    }
}
