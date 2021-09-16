package java.lesson6;

public abstract class AirTransport extends Transport {
    public void autoCharacteristics(int carPower, int speed, int weight, String brand) {
        System.out.println("Данные об автомобиле");
    }

    String wingSize() {
        return null;
    }

    int minLength() {
        return 0;
    }

}
