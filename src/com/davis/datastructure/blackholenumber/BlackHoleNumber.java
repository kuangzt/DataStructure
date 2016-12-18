package com.davis.datastructure.blackholenumber;

import java.util.Arrays;

public class BlackHoleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNum = 8741;
		for(;;){
			
			String inputStr = String.valueOf(inputNum);
			char[] inputChars = inputStr.toCharArray();
			Arrays.sort(inputChars);
			int min = 0;
			for(int i=0;i<inputChars.length;i++){
				min = min*10+(int)(inputChars[i]-'0');
			}
			int max = 0;
			for(int i=inputChars.length-1;i>=0;i--){
				max = max*10+(int)(inputChars[i]-'0');
			}
			int result = max -min;
			if(result==inputNum){
				System.out.println(inputNum);
				break;
			}
			inputNum = result;
		}
	}

}
