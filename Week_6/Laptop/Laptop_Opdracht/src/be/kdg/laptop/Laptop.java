package be.kdg.laptop;

public final class Laptop implements Comparable<Laptop>{
    private int id;
    private String naam;
    private String processor;
    private int ram;
    private int hardDisk;
    private double inch;
    private double prijs;

    public Laptop(String naam, String processor, int ram, int hardDisk, double inch, double prijs) {
        this.naam = naam;
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.inch = inch;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public double getInch() {
        return inch;
    }

    @Override
    public String toString() {
        return String.format("%-30s (%-30s RAM:%2dGB HD:%4dGB %5.1finch %8.2f)",
                naam, processor, ram, hardDisk, inch, prijs);
    }

    @Override
    public int compareTo(Laptop o) {
        if (this == o){
            return 0;
        }else if(this.equals(o)){
            return 0;
        }else {
            return this.getNaam().compareTo(o.getNaam());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        return getNaam().equals(laptop.getNaam());
    }

    @Override
    public int hashCode() {
        return getNaam().hashCode();
    }
}
