package com.company;

public class Hub {
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
}
