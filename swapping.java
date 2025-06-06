public class swapping {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int temp;
        System.out.println("before swapping"+a+""+b);
        // By using operatiore
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // By using binary operators
        // a=a^b;
        // b=a^b;
        // a=a^b;
        // By using temp variable
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping"+a+""+b);
    }
    
}
