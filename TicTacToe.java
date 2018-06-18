
public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] spielfeld = new String[3][3];
		
		// Spieler 1 => x
		// Spieler 2 => o
		
		// sieger festlegen:
		spielfeld[0][0] = "x";
		spielfeld[1][1] = "x";
		spielfeld[2][2] = "x";
		
		if (isWinner("x", spielfeld)) {
			System.out.println("Spieler 1 (x) hat gewonnen");
		}
		System.out.println(spielfeld.length);
		System.out.println(spielfeld[0].length);
	}
	
	public static boolean isWinner(String zeichen, String[][] spielfeld) {
		// Todo: add some code here
		int punkte = 0;
		for (int diagonal = 0; diagonal < spielfeld[0].length; diagonal++) {
			if (spielfeld[diagonal][diagonal].equals(zeichen)) {
				punkte++;
			}
		}
		if (punkte == 3) {
			return true;
		}
		return false;
	}

}
