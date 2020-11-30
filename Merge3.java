
import java.util.Arrays;

public class Merge3 {
	void mergesort(int a[],int l,int r)
	{
		int mid=0;
		if(l<r)
		{
			 mid=(r+l)/2;
			
		 mergesort(a, l,mid);
		 mergesort(a,mid+1,r);
		 merge(a,l,mid,r);
		}
	}
	void merge(int a[],int l,int mid,int r)
	{
		int n1=mid-l+1;
		int n2=r-mid;
		int t1[]=new int[n1];
		int t2[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			t1[i]=a[l+i];
	    }
		
		
		System.out.println();
		for(int j=0;j<n2;j++)
		{
			t2[j]=a[mid+1+j];
		}
			

		
				
		System.out.println();
		
		int i,j,k;
i=0;
j=0;

k=l;
		while(i<n1&&j<n2)
		{
			if(t1[i]<t2[j])
			{
			a[k] = t1[i];
			i++;
	       }
			else
			{
				a[k]=t2[j];
				j++;
			}
k++;
		}
		 while (i < n1) {
		      a[k++] = t1[i++];

		    }
	    while (j < n2) {
	      a[k++] = t2[j++];

	    }
			
	    
			
		}
		
	 static void display(int a[],int k)
	  {
		  for(int i=0;i<k;i++)
		  {
			  System.out.print(a[i]);
			  
		  }
	  }
	public static void main(String args[])
	{
		int a[]= {8,1,6,5,7,3};
		
		
		
		Merge3 ob=new Merge3();
		int l=0;
		int size=a.length;
		ob.mergesort(a, l, a.length-1);
		 System.out.println("Sorted Array:");
		    System.out.println(Arrays.toString(a));
		//display(a,size);
	}
	

}
/*****Output****
Sorted Array:
[1, 3, 5, 6, 7, 8]
***/