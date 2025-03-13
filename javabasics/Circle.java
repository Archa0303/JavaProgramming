import java.util.Scanner;
class Circle
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double rad=sc.nextDouble();
        double area=Math.PI *rad*rad;
        System.out.println("The area of circle:"+area);
        sc.close();
     }
}