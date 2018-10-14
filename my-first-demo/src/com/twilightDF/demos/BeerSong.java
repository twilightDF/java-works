package com.twilightDF.demos;

public class BeerSong {
	
	private int beerNum = 0;
	
	public BeerSong() {
		
		beerNum = 1;
		
	}
	
	public BeerSong(int beerNum){
		
		this.beerNum = beerNum;
		
	} //以上为建立一个。。
	
	public static void main (String[] arg) {
		
		BeerSong beer = new BeerSong(2);
		
		BeerSong beers = new BeerSong(3);
		
		BeerSong beering = new BeerSong();
		 
		
		beer.beer();
		System.out.println("---------------------------------------------");
		beers.beer();
		System.out.println("---------------------------------------------");
		beering.beer();
	}
	
	public void beer() {
		
		String word = "bottles";
		
		while(beerNum > 0) {
			if(beerNum == 1) {
				word = "bottle";
			}
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("Take away a beer." + '\n' + "Passed is around");
			beerNum = beerNum - 1;
		}
		System.out.println("No Moer Beer On The Wall");
	}
}
