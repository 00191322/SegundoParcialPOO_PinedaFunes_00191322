package Composite;

import java.util.ArrayList;

public class ComposicionCEO implements Componente{
    private ArrayList<Componente> hijos;
    public void agregar(Componente componente) {
        hijos.add(componente);
    }

    public void remove(Componente componente) {
        hijos.remove(componente);
    }

    public ArrayList<Componente> getHijos() {
        return hijos;
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando desde Composición");
    }
}
