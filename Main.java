import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("Select :\n[1]-Addition\n[2]-Subtraction\n[3]-Multiplication\n[4]-division");
        i=in.nextInt();
        switch(i){
            case 1:
                add a=new add();
                a.sum();
                break;
            case 2:
                sub s=new sub();
                s.subtract();
                break;
            case 3:
                multi m=new multi();
                m.multiplicate();
                break;
            case 4:
                div d=new div();
                d.division();
                break;
        }
    }
}
