package stock;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.TabableView;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class GUI_3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_3 frame = new GUI_3();
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
	public GUI_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1134, 744);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(9, 9, 9));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setkStartColor(new Color(9, 9, 9));
		gradientPanel.setkEndColor(new Color(0, 20, 32));
		contentPane.add(gradientPanel, "name_25879198946900");
		gradientPanel.setLayout(null);
		
		JPanel Navigation_panel = new JPanel();
		Navigation_panel.setBounds(10, 10, 60, 470);
		Navigation_panel.setBorder(new LineBorder(new Color(0, 32, 51), 4, true));
		Navigation_panel.setBackground(new Color(0, 20, 32));
		gradientPanel.add(Navigation_panel);
		Navigation_panel.setLayout(null);
		
		JButton btn = new JButton("New button");
		Image photo = new ImageIcon(this.getClass().getResource("/home_icon.png")).getImage();
		btn.setBounds(6, 176, 48, 50);
		Navigation_panel.add(btn);
		btn.setBackground(new Color(9, 9, 9));
		btn.setOpaque(true);
		btn.setIcon(new ImageIcon(photo));
		
		JButton btn2 = new JButton("New button");
		Image photo2 = new ImageIcon(this.getClass().getResource("/report_icon.png")).getImage();
		btn2.setOpaque(true);
		btn2.setBackground(new Color(9, 9, 9));
		btn2.setBounds(6, 290, 48, 50);
		Navigation_panel.add(btn2);
		btn2.setIcon(new ImageIcon(photo2));
		
		JTabbedPane tab_pane = new JTabbedPane(JTabbedPane.TOP);
		tab_pane.setBorder(new LineBorder(new Color(0, 0, 0)));
		tab_pane.setBackground(new Color(0, 20, 32));
		tab_pane.setBounds(82, 10, 1004, 540);
		gradientPanel.add(tab_pane);
		
		JPanel Home_panel = new JPanel();
		Home_panel.setBackground(new Color(0, 20, 32));
		tab_pane.addTab("home", null, Home_panel, null);
		Home_panel.setLayout(new CardLayout(0, 0));
		
		KGradientPanel home_gradient = new KGradientPanel();
		home_gradient.setkStartColor(new Color(9, 9, 9));
		home_gradient.setkEndColor(new Color(0, 20, 32));
		Home_panel.add(home_gradient, "name_33562332088100");
		home_gradient.setLayout(null);
		
		JPanel Data_panel = new JPanel();
		Data_panel.setLayout(null);
		Data_panel.setOpaque(false);
		Data_panel.setBorder(new LineBorder(new Color(0, 32, 51), 4, true));
		Data_panel.setBackground(new Color(0, 20, 32));
		Data_panel.setBounds(6, 96, 992, 371);
		home_gradient.add(Data_panel);
		
		JPanel Name_panel = new JPanel();
		Name_panel.setOpaque(false);
		Name_panel.setBorder(null);
		Name_panel.setBackground(new Color(0, 20, 32));
		Name_panel.setBounds(6, 6, 992, 78);
		home_gradient.add(Name_panel);
		Name_panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel nm_pnl = new JPanel();
		nm_pnl.setOpaque(false);
		nm_pnl.setBorder(new LineBorder(new Color(0, 32, 51), 4, true));
		nm_pnl.setBackground(new Color(0, 20, 32));
		Name_panel.add(nm_pnl);
		nm_pnl.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel Vix_label = new JLabel("VIX - ");
		Vix_label.setHorizontalTextPosition(SwingConstants.CENTER);
		Vix_label.setHorizontalAlignment(SwingConstants.CENTER);
		Vix_label.setForeground(new Color(235, 235, 235));
		Vix_label.setFont(new Font("Georgia", Font.BOLD, 18));
		Vix_label.setAlignmentX(0.5f);
		nm_pnl.add(Vix_label);
		
		JPanel nm_pnl_1 = new JPanel();
		nm_pnl_1.setOpaque(false);
		nm_pnl_1.setBorder(new LineBorder(new Color(0, 32, 51), 4, true));
		nm_pnl_1.setBackground(new Color(0, 20, 32));
		Name_panel.add(nm_pnl_1);
		nm_pnl_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel Bankex_label = new JLabel("BANKEX");
		Bankex_label.setHorizontalTextPosition(SwingConstants.CENTER);
		Bankex_label.setHorizontalAlignment(SwingConstants.CENTER);
		Bankex_label.setForeground(new Color(235, 235, 235));
		Bankex_label.setFont(new Font("Georgia", Font.BOLD, 18));
		Bankex_label.setAlignmentX(0.5f);
		nm_pnl_1.add(Bankex_label);
		
		JPanel nm_pnl_2 = new JPanel();
		nm_pnl_2.setOpaque(false);
		nm_pnl_2.setBorder(new LineBorder(new Color(0, 32, 51), 4, true));
		nm_pnl_2.setBackground(new Color(0, 20, 32));
		Name_panel.add(nm_pnl_2);
		nm_pnl_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel Midcap_label = new JLabel("MIDCAP");
		Midcap_label.setHorizontalTextPosition(SwingConstants.CENTER);
		Midcap_label.setHorizontalAlignment(SwingConstants.CENTER);
		Midcap_label.setForeground(new Color(235, 235, 235));
		Midcap_label.setFont(new Font("Georgia", Font.BOLD, 18));
		Midcap_label.setAlignmentX(0.5f);
		nm_pnl_2.add(Midcap_label);
		
		JPanel nm_pnl_3 = new JPanel();
		nm_pnl_3.setOpaque(false);
		nm_pnl_3.setBorder(new LineBorder(new Color(0, 32, 51), 4, true));
		nm_pnl_3.setBackground(new Color(0, 20, 32));
		Name_panel.add(nm_pnl_3);
		nm_pnl_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel FinNifty_label = new JLabel("FIN NIFTY");
		FinNifty_label.setHorizontalTextPosition(SwingConstants.CENTER);
		FinNifty_label.setHorizontalAlignment(SwingConstants.CENTER);
		FinNifty_label.setForeground(new Color(235, 235, 235));
		FinNifty_label.setFont(new Font("Georgia", Font.BOLD, 18));
		FinNifty_label.setAlignmentX(0.5f);
		nm_pnl_3.add(FinNifty_label);
		
		JPanel nm_pnl_4 = new JPanel();
		nm_pnl_4.setOpaque(false);
		nm_pnl_4.setBorder(new LineBorder(new Color(0, 32, 51), 4, true));
		nm_pnl_4.setBackground(new Color(0, 20, 32));
		Name_panel.add(nm_pnl_4);
		nm_pnl_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel BankNifty_label = new JLabel("BANK NIFTY");
		BankNifty_label.setHorizontalTextPosition(SwingConstants.CENTER);
		BankNifty_label.setHorizontalAlignment(SwingConstants.CENTER);
		BankNifty_label.setForeground(new Color(235, 235, 235));
		BankNifty_label.setFont(new Font("Georgia", Font.BOLD, 18));
		BankNifty_label.setAlignmentX(0.5f);
		nm_pnl_4.add(BankNifty_label);
		
		JPanel nm_pnl_5 = new JPanel();
		nm_pnl_5.setOpaque(false);
		nm_pnl_5.setBorder(new LineBorder(new Color(0, 32, 51), 4, true));
		nm_pnl_5.setBackground(new Color(0, 20, 32));
		Name_panel.add(nm_pnl_5);
		nm_pnl_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel Nifty50_label = new JLabel("NIFTY 50");
		Nifty50_label.setHorizontalTextPosition(SwingConstants.CENTER);
		Nifty50_label.setHorizontalAlignment(SwingConstants.CENTER);
		Nifty50_label.setForeground(new Color(235, 235, 235));
		Nifty50_label.setFont(new Font("Georgia", Font.BOLD, 18));
		Nifty50_label.setAlignmentX(0.5f);
		nm_pnl_5.add(Nifty50_label);
		
		JPanel nm_pnl_6 = new JPanel();
		nm_pnl_6.setOpaque(false);
		nm_pnl_6.setBorder(new LineBorder(new Color(0, 32, 51), 4, true));
		nm_pnl_6.setBackground(new Color(0, 20, 32));
		Name_panel.add(nm_pnl_6);
		nm_pnl_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel Sensex_label = new JLabel("SENSEX");
		Sensex_label.setHorizontalTextPosition(SwingConstants.CENTER);
		Sensex_label.setHorizontalAlignment(SwingConstants.CENTER);
		Sensex_label.setForeground(new Color(235, 235, 235));
		Sensex_label.setFont(new Font("Georgia", Font.BOLD, 18));
		Sensex_label.setAlignmentX(0.5f);
		nm_pnl_6.add(Sensex_label);
		tab_pane.setBackgroundAt(0, new Color(0, 255, 0));
		
		JPanel Report_panel = new JPanel();
		Report_panel.setOpaque(false);
		tab_pane.addTab("report", null, Report_panel, null);
		Report_panel.setLayout(new CardLayout(0, 0));
		
		KGradientPanel report_gradient = new KGradientPanel();
		Report_panel.add(report_gradient, "name_33427031160699");
		report_gradient.setLayout(null);
	}

}
