package Implementations;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	

	    public static String readFile(String filePath) throws IOException {

	        String str = "";
	        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
	        str = bufferedReader.readLine();
	        bufferedReader.close();
	        return str;

	    }

	
	    public static String writeFile(String filePath,String str) throws IOException {

	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
	        bufferedWriter.write(str);
	        bufferedWriter.close();
	        return "\n File is written ...";

	    }
	}


