package be.kdg.dao;

import be.kdg.laptop.Laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.List;

public class LaptopDao {
    private static LaptopDao instance = new LaptopDao();
    private Connection connection;

    /**
     * private constructor, want singleton pattern
     */
    private LaptopDao() {
        final String driverName = "org.hsqldb.jdbcDriver";
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            System.out.println("Fatal error: cannot load database driver " + driverName);
        }
        connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:hsqldb:file:db/laptopdb", "sa", "");
        } catch (SQLException e) {
            System.out.println("Fatal error: cannot get a connection to the database " + e);
        }
        try {
            Statement statement = connection.createStatement();
            //Eerst de bestaande tabel weg:
            statement.execute("DROP TABLE laptops");
            //Daarna een verse, lege tabel aanmaken:
            statement.execute("CREATE TABLE laptops (id INTEGER IDENTITY, naam CHAR(20), processor CHAR(20), " +
                    "ram INTEGER, harddisk INTEGER, inch DOUBLE, prijs DOUBLE)");
        } catch (SQLException e) {
            // ok, tabel bestond al
        }
    }

    /**
     * static methode getInstance, want singleton pattern
     */
    public static LaptopDao getInstance() {
        return instance;
    }

    public void create(Laptop laptop) {
        try {
            //Opdracht 4
        } catch (Exception e) {
            System.out.println("Fatal error: cannot create " + e);
        }
    }


    public List<Laptop> retrieve(double max) {
        try {
            //Opdracht 5
            return Collections.emptyList();
        } catch (Exception e) {
            System.out.println("Error: cannot retrieve" + e);
            return null;
        }
    }

    public void close() {
        try {
            Statement statement = connection.createStatement();
            statement.execute("SHUTDOWN");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: cannot close connection " + e);
        }
    }
}




