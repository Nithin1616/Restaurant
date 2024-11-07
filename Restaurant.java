package practice;

import java.util.*;
class Menu{
  static int m1,v1,v11,w1,v2,v12,v13,w2,bottle,q,w3,n1,price,amount,offer;
  static double total,gst;
	static String i[];
  void Menu1() {
		 System.out.println("Nitin's Foods");
		 System.out.println("1.veg");
		 System.out.println("2.nonveg");
		 System.out.println("select any one of the options above");
	}
void veg()
{
	System.out.println("veg course");
	System.out.println("1.Starters");
	System.out.println("2.Main course");
	System.out.println("3.Desserts");
}


	void vegstarters() {
		System.out.println("       Item            Price   ");
		System.out.println("1.Chilli Panner         180");
		System.out.println("2.Baby Corn Munchurian  160");
		System.out.println("3.Panner65              180");
		System.out.println("4.Gobi Manchurian       150");
		System.out.println("Select any one of the options above");
		
	}
	void vegMainCourse(){
		System.out.println("      Item             Price   ");
		System.out.println("1.Panner Biriyani       240");
		System.out.println("2.Veg biriyani          200");
		System.out.println("3.Family Pack           400");
		System.out.println("Select any one of the options above");
	}

	
	 
	void nonveg(){
		System.out.println("nonveg course");
		System.out.println("1.Starters");
		System.out.println("2.Main course");
		System.out.println("3.Desserts");
	}

	void nonVegStarters(){
		System.out.println("      Item             Price   ");
		System.out.println("Chicken Drumsticks      120");
		System.out.println("Chilli Chicken          150");
		System.out.println("Papper Chicken          160");
		System.out.println("Chicken 65              120");
		System.out.println("Apollo Fish             200");
		System.out.println("Select any one of the options above");
	}
	void dessert(){
		System.out.println("      Item                    Price   ");
		System.out.println("1.Chocalte Fudge               199");
		System.out.println("2.Caramel Turtle               229");
		System.out.println("3.Red Velvet Swirl             149");
		System.out.println("4.Salad                        169");
		System.out.println("5.Fruits and Nuts Ice Cream    259");
		System.out.println("Select any one of the options above");
	}
	void nonVegMainCourse (){
		System.out.println("      Item             Price   ");
		System.out.println("Chicken Biriyani        240");
		System.out.println("Mutton Biriyani         270");
		System.out.println("Family Pack             540");
		System.out.println("Select any one of the options above");
	}
 

