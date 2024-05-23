package stock;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import keeptoo.KGradientPanel;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.RenderingHints;

import javax.swing.UIManager;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class UpdatedGui extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdatedGui frame = new UpdatedGui();
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
	public UpdatedGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(22, 23, 33));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkEndColor(new Color(0, 19, 32));
		gradientPanel.setkStartColor(new Color(0, 0, 0));
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
	}
}
