package com.company;

public class Contenedor {
    int id;
    int peso;
    String pais;
    boolean inspeccionado;
    int prioridad;
    String descripcion;
    String empresaemisora;
    String empresaremitente;
    Contenedor(int id,int peso,String pais,boolean inspeccionado,int prioridad,String descripcion,String empresaemisora,String empresaremitente){
        this.id=id;
        this.peso=peso;
        this.pais=pais;
        this.inspeccionado=inspeccionado;
        this.prioridad=prioridad;
        this.descripcion=descripcion.substring(0,100); //Método substring para limitar tamaño cadena
        this.empresaemisora=empresaemisora.substring(0,20);
        this.empresaremitente=empresaremitente.substring(0,20);
    }

    void setId(int id){
        this.id=id;
    }
    void setPeso(int peso){
        this.peso=peso;
    }
    void setPais(String pais){
        this.pais=pais;
    }
    void setInspeccionado(boolean inspeccionado){
        this.inspeccionado=inspeccionado;
    }
    void setPrioridad(int prioridad){
        this.prioridad=prioridad;
    }
    void setDescripcion(String descripcion){
        this.descripcion=descripcion.substring(0,100);
    }
    void setEmpresaemisora(String empresaemisora){
        this.empresaremitente=empresaemisora.substring(0,20);
    }
    void setEmpresaremitente(String empresaremitente){
        this.empresaremitente=empresaremitente.substring(0,20);
    }


    int getId(){
        return id;
    }
    int getPeso(){return peso;}
    String getPais(){return pais;}
    boolean getInspeccionado(){
        return inspeccionado;
    }
    int getPrioridad(){return prioridad;}
    String getDescripcion(){return descripcion;}
    String getEmpresaemisora(){return empresaemisora;}
    String getEmpresaremitente(){return empresaremitente;}
}
