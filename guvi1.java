import java.util.*;
class guvi1
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
System.out.println("enter the array size");
int n=s1.nextInt();
int i,j,k=0;
int a[]=new int[n];
int b[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s1.nextInt();
}
for(j=0;j<n;j++)
{
if(a[j]==j)
{
b[k]=a[j];
k++;
}
else
continue;
}
int[] c=new int[k];
for(i=0;i<k;i++)
{
c[i]=b[i];
}
for(int z:c)
{
System.out.print(z);
System.out.print("\t");
i++;
}
}
}