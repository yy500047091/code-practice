package practice;

public class Consumer extends Thread{
	Company c;
	
	public Consumer(Company c) {
	 this.c=c;
	};
	
   public void run() {
	   while(true) {
		   
		   try {
			   this.c.consume_item();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   }
   }
}
