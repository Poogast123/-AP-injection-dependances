package org.example;

public class MetierImpl implements IMetier {
    private IDao dao;

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * 2;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
