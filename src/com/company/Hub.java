package com.company;

public class Hub {
    Contenedor[][] posiciones;
    Hub(){
        posiciones= new Contenedor[10][12];
    }
    @Override public String toString(){
        String resultado=null;
        for (int i=0;i<posiciones.length;i++){
            for (int e=0;e<posiciones[0].length;e++){
                resultado=resultado+("["+posiciones[i][e].id+"] ");
            }
            resultado=resultado+"\n"; //\n para que un String salte de linea
        }
        return resultado;
    }

    String apilar(Contenedor c1){
        String noesta=null;
        if (c1.prioridad==1){
            for (int i=0;i<posiciones.length;i++){
                if (posiciones[i][0]==null){ posiciones[i][0]=c1;noesta="si";}

            }

        }
        if (c1.prioridad==2){
            for (int i=0;i<posiciones.length;i++){
                if (posiciones[i][1]==null){ posiciones[i][1]=c1;noesta="si";}

            }

        }
        if (c1.prioridad==3){
            for (int i=0;i<posiciones.length;i++){
                for (int e=2;e<posiciones[0].length;e++){
                    if (posiciones[i][e]==null){posiciones[i][e]=c1;noesta="si";}
                }
            }
        }
        return noesta;
    }

    void desapilar(int columna){
        for (int i=posiciones.length;i>0;i--){
            if (posiciones[i-1][columna-1]==null){}
            else{ posiciones[i-1][columna-1]=null;break;}
            if (i==1) System.out.println("No hay más contenedores que desapilar en esta columna");
        }
    }


}
