package com.company;

public class Main {

    public static void main(String[] args) {
        Contenedor c1=new Contenedor(34,5,"España",true,3,"Botellas","Pepe S.L","Jugetes SA");
        Contenedor c2=new Contenedor(23,5,"España",true,2,"Botellas","Pepe S.L","Jugetes SA");
        Contenedor c3=new Contenedor(12,5,"España",true,1,"Botellas","Pepe S.L","Jugetes SA");
        Hub h1=new Hub();
        Hub h2=new Hub();
        Hub h3=new Hub();
        Puerto p1=new Puerto(h1,h2,h3);

        h1.apilar(c1);
        h1.apilar(c1);
        h1.apilar(c2);
        h1.apilar(c3);
        String cadena= h1.toString();
        System.out.println(cadena);
        h1.desapilar(3);
        cadena= h1.toString();
        System.out.println(cadena);
        h1.mostrar(c1);
        h1.apilar(c2);
        System.out.println();
        System.out.println(h1.cantidadPais("España"));
        System.out.println();
        System.out.println(c2.getPais());
        System.out.println();
        for (int i=0;i<200;i++){
            h1.apilar(c1);
        }
        p1.apilarContenedor(c1);
        h2.apilar(c2);
        System.out.println(h1.toString());
        System.out.println(h2.toString());



    }
}
