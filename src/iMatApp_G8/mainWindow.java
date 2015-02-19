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

public class mainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
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
	public mainWindow() {
		setTitle("iMat");
		setMaximumSize(new Dimension(1000, 1000));
		setMinimumSize(new Dimension(1000, 620));
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
		topPanel.setBackground(new Color(50, 205, 50));
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
		btnNewButton.setBackground(new Color(34, 139, 34));
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
		btnRecept.setBackground(new Color(50, 205, 50));
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
		txtSearch.setBounds(226, 7, 381, 34);
		topPanel.add(txtSearch);
		txtSearch.setColumns(1);
		
		JButton btnLoggaIn = new JButton("Logga in");
		btnLoggaIn.setRolloverEnabled(true);
		btnLoggaIn.setPreferredSize(new Dimension(80, 46));
		btnLoggaIn.setOpaque(true);
		btnLoggaIn.setMargin(new Insets(0, 0, 0, 0));
		btnLoggaIn.setLocation(new Point(100, 1));
		btnLoggaIn.setIconTextGap(0);
		btnLoggaIn.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btnLoggaIn.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnLoggaIn.setBackground(Color.YELLOW);
		btnLoggaIn.setAlignmentY(0.0f);
		btnLoggaIn.setBounds(613, 7, 110, 34);
		topPanel.add(btnLoggaIn);
		
		JButton btnTillKassan = new JButton("Till kassan");
		btnTillKassan.setRolloverEnabled(true);
		btnTillKassan.setPreferredSize(new Dimension(80, 46));
		btnTillKassan.setOpaque(true);
		btnTillKassan.setMargin(new Insets(0, 0, 0, 0));
		btnTillKassan.setLocation(new Point(100, 1));
		btnTillKassan.setIconTextGap(0);
		btnTillKassan.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btnTillKassan.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnTillKassan.setBackground(new Color(255, 255, 0));
		btnTillKassan.setAlignmentY(0.0f);
		btnTillKassan.setBounds(885, 7, 110, 34);
		topPanel.add(btnTillKassan);
		
		JButton btnKundvagn = new JButton("Kundvagn");
		btnKundvagn.setHorizontalAlignment(SwingConstants.LEFT);
		btnKundvagn.setRolloverEnabled(true);
		btnKundvagn.setPreferredSize(new Dimension(80, 46));
		btnKundvagn.setOpaque(true);
		btnKundvagn.setMargin(new Insets(0, 0, 0, 0));
		btnKundvagn.setLocation(new Point(100, 1));
		btnKundvagn.setIconTextGap(0);
		btnKundvagn.setFont(new Font("Helvetica", Font.PLAIN, 20));
		btnKundvagn.setBorder(new CompoundBorder(new MatteBorder(0, 1, 0, 1, (Color) new Color(0, 0, 0)), new EmptyBorder(0, 10, 0, 0)));
		btnKundvagn.setBackground(new Color(50, 205, 50));
		btnKundvagn.setAlignmentY(0.0f);
		btnKundvagn.setBounds(729, 1, 150, 46);
		topPanel.add(btnKundvagn);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		panel.setPreferredSize(new Dimension(220, 10));
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.add(panel, BorderLayout.WEST);
		
		JTree tree = new JTree();
		panel.add(tree);
	}
}
