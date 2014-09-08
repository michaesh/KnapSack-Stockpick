package knapsack;

import java.io.IOException;

public class Ground {
	public static void main(String args[]) throws IOException{
		ReadFile myFile;
		String[] data;
		data = new String[1000];
		int numLine;

		//Read files from quotes.txt
		myFile = new ReadFile("quotes.txt");
		myFile.OpenFile();
		numLine = myFile.Read(data);


		//Construct tree from data
		Tree myTree;
		myTree = new Tree();
		myTree.constructTree(data, numLine);
		
		myTree.printTree();
		return;
	}
}
