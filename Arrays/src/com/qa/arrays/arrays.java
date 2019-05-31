package com.qa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		arrays scanners = new arrays();
		scanners.input();
		int[][] x = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
//		System.out.println(x[1][2]);
//		for(int[] row : x) {
//			for (int cell : row){
//				System.out.println(cell);
//			}
//		}
		
		ArrayList<String> shopList = new ArrayList<String>();
		shopList.add("Cheese");
		shopList.add("Trams");
		shopList.add("Dogs");
		System.out.println(shopList.get(1));
		shopList.remove(1);
		System.out.println(shopList.get(1))
		;
	}
	
	public String input(){
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	
}
