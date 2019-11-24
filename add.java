import java.util.Scanner;
public class add {
    float i,j,k;
    public void sum(){
       Scanner in=new Scanner(System.in);
       System.out.println("Enter two numbers:");
       i=in.nextFloat();
       j=in.nextFloat();
       k=i+j;
       System.out.println("Total="+k);
    }
}
