package knapsack;

public class Node {
	String quote;
	double price;
	double totalPrice = 0; // the price of current portfolio
	double value;
	boolean buy;
	Node left;
	Node right;

	public Node(){}
	
	public Node(String quoteName, double quotePrice, double quoteValue, double total){
		this.quote = quoteName;
		this.price = quotePrice;
		this.value = quoteValue;
		this.totalPrice = total + quotePrice;
		this.left = null;
		this.right = null;
		this.buy = true;
	}
	
	public Node(String quoteName, boolean action){
		this.quote = quoteName;
		this.buy = action;
	}

	public void setBuyFalse(){
		this.buy = false;
		this.totalPrice-= this.price;
	}
	
	public void printNode(){
		System.out.println(quote);
		System.out.println(price);
		System.out.println(totalPrice);
		System.out.println(value);
		System.out.println("");
	}
	
	
}