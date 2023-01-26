public class StatystykiPanel implements Obserwator, PanelInformacyjny {
	private float tempMaks = 0.0f;
	private float tempMin = 200;
	private float tempSuma= 0.0f;
   private int liczbaPomiarow;
   private DanePogodowe danePogodowe;

   public StatystykiPanel(DanePogodowe danePogodowe) {
      this.danePogodowe = danePogodowe;
      danePogodowe.zarejestrujObserwator(this);
   }

   public void aktualizacja() {
       float temperatura=danePogodowe.getTemperatura();
		tempSuma += temperatura;
		liczbaPomiarow++;

		if (temperatura > tempMaks) {
			tempMaks = temperatura;
		}
 
		if (temperatura < tempMin) {
			tempMin = temperatura;
		}
      wyswietl();
   }

   public void wyswietl() {
      System.out.println("Temperatura średnia / maksymalna / minimalna = " + (tempSuma / liczbaPomiarow)
         + " / " + tempMaks + " / " + tempMin);
   }
}
