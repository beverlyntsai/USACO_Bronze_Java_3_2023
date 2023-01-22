import java.util.*;
import java.io.*;


public class searchlast{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, m=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	m=Integer.parseInt(st.nextToken());

	int a[]=new int[n];
	st = new StringTokenizer(in.readLine());

	for(int i=0; i<n;i++){

		a[i]=Integer.parseInt(st.nextToken());
		//System.out.println("a[i]="+a[i]);
	}


	int number=-1;

	for(int i=0; i<m;i++){

		int key=Integer.parseInt(in.readLine());
		number=binary_Search_plus_Last_Occurence(a,key);
		System.out.println(number);
	}



        in.close();


    }

	public static int binary_Search_plus_Last_Occurence(int arr[], int key)
    	{

		int low=0;
		int high=arr.length-1;
		int n=arr.length;

      	  	while(low <=high) {
          		 //int mid = ((int)high-low)/2);
			int mid=(int)((low+high)/2);
  
            		if (arr[mid] == key && ((mid+1)==n || arr[mid+1]!=key)){
                		return mid;

			}else if (arr[mid] < key){
                		low=mid+1;
  			}else{
            			high=mid-1;
			}
       		}

      	  	return -1;
   	 }

}
