public class Car {
    String banrand;
    int maxSpeed;
    public Car(String banrand, int maxSpeed) {
        this.banrand = banrand;
        this.maxSpeed = maxSpeed;
    }
    public Car(){

    }
    public void run(String banrand, int maxSpeed) {
        System.out.printf("Xe %s dang chay voi toc do toi da %d km/h",banrand,maxSpeed);
    }
}
