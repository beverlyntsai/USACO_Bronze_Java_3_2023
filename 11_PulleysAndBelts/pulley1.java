import java.util.*;
import java.io.*;



public class pulley1{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	Belt belt[] =new Belt[n-1];

	for(int i=0; i<n-1;i++){

		st = new StringTokenizer(in.readLine());

		belt[i]=new Belt();
		belt[i].source=Integer.parseInt(st.nextToken());
		belt[i].destination=Integer.parseInt(st.nextToken());		
		belt[i].dir=Integer.parseInt(st.nextToken());

	}

	Arrays.sort(belt, new comp());

	boolean isClockwise=true;

	for(int i=0; i<n-1;i++){

		if(belt[i].dir==1){
			isClockwise=!isClockwise;
		}

	}

	if(isClockwise){
		System.out.println(0);
	}else{
		System.out.println(1);
	}


        in.close();


    }

	static class Belt{
		int source;
		int destination;
		int dir;
	}


	//Step-2: Implement Comparator Interface
	static class comp implements Comparator <Belt> { 
		public int compare(Belt c1, Belt c2) {//compare method will take two cows
			if (c1.source< c2.source)//it will sort the array by game in "ascending" order******************* 
				return -1;
                        if (c1.source > c2.source) 
				return 1;
			return 0;
		}
	}


}
