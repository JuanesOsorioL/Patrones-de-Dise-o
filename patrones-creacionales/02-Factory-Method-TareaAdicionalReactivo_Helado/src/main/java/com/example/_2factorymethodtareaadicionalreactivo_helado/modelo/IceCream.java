package com.example._2factorymethodtareaadicionalreactivo_helado.modelo;

public record IceCream(String flavor, double price) {
    public String serve() {
        return flavor + " por $" + price;
    }
}
