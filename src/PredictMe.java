import java.util.Scanner;

public class PredictMe {

	public static void main(String[] args) {
		int danRodjenja;
		int mesecRodjenja;
		int godinaRodjenja;
		String datumRodjenja;
		int izborKorisnika;
		int izborHoroskopa;

		System.out.println("Unesite Vaš dan rođenja: ");
		Scanner scandIn = new Scanner(System.in);
		danRodjenja = scandIn.nextInt();
		if (danRodjenja >= 1 && danRodjenja <= 31) {
		} else {
			System.out.println("Niste uneli ispravan dan rođenja!");
			scandIn.close();
		}

		System.out.println("Unesite Vaš mesec rođenja: ");
		Scanner scanmesIn = new Scanner(System.in);
		mesecRodjenja = scanmesIn.nextInt();
		if (mesecRodjenja > 0 && mesecRodjenja <= 12) {
		} else {
			System.out.println("Niste uneli ispravan mesec rođenja!");
			scanmesIn.close();
		}

		System.out.println("Unesite Vašu godinu rođenja: ");
		Scanner scangodIn = new Scanner(System.in);
		godinaRodjenja = scangodIn.nextInt();
		if (godinaRodjenja < 2016) {
		} else {
			System.out.println("Niste uneli ispravnu godinu rođenja!");
			scangodIn.close();
		}

		datumRodjenja = (danRodjenja + "." + mesecRodjenja + "." + godinaRodjenja);
		System.out.println("Vaš datum rođenja je: " + datumRodjenja);

		

		System.out.println("Izaberite 1 ukoliko želite numerologiju ili 2 ukoliko želite horoskop: ");
		Scanner izborIn = new Scanner(System.in);
		izborKorisnika = izborIn.nextInt();
		if (izborKorisnika == 1) {
			System.out.println("Izabrali ste numerologiju");

			Numerologija num = new Numerologija();

			num.readFuture(danRodjenja, mesecRodjenja, godinaRodjenja);

		} else if (izborKorisnika == 2) {
			System.out.println("Izabrali ste horoskop");

			System.out.println("Za dnevni horoskop unesite 1, za mesečni 2, za godišnji 3");
			Scanner horoskopIn = new Scanner(System.in);
			izborHoroskopa = horoskopIn.nextInt();
			if (izborHoroskopa == 1) {
				System.out.println("Izabrali ste dnevni horoskop.");

				Dnevni h = new Dnevni();

				h.readFuture(danRodjenja, mesecRodjenja, godinaRodjenja);
			} else if (izborHoroskopa == 2) {
				System.out.println("Izabrali ste mesečni horoskop.");

				Mesecni h = new Mesecni();

				h.readFuture(danRodjenja, mesecRodjenja, godinaRodjenja);

			} else if (izborHoroskopa == 3) {
				System.out.println("Izabrali ste godišnji horoskop.");

				Godisnji h = new Godisnji();

				h.readFuture(danRodjenja, mesecRodjenja, godinaRodjenja);
			} else {
				System.out.println("Uneli ste pogrešan broj!");
				horoskopIn.close();
			}
		} else {
			System.out.println("Uneli ste pogrešan broj!");
			izborIn.close();
		}
	}
}
