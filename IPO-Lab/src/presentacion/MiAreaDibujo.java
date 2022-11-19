package presentacion;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JLabel;

public class MiAreaDibujo extends JLabel {

	private ArrayList<ObjetoGrafico> objetosGraficos = new ArrayList<ObjetoGrafico>();

	public MiAreaDibujo() {
	}

	void addObjetoGrafico(ObjetoGrafico objg) {
		objetosGraficos.add(objg);
	}

	public ObjetoGrafico getUltimoObjetoGrafico() {
		return objetosGraficos.get(objetosGraficos.size() - 1);
	}

	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < objetosGraficos.size(); i++) {
			ObjetoGrafico objg = objetosGraficos.get(i);
			if (objg instanceof ImagenGrafico) {
				g.drawImage(((ImagenGrafico) objg).getImagen(), objg.getX(), objg.getY(), null);
			}else if (objg instanceof TextoGrafico) {
				g.setColor(((TextoGrafico)objg).getColor());
				g.drawString(((TextoGrafico)objg).getTexto(), objg.getX(), objg.getY());
			}else if (objg instanceof Lapiz) {
				g.setColor(((Lapiz)objg).getColor());
				int w= ((Lapiz) objg).getX1();
				int h= ((Lapiz) objg).getY1();
				((Graphics2D)g).setStroke(new BasicStroke(3));
				g.drawLine(objg.getX(), objg.getY(), w, h);
			}
		}
	}

	public void removeAll() {
		this.objetosGraficos= new ArrayList <ObjetoGrafico>();
		
	}
}