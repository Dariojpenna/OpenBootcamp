package Herencias;


import Clase.SmartDevice;

public class SmartWatch extends SmartDevice {

    public String brand;
    public String model;
    public int screenSize;
    public String screenType;
    public String batteryDuration;
    public String conectivity;
    public int weight;
    public boolean multiLenguage;

    public boolean interchangeableMeshes;

    public SmartWatch(){}

    public SmartWatch(String brand, String model, int screenSize, String screenType, String batteryDuration, String conectivity, int weight, boolean multiLenguage, boolean interchangeableMeshes) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.screenType = screenType;
        this.batteryDuration = batteryDuration;
        this.conectivity = conectivity;
        this.weight = weight;
        this.multiLenguage = multiLenguage;
        this.interchangeableMeshes = interchangeableMeshes;

    }

    public SmartWatch(String conexion, String brand, String model, int screenSize, String screenType, String batteryDuration, String conectivity, int weight, boolean multiLenguage, boolean interchangeableMeshes) {
        super(conexion);
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.screenType = screenType;
        this.batteryDuration = batteryDuration;
        this.conectivity = conectivity;
        this.weight = weight;
        this.multiLenguage = multiLenguage;
        this.interchangeableMeshes = interchangeableMeshes;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", screenType='" + screenType + '\'' +
                ", batteryDuration='" + batteryDuration + '\'' +
                ", conectivity='" + conectivity + '\'' +
                ", weight=" + weight +
                ", multiLenguage=" + multiLenguage +
                ", interchangeableMeshes=" + interchangeableMeshes +
                ", conexion='" + conexion + '\'' +
                '}';
    }
}
