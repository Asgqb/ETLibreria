package com.company;

public class Main {

    public static void main(String[] args) {
        Contenedor c1=new Contenedor(34,5,"España",true,3,"Botellas","Pepe S.L","Jugetes SA");
        Contenedor c2=new Contenedor(23,5,"España",true,2,"Botellas","Pepe S.L","Jugetes SA");
        Contenedor c3=new Contenedor(12,5,"España",true,1,"Botellas","Pepe S.L","Jugetes SA");

        Hub h1=new Hub();
        h1.apilar(c1);
    h1.apilar(c1);
    h1.apilar(c2);
    h1.apilar(c3);
    String cadena= h1.toString();
        System.out.println(cadena);

    }
}
