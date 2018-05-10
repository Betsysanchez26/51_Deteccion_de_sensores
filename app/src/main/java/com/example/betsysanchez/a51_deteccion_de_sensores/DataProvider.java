package com.example.betsysanchez.a51_deteccion_de_sensores;

/**
 * Created by BetsySanchez on 08/05/2018.
 */

public class DataProvider {
    private String nombre,fabricante,version;

    public DataProvider(String nombre, String fabricante, String version) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getVersion() {
        return version;
    }
}
