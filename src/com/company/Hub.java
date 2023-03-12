package com.company;

public class Hub {
    Contenedor[][] posiciones;
    Hub(){
        posiciones= new Contenedor[10][12];
    }
    @Override public String toString(){
        String resultado="El Hub:\n";
        for (int i=0;i<posiciones.length;i++){
            for (int e=0;e<posiciones[0].length;e++){
                if (posiciones[i][e]==null) {resultado=resultado+("[vacío] ");}
                else {resultado=resultado+("["+posiciones[i][e].id+"] ");}
            }
            resultado=resultado+"\n"; //\n para que un String salte de linea
        }
        return resultado;
    }

     String apilar(Contenedor c1){
        String noesta=null;
        if (c1.prioridad==1){
            for (int i= posiciones.length;i>0;i--){
                if (posiciones[i-1][0]==null){ posiciones[i-1][0]=c1;noesta="si";break;}

            }


        }
         if (c1.prioridad==2){
             for (int i=posiciones.length;i>0;i--){
                 if (posiciones[i-1][1]==null){ posiciones[i-1][1]=c1;noesta="si";break;}

             }


         }
        if (c1.prioridad==3){
            int salir=0;;
            for (int e=2;e<posiciones[0].length;e++){
                for (int i=posiciones.length;i>0;i--){

                    if (posiciones[i-1][e]==null){posiciones[i-1][e]=c1;noesta="si";salir=1;break;}
                }
                if (salir==1) break;
            }
        }
        return noesta;
    }

    void desapilar(int columna){
        for (int i=0;i<posiciones.length;i++){
            if (posiciones[i][columna-1]==null){}
            else{ posiciones[i][columna-1]=null;break;}
            if (i==1) System.out.println("No hay más contenedores que desapilar en esta columna");
        }
    }


}
