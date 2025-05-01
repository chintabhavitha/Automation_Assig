package assignments;

import java.util.ArrayList;

public class Assignment12_powerOfN {

	public static void main(String[] args) {
		double x [] = {2.00000, 2.100000, 2.00000};
		int n [] = {10,3,-2};

//		ArrayList<Double> x = new ArrayList<>();
//		x.add(2.00000);
//		x.add(2.100000);
//		x.add(2.00000);
//
//		ArrayList<Integer> n = new ArrayList<>();
//		n.add(10);
//		n.add(3);
//		n.add(-2);

		// if you use list then instead of length use size() and  instead of x[i] use x.get(i)

		for (int i = 0; i < x.length; i++) { 
			double xValues = x[i];
			int nValues = n[i];
			double output = 1;

			if (nValues == 0) {
				output = 1;
			} else {
				if (nValues < 0) {
					xValues = 1 / xValues;
					nValues = -nValues;
				}
				for (int j = 0; j < nValues; j++) {
					output = output * xValues;
				}
			}
			System.out.println("For x = " + xValues + " and n =" + nValues + "  is " + output);
		}

	}

}
