import java.util.Scanner;
public class div {
    float i,j,k;
    public void division(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        i=in.nextFloat();
        j=in.nextFloat();
        k=i/j;
        System.out.println("Division="+k);
    }
}