	 public static void main(String arguments[]) {
	  Scanner S=new Scanner(System.in);  //Scanner object
	  Menu M = new Menu();               // Object Creation
     do { M.Menu1();                         //Nithin's food menu
      m1=S.nextInt();                    //1 veg,2.non veg
      if(m1==1)
      {  
    	  do {
    	  M.veg();                      //veg method
    	  v1=S.nextInt();
    	  if(v1==1) {                  //Starter selected
    		  do{                        
    			  M.vegstarters();  
    		  
    		  v11=S.nextInt();
    		  if(v11 ==1) {         
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=180;
    			  amount=q*price;
    			 total+=amount;
    			 
    		  }
    		  else if(v11 ==2) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=160;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v11 ==3) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=180;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v11 ==4) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=150;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  
    		  System.out.println("Do you want to order anything else from Starters?");
    		  System.out.println("1.Yes");
    		  System.out.println("2.No");  
    		  w1=S.nextInt();
    		  }while (w1==1);}
    	  else if(v1==2) {
    		  do {
    		  M.vegMainCourse();
    		  v12=S.nextInt();
    		  if(v12 ==1) {         
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=240;
    			  amount=q*price;
    			 total+=amount;
    			 
    		  }
    		  else if(v12 ==2) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=200;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v12 ==3) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=400;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  
    		  System.out.println("Do you want to order anything else from Main Course?");
    		  System.out.println("1.Yes");
    		  System.out.println("2.No"); 
    		  w1=S.nextInt();
    	  }while (w1==1);}
    	  else if(v1==3) {
    		  do {
    		  M.dessert();
    		  v13=S.nextInt();
    		  if(v13 ==1) {         
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=199;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v13 ==2) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=229;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v13 ==3) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=149;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v13 ==4) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=169;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v13 ==5) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=259;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  System.out.println("Do you want to order anything else from Dessert");
    		  System.out.println("1.Yes");
    		  System.out.println("2.No"); 
    		  w1=S.nextInt();
    	  }while (w1==1);}
    	  if(w1==2) {
    		  System.out.println("Do you want to order anything else from Veg?");
    		  System.out.println("1.Yes");
    		  System.out.println("2.No"); 
    		  v2=S.nextInt(); 
    	  }}while (v2==1);}
      else if(m1==2){  
    	  do {
    	  M.nonveg();                      //nonveg method
    	  v1=S.nextInt();
    	  if(v1==1) {                  //Starters selected
    		  do{                        
    			  M.nonVegStarters();  
    		  
    		  v11=S.nextInt();
    		  if(v11 ==1) {         
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=120;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v11 ==2) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=150;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v11 ==3) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=160;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v11 ==4) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=120;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v11 ==5) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=200;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  System.out.println("Do you want to order anything else from Starters?");
    		  System.out.println("1.Yes");
    		  System.out.println("2.No");  
    		  w1=S.nextInt();
    		  }while (w1==1);}
    	  else if(v1==2) {
    		  do {
    		  M.nonVegMainCourse();
    		  v12=S.nextInt();
    		  if(v12 ==1) {         
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=240;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v12 ==2) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=270;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v12 ==3) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=540;
    			  amount=q*price;
    			 total+=amount;
    		  }
    	
    		  System.out.println("Do you want to order anything else from Main Course?");
    		  System.out.println("1.Yes");
    		  System.out.println("2.No"); 
    		  w1=S.nextInt();
    	  }while (w1==1);}
    	  else if(v1==3) {
    		  do {
    		  M.dessert();
    		  v13=S.nextInt();
    		  if(v13 ==1) {         
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=199;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v13 ==2) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=229;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v13 ==3) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=149;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v13 ==4) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=169;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  else if(v13 ==5) {
    			  System.out.println("Quantity");
    			  q=S.nextInt();
    			  price=259;
    			  amount=q*price;
    			 total+=amount;
    		  }
    		  System.out.println("Do you want to order anything else from Dessert");
    		  System.out.println("1.Yes");
    		  System.out.println("2.No"); 
    		  w1=S.nextInt();
    	  }while (w1==1);}
    	  if(w1==2) {
    		  System.out.println("Do you want to order anything else from nonVeg?");
    		  System.out.println("1.Yes");
    		  System.out.println("2.No"); 
    		  v2=S.nextInt(); 
    	  }}while (v2==1);}
      if(v2==2) {
    	  System.out.println("Do you want to return to the Main menuu?");
		  System.out.println("1.Yes");
		  System.out.println("2.No"); 
		  w2=S.nextInt(); 
      } } while(w2==1);
     if (w2==2) {
    	 System.out.println("do you want water bottle?");
    	 System.out.println("1.Yes");
		  System.out.println("2.No"); 
		  w3=S.nextInt();
		  if(w3==1) {
			  System.out.println("per bottle price 20rs");
			  System.out.println("How many");
			  q=S.nextInt();
			  price=20;
			  amount=q*price;
			 total+=amount;
			  
		  }
		  if(w3==2||q<=1000){
			  System.out.println("Items ordered:");
			  System.out.println("Total Bill:"+total);
			  System.out.println("Kudos you are applicable for a discount!");
			  System.out.println("1.First Order Flat 25% off");
			  System.out.println("2.Welcome back 20% off");
			  System.out.println("3.Nithin Discount 30%");
			  System.out.println("Select any one offer");
			  offer=S.nextInt();
			  if(offer==1)
			  {
				  total=total-(total*0.25);
			  }
			  else if(offer==2) {
				  total=total-total*0.2;
			  } else if(offer==3) {
				  total=total-total*0.3;
			  }
			  System.out.println("After Discount :"+total);
			  gst=total*0.03;
			  total=total+gst;
			  System.out.println("After GST:"+total);
			  
		  }
		  }
	 }
	 }
