
import java.util.Arrays;

class interview{
    public static void main(String[] args) {
        reverse_numbers();
        sum_ofnum();
        mul_numb();
        palindrome();
        factorial ();
        spy_numb();
        fibnoci();
        amstrong();
        swap_array();
    }
    public static void reverse_numbers(){
        int num=12345;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("REVERSE OF A NUMBER "+rev);
       
    }
    ///// sum of num
    public static void sum_ofnum() {
        int num=5;
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("SUM OF NUMBERS "+sum);
        
    }
////// MUL OF NUMBERS
 
    public static void mul_numb() {
        int num=5;
        int mul=1;
        for (int i=1; i<=num; i++){
            mul=mul*i;
        }
        System.out.println("MULTIPLY OF A NUM "+mul);
    }

    ////////PALINDROME OF A NUMBER
    public static void palindrome() {
        int num=155;
        int rev=0;
        int obj=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        ///System.out.println(rev);
        if (obj==rev){
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    
    public static void factorial () {
        /////FACTORIAL OF ANUM
    ////factorial and multiplication are same logic
        int num=5;
        int fact=1;
        for (int i=1; i<=5;i++){
            fact=fact*i;
        }
        System.out.println("FACTORIAL OF A NUM "+fact);
    }

///////SPY NUMBERS
    public static void spy_numb() {
        int num=1124;
        int sum=0;
        int mul=1;
        //int obj=num;
        while(num>0){
            int val=num%10;
            sum+=val;
            mul*=val;
            num/=10;
        }
       if (sum ==mul){
            System.out.println("spyyy");
        }
        else{
            System.out.println("noooo");
        }
        }
//////FIBNOCI SERIES
        public static void fibnoci() {
            int num=10;
            int a=0;
            int b=1;
            int i=1;
            while (i<=num){
            int c=a+b;
            a=b;
            b=c;
            i++;
             //System.out.println("FIBNOCI SERIES"+num +"is "+a);
            }
            System.out.println("FIBNOCI SERIES "+num +" is "+a);
        }
///////AMSTRONG NUMBERS
        public static void amstrong() {
           int num=153;
           int sum=0;
           int temp=num;
           while (temp>0){
            int val=temp%10;
            sum+= Math.pow(val,3);
            temp=temp/10;
           }
           if (sum==num) {
               System.out.println("AMSTRONG");
            }
            else{
               System.out.println("NOT--AMSTRONG"); 
            }
        }

        ///////SWAP OF ARRAY
        public static void swap_array() {
            int [] a={10,20,30,40};
            int [] b={80,50 ,10};
            System.out.println("BEFORE SWAPPING");
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(a));

            int [] t=a;
                    a=b;
                    b=t;
                    System.err.println("AFTER-SWAPPING");
                 System.out.println(Arrays.toString(a));   
                 System.out.println(Arrays.toString(b));  
        }












}