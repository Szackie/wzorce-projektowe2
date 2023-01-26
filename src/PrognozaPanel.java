public class PrognozaPanel implements Obserwator, PanelInformacyjny {
	private float biezaceCisnienie = 1010.1f;
	private float poprzednieCisnienie;
   private DanePogodowe danePogodowe;

   public PrognozaPanel(DanePogodowe danePogodowe) {
      this.danePogodowe = danePogodowe;
      danePogodowe.zarejestrujObserwator(this);
   }

   public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
      poprzednieCisnienie = biezaceCisnienie;
      biezaceCisnienie = cisnienie;
      wyswietl();
   }

   public void wyswietl() {
		System.out.print("Prognoza pogody: ");
		if (biezaceCisnienie > poprzednieCisnienie) {
			System.out.println("Niebawem znacząca poprawa pogody!");
		} else if (biezaceCisnienie == poprzednieCisnienie) {
			System.out.println("Bieżąca pogoda się utrzyma.");
		} else if (biezaceCisnienie < poprzednieCisnienie) {
			System.out.println("Przygotuj się na nadejście chłodniejszych, deszczowych dni!");
		}
   }
}
