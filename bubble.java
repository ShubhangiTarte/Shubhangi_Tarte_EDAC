import java.util.Scanner;
class bubble
{
public static void main(String[] args)
{
Scanner obj= new Scanner(System.in);
int size=obj.nextInt();
int arr[]= new int[size];
System.out.println("Enter element in array");
for(int i=0;i<arr.length;i++)
{
arr[i]= obj.nextInt();
}
for(int i= 0; i<arr.length;i++)
{
for(int j=0;j<arr.length-1;j++)
{
if( arr[j] > arr[j+1])
{
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("Bubblesorted array");
for(int x: arr)
{

System.out.print(x+" ");
}
}
}

/**********OUTPUT*******6
Enter element in array
7
4
5
2
9
1
Bubblesorted array
1 2 4 5 7 9*/
