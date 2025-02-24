package org.example;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        return Math.random() * 100; // Simule une valeur
    }
}
