package be.kdg.dao;

import be.kdg.laptop.Laptop;

import java.sql.*;
import java.util.ArrayList;
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
            connection = DriverManager.getConnection("jdbc:hsqldb:file:Week_6/Laptop/Laptop_Opdracht/db/laptopdb", "sa", "");
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
            statement.close();
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
        Statement statement = null;
        try {
            //Opdracht 4
            statement = connection.createStatement();
            statement.execute("INSERT INTO laptops VALUES( NULL, '" + laptop.getNaam() +"', '"+ laptop.getProcessor() + "', "
                    + laptop.getRam() + ", " + laptop.getHardDisk() + ", " + laptop.getInch() + ", " + laptop.getPrijs() + ")");
        } catch (Exception e) {
            System.out.println("Fatal error: cannot create " + e);
        } finally {
            try {
                if (statement != null){
                    statement.close();
                }
            }catch (SQLException s){
                s.printStackTrace();
            }
        }
    }


    public List<Laptop> retrieve(double max) {
        Statement statement = null;
        try {
            //Opdracht 5
            statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM laptops WHERE prijs < " + max + ";");
            List<Laptop> laptops = new ArrayList<>();
            while (results.next()){
                laptops.add(new Laptop(results.getString("naam"), results.getString("processor"),
                        results.getInt("ram"), results.getInt("harddisk"),
                        results.getDouble("inch"), results.getDouble("prijs")));
            }
            return laptops;
        } catch (Exception e) {
            System.out.println("Error: cannot retrieve" + e);
            return null;
        } finally {
            try {
                if (statement != null){
                    statement.close();
                }
            }catch (SQLException s){
                s.printStackTrace();
            }
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




