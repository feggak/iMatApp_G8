package iMatApp_G8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.JTree;
import javax.swing.JSeparator;
import java.awt.Rectangle;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setTitle("iMat");
		setMaximumSize(new Dimension(1050, 1000));
		setMinimumSize(new Dimension(1050, 620));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(null);
		menuBar.setMargin(new Insets(0, 0, 1, 0));
		menuBar.setAlignmentX(Component.LEFT_ALIGNMENT);
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenu mnRedigera = new JMenu("Redigera");
		menuBar.add(mnRedigera);
		
		JMenu mnAffr = new JMenu("Affär");
		menuBar.add(mnAffr);
		
		JMenu mnFnster = new JMenu("Fönster");
		menuBar.add(mnFnster);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		menuBar.add(mnHjlp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		topPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		topPanel.setPreferredSize(new Dimension(10, 48));
		topPanel.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		topPanel.setBackground(new Color(255, 59, 33));
		topPanel.setForeground(Color.WHITE);
		topPanel.setMinimumSize(new Dimension(960, 30));
		contentPane.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Butik");
		btnNewButton.setLocation(new Point(0, 1));
		btnNewButton.setBounds(0, 1, 110, 46);
		btnNewButton.setFont(new Font("Helvetica", Font.PLAIN, 22));
		btnNewButton.setOpaque(true);
		btnNewButton.setRolloverEnabled(true);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setIconTextGap(0);
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton.setPreferredSize(new Dimension(80, 46));
		btnNewButton.setBackground(new Color(255, 59, 33));
		btnNewButton.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		topPanel.add(btnNewButton);
		
		JButton btnRecept = new JButton("Recept");
		btnRecept.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRecept.setSize(110, 46);
		btnRecept.setLocation(new Point(110, 1));
		btnRecept.setRolloverEnabled(true);
		btnRecept.setPreferredSize(new Dimension(80, 46));
		btnRecept.setOpaque(true);
		btnRecept.setMargin(new Insets(0, 0, 0, 0));
		btnRecept.setIconTextGap(0);
		btnRecept.setFont(new Font("Helvetica", Font.PLAIN, 22));
		btnRecept.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		btnRecept.setBackground(new Color(255, 59, 33));
		btnRecept.setAlignmentY(0.0f);
		topPanel.add(btnRecept);
		
		txtSearch = new JTextField();
		txtSearch.setMaximumSize(new Dimension(600, 36));
		txtSearch.setHorizontalAlignment(SwingConstants.LEFT);
		txtSearch.setFocusTraversalKeysEnabled(false);
		txtSearch.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtSearch.setMargin(new Insets(0, 5, 0, 5));
		txtSearch.setAlignmentY(Component.TOP_ALIGNMENT);
		txtSearch.setAlignmentX(0.0f);
		txtSearch.setText("Sök...");
		txtSearch.setOpaque(true);
		txtSearch.setBorder(new CompoundBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), new EmptyBorder(0, 7, 0, 0)));
		txtSearch.setMinimumSize(new Dimension(14, 36));
		txtSearch.setPreferredSize(new Dimension(14, 36));
		txtSearch.setBounds(226, 7, 461, 34);
		topPanel.add(txtSearch);
		txtSearch.setColumns(1);
		
		JButton btnLoggaIn = new JButton("Logga in");
		btnLoggaIn.setRolloverEnabled(true);
		btnLoggaIn.setPreferredSize(new Dimension(80, 46));
		btnLoggaIn.setOpaque(true);
		btnLoggaIn.setMargin(new Insets(0, 0, 0, 0));
		btnLoggaIn.setLocation(new Point(100, 1));
		btnLoggaIn.setIconTextGap(0);
		btnLoggaIn.setFont(new Font("Helvetica", Font.PLAIN, 18));
		btnLoggaIn.setBorder(null);
		btnLoggaIn.setBackground(new Color(255, 133, 117));
		btnLoggaIn.setAlignmentY(0.0f);
		btnLoggaIn.setBounds(693, 7, 110, 34);
		topPanel.add(btnLoggaIn);
		
		JButton btnTillKassan = new JButton("Till kassan");
		btnTillKassan.setRolloverEnabled(true);
		btnTillKassan.setPreferredSize(new Dimension(80, 46));
		btnTillKassan.setOpaque(true);
		btnTillKassan.setMargin(new Insets(0, 0, 0, 0));
		btnTillKassan.setLocation(new Point(100, 1));
		btnTillKassan.setIconTextGap(0);
		btnTillKassan.setFont(new Font("Helvetica", Font.PLAIN, 18));
		btnTillKassan.setBorder(null);
		btnTillKassan.setBackground(new Color(255, 133, 117));
		btnTillKassan.setAlignmentY(0.0f);
		btnTillKassan.setBounds(965, 7, 110, 34);
		topPanel.add(btnTillKassan);
		
		JButton btnKundvagn = new JButton("Kundvagn");
		btnKundvagn.setHorizontalAlignment(SwingConstants.LEFT);
		btnKundvagn.setRolloverEnabled(true);
		btnKundvagn.setPreferredSize(new Dimension(80, 46));
		btnKundvagn.setOpaque(true);
		btnKundvagn.setMargin(new Insets(0, 0, 0, 0));
		btnKundvagn.setLocation(new Point(100, 1));
		btnKundvagn.setIconTextGap(0);
		btnKundvagn.setFont(new Font("Helvetica", Font.PLAIN, 18));
		btnKundvagn.setBorder(new CompoundBorder(new MatteBorder(0, 1, 0, 1, (Color) new Color(0, 0, 0)), new EmptyBorder(0, 10, 0, 0)));
		btnKundvagn.setBackground(new Color(255, 59, 33));
		btnKundvagn.setAlignmentY(0.0f);
		btnKundvagn.setBounds(809, 1, 150, 46);
		topPanel.add(btnKundvagn);
		
		JPanel leftCategoryPanel = new JPanel();
		leftCategoryPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		leftCategoryPanel.setBackground(new Color(255, 255, 255));
		leftCategoryPanel.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		leftCategoryPanel.setPreferredSize(new Dimension(220, 10));
		leftCategoryPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		leftCategoryPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.add(leftCategoryPanel, BorderLayout.WEST);
		leftCategoryPanel.setLayout(new MigLayout("", "[190px]", "[18px][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Kampanjer");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
		leftCategoryPanel.add(lblNewLabel, "cell 0 0,alignx left,aligny center");
		
		JLabel lblVisaAllaVaror = new JLabel("Visa alla varor");
		lblVisaAllaVaror.setHorizontalTextPosition(SwingConstants.LEFT);
		lblVisaAllaVaror.setHorizontalAlignment(SwingConstants.LEFT);
		lblVisaAllaVaror.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblVisaAllaVaror.setAlignmentY(0.0f);
		leftCategoryPanel.add(lblVisaAllaVaror, "cell 0 1,aligny center");
		
		JSeparator separator = new JSeparator();
		separator.setAlignmentY(Component.TOP_ALIGNMENT);
		separator.setAlignmentX(Component.LEFT_ALIGNMENT);
		separator.setForeground(new Color(128, 128, 128));
		separator.setPreferredSize(new Dimension(192, 12));
		leftCategoryPanel.add(separator, "cell 0 2,alignx left");
		
		JLabel lblFruktGrnt = new JLabel("Frukt & Grönt");
		lblFruktGrnt.setHorizontalTextPosition(SwingConstants.LEFT);
		lblFruktGrnt.setHorizontalAlignment(SwingConstants.LEFT);
		lblFruktGrnt.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblFruktGrnt.setAlignmentY(0.0f);
		leftCategoryPanel.add(lblFruktGrnt, "cell 0 3");
		
		JLabel lblBrd = new JLabel("Bröd");
		lblBrd.setHorizontalTextPosition(SwingConstants.LEFT);
		lblBrd.setHorizontalAlignment(SwingConstants.LEFT);
		lblBrd.setFont(new Font("Helvetica", Font.PLAIN, 14));
		lblBrd.setAlignmentY(0.0f);
		leftCategoryPanel.add(lblBrd, "cell 0 4");
		
		JPanel panel = new StoreView();
		contentPane.add(panel, BorderLayout.CENTER);
	}
}
