package stock;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Function 
{
	public static void getData() throws IOException {

	    String url1="https://www.nseindia.com/"; // for nse data
	    String url2="https://www.google.com/finance/quote/INDIA_VIX:INDEXNSE?sa=X&ved=2ahUKEwjb_8ODk_OFAxV9SfUHHRspAQwQ3ecFegQIJRAf";
	    String url3="https://www.google.com/finance/quote/SENSEX:INDEXBOM";
	    String url4="https://www.google.com/finance/quote/BSE-BANK:INDEXBOM?sa=X&ved=2ahUKEwiH14rhl_OFAxWGy6ACHeaYDPwQ3ecFegQIJBAf";
	    
	    Document doc = Jsoup.connect(url1).get();
	    Document doc2 = Jsoup.connect(url2).get();
	    Document doc3 = Jsoup.connect(url3).get();
	    Document doc4 = Jsoup.connect(url4).get();
	     
	    Elements vixelement=doc2.select(".YMlKec.fxKbKc");
	    String vix=vixelement.select(".YMlKec.fxKbKc").text();
	    System.out.println("india vix - "+vix);
	    
	    
	    //---------------------------------------------------------------
	    
	    Elements sensexelement=doc3.select(".YMlKec.fxKbKc");
	    String sensex=sensexelement.select(".YMlKec.fxKbKc").text();
	    System.out.println("Sensex - "+sensex);
	    
	    Elements bankexelement=doc4.select(".YMlKec.fxKbKc");
	    String bankex=bankexelement.select(".YMlKec.fxKbKc").text();
	    System.out.println("Bankex - "+bankex);

	    
	    //-----------------------------------------------------------------
	    
	    
	    Elements element1=doc.select("#tabList_NIFTY50");
	    String nif50 = element1.select(".tb_val").text();
	    System.out.println("Nifty 50 - "+nif50);
	    
	    Elements element2=doc.select("#tabList_NIFTYFINANCIALSERVICES");
	    String finnf = element2.select(".tb_val").text();
	    System.out.println("Fin Nifty - "+finnf);
	    
	    Elements element3=doc.select("#tabList_NIFTYMIDCAPSELECT");
	    String midnf = element3.select(".tb_val").text();
	    System.out.println("Midcap Nifty - "+midnf);
	    
	    Elements element4=doc.select("#tabList_NIFTYBANK");
	    String bnknf = element4.select(".tb_val").text();
	    System.out.println("Bank Nifty - "+bnknf);
	    
	    //System.out.println(elements.html());
	  }
	
	public static String getupRange(String vix,String index)throws IOException {
	    
	    //String vixStr = vix.replace(".", "");
	    
	    String indexStr = index.replace(",", "");
	    String indexStr2 = indexStr.replace(".", "");
	    
	    float floatvix = Float.parseFloat(vix);
	    
	    //double vixint = Integer.parseInt(vix);
	    double indexint = Integer.parseInt(indexStr2);
	    indexint = indexint/100;
	    
	    double up = (float) (indexint+(((floatvix/19.10)*indexint)/100));
	    int intup = (int) up;
	    int roundedupValue = Math.round(intup / 100.0f) * 100;
	    String upstr = String.valueOf(roundedupValue);
	    return upstr;
	  }
	
	public static String getlowRange(String vix,String index)throws IOException {
	    
	    String indexStr = index.replace(",", "");
	    String indexStr2 = indexStr.replace(".", "");
	    
	    float floatvix = Float.parseFloat(vix);
	    
	    //double vixint = Integer.parseInt(vix);
	    double indexint = Integer.parseInt(indexStr2);
	    indexint = indexint/100;
	    
	    double low = (float) (indexint-(((floatvix/19.10)*indexint)/100));
	    int intlow = (int) low;
	    int roundedlowValue = Math.round(intlow / 100.0f) * 100;
	    String lowstr = String.valueOf(roundedlowValue);
	    return lowstr;
	  }
	
	public static String getvix()throws IOException{
	    String url2="https://www.google.com/finance/quote/INDIA_VIX:INDEXNSE?sa=X&ved=2ahUKEwjb_8ODk_OFAxV9SfUHHRspAQwQ3ecFegQIJRAf";
	    Document doc2 = Jsoup.connect(url2).get();
	    Elements vixelement=doc2.select(".YMlKec.fxKbKc");
	    String vix=vixelement.select(".YMlKec.fxKbKc").text();
	    return vix;
	  }
	  
	  public static String getbankex()throws IOException{
	    String url4="https://www.google.com/finance/quote/BSE-BANK:INDEXBOM?sa=X&ved=2ahUKEwiH14rhl_OFAxWGy6ACHeaYDPwQ3ecFegQIJBAf";
	    Document doc4 = Jsoup.connect(url4).get();
	    Elements bankexelement=doc4.select(".YMlKec.fxKbKc");
	    String bankex=bankexelement.select(".YMlKec.fxKbKc").text();
	    return bankex;
	  }
	  
	  public static String getmidcap()throws IOException{
	    String url1="https://www.nseindia.com/"; // for nse data
	    Document doc = Jsoup.connect(url1).get();
	    Elements element3=doc.select("#tabList_NIFTYMIDCAPSELECT");
	    String midnf = element3.select(".tb_val").text();
	    return midnf;
	  }
	  
	  public static String getfinnifty()throws IOException{
	    String url1="https://www.nseindia.com/"; // for nse data
	    Document doc = Jsoup.connect(url1).get();
	    Elements element2=doc.select("#tabList_NIFTYFINANCIALSERVICES");
	    String finnf = element2.select(".tb_val").text();
	    return finnf;
	  }
	  
	  public static String getbanknifty()throws IOException{
	    String url1="https://www.nseindia.com/"; // for nse data
	    Document doc = Jsoup.connect(url1).get();
	    Elements element4=doc.select("#tabList_NIFTYBANK");
	    String bnknf = element4.select(".tb_val").text();
	    return bnknf;
	  }
	  
	  public static String getnifty()throws IOException{
	    String url1="https://www.nseindia.com/"; // for nse data
	    Document doc = Jsoup.connect(url1).get();
	    Elements element1=doc.select("#tabList_NIFTY50");
	    String nif50 = element1.select(".tb_val").text();
	    return nif50;
	  }
	  
	  public static String getsensex()throws IOException{
	    String url3="https://www.google.com/finance/quote/SENSEX:INDEXBOM";
	    Document doc3 = Jsoup.connect(url3).get();
	    Elements sensexelement=doc3.select(".YMlKec.fxKbKc");
	    String sensex=sensexelement.select(".YMlKec.fxKbKc").text();
	    return sensex;
	  }
	  
	  
	  //time handling
	  
	  
	  public static String getsec()throws IOException{
	    LocalTime currentTime = LocalTime.now();
	    int sec = currentTime.getSecond();
	    String str = String.valueOf(sec);
	    return str;
	  }
	  
	  public static String getmin()throws IOException{
	    LocalTime currentTime = LocalTime.now();
	    int minute = currentTime.getMinute();
	    String str = String.valueOf(minute);
	    return str;
	  }
	  
	  public static String gethrs()throws IOException{
	    LocalTime currentTime = LocalTime.now();
	    int hours = currentTime.getHour();
	    String str = String.valueOf(hours);
	    return str;
	  }
	  
	  public static String getdate() throws IOException {
	      LocalDate currentDate = LocalDate.now();
	      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	      
	      // Format the date using the formatter
	      String formattedDate = currentDate.format(formatter);
	      //String temp = "29-05-2024";
	    return formattedDate;
	    //return temp;
	  }
	  
	  
	  //--------------------
	  
	  
	  public static void main(String[] args) throws IOException {
		    
		    //System.out.println("hello");
		    getData();
		    //getupRange("12.10","55,409");
		  }
}
