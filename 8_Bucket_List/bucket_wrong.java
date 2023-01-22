import java.util.*;
import java.io.*;

public class bucket{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;
	Cow cowList[]=new Cow[n];


	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		Cow cow=new Cow();
		cow.begin=Integer.parseInt(st.nextToken());
		cow.end=Integer.parseInt(st.nextToken());
		cow.numBucket=Integer.parseInt(st.nextToken());			
		cowList[i]=cow;
	}

	int bucket_num=0;
	for(int i=0; i<n;i++){

		bucket_num+=cowList[i].numBucket;			

	}
/*
	boolean bucket[]=new boolean[bucket_num];

	for(int i=0; i<bucket_num;i++){

		bucket[i]=false;			

	}
*/
	Arrays.sort(cowList, new comp());


	int bucketNeed=0;
	int tempBucket=0;
	for(int i=0; i<n;i++){

		if(i==0){
			bucketNeed=cowList[i].numBucket;
			//System.out.println("(1) bucketNeed="+bucketNeed);
		}

		if(i>0){

			tempBucket=cowList[i].numBucket;
			//System.out.println("tempBucket="+tempBucket);
			for(int j=0;j<i;j++){

				if(cowList[i].begin>=cowList[j].end){

					int provide=cowList[j].numBucket;
					if(provide>tempBucket){
						tempBucket=0;
						break;
					}

					//System.out.println("i="+i+" provide="+provide);
					if(provide<=tempBucket){
						tempBucket=tempBucket-provide;
						//System.out.println("tempBucket-provide="+tempBucket);
					}
					
					if(tempBucket==0){
						break;
					}
				}
			}

			bucketNeed+=tempBucket;
			//System.out.println("bucketNeed="+bucketNeed);
		}
	}

	System.out.println(bucketNeed);




        in.close();


    }

	static class Cow{
		int begin;
		int end;
		int numBucket;
	}


	//Step-2: Implement Comparator Interface
	static class comp implements Comparator <Cow> { 
		public int compare(Cow c1, Cow c2) {//compare method will take two cows
			if (c1.begin< c2.begin)//it will sort the array by game in "ascending" order******************* 
				return -1;
                        if (c1.begin > c2.begin) 
				return 1;
			return 0;
		}
	}

}
