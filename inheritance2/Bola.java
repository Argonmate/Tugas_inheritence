package inheritance2;

public class Bola extends BangunRuang{
    double r;

    @Override
    double volume(){
        double volume = (4/3 * 3.14 * r * r *r);
    return volume;
    }

    @Override
    double luaspermukaan(){
        double luaspermukaan = (4 * 3.14 * r * r);
    return luaspermukaan;
    }
}
