public class Amstrong {
    public static void main(String[] args) {
       int n=153;
       int n1=n;
       int n2=n;
       int count=0;
       while(n!=0){
         n=n%10;
         count=count+1;
       }
       int sum=0;
       while(n!=0){
         int x=n1%10;
         sum=sum+(int)Math.pow(x,count);
         n=n/10;
       }
      // System.out.println("The given amstrom=ng number are"+sum);
      if(n2==sum){
        System.out.println("The given number is Amstrong number");
      }
      else{
        System.out.println("The given number is not a amstrong number");
      }
  }
}