package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");
		boolean forward = (x > y) && (y > z);
		boolean backward = (x < y) && (y < z);
		boolean isOrdered = forward || backward;
		System.out.println("Are x, y, and z ordered?     " + isOrdered);
	}
}
