package Interface;

public class MultiplechildClass implements Interparent1, Interparent2 {
	public void show()
	{
	    System.out.println(" method of child class");
	
	}
	
	public void display()
	{
	    System.out.println(a+b);
	
	}
	public void print()
	
	{
		System.out.println("parent2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiplechildClass ob=new MultiplechildClass();
				ob.display();
		        ob.print();
		        ob.show();
	}



	}


