package com.company;

public class Main {

    public static void main(String[] args) {
        Contenedor c2=new Contenedor(34,5,"España",true,3,"Botellas","Pepe S.L","Jugetes SA");
        Hub c1=new Hub();
        c1.apilar(c2);
    c1.apilar(c2);
    String c4= c1.toString();
        System.out.println(c4);

    }
}
