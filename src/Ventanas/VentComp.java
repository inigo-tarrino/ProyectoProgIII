package Ventanas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import Clases.GenMapa;
import Clases.Mapa;
import Motor.CombateMethod;
import Motor.TiendaMethod;
import PJ.Enemigo;
import PJ.Personaje;

public class VentComp extends JFrame{

	public static JProgressBar pb;
	private Mapa m1;
	private int sp = 1;
	private boolean combate = false;
	private boolean nada = false;
	private boolean tesoro = false;
	private boolean tienda = false;
	private BufferedImage foncombate;
	private BufferedImage fontienda;
	private BufferedImage fonnada;
	private BufferedImage fontesoro;
	
	private ArrayList<Enemigo> enemigos;
	
	private CombateMethod combaterino;
	
	private boolean atacausua;
	private JLabel vida;
	
	public VentComp() {
		
		try {
			foncombate = ImageIO.read(new File("sprites\\combate.jpg"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			fonnada = ImageIO.read(new File("sprites\\nada1.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			fontienda = ImageIO.read(new File("sprites\\descarga.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fontesoro = ImageIO.read(new File("sprites\\tesoro1.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Genera el mapa
		m1 = GenMapa.inicializar(); 
		//Generamos contenedor
		Container cp = this.getContentPane();
		cp.setSize(1920, 1020);
		//Paneles
		JPanel main = new JPanel(new GridLayout(1 , 2));
		cp.add(main);
		
		JPanel barra = new JPanel();
		barra.setBackground(Color.YELLOW);
		barra.setSize(100, 100);
		cp.add(barra,BorderLayout.SOUTH);
		
		JLabel j2 = new JLabel();
		j2.setText("Info Salas");
		
		barra.add(j2);
		
		JPanel layjb = new JPanel(new BorderLayout());
		layjb.setBackground(Color.BLACK);
		
		main.add(layjb);
		
		JPanel Botstats = new JPanel(new GridLayout(2,1));
		Botstats.setBackground(Color.WHITE);
		
		JPanel juego = new JPanel()
		{
			@Override
			protected void paintComponent(Graphics g) {
				if(combate) {
				g.drawImage(foncombate, 0, 0,getWidth(),getHeight(), null);
				}
				if(nada) 
				{
				g.drawImage(fonnada, 0, 0, getWidth(), getHeight(), null);
				}
				if(tienda)
				{
				g.drawImage(fontienda, 0, 0, getWidth(), getHeight(), null);	
				}
				if(tesoro)
				{
				g.drawImage(fontesoro, 0, 0, getWidth(), getHeight(), null);	
				}
			
				}
		};
		juego.setBackground(Color.BLACK);
		
		layjb.add(juego,BorderLayout.CENTER);
		layjb.add(Botstats,BorderLayout.WEST);
		
		JPanel info = new JPanel(new GridLayout(2,1));
		info.setBackground(Color.RED);
		JPanel Botones = new JPanel(new GridLayout(3, 2));
		Botones.setBackground(Color.GRAY);
		Botstats.add(Botones,BorderLayout.CENTER);
		Botstats.add(info, BorderLayout.SOUTH);
		
		JPanel combatemen = new JPanel();
	//	combatemen.setBackground(Color.GREEN);
		info.add(combatemen);
		
		
		
		JButton n1 = new JButton();
		JButton n2 = new JButton();
		JButton n3 = new JButton();
		JButton n4 = new JButton();
		JButton n5 = new JButton();
	//	JButton n6 = new JButton();
	
		JButton S =new JButton();
		JButton M =new JButton();
		JButton F =new JButton();
		S.setText("Ataque suave");
		M.setText("Ataque Medio");
		F.setText("Ataque Fuerte");
		
		JPanel menbot = new JPanel(new GridLayout(3, 1));
		menbot.add(S);
		menbot.add(M);
		menbot.add(F);
	//	combatemen.add(menbot);
		
		n1.setText("Inventario");
		n2.setText("Stats");
		n3.setText("Interactuar");
		n4.setText("Seguir --->");
		n5.setText("Salir");
	//	n6.setText("6");
		
		
		Botones.add(n1);
		Botones.add(n2);
		Botones.add(n3);
		Botones.add(n4);
		Botones.add(n5);
//		Botones.add(n6);
		
		
		
		n3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				Clases.Sala salas = m1.getSalaactual();
				salas.responde();
				
				switch(salas.getTsala()) 
				{
				case COMBATE:
					if(combate) return;
					combate = true;
					CombateMethod c1 = new CombateMethod(sp, null, " ");
					combaterino = c1 ;
					juego.setBackground(Color.CYAN);
					combatemen.add(menbot);
					int i =0;
					//juego.setLayout(GridLayout(2,2));
					//ImageIcon icon = new ImageIcon(getClass().getResource("Icono.png")); 
					//juego.setBackground(icon);
					System.out.println("Combate responde");
					enemigos =  c1.getEnemigos();
					for(Enemigo enemigo : enemigos) 
					{
						i ++;
						juego.add(enemigo);
					}
					j2.setText("Sala de Combate  Sala: "+sp+"    "+i+" Enemigos se te aproximan");
					
					atacausua = c1.atacausu;
					if(!atacausua) {
						c1.responde();
						if(Personaje.hp <=0) 
						{
							System.out.println("Hasperdido");
							combate = false;
							return;
						}
						atacausua = true;
					} 
					
				break;
				
				case TIENDA:
					if(tienda) return;
					tienda = true;
					
					TiendaMethod c2 = new TiendaMethod(sp, null, " ");
					VentanaT v1 = new VentanaT();
					
					combatemen.remove(menbot);
					
					v1.setSize(1000, 600);
					v1.setVisible(true);
					v1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					v1.setTitle("Tienda");
					j2.setText("Tienda  Sala: "+sp);
					System.out.println(VentanaT.vcount);
					juego.setBackground(Color.WHITE);
					System.out.println("Tienda responde");
					System.out.println();
					System.out.println("Obejtos de cada: Pocimas : "+VentanaT.potcount+" , Vendas : "+VentanaT.vcount+" , Pan: "+VentanaT.pacount+" , Armadura: "+VentanaT.pcount);
				//	ArrayList<Objeto> Invent =  c2.getObjetos();
				//	System.out.println(Invent);
					
				break;
				
				case NADA:
					if(nada) return;
					nada = true;
			
					j2.setText("Sala vac�a  Sala: "+sp);
					juego.setBackground(Color.BLACK);
					
					combatemen.remove(menbot);
					
					System.out.println("Nada responde");
					System.out.println("Obejtos de cada: Pocimas : "+VentanaT.potcount+" , Vendas : "+VentanaT.vcount+" , Pan: "+VentanaT.pacount+" , Armadura: "+VentanaT.pcount);
					
				break;
				
				case TESORO:
					if(tesoro) return;
					tesoro = true;
					
					j2.setText("Sala de Tesoro  Sala: "+sp);
					juego.setBackground(Color.GREEN);
					
					combatemen.remove(menbot);
					
					System.out.println("Tesoro Responde");
					System.out.println("Obejtos de cada: Pocimas : "+VentanaT.potcount+" , Vendas : "+VentanaT.vcount+" , Pan: "+VentanaT.pacount+" , Armadura: "+VentanaT.pcount);
				break;
				}
			}
			
			private LayoutManager GridLayout(int i, int j) {
				// TODO Auto-generated method stub
				return null;
			}
		}
		);
		n4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(combate) {
				combate = false;
				}
				if(nada) {
					nada = false;
					}
				if(tesoro) {
					tesoro = false;
					}
				if(tienda) {
					tienda = false;
					}
				juego.removeAll();
				if(!m1.fin())
				{
					sp++;
					boolean fin = m1.actulizar();
					if(fin) 
					{
						j2.setText("Game Over");
						juego.setBackground(Color.BLUE);
						System.out.println("Has salido del mapa");
						JOptionPane.showMessageDialog(rootPane, "OH vaya... parece que te has pasado el primer mapa", "Final", 0);
						//mostrar ventana fin de juego
						
						
					}
					else 
					{
						//Muestra la siguiente sala
						//repintar sala
					}
				}
			}
		}
		);
		n1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				VInventario v1 = new VInventario();
				v1.setSize(1000, 600);
				v1.setVisible(true);
				v1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				v1.setTitle("Inventario");
			}
		}
		);
		
		S.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(atacausua && combate) {
					if(enemigos == null) System.err.println("Error: enemigos es null"); 
					if(enemigos.isEmpty()) 
					{
						combate= false;
						return;
					}
					enemigos.get(0).vida -= (int) (Personaje.dmg*0.8);
					if(enemigos.get(0).vida <= 0) {
						enemigos.remove(0);
					}
					if(enemigos.isEmpty()) 
					{
						Personaje.monedero += 15; 
						System.out.println("Has ganado");
						JOptionPane.showMessageDialog(rootPane, "Has eliminado a los enemigos:"
								+ "Ganas 15 monedas", "Victoria", 0);
						return;
					}
					atacausua = false;
					combaterino.responde();
					if(Personaje.hp <=0) 
					{
						System.out.println("Has perdido");
						JOptionPane.showMessageDialog(rootPane, "GameOver", "Has perdido", 0);
						combate= false;
						return;
					}
					atacausua= true;
					
				} 
				vida.setText(Personaje.hp+"");
			}
		});
		
		M.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(atacausua && combate) {
					if(enemigos == null) System.err.println("Error: enemigos es null"); 
					if(enemigos.isEmpty()) 
					{
						combate= false;
						return;
					}
					enemigos.get(0).vida -= (int) (Personaje.dmg*1);
					if(enemigos.get(0).vida <= 0) {
						enemigos.remove(0);
					}
					if(enemigos.isEmpty()) 
					{
						Personaje.monedero += 15; 
						System.out.println("Has ganado");
						JOptionPane.showMessageDialog(rootPane, "Has eliminado a los enemigos"
								+ "Ganas 15 monedas", "Victoria", 0);
						return;
					}
					atacausua = false;
					combaterino.responde();
					if(Personaje.hp <=0) 
					{
						System.out.println("Has perdido");
						JOptionPane.showMessageDialog(rootPane, "GameOver", "Has perdido", 0);
						combate= false;
						return;
					}
					atacausua= true;
					
				} 
				vida.setText(Personaje.hp+"");	
			}
		});
		
		F.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(atacausua && combate) {
					if(enemigos == null) System.err.println("Error: enemigos es null"); 
					if(enemigos.isEmpty()) 
					{
						combate= false;
						return;
					}
					enemigos.get(0).vida -= (int) (Personaje.dmg*1.2);
					if(enemigos.get(0).vida <= 0) {
						enemigos.remove(0);
					}
					if(enemigos.isEmpty()) 
					{
						Personaje.monedero += 15; 
						System.out.println("Has ganado");
						JOptionPane.showMessageDialog(rootPane, "Has eliminado a los enemigos"
								+ "Ganas 15 monedas", "Victoria", 0);
						return;
					}
					atacausua = false;
					combaterino.responde();
					if(Personaje.hp <=0) 
					{
						System.out.println("Has perdido");
						JOptionPane.showMessageDialog(rootPane, "GameOver", "Has perdido", 0);
						combate= false;
						return;
					}
					atacausua= true;
					
				} 
				vida.setText(Personaje.hp+"");
			}
		});
		
	}
	
	public static void main(String[] args) {
		VentComp t1 = new VentComp();
		t1.setSize(1920, 1020);
		t1.setVisible(true);
		t1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		t1.setTitle("RogeLike Dungeons");
	}
}
