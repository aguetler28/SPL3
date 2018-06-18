
public class Taschenrechner {

	public static void main(String args[]) {
		if (args.length != 3) {
			System.out.println("usage java Taschenrechner <zahl> <operator> <zahl> ("+args.length+")");
		} else {
			int zahl1 = Integer.parseInt(args[0]);
			int zahl2 = Integer.parseInt(args[2]);
			String operator = args[1];
			double result = 0;
			if (operator.equals("+")) {
				result = zahl1 + zahl2;
			}
			if (operator.equals("-")) {
				result = zahl1 - zahl2;
			}
			if (operator.equals("x")) {
				result = zahl1 * zahl2;
			}
			if (operator.equals("/")) {
				result = (double)zahl1 / (double)zahl2;
			}
			System.out.println(zahl1 + " " + operator + " " + zahl2 + " = " + (double)result);
		}
	}
}
