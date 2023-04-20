import java.util.Scanner;
class Min_Max_value
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

        /*if(size==1)
        {
            System.out.println(arr[0]+ " is the min and max number");
        }*/
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<size;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            else if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum Value : "+max+"\nMinimum Value : "+min);
    }
}