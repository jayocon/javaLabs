package cct.com.sem5;

public class arrayMultiDimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [][][] arrayName = {{{000, 001, 002},{010, 011, 012},{020, 021, 022},{030, 031, 032}},
								{{100, 101, 102},{110, 111, 112},{120, 121, 122},{130, 131, 132}},
								{{200, 201, 202},{210, 211, 212},{220, 221, 222},{230, 231, 232}}};
		
		System.out.print(arrayName[2][1][1]);
	}
}