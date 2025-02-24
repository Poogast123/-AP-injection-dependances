package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example");
        IMetier metier = context.getBean(IMetier.class);

        System.out.println("Résultat : " + metier.calcul());
    }
}
