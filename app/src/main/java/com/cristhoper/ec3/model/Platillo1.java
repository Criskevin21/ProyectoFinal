package com.cristhoper.ec3.model;

public class Platillo1 extends Shows {
    private String platillo1;
    public Platillo1(String name, String imgUrl, String platillo1 ) {
        super(name, imgUrl);
        this.platillo1=platillo1;
    }

    public String getPlatillo1() {
        return platillo1;
    }

    public void setPlatillo1(String platillo1) {
        this.platillo1 = platillo1;
    }
}
