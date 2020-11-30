import java.util.Scanner;
class Selection
{
public static void main(String[] args)
{
Scanner obj= new Scanner(System.in);
System.out.println("Enter size of array");
int size=obj.nextInt();
int arr[]= new int[size];
System.out.println("Enter elements in array");
for(int i=0;i<arr.length;i++)
{
arr[i]= obj.nextInt();
}
int min,temp=0;
for ( int i=0;i<arr.length;i++)
{
min=i;
for( int j=i+1;j<arr.length;j++)
{
if(arr[j] < arr[min])
{
min=j;
}
}
temp=arr[i];
arr[i]=arr[min];
arr[min]=temp;
}
System.out.println("Selection sort");
for( int x:arr)
{
System.out.println(x);
}
}
}
/*******)utput*****
Enter size of array
8
Enter elements in array
2
7
5
9
3
6
7
8
Selection sort
2
3
5
6
7
7
8
9*/