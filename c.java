	  public class c{
      public static void main(String[]args){
		 child D =new child();
		 D.sol();
		 parent S = new parent ();
		 S.sol();
	  }
	  }
	class child{
		   void sol(){
			   System.out.println("solo life");
		   }
	   }
	   class parent extends child{
		   
			   void sol(){
				   System.out.println("alone");
			   }
		   
	   }
	   class daughter extends child{
		   void sol(){
			   System.out.println("happy");
		   }
	   }