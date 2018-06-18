
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// args[0] = "Hallo";
		System.out.println(args.length);
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		if (args[5].equals("Leoben!")) {
			System.out.println("Leoben ist meine Stadt ;-)");
		}
	}

}
