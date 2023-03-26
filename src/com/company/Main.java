package com.company;

public class Main {

    public static void main(String[] args) {
        Contenedor c1=new Contenedor(34,5,"España",true,3,"Botellas","Pepe S.L","Jugetes SA");
        Contenedor c2=new Contenedor(23,5,"España",true,2,"Botellas","Pepe S.L","Jugetes SA");
        Contenedor c3=new Contenedor(12,5,"España",true,1,"Botellas","Pepe S.L","Jugetes SA");
        Puerto p1=new Puerto();

        for (int i=0;i<200;i++){
            p1.puerto[0].apilar(c1);
        }
        p1.apilarPuerto(c1);  //Probar apilar para el puerto
        p1.apilarPuerto(c1);
        p1.apilarPuerto(c2);
        p1.apilarPuerto(c3);
        System.out.println(p1.puerto[0].mostrar());
        System.out.println(p1.puerto[1].mostrar());
        p1.desapilarPuerto(3);
        System.out.println(p1.puerto[0].mostrar());
        System.out.println(p1.puerto[1].mostrar());
        System.out.println(p1.puerto[0].cantidadPais("España"));
        System.out.println(p1.cantidadPaisPuerto("España"));



    }
}
