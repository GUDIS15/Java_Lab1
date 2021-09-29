package LAB1;

public class Unaryoperator {
	public static void main(String[] args) 
	{
		Unaryoperator obj= new Unaryoperator(0);
		obj.Unaryoperator(5);
		
	}

	private void Unaryoperator(int i) {
		// TODO Auto-generated method stub
		
	}

	public Unaryoperator(int n) 
	{
		System.out.println(n++);
		System.out.println(++n);
	
		System.out.println(--n);
		System.out.println(n--);
	
	n=+1;
	System.out.println(n);
	n=+1;//intialize to 1
	System.out.println(n);
	n+=1;//incremented by 1
	System.out.println(n);
			
	        
	}
	
}


