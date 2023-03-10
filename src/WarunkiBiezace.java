import java.util.Date;

public class WarunkiBiezace implements Obserwator,PanelInformacyjny{
        private float aktualnaTemperatura;
        private float aktualneCisnienie;
        private float aktualnaWilgotnosc;
        private Date dataPomiaru;
        private DanePogodowe danePogodowe;

    public WarunkiBiezace(DanePogodowe danePogodowe){
        this.danePogodowe=danePogodowe;
        danePogodowe.zarejestrujObserwator(this);
    }
    @Override
    public void aktualizacja() {
        aktualnaTemperatura=danePogodowe.getTemperatura();
        aktualnaWilgotnosc=danePogodowe.getWilgotnosc();
        aktualneCisnienie=danePogodowe.getCisnienie();
        dataPomiaru=new Date();
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Data aktualizacji: "+dataPomiaru);
        System.out.println("Temp.: "+aktualnaTemperatura);
        System.out.println("Cisnienie: "+aktualneCisnienie);
        System.out.println("Wilgotnosc: "+aktualnaWilgotnosc);
    }
}
