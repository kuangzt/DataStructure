package com.davis.datastructure.alphabetpyramid;

public class AlphabetPyramid {

	/**
	 * 
	 * @param num 行数
	 */
	public void show(int num){
		for(int l=0;l<num;l++){
			for(int i=0;i<num-l;i++){
				System.out.print(" ");
			}
			for(int j=0;j<l+1;j++){
				System.out.print((char)('A'+j));
			}
			for(int k=l-1;k>=0;k--){
				System.out.print((char)('A'+k));
			}
			System.out.println();
		}
		
	}
	
	/**
	 * 
	 * @param num 行数
	 */
	public void reversedShow(int num){
		for(int l=0;l<num;l++){
			for(int i=0;i<l+1;i++){
				System.out.print(" ");
			}
			for(int j=0;j<num-l-1;j++){
				System.out.print((char)('A'+j));
			}
			for(int k=num-l-1;k>=0;k--){
				System.out.print((char)('A'+k));
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		AlphabetPyramid alphabetPyramid = new AlphabetPyramid();
		alphabetPyramid.show(3);
		
		alphabetPyramid.reversedShow(6);

	}

}
