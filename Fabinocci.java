import java.util.Scanner;
public class Fabinocci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("how many terms");
        int num=scanner.nextInt();
        int n1=0;
        int n2=1;
        int count=0;
        if(num<0){
            System.err.println("enter positive number");
        }else if (num ==1){
            System.out.println(n1);
        }else{
            System.out.println("fibonocci sequence:");
            while (count<num){
                System.out.println(n1);
                int nth=n1+n2;
                n1=n2;
                n2=nth;
                count+=1;
            }
        }
    scanner.close();    
    }
    
}
