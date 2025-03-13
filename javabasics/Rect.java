import java.util.Scanner;
class Rect
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
         double len=sc.nextDouble();
         System.out.println("Enter the breadth of the rectangle:");
         double bre=sc.nextDouble();
         double area=len*bre;
         double peri=2*(len+bre);
        System.out.println("The area of Rectangle:"+area);
        System.out.println("The perimeter of Rectangle:"+peri);
        sc.close();
     }
}
