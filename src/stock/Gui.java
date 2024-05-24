package stock;

import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	  
	    String currentminute;
	    String currentsecond;
	    String currenthour;
	    String formattedTime;
	    private JLabel time;
	    
	    private JLabel sensexcmp;
	    private JLabel bankexcmp;
	    private JLabel nifty50cmp;
	    private JLabel midcapcmp;
	    private JLabel finniftycmp;
	    private JLabel bankniftycmp;
	    
	   JLabel bankexlow;
	  JLabel midcaplow;
	  JLabel finniftylow;
	  JLabel bankniftylow;
	  JLabel nifty50low;
	  JLabel sensexlow;
	  
	  
	  
	  JLabel bankexup;
	  JLabel midcapup;
	  JLabel finniftyup;
	  JLabel bankniftyup;
	  JLabel nifty50up;
	  JLabel sensexup;
	    
	    
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
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Gui frame = new Gui();
					frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void updateStockData() throws IOException {
        // Fetch updated data from the Main class
        vixstr = Function.getvix();
        bankexstr = Function.getbankex();
        sensexstr = Function.getsensex();
        bankniftystr = Function.getbanknifty();
        nifty50str = Function.getnifty();
        finniftystr = Function.getfinnifty();
        midcapstr = Function.getmidcap();
        
        currentminute = Function.getmin();
        currentsecond = Function.getsec();
        currenthour = Function.gethrs();

        time.setText(""+currenthour+" : "+currentminute+" : "+currentsecond);
        System.out.println("updated");
        
    }
	
	private void calculate_data() throws IOException{
	      // print data in gui
	      System.out.println("hello i ran");
	      
	      sensexcmp.setText(sensexstr);
	      bankexcmp.setText(bankexstr);
	      bankniftycmp.setText(bankniftystr);
	      finniftycmp.setText(finniftystr);
	      nifty50cmp.setText(nifty50str);
	      midcapcmp.setText(midcapstr);
	      
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
	    
	      bankexlow.setText(bankexlowrange);
	    midcaplow.setText(midcaplowrange);
	    finniftylow.setText(finniftylowrange);
	    bankniftylow.setText(bankniftylowrange);
	    nifty50low.setText(nifty50lowrange);
	    sensexlow.setText(sensexlowrange);
	    
	    bankexup.setText(bankexuprange);
	    midcapup.setText(midcapuprange);
	    finniftyup.setText(finniftyuprange);
	    bankniftyup.setText(bankniftyuprange);
	    nifty50up.setText(nifty50uprange);
	    sensexup.setText(sensexuprange);
	    
	    }
	
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Gui() throws IOException 
	{
		JButton refresh_button = new JButton("refresh");
	    refresh_button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Perform refresh action here
	                // For example:
	              try {
	          updateStockData();
	          calculate_data();
	        } catch (IOException e1) {
	          e1.printStackTrace();
	        }
	          
	            }
	        });
	    
	    
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 425);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 39, 45));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		currentminute = Function.getmin();
		
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
		contentPane.setLayout(new MigLayout("", "[1px]", "[1px]"));
		contentPane.setLayout(new GridLayout(0, 49, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Vix - "+vixstr);
		lblNewLabel_1.setForeground(new Color(202, 210, 197));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("last updated -");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_2);
		
		time = new JLabel(currentminute);
		//time.setText("hello");
		time.setForeground(new Color(255, 128, 192));
		contentPane.add(time);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bankex");
		lblNewLabel_1_1.setForeground(new Color(202, 210, 197));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1);
		
		Panel panel = new Panel();
		contentPane.add(panel);
		
		Panel panel_5 = new Panel();
		contentPane.add(panel_5);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Midcap");
		lblNewLabel_1_1_1.setForeground(new Color(202, 210, 197));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1_1);
		
		Panel panel_6 = new Panel();
		contentPane.add(panel_6);
		
		Panel panel_1 = new Panel();
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Fin Nifty");
		lblNewLabel_1_1_2.setForeground(new Color(202, 210, 197));
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1_2);
		
		Panel panel_7 = new Panel();
		contentPane.add(panel_7);
		
		Panel panel_2 = new Panel();
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Bank Nifty");
		lblNewLabel_1_1_3.setForeground(new Color(202, 210, 197));
		lblNewLabel_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_3.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1_3);
		
		Panel panel_8 = new Panel();
		contentPane.add(panel_8);
		
		Panel panel_3 = new Panel();
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Nifty 50");
		lblNewLabel_1_1_4.setForeground(new Color(202, 210, 197));
		lblNewLabel_1_1_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_4.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1_4);
		
		Panel panel_9 = new Panel();
		contentPane.add(panel_9);
		
		Panel panel_4 = new Panel();
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Sensex");
		lblNewLabel_1_1_5.setForeground(new Color(202, 210, 197));
		lblNewLabel_1_1_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_5.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1_5);
		
		Panel panel_12 = new Panel();
		contentPane.add(panel_12);
		
		Panel panel_15 = new Panel();
		contentPane.add(panel_15);
		
		//-----------------------------------------------------------------------------------------------------------------------
		
		JLabel lblNewLabel = new JLabel("UP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(0, 255, 64));
		contentPane.add(lblNewLabel);
		
		Panel panel_16 = new Panel();
		contentPane.add(panel_16);
		
		bankexup = new JLabel(bankexuprange);
		bankexup.setForeground(Color.WHITE);
		contentPane.add(bankexup);
		
		midcapup = new JLabel(midcapuprange);
		midcapup.setForeground(Color.WHITE);
		contentPane.add(midcapup);
		
		finniftyup = new JLabel(finniftyuprange);
		finniftyup.setForeground(Color.WHITE);
		contentPane.add(finniftyup);
		
		bankniftyup = new JLabel(bankniftyuprange);
		bankniftyup.setForeground(Color.WHITE);
		contentPane.add(bankniftyup);
		
		nifty50up = new JLabel(nifty50uprange);
		nifty50up.setForeground(Color.WHITE);
		contentPane.add(nifty50up);
		
		sensexup = new JLabel(sensexuprange);
		sensexup.setForeground(Color.WHITE);
		contentPane.add(sensexup);
		
		Panel panel_13 = new Panel();
		contentPane.add(panel_13);
		
		Panel panel_10 = new Panel();
		contentPane.add(panel_10);
		
		// cmp section------------------------------------------------------------------------------------------------------------
		
		JLabel lblCmp = new JLabel("CMP");
		lblCmp.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCmp.setForeground(new Color(255, 255, 0));
		contentPane.add(lblCmp);
		
		bankexcmp = new JLabel(bankexstr);
		bankexcmp.setForeground(new Color(255, 255, 255));
		contentPane.add(bankexcmp);
		
		midcapcmp = new JLabel(midcapstr);
		midcapcmp.setForeground(Color.WHITE);
		contentPane.add(midcapcmp);
		
		finniftycmp = new JLabel(finniftystr);
		finniftycmp.setForeground(Color.WHITE);
		contentPane.add(finniftycmp);
		
		bankniftycmp = new JLabel(bankniftystr);
		bankniftycmp.setForeground(Color.WHITE);
		contentPane.add(bankniftycmp);
		
		nifty50cmp = new JLabel(nifty50str);
		nifty50cmp.setForeground(Color.WHITE);
		contentPane.add(nifty50cmp);
		
		sensexcmp = new JLabel(sensexstr);
		sensexcmp.setForeground(Color.WHITE);
		contentPane.add(sensexcmp);
		
		Panel panel_14 = new Panel();
		contentPane.add(panel_14);
		
		Panel panel_11 = new Panel();
		contentPane.add(panel_11);
		
		//------------------------------------------------------------------------------------------------------
		
		JLabel lblLow = new JLabel("Low");
		lblLow.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblLow.setBackground(new Color(255, 255, 255));
		lblLow.setForeground(new Color(255, 0, 0));
		contentPane.add(lblLow);
		
		bankexlow = new JLabel(bankexlowrange);
		bankexlow.setForeground(Color.WHITE);
		contentPane.add(bankexlow);
		
		midcaplow = new JLabel(midcaplowrange);
		midcaplow.setForeground(Color.WHITE);
		contentPane.add(midcaplow);
		
		finniftylow = new JLabel(finniftylowrange);
		finniftylow.setForeground(Color.WHITE);
		contentPane.add(finniftylow);
		
		bankniftylow = new JLabel(bankniftylowrange);
		bankniftylow.setForeground(Color.WHITE);
		contentPane.add(bankniftylow);
		
		nifty50low = new JLabel(nifty50lowrange);
		nifty50low.setForeground(Color.WHITE);
		contentPane.add(nifty50low);
		
		sensexlow = new JLabel(sensexlowrange);
		sensexlow.setForeground(Color.WHITE);
		contentPane.add(sensexlow);
		
		//-------------------------------------------------
		
		
		//---button----------------------------------------------------------------------------------------------------------
		
		
		contentPane.add(refresh_button);
	}

}
