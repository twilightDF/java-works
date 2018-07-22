package com.twilightDF.demos;

public class BeerSong {
	public static void main (String[] arg) {
		
		int beerNum = 99;
		
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
