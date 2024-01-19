package inheritance2;

public class leinheritance {
    public static void main(String[] args) {
        
        BangunRuang bangunRuang = new BangunRuang();

        Bola bola = new Bola();
        bola.r = 5;

        Balok balok = new Balok();
        balok.p = 20;
        balok.l = 10;
        balok.t = 30;

        LimasSegitiga limasSegitiga = new LimasSegitiga();
        limasSegitiga.a = 10;
        limasSegitiga.t = 15;

        Tabung tabung = new Tabung();
        tabung.r = 5;
        tabung.t = 12;

        bola.volume();
        bola.luaspermukaan();

        balok.volume();
        balok.luaspermukaan();

        limasSegitiga.volume();
        limasSegitiga.luaspermukaan();

        tabung.volume();
        tabung.luaspermukaan();
        
    }
}