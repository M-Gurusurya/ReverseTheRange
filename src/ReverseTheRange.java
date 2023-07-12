import java.util.Scanner;

public class ReverseTheRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter start");
        int start=scanner.nextInt();
        System.out.println("Enter end");
        int end=scanner.nextInt();
        reverse(array,start,end);
        for (int j=0;j<size;j++)
        {
            System.out.println(array[j]);
        }
    }
    public static void reverse(int array[],int start,int end)
    {
        while(start<end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
}
