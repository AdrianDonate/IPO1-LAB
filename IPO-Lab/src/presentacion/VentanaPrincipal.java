package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;


import dominio.Actividad;
import dominio.Bungalow;
import dominio.Monitor;
import dominio.Parcela;
import dominio.Usuario;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;

import javax.swing.border.BevelBorder;
import java.awt.ComponentOrientation;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.RowFilter.ComparisonType;
import javax.swing.DropMode;
import java.awt.Rectangle;
import java.awt.Robot;

import javax.swing.ScrollPaneConstants;
import java.awt.Dimension;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.FlowLayout;
import javax.swing.JPopupMenu;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import javax.swing.JRadioButtonMenuItem;

public class VentanaPrincipal {

	private JFrame frmPrincipal;
	private JPanel panelLogin;
	private JPanel panelIniciarSesion;
	private JLabel lblIniciarSesion;
	private JLabel lblErrorUsuario;
	private JPanel panelUsuario;
	private JLabel lblIconUsuario;
	private JTextField txtUsuario;
	private MaskFormatter formatoDNI;
	private JPanel panelContra;
	private JLabel lblIconContr;
	private JPasswordField pwdContrasea;
	private JButton btnVerContra;
	private boolean verContra;
	private JButton btnEntrar;
	private JLabel lblOlvidado;
	private JCheckBox chckbxRecordar;
	private JPanel panelAplicacion;
	private Usuario usuario;
	private JPanel panelOpciones;
	private JMenuBar menu;
	private JMenu mnOpciones;
	private JMenuItem mntmPerfil;
	private JSeparator separator;
	private JMenuItem mntmACercaDe;
	private JSeparator separator_1;
	private JMenuItem mntmCerrarSesin;
	private JPanel panelPaneles;
	private JPanel panelBotones;
	private JPanel panelFunciones;
	private JButton btnReservas;
	private JButton btnActividades;
	private JButton btnDisearRuta;
	private JButton btnGuasYMonitores;
	private JPanel panelReservas;
	private JPanel panelActividades;
	private JPanel panelDisearRuta;
	private JPanel panelGuasYMonitores;
	private JPanel panelPerfil;
	private JButton btnAyuda;
	private JMenu mnIdioma;
	private JPanel panelAniadir;
	private JButton btnAniadir;
	private JButton btnEliminar;
	private JButton btnEditar;
	private JPanel panelListadoMonitores;
	private JPanel panelDatosMonitores;
	private JLabel lblNm;
	private JLabel lblApellidos_1;
	private JLabel lblTelfono_1;
	private JLabel lblCorreo;
	private JLabel lblFormacin;
	private JLabel lblFoto;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextPane txtFormacion;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JLabel lblIdiomas;
	private JScrollPane scrollPane;
	private JList lstMonitores;
	private CustomListModel modeloLista;
	private String ruta = "/presentacion/Fotos/usuario.png";; //$NON-NLS-1$
	private JTextArea txtIdiomas;
	private JButton btnCargarFoto;
	private JToolBar toolBarDisenoRuta;
	private JButton btnPuntoInicio;
	private JButton btnPuntoFin;
	private JButton btnFuente;
	private JButton btnAreaDescanso;
	private JButton btnMirador;
	private JButton btnPuente;
	private JButton btnAves;
	private JButton btnRutaFacil;
	private JButton btnRutaMedia;
	private JButton btnRutaDificil;
	private JButton btnNota;
	private JButton btnRefresh;
	private JScrollPane scrollPane_ruta;

	TableColumn columnaEstado;
	JComboBox comboBoxParcela = new JComboBox();
	JComboBox comboBoxBungalow = new JComboBox();
	// ITEMS DE DIBUJO
	private MiAreaDibujo miAreaDibujo;
	private ImageIcon imagen;

	int modo = -1;
	private final int PTOI = 1;
	private final int PUNTOFIN = 2;
	private final int FUENTE = 3;
	private final int AREADESCANSO = 4;
	private final int MIRADOR = 5;
	private final int PUENTE = 6;
	private final int AVES = 7;
	private final int RUTAFACIL = 8;
	private final int RUTAMEDIA = 9;
	private final int RUTADIFICIL = 10;
	private final int TEXTO = 11;
	private final int REFRESH = 12;

	// cursores e imagenes
	private Toolkit toolkit;
	private Image imagPtoI;
	private Image imagPtoF;
	private Image imagFuente;
	private Image imagAreaDesc;
	private Image imagMirador;
	private Image imagPuente;
	private Image imagAves;
	private Image imagRutaF;
	private Image imagRutaM;
	private Image imagRutaD;
	private Image imagTexto;

	private Cursor cursorPtoI;
	private Cursor cursorPtoF;
	private Cursor cursorFuente;
	private Cursor cursorAreaDesc;
	private Cursor cursorMirador;
	private Cursor cursorPuente;
	private Cursor cursorAves;
	private Cursor cursorRutaF;
	private Cursor cursorRutaM;
	private Cursor cursorRutaD;
	private Cursor cursorTexto;
	private int x, y;
	private JTextField txtTexto = new JTextField();
	private JPanel panelInfo;
	private JLabel lblPhoto;
	private JLabel lblDni;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblTelfono;
	private JLabel lblUltimoacceso;
	private JTextField txtDni;
	private JTextField txtName;
	private JTextField txtApellidos_1;
	private JTextField txtTlf;
	private JTextField txtUltimo;
	private JPanel panelFoto;
	private JLabel lblPerfil;
	private JPanel panelBusquedaID;
	private JLabel lblBusquedaID;
	private JTextField txtBuscarID;
	private JButton btnParcelas;
	private JButton btnBungalow;
	private JPanel panelTablas;
	private JButton btnBuscar;
	private JScrollPane scrollPane_Parcela;
	private JScrollPane scrollPane_Bungalow;
	private JTable tableParcela;
	private JTable tableBungalow;
	private MiModeloTablaParcela modeloTablaParcela;
	private MiModeloTablaBungalow modeloTablaBungalow;
	private MiModeloTablaActividades modeloTablaActividades;
	private static TableRowSorter<MiModeloTablaParcela> sorterParcela;
	private static RowFilter<MiModeloTablaParcela, Integer> parcelaFilter;

	private static TableRowSorter<MiModeloTablaBungalow> sorterBungalow;
	private static RowFilter<MiModeloTablaBungalow, Integer> bungalowFilter;

	private static TableRowSorter<MiModeloTablaActividades> sorterActv;
	private static RowFilter<MiModeloTablaActividades, Integer> ActvFilter;
	private static RowFilter<MiModeloTablaActividades, Integer> ActvFilterAux;

	private int seleccionarE;
	private String datoE;

	private JPanel panelFormularioReserva;
	private JPanel panelRsv;
	private JPanel panel;
	private JLabel lblFormularioReserva;
	private JLabel lblFechaEntrada;
	private JLabel lblFechaSalida;
	private JLabel lblNombre_1;
	private JLabel lblTelefonoContacto;
	private JLabel lblEmail;
	private JTextField txtFechaE;
	private JTextField txtFechaS;
	private JTextField txtNombreForm;
	private JTextField txtContacto;
	private JTextField txtEmail;
	private JLabel lblTusDatos;
	private JLabel lblTuReserva;
	private JButton btnAceptar;
	private JLabel lblEntrada;
	private JLabel lblSalida;
	private JLabel lblId;
	private JLabel lblPrecio;
	private JButton btnHacerReserva;
	private JTextField txtEntrada;
	private JTextField txtSalida;
	private JTextField txtIDFormReserva;
	private JTextField txtPrecio;
	private JButton btnCancelarReserva;
	private JPanel panelReservaIndividual;
	private JPanel panelDisponible;
	private JLabel lblFotoReservaInd;
	private JButton btnReservarIndividual;
	private final ButtonGroup CambiarIdioma = new ButtonGroup();
	private JLabel lblNombreIndividual;
	private JLabel lblPrecio_1;
	private JPanel panel_reservaAux;
	private JLabel lblFotoUbicacion;
	private JTextArea txtDescripcion;
	// OBJETOS
	private Bungalow bun1;
	private Bungalow bun2;
	private Bungalow bun3;
	private Bungalow bun4;
	private Bungalow bun5;
	private Bungalow bun6;

	private Parcela p1;
	private Parcela p2;
	private Parcela p3;
	private Parcela p4;
	private Parcela p5;
	private Parcela p6;

