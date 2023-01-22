package Herencias;

import Clase.SmartDevice;

public class SmartPhone extends SmartDevice {
    public String brand;
    public String model;
    public Double screenSize;
    public String screenType;

    public Double high;
    public String color;
    public String source;
    public Double weight;
    public int ramMemory;
    public String processor;

    public SmartPhone (){}

    public SmartPhone(String brand, String model, Double screenSize, String screenType, Double high, String color, String source, Double weight, int ramMemory, String processor) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.screenType = screenType;

        this.high = high;
        this.color = color;
        this.source = source;
        this.weight = weight;
        this.ramMemory = ramMemory;
        this.processor = processor;
    }

    public SmartPhone(String conexion, String brand, String model, Double screenSize, String screenType, Double high, String colo, String source, Double weight, int ramMemory, String processor) {
        super(conexion);
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.screenType = screenType;
        this.high = high;
        this.color = colo;
        this.source = source;
        this.weight = weight;
        this.ramMemory = ramMemory;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", screenType='" + screenType + '\'' +
                ", high=" + high +
                ", color='" + color + '\'' +
                ", source='" + source + '\'' +
                ", weight=" + weight +
                ", ramMemory=" + ramMemory +
                ", processor='" + processor + '\'' +
                ", conexion='" + conexion + '\'' +
                '}';
    }
}
