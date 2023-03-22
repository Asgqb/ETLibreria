package com.company;

public class Puerto {
    boolean[] ocupado;
    Hub[] puerto;
    Puerto(){
        puerto=new Hub[3];
        puerto[0]=new Hub();
        puerto[1]=new Hub();
        puerto[2]=new Hub();
        ocupado=new boolean[3];
    }
    boolean apilarContenedor(Contenedor c1){
        boolean resultado=false;
        for (int i=0;i<puerto.length;i++){

            resultado=puerto[i].apilar(c1);
            if (resultado==true) break;

        }
        return resultado;
    }

    //Desapilar que devuelva contenedor desapilado
    //CUantos por pais para todo el puerto
}
