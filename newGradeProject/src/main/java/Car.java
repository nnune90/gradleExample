/**
 * Created by localadmin on 1/19/17.
 */
public class Car {
    int gasInTank = 0;
    boolean IsBeingDriven;
    int odometer = 0;
    final int AVERAGEMILESPERGALLON = 50;
    Car(){}

    Car(boolean carBeingDriven){
        this.IsBeingDriven = carBeingDriven;
    }

    public void recordOdometerMileage(int miles){
        this.odometer += miles;
        consumeGas(miles);
    }

    public void fillGasTank(int gallonsToAdd){
        this.gasInTank += gallonsToAdd;
    }

    public void consumeGas(int milesDriven)
    {
        float consumedGas = milesDriven / AVERAGEMILESPERGALLON;
        if (this.gasInTank - consumedGas >= 0)
        {
            this.gasInTank -= consumedGas;
        }
        else { throw new IllegalArgumentException("Warning: you are out of gas"); }
    }
}
