package org.example;

public class MetierImpl {
    private DaoImpl dao;

    public void setDao(DaoImpl dao) {
        this.dao = dao;
    }

    public void process() {
        System.out.println("Traitement des données : " + dao.getData());
    }
}

