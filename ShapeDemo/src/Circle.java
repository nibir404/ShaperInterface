import java.util.Scanner;

public class Circle implements Shape {
    @Override
    public void size(){
        float r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values of r : ");
        r = sc.nextFloat();
        double  result = 3.14*r*r;
        System.out.println("The Area of a triangle is : "+result);
    }
}
