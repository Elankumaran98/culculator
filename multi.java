import java.util.Scanner;
public class multi {
    float i,j,k;
    public void multiplicate(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        i=in.nextFloat();
        j=in.nextFloat();
        k=i*j;
        System.out.println("Multiplication="+k);
    }
}

