package java.lesson6;

public abstract class RoadTransport extends Transport {
    private int wheel;

    abstract int wheel();

    abstract int fuelConsumption();

    public void RoadTransport(int wheel, int fuelConsumption) {
    this.wheel = wheel;

    }


    public void autoCharacteristics(int carPower, int speed, int weight, String brand) {
        System.out.println("Данные об автомобиле:" + carPower + speed + weight + brand);
    }
}


