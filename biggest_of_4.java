public class biggest_of_4 {
    public static void main(String []args){
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        if(a>b && a>c && a>d){
            System.out.println("a is big");
        }
        if(b>c && b>d){
            System.out.println("B is big");
        }
        if(c>d){
            System.out.println("C is big");
        }
        else{
            System.out.println("D is bid");
        }
    }
}
