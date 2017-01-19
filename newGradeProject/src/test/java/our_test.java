/**
 * Created by localadmin on 1/19/17.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class our_test {
    @Test
    public void createCar_withNoGas(){
        Car car = new Car();
        assertEquals(0, car.gasInTank);
    }

    @Test
    public void createCar_carIsBeingDriven(){
        Car car = new Car(true);
        assertTrue(car.IsBeingDriven);
    }

    @Test
    public void createCar_recordingOdometerSettings(){
        Car car = new Car();
        car.recordOdometerMileage(10);
        assertEquals(10, car.odometer);
        car.recordOdometerMileage(10);
        assertEquals(20, car.odometer);
    }

    @Test
    public void createCar_FillGasTank_PremiumOnly(){
        Car car = new Car();
        car.fillGasTank(10);
        assertEquals(10, car.gasInTank);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createCar_driveUntilOutOfGas(){
        Car car = new Car(true);
        car.fillGasTank(10);
        car.recordOdometerMileage(500);

       car.recordOdometerMileage(100);
    }

}
