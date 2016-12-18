package com.davis.datastructure.decimalconversion;

import javax.swing.plaf.TextUI;

public class DecimalConversion {

	public static String toTen(String otherDecimalNum,int decimal){
		if(otherDecimalNum==null||"".equals(otherDecimalNum)){
			return "";
		}
		char[] otherDecimalChars = otherDecimalNum.toCharArray();
		int tenDecimal=0;
		for(int i=0;i<otherDecimalChars.length;i++){
			tenDecimal = (int)(otherDecimalChars[i]-'0')+tenDecimal*decimal;
		}
		return tenDecimal+"";
	}
	
	//目前只考虑10进制以内的
	public static String toN(String tenDecimalNum,int decimal){
		if(tenDecimalNum==null||"".equals(tenDecimalNum)){
			return "";
		}
		int tenDecimal = 0;
		for(int i=0;i<tenDecimalNum.length();i++){
			tenDecimal = (int)(tenDecimalNum.charAt(i)-'0')+tenDecimal*10;
		}
		String s = "";
		for(;;){
			s = ""+tenDecimal%decimal+s;
			tenDecimal = tenDecimal/decimal;
			if(tenDecimal==0){
				break;
			}
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toTen("1010", 2));
		System.out.println(toN("16",3));
	}

}
