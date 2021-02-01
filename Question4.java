package arrayAssignment;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First array elements: ");
        int arr1[] = {2,5,8,9};
        for (int i=0; i< arr1.length ;i++ )
        {
                System.out.print(arr1[i]+" ");
        }
        System.out.println("\nSecond array elements: ");
        int arr2[] = {15,3,7,12};
        for (int i=0; i< arr2.length ;i++ )
        {
                System.out.print(arr2[i]+" ");
        }
        System.out.println("\nAfter merge the array is: ");
        int arr[] = merge(arr1, arr2);
        for (int i=0; i< arr.length ;i++ )
        {
                System.out.print(arr[i]+" ");
        }
}
public static int[]merge (int[]arr1, int[]arr2)
{
        int[]arr = new int[arr1.length + arr2.length];
        int i;
        for(i=0; i < arr1.length; i++)
        {
                arr[i] = arr1[i];
        }
        for(int j=0; j < arr2.length; j++)
        {
                arr[i++]=arr2[j];
        }
return arr;

	}

}
