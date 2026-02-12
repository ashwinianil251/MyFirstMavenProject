package EncapsulationOverride;

public class EncapsSample1 {
	
	private String name;
	private int id;
	
	public void setter (String n,int i)
{
	this.name=n;
	this.id=i;
}
    public void getter()
    {
    	System.out.println("Name:"+name);
    	System.out.println("ID:"+id);
    	
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
    	EncapsSample1 Ob=new EncapsSample1();
    	Ob.setter("bibi",12345);
    	Ob.getter();
    }


}	

	
		
		
	
	


	



	
	


