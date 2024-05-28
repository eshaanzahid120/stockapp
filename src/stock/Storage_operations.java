package stock;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Storage_operations {
	
	public static void Createbasefile() throws IOException {
		String date = Function.getdate();
        String filePath = "C:/Users/Eshaan Zahid/eclipse-workspace/StockAnalyser/data/report/"+date+".txt";
        Path path = Paths.get(filePath);
        
        // Check if the file exists
        
        
        if (!Files.exists(path)) {
                Files.createFile(path);
                //System.out.println("File created: " + path.getFileName());
        } else {
            System.out.println("File already exists.");
        }
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Createbasefile();
		String date = Function.getdate();
		System.out.println(date);

	}

}
