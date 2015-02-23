package iMatApp_G8;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Color;

public class StoreView extends JPanel {

	/**
	 * Create the panel.
	 */
	public StoreView() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(830, 530));
		setMinimumSize(new Dimension(830, 530));
		setMaximumSize(new Dimension(830, 32767));
		setLayout(null);
		
		JLabel lblHej = new JLabel("Hej");
		lblHej.setBounds(293, 498, 21, 16);
		add(lblHej);

	}

}
