package knapsack;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
	private String path;
	private FileReader myReader;
	
	public ReadFile(String fileName){
		path = fileName;
	}
	
	public boolean OpenFile(){
		FileReader fr = null;
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myReader = fr;
		return true;
	}
	
	public int Read(String[] textData) throws IOException{
		BufferedReader textReader = new BufferedReader(myReader);
		int i=0;
		String temp;
		
		temp = textReader.readLine();
		while(temp!=null){
			//PrintFile(i, temp);
			textData[i]=temp;
			i++;
			try {
				temp = textReader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			textReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Compelte Read()");
		return i;
	}
	
	public void PrintFile(int i, String temp){
		System.out.print(i+" ");
		System.out.println(temp);
	}
}
