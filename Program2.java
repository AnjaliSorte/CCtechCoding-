
public class Program2 
{ 
	// Returns count buildings that can see sunlight 
	static int countBuildings(int arr[], int n) 
	{ 
		int count = 1; 
	
		// Start traversing element 
		int curr_max = arr[0]; 
		for (int i=1; i<n; i++) 
		{ 
			 
			if (arr[i] > curr_max) 
			{ 
				count++; 
				curr_max=arr[i]; 
			} 
		} 
	
		return count; 
	} 
	
	// Driver method 
	public static void main(String[] args) 
	{ 
		int arr[] = {7, 4, 8, 2, 9}; 
		
		System.out.println(countBuildings(arr, arr.length)); 
		
	} 
} 
