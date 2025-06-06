public class count_Amstrong {
    public static void main(String[] args) {
      for(int i=100;i<=1000;i++){
       int n=i;
       int n1=n;
       int n2=n;
       int count=0;
       while(n!=0){
         n=n/10;
         count=count+1;
       }
       int sum=0;
       while(n1!=0){
         int x=n1%10;
         sum=sum+(int)Math.pow(x,count);
         n1=n1/10;
       }
      if(n2==sum){
        System.out.println("The given number is Amstrong number"+sum);
      }
      }

  }
}