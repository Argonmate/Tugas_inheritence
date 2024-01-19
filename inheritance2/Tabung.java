package inheritance2;

public class Tabung extends BangunRuang {
    double r;
    double t;

    @Override
    double volume(){
        double volume = (3.14 * r * r * t);
        return volume;
    }
    
    @Override
    double luaspermukaan(){
        double luaspermukaan = (2 * 3.14 * r * (r + t));
        return luaspermukaan;
    }
}
