package com.driver;

public class Food {
	    private int id;
	    private String name;
	    private double price;

	    public Food() {
	        // Default constructor
	    	// your code goes here
			this.id = id;
			this.name = name;
			this.price = price;

	    }

	    public Food(int id, String name, double price) {
	    	// your code goes here
			this.id = id;
			this.name = name;
			this.price = price;
	    }

	    // Getters and Setters
	    public int getId() {
	    	// your code goes here
	        return id;
	    }

	    public void setId(int id) {
	    	// your code goes here
			this.id = id;
	    }

	    public String getName() {
	    	// your code goes here
	        return name;
	    }

	    public void setName(String name) {
	    	// your code goes here
			this.name = name;
	    }


	    public double getPrice() {
	    	// your code goes here
	        return price;
	    }

	    public void setPrice(double price) {
	    	// your code goes here
			this.price = price;
	    }
}
