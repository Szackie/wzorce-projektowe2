import java.util.Date;

class App {
    public static void main(String [] args){
        DanePogodowe danePogodowe= new DanePogodowe();
        WarunkiBiezace warunkiBiezace=new WarunkiBiezace(danePogodowe);
        StatystykiPanel statystykiPanel=new StatystykiPanel(danePogodowe);
        PrognozaPanel prognozaPanel= new PrognozaPanel(danePogodowe);
        IndeksCieplaPanel indeksCieplaPanel= new IndeksCieplaPanel(danePogodowe);

        danePogodowe.ustawOdczyty(23f,0.405f,1080f);



        System.out.println();
        danePogodowe.ustawOdczyty(13f,0.644f,1014f);


    }
}
