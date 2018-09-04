
public class Mesecni extends Horoscope{

	@Override
	public void readFuture(int danRodjenja, int mesecRodjenja, int godinaRodjenja) {
		this.determine_sign(mesecRodjenja,danRodjenja);

		System.out.println("Mesecni Horoskp za vas znak : " + this.getSign() + " : ");

		System.out.println("Delujete sumnjičavo kada analizirate situaciju na poslovnom planu i ne verujete previše u nečiju priču. U susretu sa saradnicima izbegavajte " +
				"preteranu razmetljivost i sačekajte na završnu fazu. Vaše raspoloženje može da se shvati na različite načine, ali partner kao da nema previše " +
				"razumevanja za izgovore kojima pokušavate da se opravdate. Potrudite se da bolje uskladite zajednički odnos. Sugestija: Prijaće Vam izlazak ili " +
				"psiho-fizička relaksacija, opustite se.");





	}
		
}


