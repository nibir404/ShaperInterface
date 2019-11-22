import java.util.Scanner;

public class RectAngle implements Shape{
    @Override
    public void size(){
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values of a & b : ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        double result = a*b;
        System.out.println("The Area of a triangle is : "+result);
    }
}
