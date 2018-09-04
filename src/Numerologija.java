
public class Numerologija implements PredictFutureInterface{


	@Override
	public void readFuture(int danRodjenja,int mesecRodjenja,int godinaRodjenja) {

		String str = danRodjenja+""+mesecRodjenja+""+godinaRodjenja;

		// ideja od:  http://codereview.stackexchange.com/questions/86726/summing-digits-of-an-alphanumeric-string
		// saberi cifre , prvi prolaz
		int total = 0;

		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				total += Character.getNumericValue(c);
			}
		}


		// saberi u drugom , konacnom prolazu

		String totalStr = "" + total;  //kastujemo u string

		int konacniZbir = 0;

		for (char c : totalStr.toCharArray()) {
			if (Character.isDigit(c)) {
				konacniZbir += Character.getNumericValue(c);
			}
		}

		System.out.println("Numerologija broj je: " + konacniZbir);
	}


}
