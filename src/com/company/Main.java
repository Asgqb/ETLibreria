package com.company;

public class Main {

    public static void main(String[] args) {
        Contenedor c1=new Contenedor(34,5,"España",true,3,"Botellas","Pepe S.L","Jugetes SA");
        Contenedor c2=new Contenedor(23,5,"España",true,2,"Botellas","Pepe S.L","Jugetes SA");
        Contenedor c3=new Contenedor(12,5,"España",true,1,"Botellas","Pepe S.L","Jugetes SA");
        Puerto p1=new Puerto();

        p1.puerto[0].apilar(c1);
        p1.puerto[0].apilar(c1);
        p1.puerto[0].apilar(c2);
        p1.puerto[0].apilar(c3);
        System.out.println(p1.puerto[0].mostrar());
        p1.puerto[0].desapilar(3);
        System.out.println(p1.puerto[0].mostrar());
        p1.puerto[0].apilar(c2);
        System.out.println(p1.puerto[0].mostrar());



    }
}
