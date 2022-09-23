/*
Program :Bean class for Items 
Code: Krushikesh
Date: 22 September 2022
*/

class Items
{
	//instance variable
	private String name;
	private int qty;
	private double totalPrice;
	
	Items()// no arg constructor
	{
		
	}
	
	//paramaterized constructor
	Items(String name, int qty, double unitPrice)
	{
		this.name=name;
		this.qty=qty;
		this.totalPrice= qty* unitPrice;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	
	public int getQty()
	{
		return this.qty;
	}
	
	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice=totalPrice;
	}
	
	public double getTotalPrice()
	{
		return this.totalPrice;
	}
	
}