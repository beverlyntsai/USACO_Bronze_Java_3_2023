import java.util.*;
import java.io.*;

public class fun1{

    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	String strHex= in.readLine();//16
	String strBin= "";//2
	String strOct= "";//8

	String ans="";
	String sumBinaryStr="";
	for(int i=0; i<strHex.length();i++){

		char ch=strHex.charAt(i);
		String chStr=String.valueOf(ch);
		String binaryStr=HexToBinary(chStr);
		while(binaryStr.length()<4){
			binaryStr="0"+binaryStr;
		}
		sumBinaryStr+=binaryStr;
	}

	while(sumBinaryStr.length()%3!=0){
		sumBinaryStr="0"+sumBinaryStr;
	}

	for(int i=0; i<sumBinaryStr.length();i=i+3){

		String group3=sumBinaryStr.substring(i,i+3);
		String decimalStr=BinaryToDecimal(group3);
		ans+=decimalStr;
	}

	int index=0;
	while(ans.charAt(index)=='0'){
		ans=ans.substring(index+1);
		index++;
	}

	System.out.println(ans);




        in.close();


    }

   	public static String HexToBinary(String hex) {
    		int i = Integer.parseInt(hex, 16);
   		String bin = Integer.toBinaryString(i);
    		return bin;
	}

   	public static String BinaryToDecimal(String binaryString)
	{

		int decimal=Integer.parseInt(binaryString,2);  
		String strDecimal=String.valueOf(decimal); 
    		return strDecimal;
	}
}
