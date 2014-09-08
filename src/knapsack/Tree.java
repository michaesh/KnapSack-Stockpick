package knapsack;


public class Tree implements TreeInterface{
	private Node root;
	private int height=0;
	private int i = 0;
	private double budget = 0.0;
	//static private int numCount = 0;
	
	public Tree(){}
	
	public Node getRoot(){
		return this.root;
	}
	
	public void constructTree(String[] data, int numLine, double portfolioBudget){
		height = numLine/3;
		budget = portfolioBudget;
		root = new Node(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),0.00);
		createNode(data,root,1);
	}
	
	private void createNode(String[]data, Node currNode, int i){
		if(i>=height){
			return;
		}
		if((currNode.totalPrice+Double.parseDouble(data[i*3+1]))<budget){
			currNode.left = new Node(data[i*3],Double.parseDouble(data[i*3+1]),Double.parseDouble(data[i*3+2]),currNode.totalPrice);
			createNode(data,currNode.left,i+1);
		}
		else{
			currNode.left = null;
		}
		currNode.right = new Node(data[i*3],Double.parseDouble(data[i*3+1]),Double.parseDouble(data[i*3+2]),currNode.totalPrice);
		currNode.right.setBuyFalse();
		createNode(data,currNode.right,i+1);
		return;
	}
	

	public void printTree(){
		printCall(root);
	}
	
	private void printCall(Node printNode){
		if(printNode==null){
			System.out.println(i+": Node is null\n");
			i++;
			return;
		}
		
		printNode.printNode();
		printCall(printNode.left);
		printCall(printNode.right);
		return;
	}


}
