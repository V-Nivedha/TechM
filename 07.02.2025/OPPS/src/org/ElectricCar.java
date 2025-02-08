package src.org;

public class ElectricCar  extends Car{
private int batteryrange;
public ElectricCar(String make, String model,int year,int batteryrange){
    super(make,model,year);
    this.batteryrange=batteryrange;
}
    public void setBatteryRange(int batteryRange) {
        this.batteryrange = batteryRange;


    }
    public int getBatteryRange() {
        return batteryrange;
    }
    public void chargeBattery() {
        System.out.println("Charging the battery ....");
    }
    public void startEngine() {
        System.out.println("The electric engine of " + getmake() + " " + getmodel() + " has started silently.");
                    }
}

