import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> garage;

    public Garage() {
        this.garage = new ArrayList<>();
        garage.add(new Car("Toyota", "4Runner"));
        garage.add(new Car("BMW", "M4"));
        garage.add(new Car("Mercedes Benz", "C300"));
        garage.add(new Car("Audi", "A6"));
    }

    public void addCar(Car car) {
        garage.add(car);
    }

    public void set(int index, Car car) {
        garage.set(index, car);
    }

    public Car get(int index) {
        return garage.get(index);
    }

    public List<Car> getGarage() {
        return garage;
    }

    public void setGarage(List<Car> garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "Garage [garage=" + garage + "]";
    }

}
