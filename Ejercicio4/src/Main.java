import Clase.SmartDevice;
import Herencias.SmartPhone;
import Herencias.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone Xiaomi = new SmartPhone("WI-fi","Xiaomi","Redmi Note 11 K7TL",6.43,"FHD+",15.9,"black","Argentina",179.3,4,"SNAPDRAGON 680");

       /* System.out.println("SmartPhone");
        System.out.println(Xiaomi.conexion);
        System.out.println(Xiaomi.brand);
        System.out.println(Xiaomi.model);
        System.out.println(Xiaomi.screenSize);
        System.out.println(Xiaomi.screenType);
        System.out.println(Xiaomi.high);
        System.out.println(Xiaomi.color);
        System.out.println(Xiaomi.source);
        System.out.println(Xiaomi.weight);
        System.out.println(Xiaomi.ramMemory);
        System.out.println(Xiaomi.processor);
        System.out.println("\n");*/




        SmartWatch Haylou = new SmartWatch("Wi-fi","Haylou","LS02",7,"TFT","20 days","Blouetooth 5.0",38,true,true);

        /*System.out.println("SmartWatch");
        System.out.println(Haylou.conexion);
        System.out.println(Haylou.brand);
        System.out.println(Haylou.model);
        System.out.println(Haylou.screenSize);
        System.out.println(Haylou.screenType);
        System.out.println(Haylou.batteryDuration);
        System.out.println(Haylou.weight);
        System.out.println(Haylou.multiLenguage);
        System.out.println(Haylou.interchangeableMeshes);*/


        // esto muestra todo el objeto porq a cada uno le agregamos el toString
        System.out.println(Xiaomi);
        System.out.println(Haylou);
    }
}