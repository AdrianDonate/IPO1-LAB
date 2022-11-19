package presentacion;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

public class MiModeloTablaParcela extends AbstractTableModel {

	private String[] nombreColumnas = { "ID", "Foto", "Nombre", "Tamaño(m2)","Descripcion", "Estado", "Precio"};
	//private Class<?>[] tipoColumna= new Class<?>[] {Integer.class, String.class, String.class, String.class, String.class, String.class, String.class,JButton.class};
	private Vector datos = new Vector();

	public int getColumnCount() {
		return nombreColumnas.length;
	}

	public int getRowCount() {
		return datos.size();
	}

	public String getColumnName(int col) {
		return nombreColumnas[col];
	}

	public Object getValueAt(int row, int col) {
		Object[] fila = (Object[]) datos.elementAt(row);
		
		return fila[col];
	}

	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}

	public boolean isCellEditable(int row, int col) {
		return true;
	}

	public void setValueAt(Object value, int row, int col) {
		if (row < getRowCount() && col < getColumnCount()) {
			Object[] fila = (Object[]) datos.elementAt(row);
			fila[col] = value;
			fireTableCellUpdated(row, col);
		}
	}

	public void eliminaFila(int row) {
		datos.remove(row);
	}

	public void aniadeFila(Object[] row) {
		datos.add(row);
	}

	public Vector getDatos() {
		return datos;
	}

	public void setDatos(Vector datos) {
		this.datos = datos;
	}

	public String[] getNombreColumnas() {
		return nombreColumnas;
	}

	public void setNombreColumnas(String[] nombreColumnas) {
		this.nombreColumnas = nombreColumnas;
	}

}
