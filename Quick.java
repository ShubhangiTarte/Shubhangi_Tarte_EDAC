
import java.util.Scanner;
class Quick
{
public static void main(String[] args)
{
Scanner ob1= new Scanner(System.in);
System.out.println("Size of array");
int size=ob1.nextInt();
int arr[]= new int[size];
System.out.println("enter elements");
for(int i=0;i<arr.length;i++)
{
arr[i]= ob1.nextInt();
}
int length=arr.length;
Quick obj= new Quick();
obj.quicksort(arr, 0, length-1);
obj.disp(arr);
}
int partion(int[] arr,int low ,int high)
{
int pivot=arr[(low+high)/2];
while(low<=high)
{
while(arr[low]<pivot)
{
low++;
}
while(arr[high]>pivot)
{
high--;
}
if(low<=high)
{
int temp=arr[low];
arr[low]=arr[high];
arr[high]=temp;
low++;
high--;
}
}
return low;
}
void quicksort(int[] arr,int low,int high)
{
int pi=partion(arr,low,high);
if(low<pi-1)
{
quicksort(arr,low,pi-1);
}
if(pi<high)
{
quicksort(arr,pi,high);
}
}
void disp(int [] arr)
{
System.out.println("Quick sort");

for(int x:arr)
{
System.out.println(x);
}
}
}
/*******)UTPUT****
Size of array
5
enter elements
378
78
23
4
6
Quick sort
4
6
23
78
378*/