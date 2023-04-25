package com.company;

import java.io.Serial;
import java.io.Serializable;
//Agel saura
public class Hub implements Serializable {
    private Contenedor[][] posiciones;
    public Hub(){
        posiciones= new Contenedor[10][12];
    }
    public String mostrar(){
        String resultado="El Hub:\n";
        for (int i=0;i<posiciones.length;i++){
            for (int e=0;e<posiciones[0].length;e++){
                if (posiciones[i][e]==null) {resultado=resultado+("[0] ");}
                else {resultado=resultado+("["+posiciones[i][e].id+"] ");}
            }
            resultado=resultado+"\n"; //\n para que un String salte de linea
        }
        return resultado;
    }

     public boolean apilar(Contenedor c1){
        boolean noesta=false;
        if (c1.prioridad==1){
            for (int i= posiciones.length;i>0;i--){
                if (posiciones[i-1][0]==null){ posiciones[i-1][0]=c1;noesta=true;break;}

            }


        }
         if (c1.prioridad==2){
             for (int i=posiciones.length;i>0;i--){
                 if (posiciones[i-1][1]==null){ posiciones[i-1][1]=c1;noesta=true;break;}

             }


         }
        if (c1.prioridad==3){
            boolean salir=false;;
            for (int e=2;e<posiciones[0].length;e++){
                for (int i=posiciones.length;i>0;i--){

                    if (posiciones[i-1][e]==null){posiciones[i-1][e]=c1;noesta=true;salir=true;break;}
                }
                if (salir==true) break;
            }
        }
        return noesta;
    }

    public Contenedor desapilar(int columna) {
        for (int i = 0; i < posiciones.length; i++) {
            if (posiciones[i][columna - 1] != null) {
                {
                    Contenedor c1 = posiciones[i][columna - 1];
                    posiciones[i][columna - 1] = null;
                    return c1;
                }
            }
        }
        return null;
    }

    public int cantidadPais(String pais) {
        int pais2=0;
        for (int i = 0; i < posiciones.length; i++) {
            for (int e = 0; e < posiciones[0].length; e++) {
                if (posiciones[i][e] != null && posiciones[i][e].pais.equals(pais)) {

                   pais2=pais2+1;

                }
            }
        }
        return pais2;
    }


    /*Los siguientes 4 metodos están hechos porque posiciones es privada y no se puede usar directamente,
    para obtener algún atributo de un contenedor en la matriz(con gets, ya que también son privados sus atributos)
    o un contenedor directamente, llamamos a metodos de Hub
    */
    public int getid(int fila,int columna){

        int id=posiciones[fila][columna].getId();
        return id;
    }
    public Contenedor getContenedor(int fila,int columna){
        Contenedor c=posiciones[fila][columna];
        return c;
    }
    public boolean vacio(int fila, int columna){
        boolean vacio2=false;
        if (posiciones[fila][columna]==null){vacio2=true;}
        return vacio2;

    }
    public String pais(int fila, int columna){
        String pais=posiciones[fila][columna].getPais();
        return pais;
    }

    public void setInspeccionado(int fila,int columna){
        posiciones[fila][columna].setInspeccionado(true);
    }

    public String mostrarPeso(int peso){
        String resultado="El Hub:\n";
        String inspeccionado="Está inspeccionado";
        for (int i=0;i<posiciones.length;i++){
            for (int e=0;e<posiciones[0].length;e++){
                if (posiciones[i][e]!=null && (posiciones[i][e].getPeso()>peso || posiciones[i][e].getPeso()==peso)){resultado=resultado+("id:"+posiciones[i][e].id+" empresa remitente:"+posiciones[i][e].empresaremitente+" peso:"+posiciones[i][e].peso+" inspeccionado:"+inspeccionado+"\n");}
            }

        }
        return resultado;
    }
    public void revisarPeso(int peso){
        for(int i=0;i<10;i++){
            for(int e=0;e<12;e++){
                if (posiciones[i][e]!=null) {
                    int peso2;
                    Contenedor c = this.getContenedor(i, e);
                    peso2 = c.getPeso();
                    if (peso2 == peso || peso2 > peso) {
                        this.setInspeccionado(i, e);
                    }
                }
            }
        }
    }
}
