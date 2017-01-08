package be.kdg.dao;

import be.kdg.laptop.Laptop;
import be.kdg.laptop.LaptopMap;

public class LaptopData {
    public static void vulMap(LaptopMap map) {
        map.voegToe(new Laptop("Acer TravelMate 5730G", "Intel Core 2 Duo T6670", 4, 640, 15.4, 724));
        map.voegToe(new Laptop("HP Compaq 610", "Intel Celeron T1500", 2, 160, 15.6, 445));
        map.voegToe(new Laptop("Acer Ferrari 1100", "Dual-Core processor TL60", 2, 160, 12.1, 845));
        map.voegToe(new Laptop("Esprimo Mobile V5535", "Intel Core 2 Duo T2390", 1, 120, 15.4, 1052));
        map.voegToe(new Laptop("HP 6830s", "Core2Duo T5870", 2, 250, 17, 729));
        map.voegToe(new Laptop("HP 6730b", "Core2Duo P8400", 3, 160, 17, 709));
        map.voegToe(new Laptop("Samsung R730-JA05", "Intel Pentium Dual-Core", 3, 320, 17.3, 538));
        map.voegToe(new Laptop("Asus Eee PC 1015PE", "Intel Atom", 1, 250, 10.1, 309));
        map.voegToe(new Laptop("Toshiba Satellite L670-187", "Intel Core i3", 4, 500, 17.3, 674));
        map.voegToe(new Laptop("Apple MacBook 13,3 (MC516)", "Intel Core 2 Duo", 2, 250, 13.3, 979));
    }
}
