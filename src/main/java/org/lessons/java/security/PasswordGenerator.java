package org.lessons.java.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     //valori 
	String name;
	String username;
	String favoriteColor;
	byte day;
	byte month;
	short year;
	
	//definizione valori
	name = "Nicolò";
	username = "De Giorgi";
    favoriteColor = "Arancione";
    day = 26;
    month = 06;
    year = 1999;
    
    //somma data di nascia
    int somma = day + month + year;
   
    //generatore password 
   String generatePass = name + "-" + username + "-" + favoriteColor + "-" + somma;
   String password = "Password: " + generatePass;
   
    
    System.out.printf (password);
    
    
    
    
	
			
	
	 
	
		
	}

}
