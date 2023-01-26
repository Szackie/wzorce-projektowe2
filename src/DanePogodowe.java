import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DanePogodowe implements Podmiot{
    List<Obserwator> obserwatorList;
private float temperatura;
private float wilgotnosc;
private float cisnienie;

    DanePogodowe(){
        obserwatorList=new ArrayList<>();
    }


    public void zarejestrujObserwator(Obserwator obserwator) {
        obserwatorList.add(obserwator);
    }


    public void usunObserwator(Obserwator obserwator) {
        obserwatorList.remove(obserwator);
    }


    public void powiadomObserwatory() {
        for(Obserwator obserwator: obserwatorList)
            obserwator.aktualizacja(getTemperatura(),getWilgotnosc(),getCisnienie());
    }
    public void zmienionoOdczyty(){
        powiadomObserwatory();
    }
    public float getTemperatura() {
        return temperatura;
    }



    public float getWilgotnosc() {
        return wilgotnosc;
    }


    public float getCisnienie() {
        return cisnienie;
    }

    public void ustawOdczyty(float temperatura,float wilgotnosc, float cisnienie){
        this.temperatura=temperatura;
        this.wilgotnosc=wilgotnosc;
        this.cisnienie=cisnienie;

        zmienionoOdczyty();

    }

}