	private ArrayList<Parcela> parcelas_array = new ArrayList<>();
	private ArrayList<Bungalow> bungalows_array = new ArrayList<>();
	private ArrayList<Actividad> actividades_array = new ArrayList<>();
	private JLabel lblDisponibilidadTxt;
	private JLabel lblDisponibilidad;
	private JLabel lblErrorFechaSalida;
	private JLabel lblErrorFechaEntrada;
	private JScrollPane scrollPane_2;
	private JTable tableActividades;
	private Actividad escalada;
	private Actividad rutaGratis;
	private Actividad equitacion;
	private Actividad rafting;
	private Actividad arco;
	private Actividad bici;
	private JPanel panelBusqueda;
	private JButton btnAadir;
	private JTextField txtBusquedaActividad;
	private JLabel lblBusca;
	private JPanel panelInfoActividades;
	private JTextArea txtActividad;
	private JLabel lblActividad;
	private JPopupMenu popupMenu;
	private JMenuItem mntmEliminar;
	private JButton btnLupita;
	private JLabel lblDatosPersonales;
	private JLabel lblNewLabel;
	private JMenu mnAjustes;
	private JMenuItem mntmx;
	private JMenuItem mntmx_1;
	private JMenuItem mntmx_2;
	private JMenuItem mntmx_3;
	private JButton btnExportar;
	private ImageIcon imagenExportada;
	private JLabel lblHabitacion;
	private JLabel lblBanio;
	private JLabel lblCocina;
	private JPanel panelGaleria;
	private JLabel lblGaleriaTitulo;
	private JLabel lblCapacidadIndividual;
	private JLabel lblTamanioIndividual;
	private JLabel lblDescripcionTitulo;
	private JTextArea txtCaracteristicas;
	private JLabel lblUbicacionTitulo;
	private JButton btnGoogleMaps;
	private JScrollPane scrollPane_1;
	private JRadioButtonMenuItem rdbtnEspaniol;
	private JRadioButtonMenuItem rdbtnIngles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frmPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JFrame getFrame() {
		return frmPrincipal;
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		String[] g1 = { "fotosReserva/bano1.jpg", "fotosReserva/habitacion1.jpg", "fotosReserva/cocina1.jpg" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		String[] g2 = { "fotosReserva/bano2.jpg", "fotosReserva/habitacion2.jpg", "fotosReserva/cocina2.jpg" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		String[] g3 = { "fotosReserva/bano3.jpg", "fotosReserva/habitacion3.jpg", "fotosReserva/cocina3.jpg" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		String[] g4 = { "fotosReserva/bano4.jpg", "fotosReserva/habitacion4.jpg", "fotosReserva/cocina4.jpg" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		String[] g5 = { "fotosReserva/bano5.jpg", "fotosReserva/habitacion5.jpg", "fotosReserva/cocina5.jpg" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		String[] g6 = { "fotosReserva/bano6.jpg", "fotosReserva/habitacion6.jpg", "fotosReserva/cocina6.jpg" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		bun1 = new Bungalow("fotosReserva/B1.jpg", 1, 3, MessagesCampingInter.getString("VentanaPrincipal.20"), 20, "35m2", "fotosReserva/B1U.jpg", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				MessagesCampingInter.getString("VentanaPrincipal.0"), //$NON-NLS-1$
				"", MessagesCampingInter.getString("VentanaPrincipal.25"), g1); //$NON-NLS-1$ //$NON-NLS-2$
		bun2 = new Bungalow("fotosReserva/B2.jpg", 2, 2, MessagesCampingInter.getString("VentanaPrincipal.27"), 15, "18m2", "fotosReserva/B2U.jpg", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-4$
				MessagesCampingInter.getString("VentanaPrincipal.30"), //$NON-NLS-1$
				"", MessagesCampingInter.getString("VentanaPrincipal.32"), g2); //$NON-NLS-1$ //$NON-NLS-2$
		bun3 = new Bungalow("fotosReserva/B4.jpg", 3, 4, MessagesCampingInter.getString("VentanaPrincipal.34"), 40, "43m2", "fotosReserva/B3U.jpg", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				MessagesCampingInter.getString("VentanaPrincipal.37"), //$NON-NLS-1$
				"", MessagesCampingInter.getString("VentanaPrincipal.39"), g3); //$NON-NLS-1$ //$NON-NLS-2$
		bun4 = new Bungalow("fotosReserva/B5.jpg", 4, 2, MessagesCampingInter.getString("VentanaPrincipal.41"), 20, "20m2", "fotosReserva/B4U.jpg", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				MessagesCampingInter.getString("VentanaPrincipal.44"), //$NON-NLS-1$
				"", MessagesCampingInter.getString("VentanaPrincipal.46"), g4); //$NON-NLS-1$ //$NON-NLS-2$
		bun5 = new Bungalow("fotosReserva/B6.jpg", 5, 3, MessagesCampingInter.getString("VentanaPrincipal.48"), 35, "32m2", "fotosReserva/B5U.jpg", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				MessagesCampingInter.getString("VentanaPrincipal.1"), //$NON-NLS-1$
				"", MessagesCampingInter.getString("VentanaPrincipal.53"), g5); //$NON-NLS-1$ //$NON-NLS-2$
		bun6 = new Bungalow("fotosReserva/B7.jpg", 6, 2, MessagesCampingInter.getString("VentanaPrincipal.55"), 12, "25m2", "fotosReserva/B6U.jpg", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				MessagesCampingInter.getString("VentanaPrincipal.58"), //$NON-NLS-1$
				"", MessagesCampingInter.getString("VentanaPrincipal.60"), g6); //$NON-NLS-1$ //$NON-NLS-2$

		p1 = new Parcela("fotosReserva/P1.jpg", 1, MessagesCampingInter.getString("VentanaPrincipal.62"), 10, //$NON-NLS-1$ //$NON-NLS-2$
				MessagesCampingInter.getString("VentanaPrincipal.63"), "10m2", //$NON-NLS-1$ //$NON-NLS-2$
				"fotosReserva/P1U.jpg", MessagesCampingInter.getString("VentanaPrincipal.66"), MessagesCampingInter.getString("VentanaPrincipal.67"), null); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		p2 = new Parcela("fotosReserva/P2.jpg", 2, MessagesCampingInter.getString("VentanaPrincipal.69"), 50, //$NON-NLS-1$ //$NON-NLS-2$
				MessagesCampingInter.getString("VentanaPrincipal.70"), "40m2", //$NON-NLS-1$ //$NON-NLS-2$
				"fotosReserva/P1U.jpg", MessagesCampingInter.getString("VentanaPrincipal.73"), MessagesCampingInter.getString("VentanaPrincipal.74"), null); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		p3 = new Parcela("fotosReserva/P3.jpg", 3, MessagesCampingInter.getString("VentanaPrincipal.76"), 35, //$NON-NLS-1$ //$NON-NLS-2$
				MessagesCampingInter.getString("VentanaPrincipal.77"), //$NON-NLS-1$
				"60m2", "fotosReserva/P3U.jpg", MessagesCampingInter.getString("VentanaPrincipal.80"), MessagesCampingInter.getString("VentanaPrincipal.81"), null); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		p4 = new Parcela("fotosReserva/P4.jpg", 4, MessagesCampingInter.getString("VentanaPrincipal.83"), 15, //$NON-NLS-1$ //$NON-NLS-2$
				MessagesCampingInter.getString("VentanaPrincipal.84"), //$NON-NLS-1$
				"30m2", "fotosReserva/P4U.jpg", MessagesCampingInter.getString("VentanaPrincipal.87"), MessagesCampingInter.getString("VentanaPrincipal.88"), null); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		p5 = new Parcela("fotosReserva/P5.jpg", 5, MessagesCampingInter.getString("VentanaPrincipal.90"), 20, //$NON-NLS-1$ //$NON-NLS-2$
				MessagesCampingInter.getString("VentanaPrincipal.91"), //$NON-NLS-1$
				"40m2", "fotosReserva/P5U.jpg", MessagesCampingInter.getString("VentanaPrincipal.94"), MessagesCampingInter.getString("VentanaPrincipal.95"), null); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		p6 = new Parcela("fotosReserva/P6.jpg", 6, MessagesCampingInter.getString("VentanaPrincipal.97"), 10, //$NON-NLS-1$ //$NON-NLS-2$
				MessagesCampingInter.getString("VentanaPrincipal.98"), //$NON-NLS-1$
				"10m2", "fotosReserva/P6U.jpg", MessagesCampingInter.getString("VentanaPrincipal.101"), MessagesCampingInter.getString("VentanaPrincipal.102"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				null);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmPrincipal = new JFrame();
		frmPrincipal.addKeyListener(new FrmPrincipalKeyListener());
		frmPrincipal.getContentPane().addComponentListener(new FrmPrincipalContentPaneComponentListener());
		frmPrincipal.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VentanaPrincipal.class.getResource("/presentacion/Iconos/casaVerde.png"))); //$NON-NLS-1$
		frmPrincipal.setTitle(MessagesCampingInter.getString("VentanaPrincipal.frmPrincipal.title")); //$NON-NLS-1$
		frmPrincipal.setBounds(100, 20, 1920, 1080);
		frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrincipal.getContentPane().setLayout(new CardLayout(0, 0));
		{
			panelLogin = new JPanel();
			panelLogin.addKeyListener(new PanelLoginKeyListener());
			panelLogin.setBorder(null);
			frmPrincipal.getContentPane().add(panelLogin, MessagesCampingInter.getString("VentanaPrincipal.104")); //$NON-NLS-1$
			panelLogin.setLayout(null);
			{
				panelIniciarSesion = new JPanel();
				panelIniciarSesion.addKeyListener(new PanelIniciarSesionKeyListener());
				panelIniciarSesion.setBackground(SystemColor.controlLtHighlight);
				panelIniciarSesion.setBounds(340, 94, 510, 471);
				panelIniciarSesion.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				panelLogin.add(panelIniciarSesion);
				GridBagLayout gbl_panelIniciarSesion = new GridBagLayout();
				gbl_panelIniciarSesion.columnWidths = new int[] { 35, 43, 160, 35, 0 };
				gbl_panelIniciarSesion.rowHeights = new int[] { 81, 0, 0, 26, 41, 21, 41, 20, 34, 20, 24, 15, 0 };
				gbl_panelIniciarSesion.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
				gbl_panelIniciarSesion.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, Double.MIN_VALUE };
				panelIniciarSesion.setLayout(gbl_panelIniciarSesion);
				{
					lblIniciarSesion = new JLabel(
							MessagesCampingInter.getString("VentanaPrincipal.lblIniciarSesion.text")); //$NON-NLS-1$
					lblIniciarSesion.setIcon(
							new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/Iconos/casa-verde.png"))); //$NON-NLS-1$
					lblIniciarSesion.setHorizontalAlignment(SwingConstants.CENTER);
					lblIniciarSesion.setBorder(new LineBorder(new Color(0, 0, 0)));
					lblIniciarSesion.setForeground(SystemColor.text);
					lblIniciarSesion.setBackground(new Color(0, 128, 0));
					lblIniciarSesion.setOpaque(true);
					lblIniciarSesion.setFont(new Font("Tahoma", Font.BOLD, 24)); //$NON-NLS-1$
					GridBagConstraints gbc_lblIniciarSesion = new GridBagConstraints();
					gbc_lblIniciarSesion.fill = GridBagConstraints.BOTH;
					gbc_lblIniciarSesion.gridwidth = 4;
					gbc_lblIniciarSesion.insets = new Insets(0, 0, 5, 0);
					gbc_lblIniciarSesion.gridx = 0;
					gbc_lblIniciarSesion.gridy = 0;
					panelIniciarSesion.add(lblIniciarSesion, gbc_lblIniciarSesion);
				}
				{
					lblErrorUsuario = new JLabel(
							MessagesCampingInter.getString("VentanaPrincipal.lblErrorUsuario.text")); //$NON-NLS-1$
					lblErrorUsuario.setBorder(new LineBorder(new Color(178, 34, 34), 1, true));
					lblErrorUsuario.setHorizontalAlignment(SwingConstants.CENTER);
					lblErrorUsuario.setOpaque(true);
					lblErrorUsuario.setBackground(new Color(255, 99, 71));
					lblErrorUsuario.setFont(new Font("Tahoma", Font.BOLD, 11)); //$NON-NLS-1$
					lblErrorUsuario.setForeground(Color.BLACK);
					lblErrorUsuario.setVisible(false);
					{
						lblNewLabel = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblNewLabel.text")); //$NON-NLS-1$
						lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20)); //$NON-NLS-1$
						GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
						gbc_lblNewLabel.gridheight = 2;
						gbc_lblNewLabel.gridwidth = 2;
						gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
						gbc_lblNewLabel.gridx = 1;
						gbc_lblNewLabel.gridy = 1;
						panelIniciarSesion.add(lblNewLabel, gbc_lblNewLabel);
					}
					{
						chckbxRecordar = new JCheckBox(
								MessagesCampingInter.getString("VentanaPrincipal.chckbxRecordar.text")); //$NON-NLS-1$
						chckbxRecordar.setBackground(SystemColor.text);
						GridBagConstraints gbc_chckbxRecordar = new GridBagConstraints();
						gbc_chckbxRecordar.fill = GridBagConstraints.BOTH;
						gbc_chckbxRecordar.insets = new Insets(0, 0, 5, 5);
						gbc_chckbxRecordar.gridx = 1;
						gbc_chckbxRecordar.gridy = 8;
						panelIniciarSesion.add(chckbxRecordar, gbc_chckbxRecordar);
					}
					{
						btnEntrar = new JButton(MessagesCampingInter.getString("VentanaPrincipal.btnEntrar.text")); //$NON-NLS-1$
						btnEntrar.addActionListener(new BtnEntrarActionListener());
						btnEntrar.setMnemonic(KeyEvent.VK_ENTER);
						btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

						GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
						gbc_btnEntrar.fill = GridBagConstraints.BOTH;
						gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
						gbc_btnEntrar.gridx = 2;
						gbc_btnEntrar.gridy = 8;
						panelIniciarSesion.add(btnEntrar, gbc_btnEntrar);
					}
					{
						lblOlvidado = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblOlvidado.text")); //$NON-NLS-1$
						lblOlvidado.setHorizontalAlignment(SwingConstants.CENTER);
						lblOlvidado.setHorizontalTextPosition(SwingConstants.CENTER);
						lblOlvidado.setFont(new Font("Tahoma", Font.PLAIN, 12)); //$NON-NLS-1$
						lblOlvidado.setForeground(SystemColor.textHighlight);
						lblOlvidado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						GridBagConstraints gbc_lblOlvidado = new GridBagConstraints();
						gbc_lblOlvidado.insets = new Insets(0, 0, 5, 0);
						gbc_lblOlvidado.anchor = GridBagConstraints.NORTH;
						gbc_lblOlvidado.fill = GridBagConstraints.HORIZONTAL;
						gbc_lblOlvidado.gridwidth = 4;
						gbc_lblOlvidado.gridx = 0;
						gbc_lblOlvidado.gridy = 10;
						panelIniciarSesion.add(lblOlvidado, gbc_lblOlvidado);
					}
					{
						panelContra = new JPanel();
						GridBagConstraints gbc_panelContra = new GridBagConstraints();
						gbc_panelContra.fill = GridBagConstraints.BOTH;
						gbc_panelContra.gridwidth = 2;
						gbc_panelContra.insets = new Insets(0, 0, 5, 5);
						gbc_panelContra.gridx = 1;
						gbc_panelContra.gridy = 6;
						panelIniciarSesion.add(panelContra, gbc_panelContra);
						GridBagLayout gbl_panelContra = new GridBagLayout();
						gbl_panelContra.columnWidths = new int[] { 43, 53, 160, 32, 0 };
						gbl_panelContra.rowHeights = new int[] { 37, 0 };
						gbl_panelContra.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
						gbl_panelContra.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
						panelContra.setLayout(gbl_panelContra);
						{
							lblIconContr = new JLabel(); // $NON-NLS-1$
							lblIconContr.setHorizontalTextPosition(SwingConstants.LEADING);
							lblIconContr.setHorizontalAlignment(SwingConstants.TRAILING);
							lblIconContr.setIcon(new ImageIcon(
									VentanaPrincipal.class.getResource("/presentacion/Iconos/locked-padlock.png"))); //$NON-NLS-1$
							GridBagConstraints gbc_lblIconContr = new GridBagConstraints();
							gbc_lblIconContr.fill = GridBagConstraints.VERTICAL;
							gbc_lblIconContr.insets = new Insets(0, 0, 0, 5);
							gbc_lblIconContr.gridx = 0;
							gbc_lblIconContr.gridy = 0;
							panelContra.add(lblIconContr, gbc_lblIconContr);
						}
						{
							pwdContrasea = new JPasswordField();
							pwdContrasea.addFocusListener(new PwdContraseaFocusListener());
							// pwdContrasea.addKeyListener(new PwdContraseaKeyListener());
							pwdContrasea.setFont(new Font("Tahoma", Font.BOLD, 12)); //$NON-NLS-1$
							pwdContrasea.setBackground(UIManager.getColor("CheckBox.background")); //$NON-NLS-1$
							GridBagConstraints gbc_pwdContrasea = new GridBagConstraints();
							gbc_pwdContrasea.fill = GridBagConstraints.BOTH;
							gbc_pwdContrasea.gridwidth = 2;
							gbc_pwdContrasea.insets = new Insets(0, 0, 0, 5);
							gbc_pwdContrasea.gridx = 1;
							gbc_pwdContrasea.gridy = 0;
							panelContra.add(pwdContrasea, gbc_pwdContrasea);
							pwdContrasea.setBorder(null);
						}
						{
							btnVerContra = new JButton(); // $NON-NLS-1$
							btnVerContra.setIcon(
									new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/Iconos/eye.png"))); //$NON-NLS-1$
							verContra = false;
							btnVerContra.addActionListener(new BtnVerContraActionListener());
							btnVerContra.setOpaque(true);
							btnVerContra.setContentAreaFilled(false);
							btnVerContra.setBackground(UIManager.getColor("CheckBox.background")); //$NON-NLS-1$
							btnVerContra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnVerContra.setBorder(null);
							// btnVerContra.setIcon(new
							// ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/Iconos/eye.png")));
							GridBagConstraints gbc_btnVerContra = new GridBagConstraints();
							gbc_btnVerContra.anchor = GridBagConstraints.WEST;
							gbc_btnVerContra.gridx = 3;
							gbc_btnVerContra.gridy = 0;
							panelContra.add(btnVerContra, gbc_btnVerContra);
						}
					}
					GridBagConstraints gbc_lblErrorUsuario = new GridBagConstraints();
					gbc_lblErrorUsuario.fill = GridBagConstraints.BOTH;
					gbc_lblErrorUsuario.gridwidth = 2;
					gbc_lblErrorUsuario.insets = new Insets(0, 0, 5, 5);
					gbc_lblErrorUsuario.gridx = 1;
					gbc_lblErrorUsuario.gridy = 3;
					panelIniciarSesion.add(lblErrorUsuario, gbc_lblErrorUsuario);
				}
				{
					panelUsuario = new JPanel();
					panelUsuario.setBorder(null);
					GridBagConstraints gbc_panelUsuario = new GridBagConstraints();
					gbc_panelUsuario.gridwidth = 2;
					gbc_panelUsuario.insets = new Insets(0, 0, 5, 5);
					gbc_panelUsuario.fill = GridBagConstraints.BOTH;
					gbc_panelUsuario.gridx = 1;
					gbc_panelUsuario.gridy = 4;
					panelIniciarSesion.add(panelUsuario, gbc_panelUsuario);
					GridBagLayout gbl_panelUsuario = new GridBagLayout();
					gbl_panelUsuario.columnWidths = new int[] { 43, 53, 160, 0, 0 };
					gbl_panelUsuario.rowHeights = new int[] { 39, 0 };
					gbl_panelUsuario.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
					gbl_panelUsuario.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
					panelUsuario.setLayout(gbl_panelUsuario);
					{
						lblIconUsuario = new JLabel(); // $NON-NLS-1$
						lblIconUsuario.setIcon(new ImageIcon(
								VentanaPrincipal.class.getResource("/presentacion/Iconos/userLogin.png"))); //$NON-NLS-1$
						GridBagConstraints gbc_lblIconUsuario = new GridBagConstraints();
						gbc_lblIconUsuario.fill = GridBagConstraints.VERTICAL;
						gbc_lblIconUsuario.insets = new Insets(0, 0, 0, 5);
						gbc_lblIconUsuario.gridx = 0;
						gbc_lblIconUsuario.gridy = 0;
						panelUsuario.add(lblIconUsuario, gbc_lblIconUsuario);
					}
					{
						txtUsuario = new JTextField();
						try {
							formatoDNI = new MaskFormatter("########"); //$NON-NLS-1$
							// formatoDNI.setPlaceholderCharacter('X');
							txtUsuario = new JFormattedTextField(formatoDNI);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						txtUsuario.setFont(new Font("Tahoma", Font.BOLD, 12)); //$NON-NLS-1$
						txtUsuario.setBackground(UIManager.getColor("CheckBox.background")); //$NON-NLS-1$
						GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
						gbc_txtUsuario.fill = GridBagConstraints.BOTH;
						gbc_txtUsuario.gridwidth = 3;
						gbc_txtUsuario.insets = new Insets(0, 0, 0, 5);
						gbc_txtUsuario.gridx = 1;
						gbc_txtUsuario.gridy = 0;
						panelUsuario.add(txtUsuario, gbc_txtUsuario);
						txtUsuario.setBorder(null);
						txtUsuario.setColumns(10);
					}
				}
			}
		}
		{
			panelAplicacion = new JPanel();
			frmPrincipal.getContentPane().add(panelAplicacion, "panelAplicacion"); //$NON-NLS-1$
			panelAplicacion.setLayout(new BorderLayout(0, 0));
			{
				panelOpciones = new JPanel();
				panelOpciones.setBorder(new LineBorder(new Color(0, 0, 0)));
				panelOpciones.setBackground(new Color(255, 255, 255));
				panelAplicacion.add(panelOpciones, BorderLayout.NORTH);
				GridBagLayout gbl_panelOpciones = new GridBagLayout();
				gbl_panelOpciones.columnWidths = new int[] { 2 };
				gbl_panelOpciones.rowHeights = new int[] { 1 };
				gbl_panelOpciones.columnWeights = new double[] { 1.0 };
				gbl_panelOpciones.rowWeights = new double[] { 1.0 };
				panelOpciones.setLayout(gbl_panelOpciones);
				{
					menu = new JMenuBar();
					GridBagConstraints gbc_menu = new GridBagConstraints();
					gbc_menu.fill = GridBagConstraints.VERTICAL;
					gbc_menu.insets = new Insets(0, 0, 5, 0);
					gbc_menu.anchor = GridBagConstraints.WEST;
					gbc_menu.gridx = 0;
					gbc_menu.gridy = 0;
					panelOpciones.add(menu, gbc_menu);
					{
						mnOpciones = new JMenu(); // $NON-NLS-1$
						mnOpciones.setIcon(new ImageIcon(
								VentanaPrincipal.class.getResource("/presentacion/Iconos/userLogin.png"))); //$NON-NLS-1$
						menu.add(mnOpciones);
						{
							mntmPerfil = new JMenuItem(
									MessagesCampingInter.getString("VentanaPrincipal.mntmPerfil.text")); //$NON-NLS-1$
							mntmPerfil.addActionListener(new MntmPerfilActionListener());
							mntmPerfil.setIcon(new ImageIcon(
									VentanaPrincipal.class.getResource("/presentacion/Fotos/perfilFoto2.png"))); //$NON-NLS-1$
							mnOpciones.add(mntmPerfil);
						}
						{
							separator = new JSeparator();
							mnOpciones.add(separator);
						}
						{
							mntmACercaDe = new JMenuItem(
									MessagesCampingInter.getString("VentanaPrincipal.mntmACercaDe.text")); //$NON-NLS-1$
							mntmACercaDe.addActionListener(new MntmACercaDeActionListener());
							mntmACercaDe.setIcon(
									new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/Iconos/lupa.png"))); //$NON-NLS-1$
							mnOpciones.add(mntmACercaDe);
						}
						{
							separator_1 = new JSeparator();
							mnOpciones.add(separator_1);
						}
						{
							mntmCerrarSesin = new JMenuItem(
									MessagesCampingInter.getString("VentanaPrincipal.mntmCerrarSesin.text")); //$NON-NLS-1$
							mntmCerrarSesin.addMouseListener(new MntmCerrarSesinMouseListener());
							mntmCerrarSesin.addActionListener(new MntmCerrarSesinActionListener());
							{
								mnAjustes = new JMenu(
										MessagesCampingInter.getString("VentanaPrincipal.mnAjustes.text")); //$NON-NLS-1$
								mnAjustes.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/camara.png"))); //$NON-NLS-1$
								mnOpciones.add(mnAjustes);
								{
									mntmx = new JMenuItem(
											MessagesCampingInter.getString("VentanaPrincipal.mntmx.text")); //$NON-NLS-1$
									mntmx.addActionListener(new MntmxActionListener());
									mnAjustes.add(mntmx);
								}
								{
									mntmx_1 = new JMenuItem(
											MessagesCampingInter.getString("VentanaPrincipal.mntmx_1.text")); //$NON-NLS-1$
									mntmx_1.addActionListener(new Mntmx_1ActionListener());
									mnAjustes.add(mntmx_1);
								}
								{
									{
										mntmx_3 = new JMenuItem(
												MessagesCampingInter.getString("VentanaPrincipal.mntmx_3.text")); //$NON-NLS-1$
										mntmx_3.addActionListener(new Mntmx_3ActionListener());
										mntmx_2 = new JMenuItem(
												MessagesCampingInter.getString("VentanaPrincipal.mntmx_2.text")); //$NON-NLS-1$
										mntmx_2.addActionListener(new Mntmx_2ActionListener());
										mnAjustes.add(mntmx_2);
										mnAjustes.add(mntmx_3);
									}
								}
							}
							mntmCerrarSesin.setIcon(new ImageIcon(
									VentanaPrincipal.class.getResource("/presentacion/Iconos/boton-x.png"))); //$NON-NLS-1$
							mnOpciones.add(mntmCerrarSesin);
						}
					}
					{
						mnIdioma = new JMenu(); // $NON-NLS-1$
						mnIdioma.setIcon(new ImageIcon(
								VentanaPrincipal.class.getResource("/presentacion/Iconos/en-todo-el-mundo.png"))); //$NON-NLS-1$
						menu.add(mnIdioma);
						{
							rdbtnEspaniol = new JRadioButtonMenuItem(MessagesCampingInter.getString("VentanaPrincipal.rdbtnEspaol.text")); //$NON-NLS-1$
							//rdbtnEspaniol.setText("Spanish");
							rdbtnEspaniol.addActionListener(new RdbtnCambiarIdiomaActionListener());
							CambiarIdioma.add(rdbtnEspaniol);
							rdbtnEspaniol.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/Iconos/spain16x16.png"))); //$NON-NLS-1$
							mnIdioma.add(rdbtnEspaniol);
						}
						{
							rdbtnIngles = new JRadioButtonMenuItem(MessagesCampingInter.getString("VentanaPrincipal.rdbtnIngls.text")); //$NON-NLS-1$
							
							rdbtnIngles.addActionListener(new RdbtnCambiarIdiomaActionListener());
							CambiarIdioma.add(rdbtnIngles);
							if (MessagesCampingInter.getIdioma().equals("inglés")) { //$NON-NLS-1$
								rdbtnIngles.setSelected(true);
							}
							else {
								rdbtnEspaniol.setSelected(true);
							}
							rdbtnIngles.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/Iconos/united-kingdom16x16.png"))); //$NON-NLS-1$
							//rdbtnIngles.setText("English");
							mnIdioma.add(rdbtnIngles);
						}
					}
				}
				{
					btnAyuda = new JButton(); // $NON-NLS-1$
					btnAyuda.addActionListener(new BtnAyudaActionListener());
					btnAyuda.setIcon(
							new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/Iconos/ayuda.png"))); //$NON-NLS-1$
					GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
					gbc_btnAyuda.gridx = 1;
					gbc_btnAyuda.gridy = 0;
					panelOpciones.add(btnAyuda, gbc_btnAyuda);
				}
			}
			{
				panelPaneles = new JPanel();
				panelAplicacion.add(panelPaneles, BorderLayout.CENTER);
				panelPaneles.setLayout(new BorderLayout(0, 0));
				{
					panelBotones = new JPanel();

					panelBotones.setBackground(Color.WHITE);
					panelPaneles.add(panelBotones, BorderLayout.WEST);
					GridBagLayout gbl_panelBotones = new GridBagLayout();
					gbl_panelBotones.columnWidths = new int[] { 0, 1 };
					gbl_panelBotones.rowHeights = new int[] { 0, 0, 0, 0, 8 };
					gbl_panelBotones.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
					gbl_panelBotones.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
					panelBotones.setLayout(gbl_panelBotones);
					{
						btnReservas = new JButton(MessagesCampingInter.getString("VentanaPrincipal.btnReservas.text")); //$NON-NLS-1$
						btnReservas.setIcon(
								new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/Iconos/casa.png"))); //$NON-NLS-1$
						btnReservas.addActionListener(new BtnReservasActionListener());
						GridBagConstraints gbc_btnReservas = new GridBagConstraints();
						gbc_btnReservas.fill = GridBagConstraints.BOTH;
						gbc_btnReservas.insets = new Insets(0, 0, 5, 0);
						gbc_btnReservas.gridx = 0;
						gbc_btnReservas.gridy = 0;
						panelBotones.add(btnReservas, gbc_btnReservas);
					}
					{
						btnActividades = new JButton(
								MessagesCampingInter.getString("VentanaPrincipal.btnActividades.text")); //$NON-NLS-1$
						btnActividades.setIcon(new ImageIcon(
								VentanaPrincipal.class.getResource("/presentacion/Iconos/actividades.png"))); //$NON-NLS-1$
						btnActividades.addActionListener(new BtnActividadesActionListener());
						GridBagConstraints gbc_btnActividades = new GridBagConstraints();
						gbc_btnActividades.fill = GridBagConstraints.BOTH;
						gbc_btnActividades.insets = new Insets(0, 0, 5, 0);
						gbc_btnActividades.gridx = 0;
						gbc_btnActividades.gridy = 1;
						panelBotones.add(btnActividades, gbc_btnActividades);
					}
					{
						btnDisearRuta = new JButton(
								MessagesCampingInter.getString("VentanaPrincipal.btnDisearRuta.text")); //$NON-NLS-1$
						btnDisearRuta.setIcon(
								new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/Iconos/mapa.png"))); //$NON-NLS-1$
						btnDisearRuta.addActionListener(new BtnDisearRutaActionListener());
						GridBagConstraints gbc_btnDisearRuta = new GridBagConstraints();
						gbc_btnDisearRuta.fill = GridBagConstraints.BOTH;
						gbc_btnDisearRuta.insets = new Insets(0, 0, 5, 0);
						gbc_btnDisearRuta.gridx = 0;
						gbc_btnDisearRuta.gridy = 2;
						panelBotones.add(btnDisearRuta, gbc_btnDisearRuta);
					}
					{
						btnGuasYMonitores = new JButton(
								MessagesCampingInter.getString("VentanaPrincipal.btnGuasYMonitores.text")); //$NON-NLS-1$
						btnGuasYMonitores.setIcon(new ImageIcon(
								VentanaPrincipal.class.getResource("/presentacion/Iconos/simbolo-del-personal.png"))); //$NON-NLS-1$
						btnGuasYMonitores.addActionListener(new BtnGuasYMonitoresActionListener());
						GridBagConstraints gbc_btnGuasYMonitores = new GridBagConstraints();
						gbc_btnGuasYMonitores.fill = GridBagConstraints.VERTICAL;
						gbc_btnGuasYMonitores.gridx = 0;
						gbc_btnGuasYMonitores.gridy = 3;
						panelBotones.add(btnGuasYMonitores, gbc_btnGuasYMonitores);
					}
				}
				{
					panelFunciones = new JPanel();
					panelFunciones.setBorder(null);
					panelPaneles.add(panelFunciones, BorderLayout.CENTER);
					panelFunciones.setLayout(new CardLayout(0, 0));
					{
						panelReservas = new JPanel();
						panelReservas.setBackground(Color.WHITE);
						panelFunciones.add(panelReservas, "panelReservas"); //$NON-NLS-1$
						panelReservas.setLayout(new BorderLayout(0, 0));
						{
							panelBusquedaID = new JPanel();
							panelReservas.add(panelBusquedaID, BorderLayout.NORTH);
							GridBagLayout gbl_panelBusquedaID = new GridBagLayout();
							gbl_panelBusquedaID.columnWidths = new int[] { 104, 180, 499, 74, 13, 75, 408, 0 };
							gbl_panelBusquedaID.rowHeights = new int[] { 0, 20, 0 };
							gbl_panelBusquedaID.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
									Double.MIN_VALUE };
							gbl_panelBusquedaID.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
							panelBusquedaID.setLayout(gbl_panelBusquedaID);
							{
								btnParcelas = new JButton(
										MessagesCampingInter.getString("VentanaPrincipal.btnParcelas.text")); //$NON-NLS-1$
								btnParcelas.addActionListener(new BtnParcelasActionListener());
								btnParcelas.setHorizontalTextPosition(SwingConstants.CENTER);
								btnParcelas.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
								btnParcelas.setForeground(Color.BLACK);
								GridBagConstraints gbc_btnParcelas = new GridBagConstraints();
								gbc_btnParcelas.fill = GridBagConstraints.HORIZONTAL;
								gbc_btnParcelas.insets = new Insets(0, 0, 5, 5);
								gbc_btnParcelas.gridx = 3;
								gbc_btnParcelas.gridy = 0;
								panelBusquedaID.add(btnParcelas, gbc_btnParcelas);
							}
							{
								btnBungalow = new JButton(
										MessagesCampingInter.getString("VentanaPrincipal.btnBungalow.text")); //$NON-NLS-1$
								btnBungalow.addActionListener(new BtnBungalowActionListener());
								btnBungalow.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
								btnBungalow.setForeground(Color.BLACK);
								GridBagConstraints gbc_btnBungalow = new GridBagConstraints();
								gbc_btnBungalow.fill = GridBagConstraints.HORIZONTAL;
								gbc_btnBungalow.insets = new Insets(0, 0, 5, 5);
								gbc_btnBungalow.gridx = 5;
								gbc_btnBungalow.gridy = 0;
								panelBusquedaID.add(btnBungalow, gbc_btnBungalow);
							}
							{
								lblBusquedaID = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblBusquedaID.text")); //$NON-NLS-1$
								lblBusquedaID.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
								lblBusquedaID.setFont(new Font("Tahoma", Font.PLAIN, 14)); //$NON-NLS-1$
								GridBagConstraints gbc_lblBusquedaID = new GridBagConstraints();
								gbc_lblBusquedaID.anchor = GridBagConstraints.EAST;
								gbc_lblBusquedaID.insets = new Insets(0, 0, 0, 5);
								gbc_lblBusquedaID.gridx = 0;
								gbc_lblBusquedaID.gridy = 1;
								panelBusquedaID.add(lblBusquedaID, gbc_lblBusquedaID);
							}
							{
								txtBuscarID = new JTextField();
								GridBagConstraints gbc_txtBuscarID = new GridBagConstraints();
								gbc_txtBuscarID.insets = new Insets(0, 0, 0, 5);
								gbc_txtBuscarID.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtBuscarID.gridx = 1;
								gbc_txtBuscarID.gridy = 1;
								panelBusquedaID.add(txtBuscarID, gbc_txtBuscarID);
								txtBuscarID.setColumns(10);
							}
							{
								btnBuscar = new JButton(); // $NON-NLS-1$
								btnBuscar.addActionListener(new BtnBuscarActionListener());
								btnBuscar.setBorder(null);
								btnBuscar.setIcon(
										new ImageIcon(VentanaPrincipal.class.getResource("/mapaIconos/lupa.png"))); //$NON-NLS-1$
								GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
								gbc_btnBuscar.anchor = GridBagConstraints.WEST;
								gbc_btnBuscar.insets = new Insets(0, 0, 0, 5);
								gbc_btnBuscar.gridx = 2;
								gbc_btnBuscar.gridy = 1;
								panelBusquedaID.add(btnBuscar, gbc_btnBuscar);
							}
						}
						{
							panelTablas = new JPanel();
							panelReservas.add(panelTablas, BorderLayout.CENTER);
							panelTablas.setLayout(new CardLayout(0, 0));
							completarArrays();
							{
								scrollPane_Parcela = new JScrollPane();
								panelTablas.add(scrollPane_Parcela, "scrollPane_Parcela"); //$NON-NLS-1$
								{

									tableParcela = new JTable();
									tableParcela.addMouseListener(new TableParcelaMouseListener());
									tableParcela.setFont(new Font("Tahoma", Font.PLAIN, 14)); //$NON-NLS-1$
									tableParcela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
									/*
									 * tableParcela.setModel(new DefaultTableModel( new Object[][] { }, new String[]
									 * { "New column3" } ));
									 */

									tableParcela.setRowHeight(170);
									modeloTablaParcela = new MiModeloTablaParcela();
									tableParcela.setModel(modeloTablaParcela);

									Object[] filaP1 = { p1.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(p1.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.141") + p1.getNombre(), p1.getTamanio(), p1.getDescripcion(), //$NON-NLS-1$
											p1.getDisponible(), p1.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.142") }; //$NON-NLS-1$
									Object[] filaP2 = { p2.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(p2.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.143") + p2.getNombre(), p2.getTamanio(), p2.getDescripcion(), //$NON-NLS-1$
											p2.getDisponible(), p2.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.144") }; //$NON-NLS-1$
									Object[] filaP3 = { p3.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(p3.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.145") + p3.getNombre(), p3.getTamanio(), p3.getDescripcion(), //$NON-NLS-1$
											p3.getDisponible(), p3.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.146") }; //$NON-NLS-1$
									Object[] filaP4 = { p4.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(p4.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.147") + p4.getNombre(), p4.getTamanio(), p4.getDescripcion(), //$NON-NLS-1$
											p4.getDisponible(), p4.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.148") }; //$NON-NLS-1$
									Object[] filaP5 = { p5.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(p5.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.149") + p5.getNombre(), p5.getTamanio(), p5.getDescripcion(), //$NON-NLS-1$
											p5.getDisponible(), p5.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.150") }; //$NON-NLS-1$
									Object[] filaP6 = { p6.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(p6.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.151") + p6.getNombre(), p6.getTamanio(), p6.getDescripcion(), //$NON-NLS-1$
											p6.getDisponible(), p6.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.152") }; //$NON-NLS-1$

									centrarTabla(tableParcela);
									modeloTablaParcela.aniadeFila(filaP1);
									modeloTablaParcela.aniadeFila(filaP2);
									modeloTablaParcela.aniadeFila(filaP3);
									modeloTablaParcela.aniadeFila(filaP4);
									modeloTablaParcela.aniadeFila(filaP5);
									modeloTablaParcela.aniadeFila(filaP6);

									scrollPane_Parcela.setViewportView(tableParcela);
									completarEstados(comboBoxParcela, 5, tableParcela);

								}
							}
							{
								scrollPane_Bungalow = new JScrollPane();
								scrollPane_Bungalow.setVisible(false);
								panelTablas.add(scrollPane_Bungalow, "scrollPane_Bungalow"); //$NON-NLS-1$
								{

									tableBungalow = new JTable();
									tableBungalow.addMouseListener(new TableBungalowMouseListener());
									tableBungalow.setFont(new Font("Tahoma", Font.PLAIN, 14)); //$NON-NLS-1$
									tableBungalow.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
									tableBungalow.setRowHeight(170);
									modeloTablaBungalow = new MiModeloTablaBungalow();
									tableBungalow.setModel(modeloTablaBungalow);
									Object[] filaB1 = { bun1.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(bun1.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.155") + bun1.getTipo(), bun1.getCapacidadMax(), bun1.getDisponible(), //$NON-NLS-1$
											bun1.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.156"), "" }; //$NON-NLS-1$ //$NON-NLS-2$
									Object[] filaB2 = { bun2.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(bun2.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.158") + bun2.getTipo(), bun2.getCapacidadMax(), bun2.getDisponible(), //$NON-NLS-1$
											bun2.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.159"), "" }; //$NON-NLS-1$ //$NON-NLS-2$
									Object[] filaB3 = { bun3.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(bun3.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.161") + bun3.getTipo(), bun3.getCapacidadMax(), bun3.getDisponible(), //$NON-NLS-1$
											bun3.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.162"), "" }; //$NON-NLS-1$ //$NON-NLS-2$
									Object[] filaB4 = { bun4.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(bun4.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.164") + bun4.getTipo(), bun4.getCapacidadMax(), bun4.getDisponible(), //$NON-NLS-1$
											bun4.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.165"), "" }; //$NON-NLS-1$ //$NON-NLS-2$
									Object[] filaB5 = { bun5.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(bun5.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.167") + bun1.getTipo(), bun5.getCapacidadMax(), bun5.getDisponible(), //$NON-NLS-1$
											bun5.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.168"), "" }; //$NON-NLS-1$ //$NON-NLS-2$
									Object[] filaB6 = { bun6.getId(),
											new ImageIcon(getClass().getClassLoader().getResource(bun6.getFoto())),
											MessagesCampingInter.getString("VentanaPrincipal.170") + bun6.getTipo(), bun6.getCapacidadMax(), bun6.getDisponible(), //$NON-NLS-1$
											bun6.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.171"), "" }; //$NON-NLS-1$ //$NON-NLS-2$

									centrarTabla(tableBungalow);
									modeloTablaBungalow.aniadeFila(filaB1);
									modeloTablaBungalow.aniadeFila(filaB2);
									modeloTablaBungalow.aniadeFila(filaB3);
									modeloTablaBungalow.aniadeFila(filaB4);
									modeloTablaBungalow.aniadeFila(filaB5);
									modeloTablaBungalow.aniadeFila(filaB6);

									scrollPane_Bungalow.setViewportView(tableBungalow);

									completarEstados(comboBoxBungalow, 4, tableBungalow);

								}
							}
						}
						{
							{

							}
						}
						{
							{

							}
						}
					}
					{
						panelActividades = new JPanel();
						panelActividades.setBackground(Color.WHITE);
						panelFunciones.add(panelActividades, "panelActividades"); //$NON-NLS-1$
						panelActividades.setLayout(new BorderLayout(0, 0));
						{
							panelBusqueda = new JPanel();
							panelActividades.add(panelBusqueda, BorderLayout.NORTH);
							GridBagLayout gbl_panelBusqueda = new GridBagLayout();
							gbl_panelBusqueda.columnWidths = new int[] { 0, 25, 0, 180, 0, 30, 91, 71, 121, 0 };
							gbl_panelBusqueda.rowHeights = new int[] { 0, 0 };
							gbl_panelBusqueda.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
									0.0, Double.MIN_VALUE };
							gbl_panelBusqueda.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
							panelBusqueda.setLayout(gbl_panelBusqueda);
							{
								btnAadir = new JButton(
										MessagesCampingInter.getString("VentanaPrincipal.btnAadir.text")); //$NON-NLS-1$
								btnAadir.setFont(new Font("Tahoma", Font.PLAIN, 13)); //$NON-NLS-1$
								btnAadir.addActionListener(new BtnAadirActionListener());
								btnAadir.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/anadir.png"))); //$NON-NLS-1$
								GridBagConstraints gbc_btnAadir = new GridBagConstraints();
								gbc_btnAadir.insets = new Insets(0, 0, 0, 5);
								gbc_btnAadir.gridx = 0;
								gbc_btnAadir.gridy = 0;
								panelBusqueda.add(btnAadir, gbc_btnAadir);
							}
							{
								lblBusca = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblBusca.text")); //$NON-NLS-1$
								lblBusca.setFont(new Font("Tahoma", Font.PLAIN, 13)); //$NON-NLS-1$
								GridBagConstraints gbc_lblBusca = new GridBagConstraints();
								gbc_lblBusca.insets = new Insets(0, 0, 0, 5);
								gbc_lblBusca.gridx = 2;
								gbc_lblBusca.gridy = 0;
								panelBusqueda.add(lblBusca, gbc_lblBusca);
							}
							{
								txtBusquedaActividad = new JTextField();
								GridBagConstraints gbc_txtBusquedaActividad = new GridBagConstraints();
								gbc_txtBusquedaActividad.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtBusquedaActividad.insets = new Insets(0, 0, 0, 5);
								gbc_txtBusquedaActividad.gridx = 3;
								gbc_txtBusquedaActividad.gridy = 0;
								panelBusqueda.add(txtBusquedaActividad, gbc_txtBusquedaActividad);
								txtBusquedaActividad.setColumns(10);
							}
							{
								btnLupita = new JButton(); // $NON-NLS-1$
								btnLupita.addActionListener(new BtnLupitaActionListener());
								btnLupita.setBorder(null);
								btnLupita.setIcon(
										new ImageIcon(VentanaPrincipal.class.getResource("/mapaIconos/lupa.png"))); //$NON-NLS-1$
								GridBagConstraints gbc_btnLupita = new GridBagConstraints();
								gbc_btnLupita.anchor = GridBagConstraints.WEST;
								gbc_btnLupita.insets = new Insets(0, 0, 0, 5);
								gbc_btnLupita.gridx = 4;
								gbc_btnLupita.gridy = 0;
								panelBusqueda.add(btnLupita, gbc_btnLupita);
							}
						}
						{
							scrollPane_2 = new JScrollPane();
							scrollPane_2.setBackground(Color.WHITE);
							panelActividades.add(scrollPane_2, BorderLayout.CENTER);
							{
								escalada = new Actividad(MessagesCampingInter.getString("VentanaPrincipal.178"), MessagesCampingInter.getString("VentanaPrincipal.179"), MessagesCampingInter.getString("VentanaPrincipal.180"), 5, 11, 10, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
										MessagesCampingInter.getString("VentanaPrincipal.181"), MessagesCampingInter.getString("VentanaPrincipal.182"), "fotosActividades/escalada.jpg"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
								rutaGratis = new Actividad(MessagesCampingInter.getString("VentanaPrincipal.184"), MessagesCampingInter.getString("VentanaPrincipal.185"), MessagesCampingInter.getString("VentanaPrincipal.186"), 6, 13, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
										0, MessagesCampingInter.getString("VentanaPrincipal.187"), MessagesCampingInter.getString("VentanaPrincipal.188"), "fotosActividades/ruta.jpg"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
								equitacion = new Actividad(MessagesCampingInter.getString("VentanaPrincipal.190"), MessagesCampingInter.getString("VentanaPrincipal.191"), MessagesCampingInter.getString("VentanaPrincipal.192"), 4, 10, 15, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
										MessagesCampingInter.getString("VentanaPrincipal.193"), MessagesCampingInter.getString("VentanaPrincipal.194"), "fotosActividades/equitacion.jpg"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
								rafting = new Actividad(MessagesCampingInter.getString("VentanaPrincipal.196"), MessagesCampingInter.getString("VentanaPrincipal.197"), MessagesCampingInter.getString("VentanaPrincipal.198"), 8, 18, 12, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
										MessagesCampingInter.getString("VentanaPrincipal.199"), MessagesCampingInter.getString("VentanaPrincipal.200"), "fotosActividades/rafting.jpg"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
								arco = new Actividad(MessagesCampingInter.getString("VentanaPrincipal.202"), MessagesCampingInter.getString("VentanaPrincipal.203"), MessagesCampingInter.getString("VentanaPrincipal.204"), 6, 14, 8, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
										MessagesCampingInter.getString("VentanaPrincipal.205"), MessagesCampingInter.getString("VentanaPrincipal.206"), "fotosActividades/arco.jpg"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
								bici = new Actividad(MessagesCampingInter.getString("VentanaPrincipal.208"), MessagesCampingInter.getString("VentanaPrincipal.209"), MessagesCampingInter.getString("VentanaPrincipal.210"), 5, 10, 7, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
										MessagesCampingInter.getString("VentanaPrincipal.211"), MessagesCampingInter.getString("VentanaPrincipal.212"), "fotosActividades/bici.jpg"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

								tableActividades = new JTable();

								tableActividades.setBackground(Color.WHITE);
								tableActividades.setRowHeight(85);
								modeloTablaActividades = new MiModeloTablaActividades();
								tableActividades.setModel(modeloTablaActividades);

								TableColumn columnaFoto = tableActividades.getColumnModel().getColumn(0);
								columnaFoto.setCellEditor(new ColumnaFotoEditor());

								Object[] filaA1 = {
										new ImageIcon(getClass().getClassLoader().getResource(escalada.getFoto())),
										escalada.getId(), escalada.getMonitor(), escalada.getHorario(),
										escalada.getCupoMin() + "/" + escalada.getCupoMax(), //$NON-NLS-1$
										escalada.getPrecioH() + MessagesCampingInter.getString("VentanaPrincipal.215"), escalada.getArea(), //$NON-NLS-1$
										escalada.getMateriales() };
								Object[] filaA2 = {
										new ImageIcon(getClass().getClassLoader().getResource(rutaGratis.getFoto())),
										rutaGratis.getId(), rutaGratis.getMonitor(), rutaGratis.getHorario(),
										rutaGratis.getCupoMin() + "/" + rutaGratis.getCupoMax(), //$NON-NLS-1$
										rutaGratis.getPrecioH() + MessagesCampingInter.getString("VentanaPrincipal.217"), rutaGratis.getArea(), //$NON-NLS-1$
										rutaGratis.getMateriales() };
								Object[] filaA3 = {
										new ImageIcon(getClass().getClassLoader().getResource(equitacion.getFoto())),
										equitacion.getId(), equitacion.getMonitor(), equitacion.getHorario(),
										equitacion.getCupoMin() + "/" + equitacion.getCupoMax(), //$NON-NLS-1$
										equitacion.getPrecioH() + MessagesCampingInter.getString("VentanaPrincipal.219"), equitacion.getArea(), //$NON-NLS-1$
										equitacion.getMateriales() };
								Object[] filaA4 = {
										new ImageIcon(getClass().getClassLoader().getResource(rafting.getFoto())),
										rafting.getId(), rafting.getMonitor(), rafting.getHorario(),
										rafting.getCupoMin() + "/" + rafting.getCupoMax(), //$NON-NLS-1$
										rafting.getPrecioH() + MessagesCampingInter.getString("VentanaPrincipal.221"), rafting.getArea(), rafting.getMateriales() }; //$NON-NLS-1$
								Object[] filaA5 = {
										new ImageIcon(getClass().getClassLoader().getResource(arco.getFoto())),
										arco.getId(), arco.getMonitor(), arco.getHorario(),
										arco.getCupoMin() + "/" + arco.getCupoMax(), arco.getPrecioH() + MessagesCampingInter.getString("VentanaPrincipal.223"), //$NON-NLS-1$ //$NON-NLS-2$
										arco.getArea(), arco.getMateriales() };
								Object[] filaA6 = {
										new ImageIcon(getClass().getClassLoader().getResource(bici.getFoto())),
										bici.getId(), bici.getMonitor(), bici.getHorario(),
										bici.getCupoMin() + "/" + bici.getCupoMax(), bici.getPrecioH() + MessagesCampingInter.getString("VentanaPrincipal.225"), //$NON-NLS-1$ //$NON-NLS-2$
										bici.getArea(), bici.getMateriales() };

								centrarTabla(tableActividades);
								modeloTablaActividades.aniadeFila(filaA1);
								modeloTablaActividades.aniadeFila(filaA2);
								modeloTablaActividades.aniadeFila(filaA3);
								modeloTablaActividades.aniadeFila(filaA4);
								modeloTablaActividades.aniadeFila(filaA5);
								modeloTablaActividades.aniadeFila(filaA6);

								tableActividades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
								ListSelectionModel rowSM = tableActividades.getSelectionModel();
								rowSM.addListSelectionListener(new ListSelectionListener() {
									public void valueChanged(ListSelectionEvent e) {
										ListSelectionModel lsm = (ListSelectionModel) e.getSource();
										if (!lsm.isSelectionEmpty()) {
											MiModeloTablaActividades modeloTabla = (MiModeloTablaActividades) tableActividades
													.getModel();
											int n = tableActividades.getSelectedRow();
											if (n != -1) {
												txtActividad.setText(MessagesCampingInter.getString("VentanaPrincipal.226") + modeloTabla.getValueAt(n, 1) //$NON-NLS-1$
														+ MessagesCampingInter.getString("VentanaPrincipal.227") + modeloTabla.getValueAt(n, 2) + MessagesCampingInter.getString("VentanaPrincipal.228") //$NON-NLS-1$ //$NON-NLS-2$
														+ modeloTabla.getValueAt(n, 3) + MessagesCampingInter.getString("VentanaPrincipal.229") //$NON-NLS-1$
														+ modeloTabla.getValueAt(n, 5)
														+ MessagesCampingInter.getString("VentanaPrincipal.230") //$NON-NLS-1$
														+ modeloTabla.getValueAt(n, 6) + MessagesCampingInter.getString("VentanaPrincipal.231") //$NON-NLS-1$
														+ modeloTabla.getValueAt(n, 7) + MessagesCampingInter.getString("VentanaPrincipal.232") //$NON-NLS-1$
														+ modeloTabla.getValueAt(n, 4) + MessagesCampingInter.getString("VentanaPrincipal.233")); //$NON-NLS-1$
												lblActividad.setIcon((ImageIcon) modeloTabla.getValueAt(n, 0));
											}
										}
									}
								});
								{
									popupMenu = new JPopupMenu();
									addPopup(tableActividades, popupMenu);
									{
										mntmEliminar = new JMenuItem(
												MessagesCampingInter.getString("VentanaPrincipal.mntmEliminar.text")); //$NON-NLS-1$
										mntmEliminar.addActionListener(new MntmEliminarActionListener());
										mntmEliminar.setIcon(new ImageIcon(VentanaPrincipal.class
												.getResource("/presentacion/Iconos/boton-x.png"))); //$NON-NLS-1$
										popupMenu.add(mntmEliminar);
									}
								}
								scrollPane_2.setViewportView(tableActividades);
							}
						}
						{
							panelInfoActividades = new JPanel();
							panelInfoActividades.setBorder(new LineBorder(new Color(0, 0, 0)));
							panelInfoActividades.setBackground(Color.WHITE);
							panelActividades.add(panelInfoActividades, BorderLayout.SOUTH);
							GridBagLayout gbl_panelInfoActividades = new GridBagLayout();
							gbl_panelInfoActividades.columnWidths = new int[] { 189, 189, 189, 189, 0, 25, 0, 0, 0, 0,
									0, 0, 0, 200, 0 };
							gbl_panelInfoActividades.rowHeights = new int[] { 30, 0, 30, 0, 0, 0, 0, 30, 0 };
							gbl_panelInfoActividades.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0,
									0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
							gbl_panelInfoActividades.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0,
									Double.MIN_VALUE };
							panelInfoActividades.setLayout(gbl_panelInfoActividades);
							{
								txtActividad = new JTextArea();
								txtActividad.setFont(new Font("Monospaced", Font.PLAIN, 16)); //$NON-NLS-1$
								txtActividad.setBackground(Color.WHITE);
								GridBagConstraints gbc_txtActividad = new GridBagConstraints();
								gbc_txtActividad.gridheight = 4;
								gbc_txtActividad.gridwidth = 7;
								gbc_txtActividad.insets = new Insets(0, 0, 5, 5);
								gbc_txtActividad.fill = GridBagConstraints.BOTH;
								gbc_txtActividad.gridx = 6;
								gbc_txtActividad.gridy = 3;
								panelInfoActividades.add(txtActividad, gbc_txtActividad);
							}
							{
								lblActividad = new JLabel(); // $NON-NLS-1$
								GridBagConstraints gbc_lblActividad = new GridBagConstraints();
								gbc_lblActividad.gridwidth = 2;
								gbc_lblActividad.gridheight = 5;
								gbc_lblActividad.insets = new Insets(0, 0, 5, 5);
								gbc_lblActividad.gridx = 1;
								gbc_lblActividad.gridy = 2;
								panelInfoActividades.add(lblActividad, gbc_lblActividad);
							}
						}
					}
					{
						panelDisearRuta = new JPanel();
						panelDisearRuta.setBackground(Color.WHITE);
						panelFunciones.add(panelDisearRuta, "panelDisearRuta"); //$NON-NLS-1$
						panelDisearRuta.setLayout(new BorderLayout(0, 0));
						{
							toolBarDisenoRuta = new JToolBar();
							panelDisearRuta.add(toolBarDisenoRuta, BorderLayout.NORTH);
							{
								btnPuntoInicio = new JButton(); // $NON-NLS-1$
								btnPuntoInicio.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnPuntoInicio.toolTipText")); //$NON-NLS-1$
								btnPuntoInicio.addActionListener(new BtnPuntoInicioActionListener());
								btnPuntoInicio.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/ptoInicio.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnPuntoInicio);
							}
							{
								btnPuntoFin = new JButton(); // $NON-NLS-1$
								btnPuntoFin.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnPuntoFin.toolTipText")); //$NON-NLS-1$
								btnPuntoFin.addActionListener(new BtnPuntoFinActionListener());
								btnPuntoFin.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/ptoFin.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnPuntoFin);
							}
							{
								btnFuente = new JButton(); // $NON-NLS-1$
								btnFuente.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnFuente.toolTipText")); //$NON-NLS-1$
								btnFuente.addActionListener(new BtnFuenteActionListener());
								btnFuente.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/fuente.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnFuente);
							}
							{
								btnAreaDescanso = new JButton(); // $NON-NLS-1$
								btnAreaDescanso.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnAreaDescanso.toolTipText")); //$NON-NLS-1$
								btnAreaDescanso.addActionListener(new BtnAreaDescansoActionListener());
								btnAreaDescanso.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/descanso.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnAreaDescanso);
							}
							{
								btnMirador = new JButton(); // $NON-NLS-1$
								btnMirador.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnMirador.toolTipText")); //$NON-NLS-1$
								btnMirador.addActionListener(new BtnMiradorActionListener());
								btnMirador.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/prismaticos.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnMirador);
							}
							{
								btnPuente = new JButton(); // $NON-NLS-1$
								btnPuente.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnPuente.toolTipText")); //$NON-NLS-1$
								btnPuente.addActionListener(new BtnPuenteActionListener());
								btnPuente.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/puente.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnPuente);
							}
							{
								btnAves = new JButton(); // $NON-NLS-1$
								btnAves.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnAves.toolTipText")); //$NON-NLS-1$
								btnAves.addActionListener(new BtnAvesActionListener());
								btnAves.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/ave.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnAves);
							}
							{
								btnRutaFacil = new JButton(); // $NON-NLS-1$
								btnRutaFacil.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnRutaFacil.toolTipText")); //$NON-NLS-1$
								btnRutaFacil.addActionListener(new BtnRutaFacilActionListener());
								btnRutaFacil.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/verde.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnRutaFacil);
							}
							{
								btnRutaMedia = new JButton(); // $NON-NLS-1$
								btnRutaMedia.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnRutaMedia.toolTipText")); //$NON-NLS-1$
								btnRutaMedia.addActionListener(new BtnRutaMediaActionListener());
								btnRutaMedia.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/amarillo.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnRutaMedia);
							}
							{
								btnRutaDificil = new JButton(); // $NON-NLS-1$
								btnRutaDificil.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnRutaDificil.toolTipText")); //$NON-NLS-1$
								btnRutaDificil.addActionListener(new BtnRutaDificilActionListener());
								btnRutaDificil.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/rojo.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnRutaDificil);
							}
							{
								btnNota = new JButton(); // $NON-NLS-1$
								btnNota.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnNota.toolTipText")); //$NON-NLS-1$
								btnNota.addActionListener(new BtnNotaActionListener());
								btnNota.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/comentar.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnNota);
							}
							{
								btnRefresh = new JButton(); // $NON-NLS-1$
								btnRefresh.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnRefresh.toolTipText")); //$NON-NLS-1$
								btnRefresh.addActionListener(new BtnRefreshActionListener());
								btnRefresh.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/refresh.png"))); //$NON-NLS-1$
								toolBarDisenoRuta.add(btnRefresh);
							}
							{
								btnExportar = new JButton(); // $NON-NLS-1$
								btnExportar.setToolTipText(
										MessagesCampingInter.getString("VentanaPrincipal.btnExportar.toolTipText")); //$NON-NLS-1$
								btnExportar.setIcon(
										new ImageIcon(VentanaPrincipal.class.getResource("/mapaIconos/exportar.png"))); //$NON-NLS-1$
								btnExportar.setSelectedIcon(null);
								btnExportar.addActionListener(new BtnExportarActionListener());
								toolBarDisenoRuta.add(btnExportar);
							}
						}
						{
							scrollPane_ruta = new JScrollPane();
							panelDisearRuta.add(scrollPane_ruta, BorderLayout.CENTER);
						}
					}
					{
						panelGuasYMonitores = new JPanel();
						panelGuasYMonitores.setBackground(Color.WHITE);
						panelFunciones.add(panelGuasYMonitores, "panelGuasYMonitores"); //$NON-NLS-1$
						panelGuasYMonitores.setLayout(new BorderLayout(0, 0));
						{
							panelAniadir = new JPanel();
							panelGuasYMonitores.add(panelAniadir, BorderLayout.NORTH);
							panelAniadir.setLayout(new GridLayout(0, 3, 0, 0));
							{
								btnAniadir = new JButton(
										MessagesCampingInter.getString("VentanaPrincipal.btnAniadir.text")); //$NON-NLS-1$
								btnAniadir.addActionListener(new BtnAniadirActionListener());
								btnAniadir.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/mas.png"))); //$NON-NLS-1$
								panelAniadir.add(btnAniadir);
							}
							{
								btnEliminar = new JButton(
										MessagesCampingInter.getString("VentanaPrincipal.btnEliminar.text")); //$NON-NLS-1$
								btnEliminar.addActionListener(new BtnEliminarActionListener());
								btnEliminar.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/eliminar.png"))); //$NON-NLS-1$
								panelAniadir.add(btnEliminar);
							}
							{
								btnEditar = new JButton(
										MessagesCampingInter.getString("VentanaPrincipal.btnEditar.text")); //$NON-NLS-1$
								btnEditar.addActionListener(new BtnEditarActionListener());
								btnEditar.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/editar.png"))); //$NON-NLS-1$
								panelAniadir.add(btnEditar);
							}
						}
						{
							panelListadoMonitores = new JPanel();
							panelGuasYMonitores.add(panelListadoMonitores, BorderLayout.CENTER);
							panelListadoMonitores.setLayout(new BorderLayout(0, 0));
							{
								scrollPane = new JScrollPane();
								panelListadoMonitores.add(scrollPane, BorderLayout.CENTER);
								{
									lstMonitores = new JList();
									lstMonitores.addListSelectionListener(new LstMonitoresListSelectionListener());
									scrollPane.setColumnHeaderView(lstMonitores);

									modeloLista = new CustomListModel();
									lstMonitores.setModel(modeloLista);

									Monitor m1 = new Monitor(MessagesCampingInter.getString("VentanaPrincipal.2"), MessagesCampingInter.getString("VentanaPrincipal.3"), "555 455 555", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
											"correo@correo.com", MessagesCampingInter.getString("VentanaPrincipal.258"), MessagesCampingInter.getString("VentanaPrincipal.259"), "/fotosMonitores/cara4.jpg"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
									Monitor m2 = new Monitor(MessagesCampingInter.getString("VentanaPrincipal.261"), MessagesCampingInter.getString("VentanaPrincipal.262"), "987 141 255", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
											"correo@correo.com", MessagesCampingInter.getString("VentanaPrincipal.265"), MessagesCampingInter.getString("VentanaPrincipal.266"), "/fotosMonitores/cara1.jpg"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
									Monitor m3 = new Monitor(MessagesCampingInter.getString("VentanaPrincipal.268"), MessagesCampingInter.getString("VentanaPrincipal.269"), "578 557 755", "correo@correo.com", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
											MessagesCampingInter.getString("VentanaPrincipal.272"), MessagesCampingInter.getString("VentanaPrincipal.273"), "/fotosMonitores/cara3.jpg"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
									Monitor m4 = new Monitor(MessagesCampingInter.getString("VentanaPrincipal.275"), MessagesCampingInter.getString("VentanaPrincipal.276"), "666 750 055", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
											"correo@correo.com", MessagesCampingInter.getString("VentanaPrincipal.279"), MessagesCampingInter.getString("VentanaPrincipal.280"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
											"/fotosMonitores/cara2.jpg"); //$NON-NLS-1$

									modeloLista.addMonitor(m1);
									modeloLista.addMonitor(m2);
									modeloLista.addMonitor(m3);
									modeloLista.addMonitor(m4);

									lstMonitores.setCellRenderer(new OtroListCellRenderer());
									scrollPane.setViewportView(lstMonitores);

								}
							}
						}
						{
							panelDatosMonitores = new JPanel();
							panelDatosMonitores.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
							panelGuasYMonitores.add(panelDatosMonitores, BorderLayout.EAST);
							GridBagLayout gbl_panelDatosMonitores = new GridBagLayout();
							gbl_panelDatosMonitores.columnWidths = new int[] { 78, 185, 25, 0, 0, 30 };
							gbl_panelDatosMonitores.rowHeights = new int[] { 46, 0, 0, 0, 0, 58, 0, 0, 0, 25, 0, 30 };
							gbl_panelDatosMonitores.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 0.0 };
							gbl_panelDatosMonitores.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
									1.0, 0.0, 0.0, 0.0 };
							panelDatosMonitores.setLayout(gbl_panelDatosMonitores);
							{
								lblDatosPersonales = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblDatosPersonales.text")); //$NON-NLS-1$
								lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 16)); //$NON-NLS-1$
								GridBagConstraints gbc_lblDatosPersonales = new GridBagConstraints();
								gbc_lblDatosPersonales.gridwidth = 3;
								gbc_lblDatosPersonales.insets = new Insets(0, 0, 5, 5);
								gbc_lblDatosPersonales.gridx = 1;
								gbc_lblDatosPersonales.gridy = 0;
								panelDatosMonitores.add(lblDatosPersonales, gbc_lblDatosPersonales);
							}
							{
								lblNm = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblNm.text")); //$NON-NLS-1$
								GridBagConstraints gbc_lblNm = new GridBagConstraints();
								gbc_lblNm.anchor = GridBagConstraints.EAST;
								gbc_lblNm.insets = new Insets(0, 0, 5, 5);
								gbc_lblNm.gridx = 0;
								gbc_lblNm.gridy = 1;
								panelDatosMonitores.add(lblNm, gbc_lblNm);
							}
							{
								txtNombre = new JTextField();
								txtNombre.setEnabled(false);
								GridBagConstraints gbc_txtNombre = new GridBagConstraints();
								gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
								gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtNombre.gridx = 1;
								gbc_txtNombre.gridy = 1;
								panelDatosMonitores.add(txtNombre, gbc_txtNombre);
								txtNombre.setColumns(10);
							}
							{
								lblApellidos_1 = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblApellidos_1.text")); //$NON-NLS-1$
								GridBagConstraints gbc_lblApellidos_1 = new GridBagConstraints();
								gbc_lblApellidos_1.anchor = GridBagConstraints.EAST;
								gbc_lblApellidos_1.insets = new Insets(0, 0, 5, 5);
								gbc_lblApellidos_1.gridx = 0;
								gbc_lblApellidos_1.gridy = 2;
								panelDatosMonitores.add(lblApellidos_1, gbc_lblApellidos_1);
							}
							{
								txtApellidos = new JTextField();
								txtApellidos.setEnabled(false);
								GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
								gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
								gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtApellidos.gridx = 1;
								gbc_txtApellidos.gridy = 2;
								panelDatosMonitores.add(txtApellidos, gbc_txtApellidos);
								txtApellidos.setColumns(10);
							}
							{
								lblTelfono_1 = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblTelfono_1.text")); //$NON-NLS-1$
								GridBagConstraints gbc_lblTelfono_1 = new GridBagConstraints();
								gbc_lblTelfono_1.anchor = GridBagConstraints.EAST;
								gbc_lblTelfono_1.insets = new Insets(0, 0, 5, 5);
								gbc_lblTelfono_1.gridx = 0;
								gbc_lblTelfono_1.gridy = 3;
								panelDatosMonitores.add(lblTelfono_1, gbc_lblTelfono_1);
							}
							{
								MaskFormatter formatoTlfno;
								try {
									formatoTlfno = new MaskFormatter(" ###' ###' ###"); //$NON-NLS-1$
									formatoTlfno.setPlaceholderCharacter('*');
									txtTelefono = new JFormattedTextField(formatoTlfno);
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								txtTelefono.setEnabled(false);
								GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
								gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
								gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtTelefono.gridx = 1;
								gbc_txtTelefono.gridy = 3;
								panelDatosMonitores.add(txtTelefono, gbc_txtTelefono);
								txtTelefono.setColumns(10);
							}
							{
								lblFoto = new JLabel(); // $NON-NLS-1$
								GridBagConstraints gbc_lblFoto = new GridBagConstraints();
								gbc_lblFoto.gridheight = 5;
								gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
								gbc_lblFoto.gridx = 3;
								gbc_lblFoto.gridy = 1;
								panelDatosMonitores.add(lblFoto, gbc_lblFoto);
							}
							{
								lblCorreo = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblCorreo.text")); //$NON-NLS-1$
								GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
								gbc_lblCorreo.anchor = GridBagConstraints.EAST;
								gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
								gbc_lblCorreo.gridx = 0;
								gbc_lblCorreo.gridy = 4;
								panelDatosMonitores.add(lblCorreo, gbc_lblCorreo);
							}
							{
								txtCorreo = new JTextField();
								txtCorreo.setEnabled(false);
								GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
								gbc_txtCorreo.insets = new Insets(0, 0, 5, 5);
								gbc_txtCorreo.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtCorreo.gridx = 1;
								gbc_txtCorreo.gridy = 4;
								panelDatosMonitores.add(txtCorreo, gbc_txtCorreo);
								txtCorreo.setColumns(10);
							}
							{
								lblIdiomas = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblIdiomas.text")); //$NON-NLS-1$
								GridBagConstraints gbc_lblIdiomas = new GridBagConstraints();
								gbc_lblIdiomas.anchor = GridBagConstraints.NORTHEAST;
								gbc_lblIdiomas.insets = new Insets(0, 0, 5, 5);
								gbc_lblIdiomas.gridx = 0;
								gbc_lblIdiomas.gridy = 5;
								panelDatosMonitores.add(lblIdiomas, gbc_lblIdiomas);
							}
							{
								txtIdiomas = new JTextArea();
								txtIdiomas.setEnabled(false);
								GridBagConstraints gbc_txtIdiomas = new GridBagConstraints();
								gbc_txtIdiomas.insets = new Insets(0, 0, 5, 5);
								gbc_txtIdiomas.fill = GridBagConstraints.BOTH;
								gbc_txtIdiomas.gridx = 1;
								gbc_txtIdiomas.gridy = 5;
								panelDatosMonitores.add(txtIdiomas, gbc_txtIdiomas);
							}
							{
								btnCargarFoto = new JButton(
										MessagesCampingInter.getString("VentanaPrincipal.btnCargarFoto.text")); //$NON-NLS-1$
								btnCargarFoto.addActionListener(new BtnCargarFotoActionListener());
								btnCargarFoto.setEnabled(false);
								btnCargarFoto.setIcon(new ImageIcon(
										VentanaPrincipal.class.getResource("/presentacion/Iconos/cargarFoto.png"))); //$NON-NLS-1$
								GridBagConstraints gbc_btnCargarFoto = new GridBagConstraints();
								gbc_btnCargarFoto.fill = GridBagConstraints.HORIZONTAL;
								gbc_btnCargarFoto.insets = new Insets(0, 0, 5, 5);
								gbc_btnCargarFoto.gridx = 3;
								gbc_btnCargarFoto.gridy = 6;
								panelDatosMonitores.add(btnCargarFoto, gbc_btnCargarFoto);
							}
							{
								lblFormacin = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblFormacin.text")); //$NON-NLS-1$
								GridBagConstraints gbc_lblFormacin = new GridBagConstraints();
								gbc_lblFormacin.anchor = GridBagConstraints.SOUTHEAST;
								gbc_lblFormacin.insets = new Insets(0, 0, 5, 5);
								gbc_lblFormacin.gridx = 0;
								gbc_lblFormacin.gridy = 7;
								panelDatosMonitores.add(lblFormacin, gbc_lblFormacin);
							}
							{
								txtFormacion = new JTextPane();
								txtFormacion.setEnabled(false);
								GridBagConstraints gbc_txtFormacion = new GridBagConstraints();
								gbc_txtFormacion.gridwidth = 4;
								gbc_txtFormacion.insets = new Insets(0, 0, 5, 5);
								gbc_txtFormacion.fill = GridBagConstraints.BOTH;
								gbc_txtFormacion.gridx = 1;
								gbc_txtFormacion.gridy = 8;
								panelDatosMonitores.add(txtFormacion, gbc_txtFormacion);
							}
							{
							}
							btnGuardar = new JButton(
									MessagesCampingInter.getString("VentanaPrincipal.btnGuardar.text")); //$NON-NLS-1$
							btnGuardar.setEnabled(false);
							btnGuardar.addActionListener(new BtnGuardarActionListener());
							GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
							gbc_btnGuardar.anchor = GridBagConstraints.EAST;
							gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
							gbc_btnGuardar.gridx = 1;
							gbc_btnGuardar.gridy = 10;
							panelDatosMonitores.add(btnGuardar, gbc_btnGuardar);
							{
								{
									btnCancelar = new JButton(
											MessagesCampingInter.getString("VentanaPrincipal.btnCancelar.text")); //$NON-NLS-1$
									btnCancelar.setEnabled(false);
									btnCancelar.addActionListener(new BtnCancelarActionListener());
									GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
									gbc_btnCancelar.anchor = GridBagConstraints.WEST;
									gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
									gbc_btnCancelar.gridx = 3;
									gbc_btnCancelar.gridy = 10;
									panelDatosMonitores.add(btnCancelar, gbc_btnCancelar);

								}
							}
						}
					}
					{
						panelPerfil = new JPanel();
						panelPerfil.addComponentListener(new PanelPerfilComponentListener());
						panelPerfil.setBackground(Color.WHITE);
						panelFunciones.add(panelPerfil, "panelPerfil"); //$NON-NLS-1$
						panelPerfil.setLayout(null);
						{
							panelInfo = new JPanel();
							panelInfo.setBackground(new Color(245, 255, 250));
							panelInfo.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
							panelInfo.setBounds(340, 13, 466, 685);
							panelPerfil.add(panelInfo);
							GridBagLayout gbl_panelInfo = new GridBagLayout();
							gbl_panelInfo.columnWidths = new int[] { 0, 0, 120, 0 };
							gbl_panelInfo.rowHeights = new int[] { 0, 24, 0, 76, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35,
									35, 35, 35, 35, 20, 0 };
							gbl_panelInfo.columnWeights = new double[] { 1.0, 1.0, 0.0, Double.MIN_VALUE };
							gbl_panelInfo.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
									0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
							panelInfo.setLayout(gbl_panelInfo);
							{
								lblPerfil = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblPerfil.text")); //$NON-NLS-1$
								lblPerfil.setForeground(new Color(0, 0, 0));
								lblPerfil.setBackground(UIManager.getColor("Panel.background")); //$NON-NLS-1$
								lblPerfil.setHorizontalAlignment(SwingConstants.CENTER);
								lblPerfil.setFont(new Font("Tahoma", Font.BOLD, 26)); //$NON-NLS-1$
								GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
								gbc_lblPerfil.fill = GridBagConstraints.HORIZONTAL;
								gbc_lblPerfil.gridwidth = 3;
								gbc_lblPerfil.insets = new Insets(0, 0, 5, 5);
								gbc_lblPerfil.gridx = 0;
								gbc_lblPerfil.gridy = 0;
								panelInfo.add(lblPerfil, gbc_lblPerfil);
							}
							{
								panelFoto = new JPanel();
								panelFoto.setBackground(new Color(245, 255, 250));
								GridBagConstraints gbc_panelFoto = new GridBagConstraints();
								gbc_panelFoto.gridwidth = 3;
								gbc_panelFoto.gridheight = 7;
								gbc_panelFoto.insets = new Insets(0, 0, 5, 0);
								gbc_panelFoto.fill = GridBagConstraints.BOTH;
								gbc_panelFoto.gridx = 0;
								gbc_panelFoto.gridy = 1;
								panelInfo.add(panelFoto, gbc_panelFoto);
								panelFoto.setLayout(new BorderLayout(0, 0));
								{
									lblPhoto = new JLabel(); // $NON-NLS-1$
									lblPhoto.setHorizontalAlignment(SwingConstants.CENTER);
									panelFoto.add(lblPhoto);
									lblPhoto.setIcon(new ImageIcon(
											VentanaPrincipal.class.getResource("/presentacion/Fotos/usuario.png"))); //$NON-NLS-1$
								}
							}
							{
								lblDni = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblDni.text")); //$NON-NLS-1$
								lblDni.setFont(new Font("Tahoma", Font.BOLD, 15)); //$NON-NLS-1$
								GridBagConstraints gbc_lblDni = new GridBagConstraints();
								gbc_lblDni.anchor = GridBagConstraints.EAST;
								gbc_lblDni.insets = new Insets(0, 0, 5, 5);
								gbc_lblDni.gridx = 0;
								gbc_lblDni.gridy = 9;
								panelInfo.add(lblDni, gbc_lblDni);
							}
							{
								txtDni = new JTextField();
								txtDni.setEnabled(false);
								GridBagConstraints gbc_txtDni = new GridBagConstraints();
								gbc_txtDni.insets = new Insets(0, 0, 5, 5);
								gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtDni.gridx = 1;
								gbc_txtDni.gridy = 9;
								panelInfo.add(txtDni, gbc_txtDni);
								txtDni.setColumns(10);

							}
							{
								lblNombre = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblNombre.text")); //$NON-NLS-1$
								lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15)); //$NON-NLS-1$
								GridBagConstraints gbc_lblNombre = new GridBagConstraints();
								gbc_lblNombre.anchor = GridBagConstraints.EAST;
								gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
								gbc_lblNombre.gridx = 0;
								gbc_lblNombre.gridy = 11;
								panelInfo.add(lblNombre, gbc_lblNombre);
							}
							{
								txtName = new JTextField();
								txtName.setEnabled(false);
								GridBagConstraints gbc_txtName = new GridBagConstraints();
								gbc_txtName.insets = new Insets(0, 0, 5, 5);
								gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtName.gridx = 1;
								gbc_txtName.gridy = 11;
								panelInfo.add(txtName, gbc_txtName);
								txtName.setColumns(10);

							}
							{
								lblApellidos = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblApellidos.text")); //$NON-NLS-1$
								lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 15)); //$NON-NLS-1$
								GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
								gbc_lblApellidos.anchor = GridBagConstraints.EAST;
								gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
								gbc_lblApellidos.gridx = 0;
								gbc_lblApellidos.gridy = 13;
								panelInfo.add(lblApellidos, gbc_lblApellidos);
							}
							{
								txtApellidos_1 = new JTextField();
								txtApellidos_1.setEnabled(false);
								GridBagConstraints gbc_txtApellidos_1 = new GridBagConstraints();
								gbc_txtApellidos_1.insets = new Insets(0, 0, 5, 5);
								gbc_txtApellidos_1.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtApellidos_1.gridx = 1;
								gbc_txtApellidos_1.gridy = 13;
								panelInfo.add(txtApellidos_1, gbc_txtApellidos_1);
								txtApellidos_1.setColumns(10);

							}
							{
								lblTelfono = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblTelfono.text")); //$NON-NLS-1$
								lblTelfono.setFont(new Font("Tahoma", Font.BOLD, 15)); //$NON-NLS-1$
								GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
								gbc_lblTelfono.anchor = GridBagConstraints.EAST;
								gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
								gbc_lblTelfono.gridx = 0;
								gbc_lblTelfono.gridy = 15;
								panelInfo.add(lblTelfono, gbc_lblTelfono);
							}
							{
								txtTlf = new JTextField();
								txtTlf.setEnabled(false);
								GridBagConstraints gbc_txtTlf = new GridBagConstraints();
								gbc_txtTlf.insets = new Insets(0, 0, 5, 5);
								gbc_txtTlf.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtTlf.gridx = 1;
								gbc_txtTlf.gridy = 15;
								panelInfo.add(txtTlf, gbc_txtTlf);
								txtTlf.setColumns(10);

							}
							{
								lblUltimoacceso = new JLabel(
										MessagesCampingInter.getString("VentanaPrincipal.lblUltimoacceso.text")); //$NON-NLS-1$
								lblUltimoacceso.setFont(new Font("Tahoma", Font.BOLD, 15)); //$NON-NLS-1$
								GridBagConstraints gbc_lblUltimoacceso = new GridBagConstraints();
								gbc_lblUltimoacceso.anchor = GridBagConstraints.EAST;
								gbc_lblUltimoacceso.insets = new Insets(0, 0, 5, 5);
								gbc_lblUltimoacceso.gridx = 0;
								gbc_lblUltimoacceso.gridy = 17;
								panelInfo.add(lblUltimoacceso, gbc_lblUltimoacceso);
							}
							{
								txtUltimo = new JTextField();
								txtUltimo.setEnabled(false);
								GridBagConstraints gbc_txtUltimo = new GridBagConstraints();
								gbc_txtUltimo.insets = new Insets(0, 0, 5, 5);
								gbc_txtUltimo.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtUltimo.gridx = 1;
								gbc_txtUltimo.gridy = 17;
								panelInfo.add(txtUltimo, gbc_txtUltimo);
								txtUltimo.setColumns(10);

							}
						}
					}
				}
			}
		}
		miAreaDibujo = new MiAreaDibujo();
		miAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
		miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
		miAreaDibujo.setIcon(null);
		scrollPane_ruta.setViewportView(miAreaDibujo);

		// Dibujo
		toolkit = Toolkit.getDefaultToolkit();

		imagPtoI = toolkit.getImage(getClass().getClassLoader().getResource("mapaIconos/ptoInicio.png")); //$NON-NLS-1$
		cursorPtoI = toolkit.createCustomCursor(imagPtoI, new Point(0, 0), "CURSOR_PTOI"); //$NON-NLS-1$

		imagPtoF = toolkit.getImage(getClass().getClassLoader().getResource("mapaIconos/ptoFin.png")); //$NON-NLS-1$
		cursorPtoF = toolkit.createCustomCursor(imagPtoF, new Point(0, 0), "CURSOR_PTOF"); //$NON-NLS-1$

		imagFuente = toolkit.getImage(getClass().getClassLoader().getResource("mapaIconos/fuente.png")); //$NON-NLS-1$
		cursorFuente = toolkit.createCustomCursor(imagFuente, new Point(0, 0), "CURSOR_FUENTE"); //$NON-NLS-1$

		imagAreaDesc = toolkit.getImage(getClass().getClassLoader().getResource("mapaIconos/descanso.png")); //$NON-NLS-1$
		cursorAreaDesc = toolkit.createCustomCursor(imagAreaDesc, new Point(0, 0), "CURSOR_AD"); //$NON-NLS-1$

		imagMirador = toolkit.getImage(getClass().getClassLoader().getResource("mapaIconos/prismaticos.png")); //$NON-NLS-1$
		cursorMirador = toolkit.createCustomCursor(imagMirador, new Point(0, 0), "CURSOR_PRSMT"); //$NON-NLS-1$

		imagPuente = toolkit.getImage(getClass().getClassLoader().getResource("mapaIconos/puente.png")); //$NON-NLS-1$
		cursorPuente = toolkit.createCustomCursor(imagPuente, new Point(0, 0), "CURSOR_PUENTE"); //$NON-NLS-1$

		imagAves = toolkit.getImage(getClass().getClassLoader().getResource("mapaIconos/ave.png")); //$NON-NLS-1$
		cursorAves = toolkit.createCustomCursor(imagAves, new Point(0, 0), "CURSOR_AVE"); //$NON-NLS-1$

		imagRutaF = toolkit.getImage(getClass().getClassLoader().getResource("mapaIconos/verde.png")); //$NON-NLS-1$
		cursorRutaF = toolkit.createCustomCursor(imagRutaF, new Point(0, 0), "CURSOR_RF"); //$NON-NLS-1$

		imagRutaM = toolkit.getImage(getClass().getClassLoader().getResource("mapaIconos/amarillo.png")); //$NON-NLS-1$
		cursorRutaM = toolkit.createCustomCursor(imagRutaM, new Point(0, 0), "CURSOR_RM"); //$NON-NLS-1$

		imagRutaD = toolkit.getImage(getClass().getClassLoader().getResource("mapaIconos/rojo.png")); //$NON-NLS-1$
		cursorRutaD = toolkit.createCustomCursor(imagRutaD, new Point(0, 0), "CURSOR_RD"); //$NON-NLS-1$

		imagTexto = toolkit.getImage(getClass().getClassLoader().getResource("mapaIconos/comentar.png")); //$NON-NLS-1$
		cursorTexto = toolkit.createCustomCursor(imagTexto, new Point(0, 0), "CURSOR_TXT"); //$NON-NLS-1$

		miAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
		miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
		ImageIcon aux = null;

		try {
			aux = new ImageIcon(getClass().getClassLoader().getResource("mapaCamping/mapa.jpg")); //$NON-NLS-1$
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			Image image = aux.getImage();
			Image newIm = image.getScaledInstance(1740, 900, java.awt.Image.SCALE_SMOOTH);
			aux = new ImageIcon(newIm);
			imagen = new ImageIcon(newIm);
		}
		miAreaDibujo.setIcon(imagen);
		{
			panelFormularioReserva = new JPanel();
			panelFormularioReserva.setBackground(Color.WHITE);
			panelFunciones.add(panelFormularioReserva, "panelFormularioReserva"); //$NON-NLS-1$
			panelFormularioReserva.setLayout(null);
			panelFormularioReserva.addComponentListener(new PanelFormularioReservaComponentListener());
			{
				panelRsv = new JPanel();
				panelRsv.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				panelRsv.setBackground(new Color(245, 255, 250));

				panelRsv.setBounds(174, 40, 748, 662);
				panelFormularioReserva.add(panelRsv);
				GridBagLayout gbl_panelRsv = new GridBagLayout();
				gbl_panelRsv.columnWidths = new int[] { 66, 200, 53, 77, 0, 0, 30, 0 };
				gbl_panelRsv.rowHeights = new int[] { 34, 30, 0, 30, 30, 0, 0, 30, 0, 0, 30, 0, 0, 30, 0, 0, 30, 0, 0,
						30, 0, 0, 0 };
				gbl_panelRsv.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
				gbl_panelRsv.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
				panelRsv.setLayout(gbl_panelRsv);
				{
					panel = new JPanel();
					panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
					panel.setBackground(new Color(135, 206, 235));
					GridBagConstraints gbc_panel = new GridBagConstraints();
					gbc_panel.gridwidth = 7;
					gbc_panel.insets = new Insets(0, 0, 5, 0);
					gbc_panel.fill = GridBagConstraints.BOTH;
					gbc_panel.gridx = 0;
					gbc_panel.gridy = 0;
					panelRsv.add(panel, gbc_panel);
					{
						lblFormularioReserva = new JLabel(
								MessagesCampingInter.getString("VentanaPrincipal.lblFormularioReserva.text")); //$NON-NLS-1$
						lblFormularioReserva.setFont(new Font("Tahoma", Font.BOLD, 28)); //$NON-NLS-1$
						panel.add(lblFormularioReserva);
					}
				}
				{
					lblTusDatos = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblTusDatos.text")); //$NON-NLS-1$
					lblTusDatos.setFont(new Font("Tahoma", Font.BOLD, 17)); //$NON-NLS-1$
					GridBagConstraints gbc_lblTusDatos = new GridBagConstraints();
					gbc_lblTusDatos.anchor = GridBagConstraints.WEST;
					gbc_lblTusDatos.insets = new Insets(0, 0, 5, 5);
					gbc_lblTusDatos.gridx = 1;
					gbc_lblTusDatos.gridy = 2;
					panelRsv.add(lblTusDatos, gbc_lblTusDatos);
				}
				{
					lblTuReserva = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblTuReserva.text")); //$NON-NLS-1$
					lblTuReserva.setFont(new Font("Tahoma", Font.BOLD, 17)); //$NON-NLS-1$
					GridBagConstraints gbc_lblTuReserva = new GridBagConstraints();
					gbc_lblTuReserva.insets = new Insets(0, 0, 5, 5);
					gbc_lblTuReserva.gridx = 4;
					gbc_lblTuReserva.gridy = 2;
					panelRsv.add(lblTuReserva, gbc_lblTuReserva);
				}
				{
					lblEntrada = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblEntrada.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblEntrada = new GridBagConstraints();
					gbc_lblEntrada.anchor = GridBagConstraints.WEST;
					gbc_lblEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_lblEntrada.gridx = 4;
					gbc_lblEntrada.gridy = 4;
					panelRsv.add(lblEntrada, gbc_lblEntrada);
				}
				{
					txtEntrada = new JTextField();
					txtEntrada.setEnabled(false);
					GridBagConstraints gbc_txtEntrada = new GridBagConstraints();
					gbc_txtEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_txtEntrada.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtEntrada.gridx = 5;
					gbc_txtEntrada.gridy = 4;
					panelRsv.add(txtEntrada, gbc_txtEntrada);
					txtEntrada.setColumns(10);
				}
				{
					lblFechaEntrada = new JLabel(
							MessagesCampingInter.getString("VentanaPrincipal.lblFechaEntrada.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblFechaEntrada = new GridBagConstraints();
					gbc_lblFechaEntrada.anchor = GridBagConstraints.WEST;
					gbc_lblFechaEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_lblFechaEntrada.gridx = 1;
					gbc_lblFechaEntrada.gridy = 5;
					panelRsv.add(lblFechaEntrada, gbc_lblFechaEntrada);
				}
				{
					lblSalida = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblSalida.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblSalida = new GridBagConstraints();
					gbc_lblSalida.anchor = GridBagConstraints.WEST;
					gbc_lblSalida.insets = new Insets(0, 0, 5, 5);
					gbc_lblSalida.gridx = 4;
					gbc_lblSalida.gridy = 5;
					panelRsv.add(lblSalida, gbc_lblSalida);
				}
				{
					txtSalida = new JTextField();
					txtSalida.setEnabled(false);
					GridBagConstraints gbc_txtSalida = new GridBagConstraints();
					gbc_txtSalida.insets = new Insets(0, 0, 5, 5);
					gbc_txtSalida.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtSalida.gridx = 5;
					gbc_txtSalida.gridy = 5;
					panelRsv.add(txtSalida, gbc_txtSalida);
					txtSalida.setColumns(10);
				}
				{
					MaskFormatter formatoFecha;
					try {
						formatoFecha = new MaskFormatter("####/##/##"); //$NON-NLS-1$
						formatoFecha.setPlaceholderCharacter('*');
						txtFechaE = new JFormattedTextField(formatoFecha);
						txtFechaE.setForeground(Color.BLACK);
						txtFechaE.setCaretColor(Color.BLACK);

					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					GridBagConstraints gbc_txtFechaE = new GridBagConstraints();
					gbc_txtFechaE.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtFechaE.insets = new Insets(0, 0, 5, 5);
					gbc_txtFechaE.gridx = 1;
					gbc_txtFechaE.gridy = 6;
					panelRsv.add(txtFechaE, gbc_txtFechaE);
					txtFechaE.setColumns(10);
				}
				{
					lblErrorFechaEntrada = new JLabel(); // $NON-NLS-1$
					lblErrorFechaEntrada.setVisible(false);
					lblErrorFechaEntrada
							.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/fotosReserva/error.png"))); //$NON-NLS-1$
					GridBagConstraints gbc_lblErrorFechaEntrada = new GridBagConstraints();
					gbc_lblErrorFechaEntrada.insets = new Insets(0, 0, 5, 5);
					gbc_lblErrorFechaEntrada.gridx = 2;
					gbc_lblErrorFechaEntrada.gridy = 6;
					panelRsv.add(lblErrorFechaEntrada, gbc_lblErrorFechaEntrada);
				}
				{
					lblId = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblId.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblId = new GridBagConstraints();
					gbc_lblId.anchor = GridBagConstraints.WEST;
					gbc_lblId.insets = new Insets(0, 0, 5, 5);
					gbc_lblId.gridx = 4;
					gbc_lblId.gridy = 6;
					panelRsv.add(lblId, gbc_lblId);
				}
				{
					txtIDFormReserva = new JTextField();
					txtIDFormReserva.setEnabled(false);
					GridBagConstraints gbc_txtIDFormReserva = new GridBagConstraints();
					gbc_txtIDFormReserva.insets = new Insets(0, 0, 5, 5);
					gbc_txtIDFormReserva.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtIDFormReserva.gridx = 5;
					gbc_txtIDFormReserva.gridy = 6;
					panelRsv.add(txtIDFormReserva, gbc_txtIDFormReserva);
					txtIDFormReserva.setColumns(10);
				}
				{
					lblPrecio = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblPrecio.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
					gbc_lblPrecio.anchor = GridBagConstraints.WEST;
					gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
					gbc_lblPrecio.gridx = 4;
					gbc_lblPrecio.gridy = 7;
					panelRsv.add(lblPrecio, gbc_lblPrecio);
				}
				{
					txtPrecio = new JTextField();
					txtPrecio.setEnabled(false);
					GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
					gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
					gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtPrecio.gridx = 5;
					gbc_txtPrecio.gridy = 7;
					panelRsv.add(txtPrecio, gbc_txtPrecio);
					txtPrecio.setColumns(10);
				}
				{
					lblFechaSalida = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblFechaSalida.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblFechaSalida = new GridBagConstraints();
					gbc_lblFechaSalida.anchor = GridBagConstraints.WEST;
					gbc_lblFechaSalida.insets = new Insets(0, 0, 5, 5);
					gbc_lblFechaSalida.gridx = 1;
					gbc_lblFechaSalida.gridy = 8;
					panelRsv.add(lblFechaSalida, gbc_lblFechaSalida);
				}
				{

					MaskFormatter formatoFecha;
					try {
						formatoFecha = new MaskFormatter("####/##/##"); //$NON-NLS-1$
						formatoFecha.setPlaceholderCharacter('*');
						txtFechaS = new JFormattedTextField(formatoFecha);

					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					GridBagConstraints gbc_txtFechaS = new GridBagConstraints();
					gbc_txtFechaS.insets = new Insets(0, 0, 5, 5);
					gbc_txtFechaS.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtFechaS.gridx = 1;
					gbc_txtFechaS.gridy = 9;
					panelRsv.add(txtFechaS, gbc_txtFechaS);
					txtFechaS.setColumns(10);
				}
				{
					btnHacerReserva = new JButton(
							MessagesCampingInter.getString("VentanaPrincipal.btnHacerReserva.text")); //$NON-NLS-1$
					btnHacerReserva.addActionListener(new BtnHacerReservaActionListener());
					{
						lblErrorFechaSalida = new JLabel(); // $NON-NLS-1$
						lblErrorFechaSalida.setVisible(false);
						lblErrorFechaSalida
								.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/fotosReserva/error.png"))); //$NON-NLS-1$
						GridBagConstraints gbc_lblErrorFechaSalida = new GridBagConstraints();
						gbc_lblErrorFechaSalida.insets = new Insets(0, 0, 5, 5);
						gbc_lblErrorFechaSalida.gridx = 2;
						gbc_lblErrorFechaSalida.gridy = 9;
						panelRsv.add(lblErrorFechaSalida, gbc_lblErrorFechaSalida);
					}
					btnHacerReserva.setFont(new Font("Tahoma", Font.BOLD, 14)); //$NON-NLS-1$
					btnHacerReserva.setForeground(Color.WHITE);
					GridBagConstraints gbc_btnHacerReserva = new GridBagConstraints();
					gbc_btnHacerReserva.gridheight = 2;
					gbc_btnHacerReserva.fill = GridBagConstraints.BOTH;
					gbc_btnHacerReserva.insets = new Insets(0, 0, 5, 5);
					gbc_btnHacerReserva.gridx = 5;
					gbc_btnHacerReserva.gridy = 10;
					panelRsv.add(btnHacerReserva, gbc_btnHacerReserva);

					btnHacerReserva.setEnabled(false);
					btnHacerReserva.setBackground(new Color(30, 144, 255));
				}
				{
					lblNombre_1 = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblNombre_1.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
					gbc_lblNombre_1.anchor = GridBagConstraints.WEST;
					gbc_lblNombre_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblNombre_1.gridx = 1;
					gbc_lblNombre_1.gridy = 11;
					panelRsv.add(lblNombre_1, gbc_lblNombre_1);
				}
				{
					txtNombreForm = new JTextField();
					GridBagConstraints gbc_txtNombreForm = new GridBagConstraints();
					gbc_txtNombreForm.insets = new Insets(0, 0, 5, 5);
					gbc_txtNombreForm.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtNombreForm.gridx = 1;
					gbc_txtNombreForm.gridy = 12;
					panelRsv.add(txtNombreForm, gbc_txtNombreForm);
					txtNombreForm.setColumns(10);
				}
				{
					btnCancelarReserva = new JButton(
							MessagesCampingInter.getString("VentanaPrincipal.btnCancelarReserva.text")); //$NON-NLS-1$
					btnCancelarReserva.setEnabled(false);
					btnCancelarReserva.setFont(new Font("Tahoma", Font.PLAIN, 14)); //$NON-NLS-1$
					GridBagConstraints gbc_btnCancelarReserva = new GridBagConstraints();
					gbc_btnCancelarReserva.gridheight = 2;
					gbc_btnCancelarReserva.fill = GridBagConstraints.BOTH;
					gbc_btnCancelarReserva.insets = new Insets(0, 0, 5, 5);
					gbc_btnCancelarReserva.gridx = 5;
					gbc_btnCancelarReserva.gridy = 13;
					panelRsv.add(btnCancelarReserva, gbc_btnCancelarReserva);
					btnCancelarReserva.setBackground(UIManager.getColor("Button.highlight")); //$NON-NLS-1$
					btnCancelarReserva.addActionListener(new BtnCancelar_1ActionListener());
				}
				{
					lblTelefonoContacto = new JLabel(
							MessagesCampingInter.getString("VentanaPrincipal.lblTelefonoContacto.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblTelefonoContacto = new GridBagConstraints();
					gbc_lblTelefonoContacto.anchor = GridBagConstraints.WEST;
					gbc_lblTelefonoContacto.insets = new Insets(0, 0, 5, 5);
					gbc_lblTelefonoContacto.gridx = 1;
					gbc_lblTelefonoContacto.gridy = 14;
					panelRsv.add(lblTelefonoContacto, gbc_lblTelefonoContacto);
				}
				{
					MaskFormatter formatoTlfno;
					try {
						formatoTlfno = new MaskFormatter(" ###' ###' ###"); //$NON-NLS-1$
						formatoTlfno.setPlaceholderCharacter('*');
						txtContacto = new JFormattedTextField(formatoTlfno);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					GridBagConstraints gbc_txtContacto = new GridBagConstraints();
					gbc_txtContacto.insets = new Insets(0, 0, 5, 5);
					gbc_txtContacto.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtContacto.gridx = 1;
					gbc_txtContacto.gridy = 15;
					panelRsv.add(txtContacto, gbc_txtContacto);
					txtContacto.setColumns(10);
				}
				{
					lblEmail = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblEmail.text")); //$NON-NLS-1$
					GridBagConstraints gbc_lblEmail = new GridBagConstraints();
					gbc_lblEmail.anchor = GridBagConstraints.WEST;
					gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
					gbc_lblEmail.gridx = 1;
					gbc_lblEmail.gridy = 17;
					panelRsv.add(lblEmail, gbc_lblEmail);
				}
				{
					txtEmail = new JTextField();
					GridBagConstraints gbc_txtEmail = new GridBagConstraints();
					gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
					gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtEmail.gridx = 1;
					gbc_txtEmail.gridy = 18;
					panelRsv.add(txtEmail, gbc_txtEmail);
					txtEmail.setColumns(10);
				}
				{
					btnAceptar = new JButton(MessagesCampingInter.getString("VentanaPrincipal.btnAceptar.text")); //$NON-NLS-1$
					btnAceptar.addActionListener(new BtnAceptarActionListener());
					GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
					gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
					gbc_btnAceptar.gridx = 1;
					gbc_btnAceptar.gridy = 20;
					panelRsv.add(btnAceptar, gbc_btnAceptar);

				}
			}
		}
		{
			{
				panelReservaIndividual = new JPanel();
				panelFunciones.add(panelReservaIndividual, "panelReservaIndividual"); //$NON-NLS-1$
				panelReservaIndividual.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				panelReservaIndividual.setBackground(new Color(30, 14, 255));
				panelReservaIndividual.setLayout(new BorderLayout(0, 0));
				{
					panelDisponible = new JPanel();
					panelDisponible.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
					panelDisponible.setBackground(Color.WHITE);
					panelReservaIndividual.add(panelDisponible, BorderLayout.NORTH);
					GridBagLayout gbl_panelDisponible = new GridBagLayout();
					gbl_panelDisponible.columnWidths = new int[] { 30, 0, 0, 0, 0, 0, 30, 31, 30, 30, 0, 30, 30, 0, 233,
							374, 0, 155, 0, 0, 30, 145, 0, 0, 5 };
					gbl_panelDisponible.rowHeights = new int[] { 30, 0, 0, 0, 30, 0, 0, 30, 0, 8 };
					gbl_panelDisponible.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
							0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
					gbl_panelDisponible.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0,
							Double.MIN_VALUE };
					panelDisponible.setLayout(gbl_panelDisponible);
					{
						lblFotoReservaInd = new JLabel(); // $NON-NLS-1$
						GridBagConstraints gbc_lblFotoReservaInd = new GridBagConstraints();
						gbc_lblFotoReservaInd.fill = GridBagConstraints.VERTICAL;
						gbc_lblFotoReservaInd.gridheight = 6;
						gbc_lblFotoReservaInd.gridwidth = 5;
						gbc_lblFotoReservaInd.insets = new Insets(0, 0, 5, 5);
						gbc_lblFotoReservaInd.gridx = 1;
						gbc_lblFotoReservaInd.gridy = 1;
						panelDisponible.add(lblFotoReservaInd, gbc_lblFotoReservaInd);
					}
					{
						lblNombreIndividual = new JLabel(
								MessagesCampingInter.getString("VentanaPrincipal.lblNombreIndividual.text")); //$NON-NLS-1$
						lblNombreIndividual.setFont(new Font("Tahoma", Font.BOLD, 16)); //$NON-NLS-1$
						GridBagConstraints gbc_lblNombreIndividual = new GridBagConstraints();
						gbc_lblNombreIndividual.anchor = GridBagConstraints.WEST;
						gbc_lblNombreIndividual.insets = new Insets(0, 0, 5, 5);
						gbc_lblNombreIndividual.gridx = 7;
						gbc_lblNombreIndividual.gridy = 1;
						panelDisponible.add(lblNombreIndividual, gbc_lblNombreIndividual);
					}
					{
						{
							lblDisponibilidad = new JLabel(); // $NON-NLS-1$
							GridBagConstraints gbc_lblDisponibilidad = new GridBagConstraints();
							gbc_lblDisponibilidad.gridheight = 2;
							gbc_lblDisponibilidad.gridwidth = 2;
							gbc_lblDisponibilidad.insets = new Insets(0, 0, 5, 5);
							gbc_lblDisponibilidad.gridx = 10;
							gbc_lblDisponibilidad.gridy = 1;
							panelDisponible.add(lblDisponibilidad, gbc_lblDisponibilidad);
						}
						{
							lblDisponibilidadTxt = new JLabel(
									MessagesCampingInter.getString("VentanaPrincipal.lblDisponibilidadTxt.text")); //$NON-NLS-1$
							lblDisponibilidadTxt.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
							GridBagConstraints gbc_lblDisponibilidadTxt = new GridBagConstraints();
							gbc_lblDisponibilidadTxt.gridheight = 2;
							gbc_lblDisponibilidadTxt.anchor = GridBagConstraints.WEST;
							gbc_lblDisponibilidadTxt.gridwidth = 3;
							gbc_lblDisponibilidadTxt.insets = new Insets(0, 0, 5, 5);
							gbc_lblDisponibilidadTxt.gridx = 12;
							gbc_lblDisponibilidadTxt.gridy = 1;
							panelDisponible.add(lblDisponibilidadTxt, gbc_lblDisponibilidadTxt);
						}
					}
					{
						lblCapacidadIndividual = new JLabel(
								MessagesCampingInter.getString("VentanaPrincipal.lblCapacidadIndividual.text")); //$NON-NLS-1$
						lblCapacidadIndividual.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
						GridBagConstraints gbc_lblCapacidadIndividual = new GridBagConstraints();
						gbc_lblCapacidadIndividual.anchor = GridBagConstraints.WEST;
						gbc_lblCapacidadIndividual.insets = new Insets(0, 0, 5, 5);
						gbc_lblCapacidadIndividual.gridx = 7;
						gbc_lblCapacidadIndividual.gridy = 2;
						panelDisponible.add(lblCapacidadIndividual, gbc_lblCapacidadIndividual);
					}
					btnReservarIndividual = new JButton(
							MessagesCampingInter.getString("VentanaPrincipal.btnReservarIndividual.text")); //$NON-NLS-1$
					btnReservarIndividual.setIcon(null);
					btnReservarIndividual.setForeground(Color.WHITE);
					btnReservarIndividual.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
					btnReservarIndividual.setBackground(SystemColor.textHighlight);
					btnReservarIndividual.setFont(new Font("Tahoma", Font.BOLD, 25)); //$NON-NLS-1$
					btnReservarIndividual.addActionListener(new BtnReservarActionListener());
					{
						lblTamanioIndividual = new JLabel(
								MessagesCampingInter.getString("VentanaPrincipal.lblTamanioIndividual.text")); //$NON-NLS-1$
						lblTamanioIndividual.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
						GridBagConstraints gbc_lblTamanioIndividual = new GridBagConstraints();
						gbc_lblTamanioIndividual.anchor = GridBagConstraints.WEST;
						gbc_lblTamanioIndividual.insets = new Insets(0, 0, 5, 5);
						gbc_lblTamanioIndividual.gridx = 7;
						gbc_lblTamanioIndividual.gridy = 3;
						panelDisponible.add(lblTamanioIndividual, gbc_lblTamanioIndividual);
					}
					{
						lblPrecio_1 = new JLabel(MessagesCampingInter.getString("VentanaPrincipal.lblPrecio_1.text")); //$NON-NLS-1$
						lblPrecio_1.setFont(new Font("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
						GridBagConstraints gbc_lblPrecio_1 = new GridBagConstraints();
						gbc_lblPrecio_1.anchor = GridBagConstraints.WEST;
						gbc_lblPrecio_1.insets = new Insets(0, 0, 5, 5);
						gbc_lblPrecio_1.gridx = 7;
						gbc_lblPrecio_1.gridy = 4;
						panelDisponible.add(lblPrecio_1, gbc_lblPrecio_1);
					}
					GridBagConstraints gbc_btnReservarIndividual = new GridBagConstraints();
					gbc_btnReservarIndividual.anchor = GridBagConstraints.SOUTH;
					gbc_btnReservarIndividual.gridheight = 3;
					gbc_btnReservarIndividual.fill = GridBagConstraints.HORIZONTAL;
					gbc_btnReservarIndividual.gridwidth = 7;
					gbc_btnReservarIndividual.insets = new Insets(0, 0, 0, 5);
					gbc_btnReservarIndividual.gridx = 16;
					gbc_btnReservarIndividual.gridy = 6;
					panelDisponible.add(btnReservarIndividual, gbc_btnReservarIndividual);
					{
						txtDescripcion = new JTextArea();
						txtDescripcion.setBorder(new TitledBorder(null,
								MessagesCampingInter.getString("VentanaPrincipal.txtDescripcion.borderTitle"), //$NON-NLS-1$
								TitledBorder.LEADING, TitledBorder.TOP, null, null));
						GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
						gbc_txtDescripcion.gridheight = 3;
						gbc_txtDescripcion.gridwidth = 8;
						gbc_txtDescripcion.insets = new Insets(0, 0, 0, 5);
						gbc_txtDescripcion.gridx = 7;
						gbc_txtDescripcion.gridy = 6;
						panelDisponible.add(txtDescripcion, gbc_txtDescripcion);
						txtDescripcion.setFont(new Font("Monospaced", Font.PLAIN, 20)); //$NON-NLS-1$
						txtDescripcion.setBackground(Color.WHITE);
						txtDescripcion.setEditable(false);
					}
				}
				{
					panel_reservaAux = new JPanel();
					panelReservaIndividual.add(panel_reservaAux, BorderLayout.CENTER);
					panel_reservaAux.setBackground(Color.WHITE);
					GridBagLayout gbl_panel_reservaAux = new GridBagLayout();
					gbl_panel_reservaAux.columnWidths = new int[] { 10, 30, 0, 0, 0, 0, 0, 0, 0, 164, 87, 86, 63, 30,
							30, 30, 30, 30, 30, 0, 58, 174, 0, 0 };
					gbl_panel_reservaAux.rowHeights = new int[] { 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0, 0,
							0, 0, 18, 30, 0 };
					gbl_panel_reservaAux.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
							0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
					gbl_panel_reservaAux.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
							0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
					panel_reservaAux.setLayout(gbl_panel_reservaAux);
					{
						lblUbicacionTitulo = new JLabel(
								MessagesCampingInter.getString("VentanaPrincipal.lblUbicacionTitulo.text")); //$NON-NLS-1$
						lblUbicacionTitulo.setFont(new Font("Tahoma", Font.BOLD, 25)); //$NON-NLS-1$
						GridBagConstraints gbc_lblUbicacionTitulo = new GridBagConstraints();
						gbc_lblUbicacionTitulo.anchor = GridBagConstraints.WEST;
						gbc_lblUbicacionTitulo.gridwidth = 7;
						gbc_lblUbicacionTitulo.insets = new Insets(0, 0, 5, 5);
						gbc_lblUbicacionTitulo.gridx = 13;
						gbc_lblUbicacionTitulo.gridy = 0;
						panel_reservaAux.add(lblUbicacionTitulo, gbc_lblUbicacionTitulo);
					}
					{
						lblDescripcionTitulo = new JLabel(
								MessagesCampingInter.getString("VentanaPrincipal.lblDescripcionTitulo.text")); //$NON-NLS-1$
						lblDescripcionTitulo.setFont(new Font("Tahoma", Font.BOLD, 25)); //$NON-NLS-1$
						GridBagConstraints gbc_lblDescripcionTitulo = new GridBagConstraints();
						gbc_lblDescripcionTitulo.anchor = GridBagConstraints.WEST;
						gbc_lblDescripcionTitulo.gridwidth = 7;
						gbc_lblDescripcionTitulo.insets = new Insets(0, 0, 5, 5);
						gbc_lblDescripcionTitulo.gridx = 1;
						gbc_lblDescripcionTitulo.gridy = 1;
						panel_reservaAux.add(lblDescripcionTitulo, gbc_lblDescripcionTitulo);
					}
					{
						scrollPane_1 = new JScrollPane();
						GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
						gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
						gbc_scrollPane_1.gridheight = 6;
						gbc_scrollPane_1.gridwidth = 11;
						gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
						gbc_scrollPane_1.gridx = 1;
						gbc_scrollPane_1.gridy = 2;
						panel_reservaAux.add(scrollPane_1, gbc_scrollPane_1);
						{
							txtCaracteristicas = new JTextArea();
							scrollPane_1.setViewportView(txtCaracteristicas);
							txtCaracteristicas.setFont(new Font("Tahoma", Font.PLAIN, 18)); //$NON-NLS-1$
						}
					}
					{
						lblFotoUbicacion = new JLabel(); // $NON-NLS-1$
						GridBagConstraints gbc_lblFotoUbicacion = new GridBagConstraints();
						gbc_lblFotoUbicacion.insets = new Insets(0, 0, 5, 5);
						gbc_lblFotoUbicacion.gridwidth = 9;
						gbc_lblFotoUbicacion.gridheight = 14;
						gbc_lblFotoUbicacion.gridx = 13;
						gbc_lblFotoUbicacion.gridy = 2;
						panel_reservaAux.add(lblFotoUbicacion, gbc_lblFotoUbicacion);
					}
					{
						lblGaleriaTitulo = new JLabel(
								MessagesCampingInter.getString("VentanaPrincipal.lblGaleriaTitulo.text")); //$NON-NLS-1$
						lblGaleriaTitulo.setFont(new Font("Tahoma", Font.BOLD, 25)); //$NON-NLS-1$
						GridBagConstraints gbc_lblGaleriaTitulo = new GridBagConstraints();
						gbc_lblGaleriaTitulo.anchor = GridBagConstraints.WEST;
						gbc_lblGaleriaTitulo.gridheight = 2;
						gbc_lblGaleriaTitulo.gridwidth = 8;
						gbc_lblGaleriaTitulo.insets = new Insets(0, 0, 5, 5);
						gbc_lblGaleriaTitulo.gridx = 1;
						gbc_lblGaleriaTitulo.gridy = 9;
						panel_reservaAux.add(lblGaleriaTitulo, gbc_lblGaleriaTitulo);
					}
					{
						panelGaleria = new JPanel();
						panelGaleria.setBackground(Color.WHITE);
						GridBagConstraints gbc_panelGaleria = new GridBagConstraints();
						gbc_panelGaleria.gridheight = 4;
						gbc_panelGaleria.gridwidth = 10;
						gbc_panelGaleria.insets = new Insets(0, 0, 5, 5);
						gbc_panelGaleria.fill = GridBagConstraints.BOTH;
						gbc_panelGaleria.gridx = 1;
						gbc_panelGaleria.gridy = 11;
						panel_reservaAux.add(panelGaleria, gbc_panelGaleria);
						panelGaleria.setLayout(new GridLayout(0, 3, 0, 0));
						{
							lblHabitacion = new JLabel(); // $NON-NLS-1$
							panelGaleria.add(lblHabitacion);
						}
						{
							lblCocina = new JLabel(); // $NON-NLS-1$
							panelGaleria.add(lblCocina);
						}
						{
							lblBanio = new JLabel(); // $NON-NLS-1$
							panelGaleria.add(lblBanio);
						}
					}
					{
						btnGoogleMaps = new JButton(
								MessagesCampingInter.getString("VentanaPrincipal.btnGoogleMaps.text")); //$NON-NLS-1$
						btnGoogleMaps.addActionListener(new BtnGoogleMapsActionListener());
						btnGoogleMaps.setIcon(
								new ImageIcon(VentanaPrincipal.class.getResource("/fotosReserva/googleMaps.png"))); //$NON-NLS-1$
						GridBagConstraints gbc_btnGoogleMaps = new GridBagConstraints();
						gbc_btnGoogleMaps.gridwidth = 2;
						gbc_btnGoogleMaps.insets = new Insets(0, 0, 5, 5);
						gbc_btnGoogleMaps.gridx = 14;
						gbc_btnGoogleMaps.gridy = 16;
						panel_reservaAux.add(btnGoogleMaps, gbc_btnGoogleMaps);
					}
				}
			}
		}
	}

	private void completarEstados(JComboBox cb, int n, JTable tab) {

		columnaEstado = tab.getColumnModel().getColumn(n);
		cb.addItem(MessagesCampingInter.getString("VentanaPrincipal.342")); //$NON-NLS-1$
		cb.addItem(MessagesCampingInter.getString("VentanaPrincipal.343")); //$NON-NLS-1$
		cb.addItem(MessagesCampingInter.getString("VentanaPrincipal.344")); //$NON-NLS-1$
		cb.addItemListener(event -> {
			if (event.getStateChange() == ItemEvent.SELECTED) {
				if (tab.equals(tableParcela)) {
					seleccionarE = tableParcela.getSelectedRow();
					datoE = String.valueOf(tableParcela.getValueAt(seleccionarE, 0));
					cambioDisponibilidad(Integer.parseInt(datoE), tableParcela, event.getItem().toString());
				} else if (tab.equals(tableBungalow)) {
					seleccionarE = tableBungalow.getSelectedRow();
					datoE = String.valueOf(tableBungalow.getValueAt(seleccionarE, 0));
					cambioDisponibilidad(Integer.parseInt(datoE), tableBungalow, event.getItem().toString());

				}
			}
		});

		columnaEstado.setCellEditor(new DefaultCellEditor(cb));

	}

	private void centrarTabla(JTable tab) {
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		tab.setDefaultRenderer(String.class, centerRenderer);
		tab.setDefaultRenderer(Integer.class, centerRenderer);

	}

	private void entrar() {
		String password = pwdContrasea.getText();
		String usu = txtUsuario.getText();
		usuario = new Usuario();
		usuario.setDNI(usu);
		usuario.setNombre(MessagesCampingInter.getString("VentanaPrincipal.345")); //$NON-NLS-1$
		usuario.setApellido1(MessagesCampingInter.getString("VentanaPrincipal.346")); //$NON-NLS-1$
		usuario.setApellido2(MessagesCampingInter.getString("VentanaPrincipal.347")); //$NON-NLS-1$
		usuario.setTlfno("555-55-89-63"); //$NON-NLS-1$

		if (usu.equals("12345678") && password.equals("a")) { //$NON-NLS-1$ //$NON-NLS-2$
			((CardLayout) frmPrincipal.getContentPane().getLayout()).show(frmPrincipal.getContentPane(),
					"panelAplicacion"); //$NON-NLS-1$
			Date date = new Date();
			DateFormat ultimoAcceso = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss "); //$NON-NLS-1$
			usuario.setUltimoAcceso(ultimoAcceso.format(date));
			lblErrorUsuario.setVisible(false);

			if (!chckbxRecordar.isSelected()) {
				txtUsuario.setText(""); //$NON-NLS-1$
				pwdContrasea.setText(MessagesCampingInter.getString("VentanaPrincipal.354")); //$NON-NLS-1$
			}

		} else if (usu != "12345678" || password != "a") { //$NON-NLS-1$ //$NON-NLS-2$
			lblErrorUsuario.setVisible(true);
		}
	}

	private class FrmPrincipalContentPaneComponentListener extends ComponentAdapter {
		@Override
		public void componentResized(ComponentEvent e) {
			int centroX = (int) panelLogin.getBounds().getCenterX();
			int centroY = (int) panelLogin.getBounds().getCenterY();
			int width = panelIniciarSesion.getWidth();
			int height = panelIniciarSesion.getHeight();
			panelIniciarSesion.setBounds(centroX - (width / 2), centroY - (height / 2), width, height);
		}
	}

	private class FrmPrincipalKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}
	}

	private class PanelLoginKeyListener extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}
	}

	private class PanelIniciarSesionKeyListener extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}
	}

	private class PwdContraseaFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent arg0) {

			pwdContrasea.setText(""); //$NON-NLS-1$
		}

		@Override
		public void focusLost(FocusEvent e) {

			if (pwdContrasea.getPassword().length == 0) {
				pwdContrasea.setText(MessagesCampingInter.getString("VentanaPrincipal.358")); //$NON-NLS-1$
			}
		}
	}

	private class BtnVerContraActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (verContra) {
				// Ocultar la contraseña
				pwdContrasea.setEchoChar('\u2022');
				btnVerContra.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/Iconos/eye.png"))); //$NON-NLS-1$
				btnVerContra.setToolTipText(MessagesCampingInter.getString("VentanaPrincipal.360")); //$NON-NLS-1$
				verContra = false;
			} else {
				// Mostrar la contraseña
				pwdContrasea.setEchoChar((char) 0);
				btnVerContra.setIcon(
						new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/Iconos/eye_slashed24x24.png"))); //$NON-NLS-1$
				btnVerContra.setToolTipText(MessagesCampingInter.getString("VentanaPrincipal.362")); //$NON-NLS-1$
				verContra = true;
			}
		}
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			entrar();
		}
	}

	private class MntmCerrarSesinActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			((CardLayout) frmPrincipal.getContentPane().getLayout()).show(frmPrincipal.getContentPane(), "panelLogin"); //$NON-NLS-1$

		}
	}

	private class BtnReservasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panelFunciones.getLayout());
			cl.show(panelFunciones, "panelReservas"); //$NON-NLS-1$

		}
	}

	private class BtnActividadesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panelFunciones.getLayout());
			cl.show(panelFunciones, "panelActividades"); //$NON-NLS-1$
		}

	}

	private class BtnDisearRutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panelFunciones.getLayout());
			cl.show(panelFunciones, "panelDisearRuta"); //$NON-NLS-1$
		}
	}

	private class BtnGuasYMonitoresActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panelFunciones.getLayout());
			cl.show(panelFunciones, "panelGuasYMonitores"); //$NON-NLS-1$
		}
	}

	private class MntmPerfilActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			CardLayout cl = (CardLayout) (panelFunciones.getLayout());
			cl.show(panelFunciones, "panelPerfil"); //$NON-NLS-1$
			txtDni.setText(usuario.getDNI());
			txtName.setText(usuario.getNombre());
			txtApellidos_1.setText(usuario.getApellido1() + " " + usuario.getApellido2()); //$NON-NLS-1$
			txtTlf.setText(usuario.getTlfno());
			txtUltimo.setText(usuario.getUltimoAcceso());
		}
	}

	private class BtnAyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frmPrincipal, "https://www.youtube.com/watch?v=Sk4Jgvw9jxg&ab_channel=VictorLozano", MessagesCampingInter.getString("VentanaPrincipal.371"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.PLAIN_MESSAGE);
			if (Desktop.isDesktopSupported()) {
				try {
					URI uri = new URI("https://www.youtube.com/watch?v=Sk4Jgvw9jxg&ab_channel=VictorLozano"); //$NON-NLS-1$
					Desktop.getDesktop().browse(uri);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(frmPrincipal, MessagesCampingInter.getString("VentanaPrincipal.443"), "¡ERROR!", //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.PLAIN_MESSAGE);

				}

			}
			
		}
	}

	private class MntmACercaDeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frmPrincipal,
					MessagesCampingInter.getString("VentanaPrincipal.372"), //$NON-NLS-1$
					MessagesCampingInter.getString("VentanaPrincipal.373"), JOptionPane.PLAIN_MESSAGE); //$NON-NLS-1$
		}
	}

	private class BtnEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnAniadir.setEnabled(false);
			btnEliminar.setEnabled(false);
			enable(true);

		}
	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			enable(false);

			txtNombre.setText(""); //$NON-NLS-1$
			txtApellidos.setText(""); //$NON-NLS-1$
			txtTelefono.setText(""); //$NON-NLS-1$
			txtCorreo.setText(""); //$NON-NLS-1$
			txtFormacion.setText(""); //$NON-NLS-1$
			txtIdiomas.setText(""); //$NON-NLS-1$
			btnAniadir.setEnabled(true);
			btnEliminar.setEnabled(true);

		}
	}

	private class LstMonitoresListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			txtNombre.setText((String) lstMonitores.getSelectedValue());
			txtApellidos.setText(modeloLista.getMonitor(lstMonitores.getSelectedIndex()).getApellidos());
			txtTelefono.setText(modeloLista.getMonitor(lstMonitores.getSelectedIndex()).getTlfn());
			txtCorreo.setText(modeloLista.getMonitor(lstMonitores.getSelectedIndex()).getCorreo());
			txtFormacion.setText(modeloLista.getMonitor(lstMonitores.getSelectedIndex()).getFormacion());
			txtIdiomas.setText(modeloLista.getMonitor(lstMonitores.getSelectedIndex()).getIdiomas());
			lblFoto.setIcon(new ImageIcon(VentanaPrincipal.class
					.getResource(modeloLista.getMonitor(lstMonitores.getSelectedIndex()).getImagen())));
		}
	}

	private class BtnCargarFotoActionListener implements ActionListener {
		private Component frame;

		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new ImageFilter());
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			// Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				// En este punto la aplicación se debería encargar de realizar la operación
				// sobre el fichero
				System.out.println("Fichero seleccionado: " + file.getName()); //$NON-NLS-1$
				lblFoto.setIcon(new ImageIcon(file.getAbsolutePath()));
				file.getAbsolutePath();
			}

		}
	}

	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int selection = lstMonitores.getSelectedIndex();
			if (selection != -1) {
				modeloLista.eliminarMonitor(selection);
			}
		}
	}

	private class BtnAniadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Monitor m = new Monitor("", "", "",
					"", "", "", ruta);
			modeloLista.addMonitor(m);
		}
	}

	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modeloLista.getMonitor(lstMonitores.getSelectedIndex()).setNombre(txtNombre.getText());
			modeloLista.getMonitor(lstMonitores.getSelectedIndex()).setApellidos(txtApellidos.getText());
			modeloLista.getMonitor(lstMonitores.getSelectedIndex()).setTlfn(txtTelefono.getText());
			modeloLista.getMonitor(lstMonitores.getSelectedIndex()).setCorreo(txtCorreo.getText());
			modeloLista.getMonitor(lstMonitores.getSelectedIndex()).setFormacion(txtFormacion.getText());
			modeloLista.getMonitor(lstMonitores.getSelectedIndex()).setIdiomas(txtIdiomas.getText());

			modeloLista.getMonitor(lstMonitores.getSelectedIndex()).setImagen(ruta);
			btnAniadir.setEnabled(true);
			btnEliminar.setEnabled(true);
			enable(false);
		}
	}

	private class BtnPuntoInicioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = PTOI;
			panelDisearRuta.setCursor(cursorPtoI);
		}
	}

	private class MiAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			if (imagen != null) {
				switch (modo) {
				case PTOI:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagPtoI));
					miAreaDibujo.repaint();

					break;
				case PUNTOFIN:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagPtoF));
					miAreaDibujo.repaint();
					break;
				case FUENTE:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagFuente));
					miAreaDibujo.repaint();
					break;
				case AREADESCANSO:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagAreaDesc));
					miAreaDibujo.repaint();
					break;
				case MIRADOR:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagMirador));
					miAreaDibujo.repaint();
					break;
				case PUENTE:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagPuente));
					miAreaDibujo.repaint();
					break;
				case AVES:
					miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagAves));
					miAreaDibujo.repaint();
					break;
				case RUTAFACIL:
					miAreaDibujo.addObjetoGrafico(new Lapiz(x, y, x, y, Color.GREEN));
					break;
				case RUTAMEDIA:
					miAreaDibujo.addObjetoGrafico(new Lapiz(x, y, x, y, Color.YELLOW));
					break;
				case RUTADIFICIL:
					miAreaDibujo.addObjetoGrafico(new Lapiz(x, y, x, y, Color.RED));
					break;
				case REFRESH:
					miAreaDibujo.removeAll();
					miAreaDibujo.repaint();
					break;
				case TEXTO:
					txtTexto.setBounds(x, y, 200, 30);
					txtTexto.setVisible(true);
					txtTexto.requestFocus();
					txtTexto.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							if (!txtTexto.getText().equals("")) { //$NON-NLS-1$
								miAreaDibujo
										.addObjetoGrafico(new TextoGrafico(x, y + 15, txtTexto.getText(), Color.BLUE));
								txtTexto.setText(""); //$NON-NLS-1$
								txtTexto.setVisible(false);
								miAreaDibujo.repaint();
							}

						}
					});
					miAreaDibujo.add(txtTexto);
				}
			}
		}
	}

	private class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			if ((modo == RUTAFACIL) || (modo == RUTAMEDIA) || (modo == RUTADIFICIL)) {
				((Lapiz) miAreaDibujo.getUltimoObjetoGrafico()).setX1(e.getX());
				((Lapiz) miAreaDibujo.getUltimoObjetoGrafico()).setY1(e.getY());
				miAreaDibujo.repaint();

			}
		}
	}

	private class BtnPuntoFinActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = PUNTOFIN;
			panelDisearRuta.setCursor(cursorPtoF);
		}
	}

	private class BtnFuenteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = FUENTE;
			panelDisearRuta.setCursor(cursorFuente);
		}
	}

	private class BtnAreaDescansoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = AREADESCANSO;
			panelDisearRuta.setCursor(cursorAreaDesc);
		}
	}

	private class BtnMiradorActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = MIRADOR;
			panelDisearRuta.setCursor(cursorMirador);
		}
	}

	private class BtnPuenteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = PUENTE;
			panelDisearRuta.setCursor(cursorPuente);
		}
	}

	private class BtnAvesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = AVES;
			panelDisearRuta.setCursor(cursorAves);
		}
	}

	private class BtnRutaFacilActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = RUTAFACIL;
			panelDisearRuta.setCursor(cursorRutaF);
		}
	}

	private class BtnRutaMediaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = RUTAMEDIA;
			panelDisearRuta.setCursor(cursorRutaM);
		}
	}

	private class BtnRutaDificilActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = RUTADIFICIL;
			panelDisearRuta.setCursor(cursorRutaD);
		}
	}

	private class BtnNotaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = TEXTO;
			panelDisearRuta.setCursor(cursorTexto);
		}
	}

	private class BtnRefreshActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if ((JOptionPane.showConfirmDialog(null, MessagesCampingInter.getString("VentanaPrincipal.383"), MessagesCampingInter.getString("VentanaPrincipal.384"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.YES_NO_OPTION)) == JOptionPane.YES_OPTION) {
				miAreaDibujo.removeAll();
				miAreaDibujo.repaint();

			} else {

			}

		}
	}

	private class PanelPerfilComponentListener extends ComponentAdapter {
		@Override
		public void componentResized(ComponentEvent e) {
			int centroX = (int) panelPerfil.getBounds().getCenterX();
			int centroY = (int) panelPerfil.getBounds().getCenterY();
			int width = panelInfo.getWidth();
			int height = panelInfo.getHeight();
			panelInfo.setBounds(centroX - (width / 2), centroY - (height / 2), width, height);
		}
	}

	private class MntmCerrarSesinMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			Date date = new Date();
			DateFormat ultimoAcceso = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //$NON-NLS-1$
			usuario.setUltimoAcceso(ultimoAcceso.format(date));
			System.exit(0);
		}
	}

	private class BtnParcelasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			scrollPane_Bungalow.setVisible(false);
			scrollPane_Parcela.setVisible(true);

			CardLayout cl = (CardLayout) (panelTablas.getLayout());
			cl.show(panelTablas, "scrollPane_Parcela"); //$NON-NLS-1$
		}
	}

	private class BtnBungalowActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			scrollPane_Bungalow.setVisible(true);
			scrollPane_Parcela.setVisible(false);
			CardLayout cl = (CardLayout) (panelTablas.getLayout());
			cl.show(panelTablas, "scrollPane_Bungalow"); //$NON-NLS-1$
		}
	}

	private void filtroRes(String consulta, JTable tab, TableRowSorter sorter, RowFilter rowF) {
		String str;
		if (consulta.isEmpty() || consulta == null) {
			tab.setRowSorter(sorter);
		} else if (isNumeric(consulta)) {
			rowF = RowFilter.numberFilter(ComparisonType.EQUAL, Integer.parseInt(consulta), 0);
			sorter.setRowFilter(rowF);
			tab.setRowSorter(sorter);
		} else {
			if (tab.equals(tableParcela)) {
				str = consulta.toLowerCase();
				str = str.substring(0, 1).toUpperCase() + str.substring(1);
				sorter = new TableRowSorter<>(modeloTablaParcela);
				tab.setRowSorter(sorter);
				sorter.setRowFilter(RowFilter.regexFilter(str, 2));
			} else {
				str = consulta.toLowerCase();
				str = str.substring(0, 1).toUpperCase() + str.substring(1);
				sorter = new TableRowSorter<>(modeloTablaBungalow);
				tab.setRowSorter(sorter);
				sorter.setRowFilter(RowFilter.regexFilter(str, 2));
			}

		}
	}

	public static boolean isNumeric(String cadena) {
		boolean resultado;
		try {
			Integer.parseInt(cadena);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		}
		return resultado;
	}

	private class BtnBuscarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			sorterParcela = new TableRowSorter<MiModeloTablaParcela>(modeloTablaParcela);
			sorterBungalow = new TableRowSorter<MiModeloTablaBungalow>(modeloTablaBungalow);
			if (scrollPane_Parcela.isVisible()) {
				filtroRes(txtBuscarID.getText(), tableParcela, sorterParcela, parcelaFilter);

			} else if (scrollPane_Bungalow.isVisible()) {
				filtroRes(txtBuscarID.getText(), tableBungalow, sorterBungalow, bungalowFilter);

			}

		}
	}

	private class TableParcelaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			int seleccionar = tableParcela.rowAtPoint(e.getPoint());
			String dato = String.valueOf(tableParcela.getValueAt(seleccionar, 0));

			if ((JOptionPane.showConfirmDialog(null, MessagesCampingInter.getString("VentanaPrincipal.388") + dato + "?", //$NON-NLS-1$ //$NON-NLS-2$
					"", JOptionPane.YES_NO_OPTION)) == JOptionPane.YES_OPTION) {
				identificarParcela(Integer.parseInt(dato));
				CardLayout cl = (CardLayout) (panelFunciones.getLayout());
				cl.show(panelFunciones, "panelReservaIndividual"); //$NON-NLS-1$

			}

		}
	}

	private class PanelFormularioReservaComponentListener extends ComponentAdapter {
		@Override
		public void componentResized(ComponentEvent e) {
			int centroX = (int) panelFormularioReserva.getBounds().getCenterX();
			int centroY = (int) panelFormularioReserva.getBounds().getCenterY();
			int width = panelRsv.getWidth();
			int height = panelRsv.getHeight();
			panelRsv.setBounds(centroX - (width / 2), centroY - (height / 2), width, height);
		}
	}

	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (txtEmail.getText().isEmpty() || txtContacto.getText().isEmpty() || txtNombreForm.getText().isEmpty()
					|| txtFechaS.getText().isEmpty() || txtFechaE.getText().isEmpty()) {
				JOptionPane.showMessageDialog(frmPrincipal, MessagesCampingInter.getString("VentanaPrincipal.392"), "", //$NON-NLS-1$ //$NON-NLS-2$
						JOptionPane.PLAIN_MESSAGE);
			} else {

				try {
					if ((comprobarFechasValidas()) && (comprobarFechasNumeros(txtFechaE.getText())
							&& (comprobarFechasNumeros(txtFechaS.getText())))) {
						int precioInicio = Integer.parseInt(txtPrecio.getText());
						txtPrecio.setText(String.valueOf(
								diferenciaEnDias2(fechasFormat(txtFechaS.getText()), fechasFormat(txtFechaE.getText()))
										* precioInicio));
						txtEntrada.setText(txtFechaE.getText());
						txtSalida.setText(txtFechaS.getText());
						btnHacerReserva.setEnabled(true);
						btnCancelarReserva.setEnabled(true);
						txtFechaE.setForeground(Color.BLACK);
						txtFechaS.setForeground(Color.BLACK);
						lblErrorFechaEntrada.setVisible(false);
						lblErrorFechaSalida.setVisible(false);
					} else {
						JOptionPane.showMessageDialog(frmPrincipal, MessagesCampingInter.getString("VentanaPrincipal.394"), MessagesCampingInter.getString("VentanaPrincipal.395"), //$NON-NLS-1$ //$NON-NLS-2$
								JOptionPane.PLAIN_MESSAGE);
					}
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		}

		private boolean comprobarFechasNumeros(String fecha) {
			String[] v = fecha.split("/"); //$NON-NLS-1$
			int anio = Integer.parseInt(v[0]);
			int mes = Integer.parseInt(v[1]);
			int dia = Integer.parseInt(v[2]);
			if ((anio >= 2020) && (mes <= 12 && mes > 0) && (dia > 0 && dia <= 31)) {
				return true;
			} else {
				return false;
			}
		}

		private boolean comprobarIgualdad(String fechaI, String fechaF) {
			String[] vI = fechaI.split("/"); //$NON-NLS-1$
			int anioI = Integer.parseInt(vI[0]);
			int mesI = Integer.parseInt(vI[1]);
			int diaI = Integer.parseInt(vI[2]);

			String[] vF = fechaF.split("/"); //$NON-NLS-1$
			int anioF = Integer.parseInt(vF[0]);
			int mesF = Integer.parseInt(vF[1]);
			int diaF = Integer.parseInt(vF[2]);

			if (anioI == anioF && mesI == mesF && anioI == anioF) {
				return true;
			} else {
				return false;
			}

		}

		private boolean comprobarFechasValidas() throws ParseException {

			Date fechaActual = new Date();
			String fechaI = txtFechaE.getText();
			String fechaF = txtFechaS.getText();
			SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd"); //$NON-NLS-1$
			Date fechaInicioDate = date.parse(fechaI); // String a date
			Date fechaFinDate = date.parse(fechaF); // String a date
			if (date.format(fechaActual).equals(fechaI)) {
				return true;

			} else {
				if (fechaInicioDate.before(fechaActual)) {
					txtFechaE.setForeground(Color.RED);
					lblErrorFechaEntrada.setVisible(true);
					return false;
				} else if (fechaInicioDate.after(fechaFinDate)) {
					txtFechaE.setForeground(Color.RED);
					txtFechaS.setForeground(Color.RED);
					lblErrorFechaEntrada.setVisible(true);
					lblErrorFechaSalida.setVisible(true);
					return false;
				} else if (fechaFinDate.before(fechaActual)) {
					txtFechaS.setForeground(Color.RED);
					lblErrorFechaSalida.setVisible(true);
					return false;
				} else if (fechaFinDate.before(fechaInicioDate)) {
					txtFechaS.setForeground(Color.RED);
					lblErrorFechaSalida.setVisible(true);
					return false;

				} else {
					return true;
				}
			}

		}

		private int diferenciaEnDias2(Date fechaMayor, Date fechaMenor) {
			long dif = fechaMayor.getTime() - fechaMenor.getTime();

			long dias = dif / (1000 * 60 * 60 * 24);
			return (int) dias;
		}

		private Date fechasFormat(String fechaI) {
			String[] v = fechaI.split("/"); //$NON-NLS-1$
			int anio = Integer.parseInt(v[0]);
			int mes = Integer.parseInt(v[1]);
			int dia = Integer.parseInt(v[2]);
			Date e = new Date(anio, mes, dia);
			return e;
		}
	}

	private class BtnCancelar_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panelFunciones.getLayout());
			cl.show(panelFunciones, "panelReservas"); //$NON-NLS-1$
		}
	}

	private class TableBungalowMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			int seleccionar = tableBungalow.rowAtPoint(e.getPoint());
			String dato = String.valueOf(tableBungalow.getValueAt(seleccionar, 0));

			if ((JOptionPane.showConfirmDialog(null, MessagesCampingInter.getString("VentanaPrincipal.402") + dato + "?", //$NON-NLS-1$ //$NON-NLS-2$
					"", JOptionPane.YES_NO_OPTION)) == JOptionPane.YES_OPTION) { //$NON-NLS-1$
				identificarBungalow(Integer.parseInt(dato));
				CardLayout cl = (CardLayout) (panelFunciones.getLayout());
				cl.show(panelFunciones, "panelReservaIndividual"); //$NON-NLS-1$

			}
		}
	}

	private class BtnReservarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout) (panelFunciones.getLayout());
			cl.show(panelFunciones, "panelFormularioReserva"); //$NON-NLS-1$
		}
	}

	private class BtnHacerReservaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if ((JOptionPane.showConfirmDialog(null, MessagesCampingInter.getString("VentanaPrincipal.407"), MessagesCampingInter.getString("VentanaPrincipal.408"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.YES_NO_OPTION)) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(frmPrincipal, MessagesCampingInter.getString("VentanaPrincipal.409"), //$NON-NLS-1$
						MessagesCampingInter.getString("VentanaPrincipal.410"), JOptionPane.PLAIN_MESSAGE); //$NON-NLS-1$
				JOptionPane.showMessageDialog(frmPrincipal, MessagesCampingInter.getString("VentanaPrincipal.411"), MessagesCampingInter.getString("VentanaPrincipal.412"), //$NON-NLS-1$ //$NON-NLS-2$
						JOptionPane.INFORMATION_MESSAGE);
				identificarReservado();
				limpiarFormulario();
				CardLayout cl = (CardLayout) (panelFunciones.getLayout());
				cl.show(panelFunciones, "panelReservas"); //$NON-NLS-1$

			}

		}
		

		private void limpiarFormulario() {
			txtFechaE.setText(""); //$NON-NLS-1$
			txtFechaS.setText(""); //$NON-NLS-1$
			txtNombreForm.setText(""); //$NON-NLS-1$
			txtContacto.setText(""); //$NON-NLS-1$
			txtEmail.setText(""); //$NON-NLS-1$
			txtEntrada.setText(""); //$NON-NLS-1$
			txtSalida.setText(""); //$NON-NLS-1$
			txtIDFormReserva.setText(""); //$NON-NLS-1$
			txtPrecio.setText(""); //$NON-NLS-1$
			lblErrorFechaEntrada.setText("");
			lblErrorFechaSalida.setText(""); //$NON-NLS-1$
			btnHacerReserva.setEnabled(false);
			btnCancelarReserva.setEnabled(false);

		}
	}

	private class BtnAadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MiModeloTablaActividades modeloTabla = (MiModeloTablaActividades) tableActividades.getModel();
			Object[] nuevaFila = {
					new ImageIcon(getClass().getClassLoader().getResource("fotosActividades/deporte.png")), "______", //$NON-NLS-1$ //$NON-NLS-2$
					"______", MessagesCampingInter.getString("VentanaPrincipal.4"), "0/X", MessagesCampingInter.getString("VentanaPrincipal.430"), "_______", "_______" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
			modeloTabla.aniadeFila(nuevaFila);
			modeloTabla.fireTableDataChanged();
		}
	}

	private class MntmEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MiModeloTablaActividades modeloTabla = (MiModeloTablaActividades) tableActividades.getModel();
			int n = tableActividades.getSelectedRow();
			if (n != -1)
				modeloTabla.eliminaFila(tableActividades.getSelectedRow());
			modeloTabla.fireTableDataChanged();
			txtActividad.setText(""); //$NON-NLS-1$
			lblActividad.setIcon(null);
		}
	}

	private class BtnLupitaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			filtroActv(txtBusquedaActividad.getText(), tableActividades);

		}
	}

	private class MntmxActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frmPrincipal.setBounds(100, 20, 1920, 1080);
		}
	}

	private class Mntmx_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frmPrincipal.setBounds(100, 20, 1680, 1050);
		}
	}

	private class Mntmx_2ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frmPrincipal.setBounds(100, 20, 1600, 1024);
		}
	}

	private class Mntmx_3ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frmPrincipal.setBounds(100, 20, 1200, 800);
		}
	}

	private class BtnExportarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if ((JOptionPane.showConfirmDialog(null, MessagesCampingInter.getString("VentanaPrincipal.434"), MessagesCampingInter.getString("VentanaPrincipal.435"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.YES_NO_OPTION)) == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(frmPrincipal, MessagesCampingInter.getString("VentanaPrincipal.436")+" 'mapaPersonalizado.jpg'", MessagesCampingInter.getString("VentanaPrincipal.437")+" 'mapaPersonalizado.jpg'", //$NON-NLS-1$ //$NON-NLS-2$
						JOptionPane.PLAIN_MESSAGE);
				BufferedImage imagebuf = null;
				try {
					imagebuf = new Robot().createScreenCapture(scrollPane_ruta.getBounds());
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				Graphics2D graphics2D = imagebuf.createGraphics();
				scrollPane_ruta.paint(graphics2D);
				try {

					ImageIO.write(imagebuf, "jpg", new File("mapaPersonalizado.jpg")); //$NON-NLS-1$ //$NON-NLS-2$

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(frmPrincipal, MessagesCampingInter.getString("VentanaPrincipal.440"), "¡ERROR!", //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.PLAIN_MESSAGE);
				}

			}

		}
	}

	private class BtnGoogleMapsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (Desktop.isDesktopSupported()) {
				try {
					URI uri = new URI("https://www.google.es/maps/@41.3129817,0.9803123,18z"); //$NON-NLS-1$
					Desktop.getDesktop().browse(uri);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(frmPrincipal, MessagesCampingInter.getString("VentanaPrincipal.443"), "¡ERROR!", //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.PLAIN_MESSAGE);

				}

			}

		}
	}

	private void filtroActv(String consulta, JTable tab) {
		String str;
		if (consulta.isEmpty() || consulta == null) {
			sorterActv = new TableRowSorter<>(modeloTablaActividades);
			tab.setRowSorter(sorterActv);

		} else {
			str = consulta.toLowerCase();
			str = str.substring(0, 1).toUpperCase() + str.substring(1);
			sorterActv = new TableRowSorter<>(modeloTablaActividades);
			tab.setRowSorter(sorterActv);
			sorterActv.setRowFilter(RowFilter.regexFilter(str, 1));
		}

	}

	private void actualizarParcela(Parcela p) {
		for (int i = 0; i < tableParcela.getRowCount(); i++) {
			if (tableParcela.getValueAt(i, 0).toString().equals(String.valueOf(p.getId()))) {
				tableParcela.setValueAt(p.getDisponible(), i, 5);
			}
		}
	}

	private void actualizarBungalow(Bungalow b) {
		for (int i = 0; i < tableBungalow.getRowCount(); i++) {
			if (tableBungalow.getValueAt(i, 0).toString().equals(String.valueOf(b.getId()))) {
				tableBungalow.setValueAt(b.getDisponible(), i, 4);
			}
		}
	}

	private void identificarReservado() {
		String id = txtIDFormReserva.getText();
		String nombreTotal = lblNombreIndividual.getText();
		String[] v = nombreTotal.split(" "); //$NON-NLS-1$
		String nombre = v[0];
		String tipo = v[1];
		for (Bungalow bungalow : bungalows_array) {
			if (bungalow.getId() == Integer.parseInt(id) && bungalow.getTipo().equals(tipo)) {
				bungalow.setDisponible("Ocupada"); //$NON-NLS-1$
				actualizarBungalow(bungalow);
			}
		}
		for (Parcela parcela : parcelas_array) {
			if (parcela.getId() == Integer.parseInt(id) && parcela.getNombre().equals(tipo)) {
				parcela.setDisponible("Ocupada"); //$NON-NLS-1$
				actualizarParcela(parcela);
			}
		}

	}

	private void completarArrays() {
		bungalows_array.add(bun1);
		bungalows_array.add(bun2);
		bungalows_array.add(bun3);
		bungalows_array.add(bun4);
		bungalows_array.add(bun5);
		bungalows_array.add(bun6);

		parcelas_array.add(p1);
		parcelas_array.add(p2);
		parcelas_array.add(p3);
		parcelas_array.add(p4);
		parcelas_array.add(p5);
		parcelas_array.add(p6);

		actividades_array.add(escalada);
		actividades_array.add(rutaGratis);
		actividades_array.add(equitacion);
		actividades_array.add(rafting);
		actividades_array.add(arco);
		actividades_array.add(bici);
	}

	private void identificarBungalow(int id) {
		for (Bungalow bungalow : bungalows_array) {
			if (bungalow.getId() == id) {
				panelGaleria.setVisible(true);
				lblGaleriaTitulo.setText(MessagesCampingInter.getString("VentanaPrincipal.448")); //$NON-NLS-1$
				lblFotoUbicacion
						.setIcon(new ImageIcon(getClass().getClassLoader().getResource(bungalow.getUbicacion())));
				txtPrecio.setText(String.valueOf(bungalow.getPrecioNoche()));
				lblFotoReservaInd.setIcon(new ImageIcon(getClass().getClassLoader().getResource(bungalow.getFoto())));
				asignarDisponibilidadImagenBungalow(bungalow);
				txtIDFormReserva.setText(String.valueOf(bungalow.getId()));
				txtDescripcion.setText(MessagesCampingInter.getString("VentanaPrincipal.449") + bungalow.getTipo() + MessagesCampingInter.getString("VentanaPrincipal.450") //$NON-NLS-1$ //$NON-NLS-2$
						+ bungalow.getTamanio()
						+ MessagesCampingInter.getString("VentanaPrincipal.451")); //$NON-NLS-1$
				lblNombreIndividual.setText(MessagesCampingInter.getString("VentanaPrincipal.452") + bungalow.getTipo()); //$NON-NLS-1$
				lblPrecio_1.setText(bungalow.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.453")); //$NON-NLS-1$
				lblCapacidadIndividual.setText(bungalow.getCapacidadMax() + MessagesCampingInter.getString("VentanaPrincipal.454")); //$NON-NLS-1$
				lblTamanioIndividual.setText(bungalow.getTamanio());
				identificarGaleriaBungalow(bungalow);
				txtCaracteristicas.setText(bungalow.getEquipamiento());
				if (bungalow.getDisponible().equals("Disponible") || bungalow.getDisponible().equals("Available")) { //$NON-NLS-1$
					btnReservarIndividual.setEnabled(true);
				} else {
					btnReservarIndividual.setEnabled(false);
				}
			}
		}
	}

	private void cambioDisponibilidad(int id, JTable tab, String estado) {

		if (tab.equals(tableParcela)) {
			for (Parcela parcela : parcelas_array) {
				if (parcela.getId() == id) {
					parcela.setDisponible(estado);
					if (estado == "Disponible" || estado == "Available") { //$NON-NLS-1$
						btnReservarIndividual.setEnabled(true);
					}
				}
			}

		} else if (tab.equals(tableBungalow)) {
			for (Bungalow bungalow : bungalows_array) {
				if (bungalow.getId() == id) {
					bungalow.setDisponible(estado);
					if (estado == "Disponible" || estado == "Available") { //$NON-NLS-1$
						btnReservarIndividual.setEnabled(true);
					}
				}
			}
		}

	}
	
	private class RdbtnCambiarIdiomaActionListener implements ActionListener {
		
		public void actionPerformed(ActionEvent arg0) {
			
			if(rdbtnIngles.isSelected()) {
				MessagesCampingInter.setIdioma(MessagesCampingInter.getString("VentanaPrincipal.458")); //$NON-NLS-1$
			}
			
			if(rdbtnEspaniol.isSelected()) {
				MessagesCampingInter.setIdioma(MessagesCampingInter.getString("VentanaPrincipal.459"));			 //$NON-NLS-1$
			}

			VentanaPrincipal ventana = new VentanaPrincipal();
			ventana.getFrame().setVisible(true);
			
			frmPrincipal.dispose();
			
		}
	}
	
	private void asignarDisponibilidadImagenBungalow(Bungalow b) {
		if (b.getDisponible().equals("Disponible") || b.getDisponible().equals("Available")) { //$NON-NLS-1$
			lblDisponibilidad
					.setIcon(new ImageIcon(getClass().getClassLoader().getResource("fotosReserva/disponible.png"))); //$NON-NLS-1$
			lblDisponibilidadTxt.setText(b.getDisponible());
		} else if (b.getDisponible().equals("Mantenimiento") || b.getDisponible().equals("Maintenance")) { //$NON-NLS-1$
			lblDisponibilidad
					.setIcon(new ImageIcon(getClass().getClassLoader().getResource("fotosReserva/mantenimiento.png"))); //$NON-NLS-1$
			lblDisponibilidadTxt.setText(b.getDisponible());
		} else {
			lblDisponibilidad
					.setIcon(new ImageIcon(getClass().getClassLoader().getResource("fotosReserva/ocupado.png"))); //$NON-NLS-1$
			lblDisponibilidadTxt.setText(b.getDisponible());
		}
	}

	private void asignarDisponibilidadImagenParcela(Parcela p) {

		if (p.getDisponible().equals("Disponible") || p.getDisponible().equals("Available")) { //$NON-NLS-1$
			lblDisponibilidad
					.setIcon(new ImageIcon(getClass().getClassLoader().getResource("fotosReserva/disponible.png"))); //$NON-NLS-1$
			lblDisponibilidadTxt.setText(p.getDisponible());
		} else if (p.getDisponible().equals("Mantenimiento") || p.getDisponible().equals("Maintenance")) { //$NON-NLS-1$
			lblDisponibilidad
					.setIcon(new ImageIcon(getClass().getClassLoader().getResource("fotosReserva/mantenimiento.png"))); //$NON-NLS-1$
			lblDisponibilidadTxt.setText(p.getDisponible());
		} else {
			lblDisponibilidad
					.setIcon(new ImageIcon(getClass().getClassLoader().getResource("fotosReserva/ocupado.png"))); //$NON-NLS-1$
			lblDisponibilidadTxt.setText(p.getDisponible());
		}

	}

	private void identificarParcela(int id) {
		for (Parcela parcela : parcelas_array) {
			if (parcela.getId() == id) {
				// PONER FOTO PA LAS PARCELAS
				panelGaleria.setVisible(false);
				lblGaleriaTitulo.setText(""); //$NON-NLS-1$
				txtPrecio.setText(String.valueOf(parcela.getPrecioNoche()));
				lblFotoReservaInd.setIcon(new ImageIcon(getClass().getClassLoader().getResource(parcela.getFoto())));
				lblFotoUbicacion
						.setIcon(new ImageIcon(getClass().getClassLoader().getResource(parcela.getUbicacion())));
				asignarDisponibilidadImagenParcela(parcela);
				txtIDFormReserva.setText(String.valueOf(parcela.getId()));
				txtDescripcion.setText(MessagesCampingInter.getString("VentanaPrincipal.471") + parcela.getNombre() + MessagesCampingInter.getString("VentanaPrincipal.472") //$NON-NLS-1$ //$NON-NLS-2$
						+ parcela.getTamanio()
						+ MessagesCampingInter.getString("VentanaPrincipal.473")); //$NON-NLS-1$
				lblNombreIndividual.setText(MessagesCampingInter.getString("VentanaPrincipal.474") + parcela.getNombre()); //$NON-NLS-1$
				lblPrecio_1.setText(parcela.getPrecioNoche() + MessagesCampingInter.getString("VentanaPrincipal.475")); //$NON-NLS-1$
				// identificarGaleriaParcela(parcela);
				lblTamanioIndividual.setText(parcela.getTamanio());
				lblCapacidadIndividual.setText(MessagesCampingInter.getString("VentanaPrincipal.476")); //$NON-NLS-1$
				txtCaracteristicas.setText(parcela.getCaracteristicas());
				if (parcela.getDisponible().equals("Disponible") || parcela.getDisponible().equals("Available")) { //$NON-NLS-1$
					btnReservarIndividual.setEnabled(true);
				} else {
					btnReservarIndividual.setEnabled(false);
				}

			}

		}
	}

	
	private void identificarGaleriaBungalow(Bungalow b) {
		String[] g;
		g = b.getGaleria();
		String habitacion = g[1];
		String cocina = g[2];
		String banio = g[0];
		lblHabitacion.setIcon(new ImageIcon(getClass().getClassLoader().getResource(habitacion)));
		lblCocina.setIcon(new ImageIcon(getClass().getClassLoader().getResource(cocina)));
		lblBanio.setIcon(new ImageIcon(getClass().getClassLoader().getResource(banio)));
	}

	private void enable(boolean b) {
		btnGuardar.setEnabled(b);
		btnCancelar.setEnabled(b);
		txtNombre.setEnabled(b);
		txtApellidos.setEnabled(b);
		txtTelefono.setEnabled(b);
		txtCorreo.setEnabled(b);
		txtFormacion.setEnabled(b);
		txtIdiomas.setEnabled(b);
		btnCargarFoto.setEnabled(b);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}

		});
	}
}
