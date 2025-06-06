public class numcount {
    public static void main(String args[]){
        int n=0;
        if(n>=1 && n<=9){
            System.out.println("The given numis 1 digit");
        }
        else if(n>=10 && n<=99){
            System.out.println("The given numis 2 digit");
        }
        else if (n>=100 && n<=999){
            System.out.println("The given numis 1 digit");
        }
        else{
            System.out.println("Invalid");
        }

    }
}