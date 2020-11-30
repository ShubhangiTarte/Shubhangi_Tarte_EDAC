import java.util.Scanner;
class Insertion
{
public static void main(String[] args)
{
Scanner obj= new Scanner(System.in);
System.out.println("Enter size of array");
int size=obj.nextInt();

int arr[]= new int[size];
System.out.println("Enter element in array");
for(int i=0;i<arr.length;i++)
{
arr[i]= obj.nextInt();
}
int temp,j;
for(int i=0;i<arr.length;i++)
{
temp=arr[i];
j=i;
while(j>0 && arr[j-1]>temp)
{
arr[j]=arr[j-1];
j--;
}
arr[j]=temp;
}
System.out.println("Insertion Sort");
for(int x: arr)
{
System.out.println(x+" ");
}
}
}
/********OUtPUT******
Enter size of array
6
Enter element in array
395812
6
6373847
93
45

2
Insertion Sort
2
6
45
93
395812
6373847*/
