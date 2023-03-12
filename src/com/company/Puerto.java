package com.company;

public class Puerto {
    Hub[] puerto;
    Puerto(){
        puerto=new Hub[3];
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
