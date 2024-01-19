package inheritance2;

public class Balok extends BangunRuang {
    double p;
    double l;
    double t;

    @Override
    double volume(){
        double volume = (p * l * t);
        return volume;
    }

    @Override
    double luaspermukaan(){
        double luaspermukaan = (2 * ((p * l) + (p * t) + (l * t)));
        return luaspermukaan;
    }
}