package DB;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class Bestiario extends JFrame {

	public Bestiario() {

		//Cabeceras de las columnas
		String[] columnas = new String[] {
				"Id", "Nombre", "Tipo", "Desc" , "puntos"
		};

		//Los datos actuales, ¿¿Podemos cambiarlos paraa que los cargue desde la base de datos??
		Object[][] datos = new Object[][] {
			{"1","Esqueleto","Melee","Esta mu enfadao","10"},
			{"2","Caballero Negro","Mele y Piromantico","Su reluciente armadura "
					+ "antaño brillante se ha reducido"
					+ " a una armadura negruzca y oxidada por la nagre de sus enemigos","40"},
			{"3","Trol","Melee","Como un goblin con upgrade y mala leche","30"},
		};
		//Creamos la tabla
		JTable tabla = new JTable(datos, columnas);
		//La dimensionamos
		tabla.setPreferredSize(new Dimension(1000,400));
		//Añadimos todas sun funciones
		this.add(new JScrollPane(tabla));

		this.setTitle("Bestiario");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Bestiario();
			}
		});
	}   

}
