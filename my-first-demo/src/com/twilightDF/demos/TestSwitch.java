package com.twilightDF.demos;
/**
 * ≤‚ ‘Switch”Ôæ‰
 * @author ∂≈∑Ê
 *
 */
public class TextSwitch {
	
	public static void main(String[] args) {
		char c = 'a';
		char c1 = (char)(c + (Math.random() * 26));
		System.out.print(c1 + ":");
		
		switch(c1) {
		case 'a':
		case 'o':
		case 'i':
		case 'u':
		case 'e':
			System.out.println("‘™“Ù");
			break;
		case 'w':
		case 'y':
			System.out.println("∞Î‘™“Ù");
			break;
			default:
				System.out.println("∏®“Ù");
		
		}
	}

}
