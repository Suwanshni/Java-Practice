import java.util.Scanner;
class array_in_java
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element : ");
            arr[i]=input.nextInt();
        }

        System.out.print("The elements are : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}