public class more{
       public static void main(String[]args){
        int T=3,P=30000,R=3;
        double interest;
        
       interest=(P*T*R)/100;
       
      if(interest>100000)
      System.out.println("the loan is eligible");
      
      else
      System.out.println("the loan is not eligible");

}
}