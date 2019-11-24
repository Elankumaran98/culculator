import java.util.Scanner;
public class sub {
    float i,j,k;
    public void subtract(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        i=in.nextFloat();
        j=in.nextFloat();
        k=i-j;
        System.out.println("Subtract="+k);
    }
}
