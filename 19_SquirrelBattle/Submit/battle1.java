import java.util.*;
import java.io.*;


public class battle1{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));


	char board[][]=new char[3][3];
	char charList[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};


	for(int i=0; i<3;i++){

		String line=in.readLine();
		
		board[i][0]=line.charAt(0);
		board[i][1]=line.charAt(1);
		board[i][2]=line.charAt(2);		

	}

	//Single check
	int singleCount=0;
	boolean isSingleWin=false;

	for(char ch:charList){

		isSingleWin=false;
		//check row and column
		for(int index=0;index<3;index++){

			if(singleCheck(index, 0,index, 1,index, 2,ch, board)==true) isSingleWin=true;
			if(singleCheck(0,index, 1,index, 2,index, ch, board)==true) isSingleWin=true;
		}

		//check  diagonal 1
		if(singleCheck(0, 0,1, 1,2, 2,ch, board)==true) isSingleWin=true;

		//check  diagonal 2
		if(singleCheck(2, 0,1, 1,0, 2,ch, board)==true) isSingleWin=true;

		if(isSingleWin==true) singleCount++;
	}


	//Double check
	int doubleCount=0;
	boolean isDoubleWin=false;
	for(int i=0; i<26;i++){

		for(int j=i+1; j<26;j++){
			
			char ch1=charList[i];
			char ch2=charList[j];

			isDoubleWin=false;
			//check row and column
			for(int index=0;index<3;index++){

				if(doubleCheck(index, 0,index, 1,index, 2,ch1, ch2, board)==true) isDoubleWin=true;
				if(doubleCheck(0,index, 1,index, 2,index, ch1, ch2, board)==true) isDoubleWin=true;
			}

			//check  diagonal 1
			if(doubleCheck(0, 0,1, 1,2, 2,ch1, ch2, board)==true) isDoubleWin=true;

			//check  diagonal 2
			if(doubleCheck(2, 0,1, 1,0, 2,ch1, ch2, board)==true) isDoubleWin=true;

			if(isDoubleWin==true) doubleCount++;

		}
	}

	System.out.println(singleCount);
	System.out.println(doubleCount);

        in.close();


    }

	public static boolean singleCheck(int r1, int c1,int r2, int c2,int r3, int c3,char char1, char board[][]){

		if(board[r1][c1]==char1 && board[r2][c2]==char1 && board[r3][c3]==char1) return true;

		return false;
	}


	public static boolean doubleCheck(int r1, int c1,int r2, int c2,int r3, int c3,char char1, char char2, char board[][]){

		if(board[r1][c1]==char1 && board[r2][c2]==char1 && board[r3][c3]==char1) return false;//counbt as single case

		if(board[r1][c1]==char2 && board[r2][c2]==char2 && board[r3][c3]==char2) return false;//counbt as single case

		if((board[r1][c1]==char1||board[r1][c1]==char2)  && (board[r2][c2]==char1||board[r2][c2]==char2)   && (board[r3][c3]==char1||board[r3][c3]==char2)  ){
			 return true;
		}
		return false;
	}

}
