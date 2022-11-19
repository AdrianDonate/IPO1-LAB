package presentacion;

import java.util.ArrayList;

import javax.swing.AbstractListModel;

import dominio.Monitor;

public class CustomListModel extends AbstractListModel{

    private ArrayList lista = new ArrayList<>();

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        Monitor m = (Monitor) lista.get(index);
        return m.getNombre();
    }
    public void addMonitor(Monitor m){
        lista.add(m);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    public void eliminarMonitor(int index0){
        lista.remove(index0);
        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
    }
    public Monitor getMonitor(int index){
        return (Monitor) lista.get(index);
    }
}
