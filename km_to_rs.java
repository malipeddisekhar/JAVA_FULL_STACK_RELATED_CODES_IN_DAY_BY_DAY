public class km_to_rs{
    public static void main(String args[]){
        int km= 8;
        int t=20;
        if(km>=1 && km<=10){
            System.out.println("pay 20 rs/-");
        }
        else if(km>=11 && km<=20){
            t=t+(km-10)*3;
            System.out.println("");
        }
        else if(km>=21 && km<=50){
            t=t+30+(km-10-10)*5;
            System.out.println("you pay "+t);

    }
    else if(km>=51 && km<=100){
            t=t+30+150+(km-10-10-30)*7;
            System.out.println("you pay "+t);   
    }
    
    else{
        t=t+30+150+350+(km-100)*5;
        System.out.println("you pay "+t);   

    }
}
}