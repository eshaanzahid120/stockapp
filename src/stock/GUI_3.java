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
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalTime;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI_3 extends JFrame {
	JTabbedPane tab_pane;
	JPanel panel_6;
	
	String vixstr;
    String bankexstr;
    String sensexstr;
    String bankniftystr;
    String nifty50str;
    String finniftystr;
    String midcapstr;
    
  String bankexuprange;
  String bankexlowrange;
  
  String sensexuprange;
  String sensexlowrange;
  
  String bankniftyuprange;
  String bankniftylowrange;
  
  String nifty50uprange;
  String nifty50lowrange;
  
  String finniftyuprange;
  String finniftylowrange;
  
  String midcapuprange;
  String midcaplowrange;
	

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
	//fuck you
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public GUI_3() throws IOException {
		
		vixstr = Function.getvix();
		bankexstr = Function.getbankex();
		sensexstr = Function.getsensex();
		bankniftystr = Function.getbanknifty();
		nifty50str = Function.getnifty();
		finniftystr = Function.getfinnifty();
		midcapstr = Function.getmidcap();
		//
		bankexuprange = Function.getupRange(vixstr,bankexstr);
		bankexlowrange = Function.getlowRange(vixstr,bankexstr);
		
		sensexuprange = Function.getupRange(vixstr,sensexstr);
		sensexlowrange = Function.getlowRange(vixstr,sensexstr);
		
		bankniftyuprange = Function.getupRange(vixstr,bankniftystr);
		bankniftylowrange = Function.getlowRange(vixstr,bankniftystr);
		
		nifty50uprange = Function.getupRange(vixstr,nifty50str);
		nifty50lowrange = Function.getlowRange(vixstr,nifty50str);
		
		finniftyuprange = Function.getupRange(vixstr,finniftystr);
		finniftylowrange = Function.getlowRange(vixstr,finniftystr);
		
		midcapuprange = Function.getupRange(vixstr,midcapstr);
		midcaplowrange = Function.getlowRange(vixstr,midcapstr);
		
		//basebadatafile
		
		String date = Function.getdate();
		String filePath2 = "C:/Users/Eshaan Zahid/eclipse-workspace/StockAnalyser/data/"+date+"_stockdata.txt";
        Path path2 = Paths.get(filePath2);
		
        if (!Files.exists(path2)) {
            Files.createFile(path2);
            
            String fileContent = bankexuprange+" "+bankexlowrange+" "+midcapuprange+" "+midcaplowrange+" "+finniftyuprange+" "+finniftylowrange+" "+bankniftyuprange+" "+bankniftylowrange+" "+nifty50uprange+" "+nifty50lowrange+" "+sensexuprange+" "+sensexlowrange;
            Files.write(path2, fileContent.getBytes(StandardCharsets.UTF_8), StandardOpenOption.WRITE);
            //System.out.println("File created: " + path.getFileName());
        }
        else {
        	
        }
			
			
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1214, 744);
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
		Navigation_panel.setBounds(10, 10, 60, 519);
		Navigation_panel.setBorder(new LineBorder(new Color(0, 32, 51), 4, true));
		Navigation_panel.setBackground(new Color(0, 20, 32));
		gradientPanel.add(Navigation_panel);
		Navigation_panel.setLayout(null);
		
		JButton btn = new JButton("New button");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tab_pane.setSelectedIndex(0);
			}
		});
		Image photo = new ImageIcon(this.getClass().getResource("/home_icon.png")).getImage();
		btn.setBounds(6, 176, 48, 50);
		Navigation_panel.add(btn);
		btn.setBackground(new Color(9, 9, 9));
		btn.setOpaque(true);
		btn.setIcon(new ImageIcon(photo));
		
		JButton btn2 = new JButton("New button");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tab_pane.setSelectedIndex(1);
			}
		});
		Image photo2 = new ImageIcon(this.getClass().getResource("/report_icon.png")).getImage();
		btn2.setOpaque(true);
		btn2.setBackground(new Color(9, 9, 9));
		btn2.setBounds(6, 318, 48, 50);
		Navigation_panel.add(btn2);
		btn2.setIcon(new ImageIcon(photo2));
		
		tab_pane = new JTabbedPane(JTabbedPane.TOP);
		tab_pane.setBorder(new LineBorder(new Color(0, 0, 0)));
		tab_pane.setBackground(new Color(0, 20, 32));
		tab_pane.setBounds(82, 10, 1004, 519);
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
		Data_panel.setOpaque(false);
		Data_panel.setBorder(new LineBorder(new Color(0, 32, 51), 4, true));
		Data_panel.setBackground(new Color(0, 20, 32));
		Data_panel.setBounds(6, 96, 992, 391);
		home_gradient.add(Data_panel);
		Data_panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel marker_panel = new JPanel();
		marker_panel.setOpaque(false);
		marker_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Data_panel.add(marker_panel);
		GridBagLayout gbl_marker_panel = new GridBagLayout();
		gbl_marker_panel.columnWidths = new int[]{0, 0};
		gbl_marker_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_marker_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_marker_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		marker_panel.setLayout(gbl_marker_panel);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_7.setOpaque(false);
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 0;
		marker_panel.add(panel_7, gbc_panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("HIGH");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_8.setOpaque(false);
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 5, 0);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 0;
		gbc_panel_8.gridy = 1;
		marker_panel.add(panel_8, gbc_panel_8);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblCmp = new JLabel("CMP");
		lblCmp.setForeground(new Color(255, 255, 255));
		lblCmp.setBackground(new Color(255, 255, 255));
		lblCmp.setFont(new Font("Georgia", Font.BOLD, 18));
		lblCmp.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCmp.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblCmp);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_9.setOpaque(false);
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 2;
		marker_panel.add(panel_9, gbc_panel_9);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblLow = new JLabel("LOW");
		lblLow.setForeground(new Color(255, 255, 255));
		lblLow.setBackground(new Color(255, 255, 255));
		lblLow.setFont(new Font("Georgia", Font.BOLD, 18));
		lblLow.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblLow);
		
		
		//Bankex
		JPanel bankex_data_panel = new JPanel();
		bankex_data_panel.setOpaque(false);
		bankex_data_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Data_panel.add(bankex_data_panel);
		GridBagLayout gbl_bankex_data_panel = new GridBagLayout();
		gbl_bankex_data_panel.columnWidths = new int[]{0, 0};
		gbl_bankex_data_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_bankex_data_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_bankex_data_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		bankex_data_panel.setLayout(gbl_bankex_data_panel);
		
		JPanel panel_10 = new JPanel();
		panel_10.setOpaque(false);
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 0;
		bankex_data_panel.add(panel_10, gbc_panel_10);
		panel_10.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel bankex_high = new JLabel(bankexuprange);
		bankex_high.setBorder(new LineBorder(new Color(0, 0, 0)));
		bankex_high.setForeground(new Color(255, 255, 255));
		bankex_high.setFont(new Font("Monospaced", Font.BOLD, 18));
		bankex_high.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(bankex_high);
		
		JPanel panel_11 = new JPanel();
		panel_11.setOpaque(false);
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 5, 0);
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 1;
		bankex_data_panel.add(panel_11, gbc_panel_11);
		panel_11.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel bankex_cmp = new JLabel(bankexstr);
		bankex_cmp.setBorder(new LineBorder(new Color(0, 0, 0)));
		bankex_cmp.setForeground(new Color(255, 255, 255));
		bankex_cmp.setFont(new Font("Monospaced", Font.BOLD, 18));
		bankex_cmp.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(bankex_cmp);
		
		JPanel panel_12 = new JPanel();
		panel_12.setOpaque(false);
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 0;
		gbc_panel_12.gridy = 2;
		bankex_data_panel.add(panel_12, gbc_panel_12);
		panel_12.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel bankex_low = new JLabel(bankexlowrange);
		bankex_low.setBorder(new LineBorder(new Color(0, 0, 0)));
		bankex_low.setForeground(new Color(255, 255, 255));
		bankex_low.setFont(new Font("Monospaced", Font.BOLD, 18));
		bankex_low.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(bankex_low);
		
		
		//Midcap
		JPanel midcap_data_panel = new JPanel();
		midcap_data_panel.setOpaque(false);
		midcap_data_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Data_panel.add(midcap_data_panel);
		GridBagLayout gbl_midcap_data_panel = new GridBagLayout();
		gbl_midcap_data_panel.columnWidths = new int[]{0, 0};
		gbl_midcap_data_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_midcap_data_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_midcap_data_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		midcap_data_panel.setLayout(gbl_midcap_data_panel);
		
		JPanel panel_10_1 = new JPanel();
		panel_10_1.setOpaque(false);
		GridBagConstraints gbc_panel_10_1 = new GridBagConstraints();
		gbc_panel_10_1.fill = GridBagConstraints.BOTH;
		gbc_panel_10_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10_1.gridx = 0;
		gbc_panel_10_1.gridy = 0;
		midcap_data_panel.add(panel_10_1, gbc_panel_10_1);
		panel_10_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel midcap_high = new JLabel(midcapuprange);
		midcap_high.setBorder(new LineBorder(new Color(0, 0, 0)));
		midcap_high.setForeground(new Color(255, 255, 255));
		midcap_high.setFont(new Font("Monospaced", Font.BOLD, 18));
		midcap_high.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10_1.add(midcap_high);
		
		JPanel panel_11_1 = new JPanel();
		panel_11_1.setOpaque(false);
		GridBagConstraints gbc_panel_11_1 = new GridBagConstraints();
		gbc_panel_11_1.fill = GridBagConstraints.BOTH;
		gbc_panel_11_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_11_1.gridx = 0;
		gbc_panel_11_1.gridy = 1;
		midcap_data_panel.add(panel_11_1, gbc_panel_11_1);
		panel_11_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel midcap_cmp = new JLabel(midcapstr);
		midcap_cmp.setBorder(new LineBorder(new Color(0, 0, 0)));
		midcap_cmp.setForeground(new Color(255, 255, 255));
		midcap_cmp.setFont(new Font("Monospaced", Font.BOLD, 18));
		midcap_cmp.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11_1.add(midcap_cmp);
		
		JPanel panel_12_1 = new JPanel();
		panel_12_1.setOpaque(false);
		GridBagConstraints gbc_panel_12_1 = new GridBagConstraints();
		gbc_panel_12_1.fill = GridBagConstraints.BOTH;
		gbc_panel_12_1.gridx = 0;
		gbc_panel_12_1.gridy = 2;
		midcap_data_panel.add(panel_12_1, gbc_panel_12_1);
		panel_12_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel midcap_low = new JLabel(midcaplowrange);
		midcap_low.setBorder(new LineBorder(new Color(0, 0, 0)));
		midcap_low.setForeground(new Color(255, 255, 255));
		midcap_low.setFont(new Font("Monospaced", Font.BOLD, 18));
		midcap_low.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12_1.add(midcap_low);
		
		
		//FinNifty
		JPanel finnifty_data_panel = new JPanel();
		finnifty_data_panel.setOpaque(false);
		finnifty_data_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Data_panel.add(finnifty_data_panel);
		GridBagLayout gbl_finnifty_data_panel = new GridBagLayout();
		gbl_finnifty_data_panel.columnWidths = new int[]{0, 0};
		gbl_finnifty_data_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_finnifty_data_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_finnifty_data_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		finnifty_data_panel.setLayout(gbl_finnifty_data_panel);
		
		JPanel panel_10_2 = new JPanel();
		panel_10_2.setOpaque(false);
		GridBagConstraints gbc_panel_10_2 = new GridBagConstraints();
		gbc_panel_10_2.fill = GridBagConstraints.BOTH;
		gbc_panel_10_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10_2.gridx = 0;
		gbc_panel_10_2.gridy = 0;
		finnifty_data_panel.add(panel_10_2, gbc_panel_10_2);
		panel_10_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel finnifty_high = new JLabel(finniftyuprange);
		finnifty_high.setBorder(new LineBorder(new Color(0, 0, 0)));
		finnifty_high.setForeground(new Color(255, 255, 255));
		finnifty_high.setFont(new Font("Monospaced", Font.BOLD, 18));
		finnifty_high.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10_2.add(finnifty_high);
		
		JPanel panel_11_2 = new JPanel();
		panel_11_2.setOpaque(false);
		GridBagConstraints gbc_panel_11_2 = new GridBagConstraints();
		gbc_panel_11_2.fill = GridBagConstraints.BOTH;
		gbc_panel_11_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_11_2.gridx = 0;
		gbc_panel_11_2.gridy = 1;
		finnifty_data_panel.add(panel_11_2, gbc_panel_11_2);
		panel_11_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel finnifty_cmp = new JLabel(finniftystr);
		finnifty_cmp.setBorder(new LineBorder(new Color(0, 0, 0)));
		finnifty_cmp.setForeground(new Color(255, 255, 255));
		finnifty_cmp.setFont(new Font("Monospaced", Font.BOLD, 18));
		finnifty_cmp.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11_2.add(finnifty_cmp);
		
		JPanel panel_12_2 = new JPanel();
		panel_12_2.setOpaque(false);
		GridBagConstraints gbc_panel_12_2 = new GridBagConstraints();
		gbc_panel_12_2.fill = GridBagConstraints.BOTH;
		gbc_panel_12_2.gridx = 0;
		gbc_panel_12_2.gridy = 2;
		finnifty_data_panel.add(panel_12_2, gbc_panel_12_2);
		panel_12_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel finnifty_low = new JLabel(finniftylowrange);
		finnifty_low.setBorder(new LineBorder(new Color(0, 0, 0)));
		finnifty_low.setForeground(new Color(255, 255, 255));
		finnifty_low.setFont(new Font("Monospaced", Font.BOLD, 18));
		finnifty_low.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12_2.add(finnifty_low);
		
		
		//BankNifty
		JPanel banknifty_data_panel = new JPanel();
		banknifty_data_panel.setOpaque(false);
		banknifty_data_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Data_panel.add(banknifty_data_panel);
		GridBagLayout gbl_banknifty_data_panel = new GridBagLayout();
		gbl_banknifty_data_panel.columnWidths = new int[]{0, 0};
		gbl_banknifty_data_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_banknifty_data_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_banknifty_data_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		banknifty_data_panel.setLayout(gbl_banknifty_data_panel);
		
		JPanel panel_10_3 = new JPanel();
		panel_10_3.setOpaque(false);
		GridBagConstraints gbc_panel_10_3 = new GridBagConstraints();
		gbc_panel_10_3.fill = GridBagConstraints.BOTH;
		gbc_panel_10_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10_3.gridx = 0;
		gbc_panel_10_3.gridy = 0;
		banknifty_data_panel.add(panel_10_3, gbc_panel_10_3);
		panel_10_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel banknifty_high = new JLabel(bankniftyuprange);
		banknifty_high.setBorder(new LineBorder(new Color(0, 0, 0)));
		banknifty_high.setForeground(new Color(255, 255, 255));
		banknifty_high.setFont(new Font("Monospaced", Font.BOLD, 18));
		banknifty_high.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10_3.add(banknifty_high);
		
		JPanel panel_11_3 = new JPanel();
		panel_11_3.setOpaque(false);
		GridBagConstraints gbc_panel_11_3 = new GridBagConstraints();
		gbc_panel_11_3.fill = GridBagConstraints.BOTH;
		gbc_panel_11_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_11_3.gridx = 0;
		gbc_panel_11_3.gridy = 1;
		banknifty_data_panel.add(panel_11_3, gbc_panel_11_3);
		panel_11_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel banknifty_cmp = new JLabel(bankniftystr);
		banknifty_cmp.setBorder(new LineBorder(new Color(0, 0, 0)));
		banknifty_cmp.setForeground(new Color(255, 255, 255));
		banknifty_cmp.setFont(new Font("Monospaced", Font.BOLD, 18));
		banknifty_cmp.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11_3.add(banknifty_cmp);
		
		JPanel panel_12_3 = new JPanel();
		panel_12_3.setOpaque(false);
		GridBagConstraints gbc_panel_12_3 = new GridBagConstraints();
		gbc_panel_12_3.fill = GridBagConstraints.BOTH;
		gbc_panel_12_3.gridx = 0;
		gbc_panel_12_3.gridy = 2;
		banknifty_data_panel.add(panel_12_3, gbc_panel_12_3);
		panel_12_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel banknifty_low = new JLabel(bankniftylowrange);
		banknifty_low.setBorder(new LineBorder(new Color(0, 0, 0)));
		banknifty_low.setForeground(new Color(255, 255, 255));
		banknifty_low.setFont(new Font("Monospaced", Font.BOLD, 18));
		banknifty_low.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12_3.add(banknifty_low);
		
		
		//Mifty50
		JPanel nifty50_data_panel = new JPanel();
		nifty50_data_panel.setOpaque(false);
		nifty50_data_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Data_panel.add(nifty50_data_panel);
		GridBagLayout gbl_nifty50_data_panel = new GridBagLayout();
		gbl_nifty50_data_panel.columnWidths = new int[]{0, 0};
		gbl_nifty50_data_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_nifty50_data_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_nifty50_data_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		nifty50_data_panel.setLayout(gbl_nifty50_data_panel);
		
		JPanel panel_10_4 = new JPanel();
		panel_10_4.setOpaque(false);
		GridBagConstraints gbc_panel_10_4 = new GridBagConstraints();
		gbc_panel_10_4.fill = GridBagConstraints.BOTH;
		gbc_panel_10_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10_4.gridx = 0;
		gbc_panel_10_4.gridy = 0;
		nifty50_data_panel.add(panel_10_4, gbc_panel_10_4);
		panel_10_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel nifty50_high = new JLabel(nifty50uprange);
		nifty50_high.setBorder(new LineBorder(new Color(0, 0, 0)));
		nifty50_high.setForeground(new Color(255, 255, 255));
		nifty50_high.setFont(new Font("Monospaced", Font.BOLD, 18));
		nifty50_high.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10_4.add(nifty50_high);
		
		JPanel panel_11_4 = new JPanel();
		panel_11_4.setOpaque(false);
		GridBagConstraints gbc_panel_11_4 = new GridBagConstraints();
		gbc_panel_11_4.fill = GridBagConstraints.BOTH;
		gbc_panel_11_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_11_4.gridx = 0;
		gbc_panel_11_4.gridy = 1;
		nifty50_data_panel.add(panel_11_4, gbc_panel_11_4);
		panel_11_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel nifty50_cmp = new JLabel(nifty50str);
		nifty50_cmp.setBorder(new LineBorder(new Color(0, 0, 0)));
		nifty50_cmp.setForeground(new Color(255, 255, 255));
		nifty50_cmp.setFont(new Font("Monospaced", Font.BOLD, 18));
		nifty50_cmp.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11_4.add(nifty50_cmp);
		
		JPanel panel_12_4 = new JPanel();
		panel_12_4.setOpaque(false);
		GridBagConstraints gbc_panel_12_4 = new GridBagConstraints();
		gbc_panel_12_4.fill = GridBagConstraints.BOTH;
		gbc_panel_12_4.gridx = 0;
		gbc_panel_12_4.gridy = 2;
		nifty50_data_panel.add(panel_12_4, gbc_panel_12_4);
		panel_12_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel nifty50_low = new JLabel(nifty50lowrange);
		nifty50_low.setBorder(new LineBorder(new Color(0, 0, 0)));
		nifty50_low.setForeground(new Color(255, 255, 255));
		nifty50_low.setFont(new Font("Monospaced", Font.BOLD, 18));
		nifty50_low.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12_4.add(nifty50_low);
		
		//Sensex
		JPanel sensex_data_panel = new JPanel();
		sensex_data_panel.setOpaque(false);
		sensex_data_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Data_panel.add(sensex_data_panel);
		GridBagLayout gbl_sensex_data_panel = new GridBagLayout();
		gbl_sensex_data_panel.columnWidths = new int[]{0, 0};
		gbl_sensex_data_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_sensex_data_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_sensex_data_panel.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		sensex_data_panel.setLayout(gbl_sensex_data_panel);
		
		JPanel panel_10_5 = new JPanel();
		panel_10_5.setOpaque(false);
		GridBagConstraints gbc_panel_10_5 = new GridBagConstraints();
		gbc_panel_10_5.fill = GridBagConstraints.BOTH;
		gbc_panel_10_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10_5.gridx = 0;
		gbc_panel_10_5.gridy = 0;
		sensex_data_panel.add(panel_10_5, gbc_panel_10_5);
		panel_10_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel sensex_high = new JLabel(sensexuprange);
		sensex_high.setBorder(new LineBorder(new Color(0, 0, 0)));
		sensex_high.setForeground(new Color(255, 255, 255));
		sensex_high.setFont(new Font("Monospaced", Font.BOLD, 18));
		sensex_high.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10_5.add(sensex_high);
		
		JPanel panel_11_5 = new JPanel();
		panel_11_5.setOpaque(false);
		GridBagConstraints gbc_panel_11_5 = new GridBagConstraints();
		gbc_panel_11_5.fill = GridBagConstraints.BOTH;
		gbc_panel_11_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_11_5.gridx = 0;
		gbc_panel_11_5.gridy = 1;
		sensex_data_panel.add(panel_11_5, gbc_panel_11_5);
		panel_11_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel sensex_cmp = new JLabel(sensexstr);
		sensex_cmp.setBorder(new LineBorder(new Color(0, 0, 0)));
		sensex_cmp.setForeground(new Color(255, 255, 255));
		sensex_cmp.setFont(new Font("Monospaced", Font.BOLD, 18));
		sensex_cmp.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11_5.add(sensex_cmp);
		
		JPanel panel_12_5 = new JPanel();
		panel_12_5.setOpaque(false);
		GridBagConstraints gbc_panel_12_5 = new GridBagConstraints();
		gbc_panel_12_5.fill = GridBagConstraints.BOTH;
		gbc_panel_12_5.gridx = 0;
		gbc_panel_12_5.gridy = 2;
		sensex_data_panel.add(panel_12_5, gbc_panel_12_5);
		panel_12_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel sensex_low = new JLabel(sensexlowrange);
		sensex_low.setBorder(new LineBorder(new Color(0, 0, 0)));
		sensex_low.setForeground(new Color(255, 255, 255));
		sensex_low.setFont(new Font("Monospaced", Font.BOLD, 18));
		sensex_low.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12_5.add(sensex_low);
		//Sensex
		
		
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
		Bankex_label.setForeground(new Color(254, 254, 205));
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
		Midcap_label.setForeground(new Color(254, 254, 205));
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
		FinNifty_label.setForeground(new Color(254, 254, 205));
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
		BankNifty_label.setForeground(new Color(254, 254, 205));
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
		Nifty50_label.setForeground(new Color(254, 254, 205));
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
		Sensex_label.setForeground(new Color(254, 254, 205));
		Sensex_label.setFont(new Font("Georgia", Font.BOLD, 18));
		Sensex_label.setAlignmentX(0.5f);
		nm_pnl_6.add(Sensex_label);
		tab_pane.setBackgroundAt(0, new Color(0, 255, 0));
		
		JPanel Report_panel = new JPanel();
		Report_panel.setOpaque(false);
		tab_pane.addTab("report", null, Report_panel, null);
		Report_panel.setLayout(new CardLayout(0, 0));
		
		KGradientPanel report_gradient = new KGradientPanel();
		report_gradient.setkStartColor(new Color(9, 9, 9));
		report_gradient.setkEndColor(new Color(0, 20, 32));
		Report_panel.add(report_gradient, "name_33427031160699");
		report_gradient.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(6, 6, 990, 190);
		report_gradient.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel yest_rprt = new JPanel();
		yest_rprt.setBackground(new Color(0, 0, 0));
		yest_rprt.setOpaque(false);
		panel.add(yest_rprt);
		yest_rprt.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 6, 318, 178);
		yest_rprt.add(panel_1);
		panel_1.setLayout(null);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.setBounds(6, 5, 306, 167);
		panel_1.add(gradientPanel_1);
		
		JPanel today_rprt = new JPanel();
		today_rprt.setOpaque(false);
		panel.add(today_rprt);
		today_rprt.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 6, 318, 178);
		today_rprt.add(panel_2);
		panel_2.setLayout(null);
		
		KGradientPanel gradientPanel_2 = new KGradientPanel();
		gradientPanel_2.setkStartColor(new Color(0, 0, 255));
		gradientPanel_2.setBounds(6, 6, 306, 166);
		panel_2.add(gradientPanel_2);
		
		JPanel weekly_rprt = new JPanel();
		weekly_rprt.setOpaque(false);
		panel.add(weekly_rprt);
		weekly_rprt.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(6, 6, 318, 178);
		weekly_rprt.add(panel_3);
		panel_3.setLayout(null);
		
		KGradientPanel gradientPanel_3 = new KGradientPanel();
		gradientPanel_3.setBounds(6, 6, 306, 166);
		panel_3.add(gradientPanel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(779, 423, 217, 58);
		report_gradient.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("Report");
		btnNewButton.addMouseListener(new MouseAdapter() {
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocalTime checkTime = LocalTime.of(15, 25);
				LocalTime currentTime = LocalTime.now();
				if (currentTime.isAfter(checkTime)) {
					try {
						Storage_operations.Createbasefile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//green
				    panel_6.setBackground(new Color(0, 255, 0));
				    
				} else {
				    panel_6.setBackground(new Color(255, 0, 0));
				}
				
				
				;
			}
		});
		panel_4.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		panel_6 = new JPanel();
		String filePath = "C:/Users/Eshaan Zahid/eclipse-workspace/StockAnalyser/data/report/"+date+".txt";
        Path path = Paths.get(filePath);
        
		if (!Files.exists(path)) {
			panel_6.setBackground(new Color(255, 0, 0));
		}
		else {
			panel_6.setBackground(new Color(0, 255, 0));
		}
		panel_6.setBounds(6, 6, 96, 46);
		panel_5.add(panel_6);
	}
}
