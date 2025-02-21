	package learning;

// Main class
public class learn {
	
	public learn() {
		System.out.println("I'm constructor..!!");
	}
	
	int rollname;
	String name;
	
	public learn(String i,int r) {
		 rollname=r;
		 name=i;
	}

	public void display() {
		System.out.println("Roll number is: " + rollname + " and Name is: " + name);
	}
		
    public static void main(String[] args) {
              learn students=new learn();
              learn std=new learn("Rahul", 10);
              learn std2=new learn("Anjali", 9);
              std.display();
              std2.display();
              }
}
