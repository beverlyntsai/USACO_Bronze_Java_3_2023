import java.util.*;
import java.io.*;



public class unlucky1{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	int counter[]=new int[7];
	int month[]={31,28,31,30,31,30,31,31,30,31,30,31};

	for(int i=0; i<7;i++){

		counter[i]=0;

	}

	//index:0-6, key track of which day of the week
	int index=2;// because 1900 Jan 1=1900, 0,1 is Monday=2

	for(int y=1900;y<1900+n;y++){

		for(int m=0;m<12;m++){

			int days=0;

			if(m==1){
				if(isLeap(y)==true){
					days=29;
				}else{
					days=28;
				}	
			}else{

				days=month[m];
			}

			for(int d=0;d<days;d++){
				
				if(d==12){
					counter[index]++;
				}
				
				index++;
				index=index%7;
			}
		}

	}


	for(int i=0; i<7;i++){

		System.out.print(counter[i]);
		if(i!=06){
			System.out.print(" ");
		}
	}



        in.close();


    }

	public static boolean isLeap(int year){

		if((year%4==0 && year%100!=0) || year%400==0) return true;

		return false;
	}

}
