package inheritance2;

public class LimasSegitiga extends BangunRuang{
    double a;
    double t;

    @Override
    double volume(){
        double volume = (1/3 * a * t);
        return volume;
    }

    @Override
    double luaspermukaan(){
        double luaspermukaan = (1/2 * a * t);
        return luaspermukaan;
    }
}
