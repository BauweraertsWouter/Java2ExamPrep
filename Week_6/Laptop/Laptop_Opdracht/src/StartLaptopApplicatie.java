import be.kdg.dao.LaptopDao;
import be.kdg.dao.LaptopData;
import be.kdg.laptop.Laptop;
import be.kdg.laptop.LaptopMap;

/**
 * Created by IntelliJ IDEA.
 * Author: Mark Goovaerts
 * Date: 5-dec-2010
 */
public class StartLaptopApplicatie {
    public static void main(String[] args) {
        LaptopMap laptopMap = new LaptopMap();
        LaptopData.vulMap(laptopMap);
        System.out.println("Testafdruk na aanmaken laptopMap:");
        for (Laptop laptop : laptopMap.getList(LaptopMap.SortCriterium.OP_NAAM)) {
            System.out.println(laptop);
        }

        LaptopDao dao = LaptopDao.getInstance();
        for (Laptop laptop : laptopMap.getList(LaptopMap.SortCriterium.OP_NAAM)) {
            dao.create(laptop);
        }

        System.out.println("\nNa aanmaken database. Alle laptops onder 700€ :");
        for (Laptop laptop : dao.retrieve(700)) {
            System.out.println(laptop);
        }

        dao.close();

    }
}
