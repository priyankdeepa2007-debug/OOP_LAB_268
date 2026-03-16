	public class cs{
		public static void main(String[]args){
			person A =new person();
			delulu D = new delulu();
			D.add();
		}
	}
	class person{
		void add(){
			System.out.println("yes");
		}
	}
	
	class delulu extends person{
		void add(){
			System.out.println("hoo");
			super.add();
		}
	}
	