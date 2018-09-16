package com.twilightDF.demos;

public class BeerSong {
	
	private static final int BEER_NUM = 99; 
	
	public static void main (String[] arg) {
		
		beer();
	}

	public static void beer() {
		int beerNum = BEER_NUM;
		
		String word = "bottles";
		
		while(beerNum > 0) {
			if(beerNum == 1) {
				word = "bottle";
			}
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("Take away a beer.");
			System.out.println("Passed is around");
			beerNum = beerNum - 1;
		}
		System.out.println("No Moer Beer On The Wall");
	}
}
