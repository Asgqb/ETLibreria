package com.company;

public class Puerto {
    Hub[] puerto;
    Puerto(Hub h1,Hub h2,Hub h3){
        puerto=new Hub[3];
        puerto[0]=h1;
        puerto[1]=h2;
        puerto[2]=h3;
    }
    void apilarContenedor(Contenedor c1){
        String resultado;
        resultado=puerto[0].apilar(c1);
        for (int i=1;i<puerto.length;i++){

            if (resultado==null){
                resultado=puerto[i].apilar(c1);
            }
        }
        if (resultado==null){
            System.out.println("No hay espacio en el puerto");
        }
    }
}
