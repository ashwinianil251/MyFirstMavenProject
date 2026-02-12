package Interface;

public class SampleClass  implements InterfaceSample{
	
	public void print()
	{
		System.out.println("method of class");
	}
	
    public void add()
    {
    	System.out.println(a+b);
    }
    
    public void display()
    {
    	System.out.println("method in interface");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass sc=new SampleClass();
		sc.print();
		sc.add();
		sc.display();
		System.out.println(sc.a);//the value is  from interface
		InterfaceSample is= new SampleClass();

	}

}
