package com.Iva;

public class Iva {

    public static void main(String[] args) {
        int precio= 10;
        precioConIva(precio);

      

    }


    public static void  precioConIva(int costo){
        double precioTotal= costo * 0.20;

        System.out.println("El total es "+  precioTotal);

    }
}
