import java.util.*;
import java.io.*;



public class cowvid1{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	int cow[]=new int[n];
	int infectedCow[]=new int[n];
	int infectedCowNum=0;
	int maxNumber=-1;

	for(int i=0; i<n;i++){
		cow[i]=Integer.parseInt(in.readLine());
	}

	int radius=1;

	for(int i=0;i<n;i++){


		//System.out.println("**** i="+i);
		resetInfectedCow(infectedCow,n);//Need to check if this reset works
/*
		System.out.println("After reset");
		for(int j=0;j<n;j++){
			System.out.print(infectedCow[j]+", ");
		}
*/
		radius=1;
		infectedCow[i]=radius;
		boolean isContinue=true;

		while(isContinue==true){

			for(int j=0;j<n;j++){
				
				if(infectedCow[j]==radius){

					int pos=cow[j];
					int maxInfectPos=pos+radius;
			 		int minInfectPos=pos-radius;

					for(int x=0;x<n;x++){
					
						if(infectedCow[x]==0 && cow[x]<=maxInfectPos && cow[x]>=minInfectPos){
							infectedCow[x]=radius+1;

						}
					}

				}
			}//for

			isContinue=false;//First assume no more infected cow
/*
			for(int j=0;j<n;j++){
				System.out.println("infectedCow[j]="+infectedCow[j]);	
			
			}//for
*/
			for(int j=0;j<n;j++){
				//System.out.println("j="+j);
				if(infectedCow[j]==(radius+1)){

					isContinue=true; 
					radius++;
					//System.out.println("radius="+radius);
				}
			
			
			}//for

			infectedCowNum=0;
			for(int j=0;j<n;j++){
				if(infectedCow[j]!=0){
					infectedCowNum++;
				}	
			}
					
		}

		//System.out.println("infectedCowNum="+infectedCowNum);

		if(infectedCowNum>maxNumber) maxNumber=infectedCowNum;
	}
	

	System.out.println(maxNumber);




        in.close();


    }

	public static void resetInfectedCow(int[] infect, int n){
		for(int i=0; i<n;i++){
			infect[i]=0;
		}

	}
}
