package Composite;

import java.util.ArrayList;

public class ComposicionDepartamento implements ComponenteDepartamento{
    private ArrayList<ComponenteDepartamento> hijos;
    public void agregar(ComponenteDepartamento componente) {
        hijos.add(componente);
    }

    public void remove(ComponenteDepartamento componente) {
        hijos.remove(componente);
    }

    public ArrayList<ComponenteDepartamento> getHijos() {
        return hijos;
    }

    @Override
    public void ejecutar() {

    }
}
