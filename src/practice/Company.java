package practice;

public class Company     {
	
	int n =1;
	boolean f= false;
	  
	
	  synchronized public void produce_item(int n) throws  Exception
	 {
		
		if(f) {
			wait();
		}
		
		this.n=n;
		System.out.println("produced :" + this.n);
		f=true;
		notify();
		
	}
	  synchronized public int consume_item() throws  Exception
		 {
			
			if(!f) {
				wait();
			}
			
			
			System.out.println("consumed :" + this.n);
			f=false;
			notify();
			return this.n;
			
		}

}
