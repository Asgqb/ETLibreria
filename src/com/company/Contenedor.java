package com.company;

import java.io.Serializable;
//Angel saura
public class Contenedor implements Serializable {
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
        this.descripcion=descripcion; //Método substring para limitar tamaño cadena
        this.empresaemisora=empresaemisora;
        this.empresaremitente=empresaremitente;
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
        this.descripcion=descripcion;
    }
    void setEmpresaemisora(String empresaemisora){
        this.empresaremitente=empresaemisora;
    }
    void setEmpresaremitente(String empresaremitente){
        this.empresaremitente=empresaremitente;
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
