package com.cristhoper.ec3.model;

public class Platillo2 extends Shows {
    private int platillo2;
    public Platillo2(String name, String imgUrl, String Platillo2) {
        super(name, imgUrl);
        this.platillo2=platillo2;
    }

    public int getPlatillo2() {
        return platillo2;
    }

    public void setPlatillo2(int platillo2) {
        this.platillo2 = platillo2;
    }
}
