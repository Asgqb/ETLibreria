package com.company;

public class Puerto {
    boolean[] ocupado;
    public Hub[] puerto;
    public Puerto(){
        puerto=new Hub[3];
        puerto[0]=new Hub();
        puerto[1]=new Hub();
        puerto[2]=new Hub();
        ocupado=new boolean[3];
    }
    public boolean apilarPuerto(Contenedor c1){
        boolean resultado=false;
        for (int i=0;i<puerto.length;i++){

            resultado=puerto[i].apilar(c1);
            if (resultado==true) break;

        }
        return resultado;
    }

    public Contenedor desapilarPuerto(int columna){
        Contenedor desapilado;
        for (int i=puerto.length-1;i>-1;i--){
            desapilado=puerto[i].desapilar(columna);
            if (desapilado != null) return desapilado;
        }
        return null;
    }

    public int cantidadPaisPuerto(String pais){
        int numero=0;
        for (int i=0;i<puerto.length;i++){
            numero=numero+puerto[i].cantidadPais(pais);
        }
        return numero;
    }

}
