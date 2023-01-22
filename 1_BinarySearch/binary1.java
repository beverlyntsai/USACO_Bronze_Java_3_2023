import java.util.*;
import java.io.*;


public class binary1{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, q=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	q=Integer.parseInt(st.nextToken());


	int a[]=new int[n];

	st = new StringTokenizer(in.readLine());
	for(int i=0; i<n;i++){
		
		a[i]=Integer.parseInt(st.nextToken());	
	}


	for(int i=0; i<q;i++){
		
		int key=Integer.parseInt(in.readLine());
		int index=binary_Search_plus_Lowerbound(a,key);
		System.out.println(index);
	}

	

        in.close();


    }

	public static int binary_Search_plus_Lowerbound(int arr[], int key)
    	{

		int first=-1;//first occurence
		int low=0;
		int high=arr.length-1;

      	  	while(low <=high) {
          		 //int mid = ((int)high-low)/2);
			int mid=(int)((low+high)/2);
  
            		if (arr[mid] == key){
                		first=mid;
				high=mid-1;

			}else if (arr[mid] < key){
                		low=mid+1;
  			}else{
            			high=mid-1;
			}
       		}

      	  	return first;
   	 }

}
