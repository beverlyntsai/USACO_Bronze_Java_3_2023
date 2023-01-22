import java.util.*;
import java.io.*;

public class milk1{

    public static void main(String[] args)throws Exception{

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, q=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	q=Integer.parseInt(st.nextToken());

	int a[]=new int[n];

	int totalTime=0;
	for(int i=0; i<n;i++){
		int time=Integer.parseInt(in.readLine());	
		totalTime+=time;
		a[i]=totalTime;
		//System.out.println(a[i]);
	}

	

	for(int i=0; i<q;i++){		
		int key=Integer.parseInt(in.readLine());
		//System.out.println(key);
		int index=binary_Search_toNext(a,key);
		System.out.println(index+1);
	}

        in.close();


    }


	public static int binary_Search_toNext(int arr[], int key)
    	{
		int low=0;
		int high=arr.length-1;
		int mid=0;
      	  	while(low <=high) {
          		 //int mid = ((int)high-low)/2);
			mid=(int)((low+high)/2);
  
            		//if (arr[mid] == key){//traditional case
			if ((mid>0 && key<arr[mid] && key>=arr[mid-1]) || (mid==0 && key<arr[mid])){
                		return mid;

			}

			if (arr[mid] > key){
                		high=mid-1;
  			}else{ //This includes two cases: arr[mid] < key && arr[mid] == key
            			low=mid+1;
			}
       		}

      	  	return -1;

   	 }


}
