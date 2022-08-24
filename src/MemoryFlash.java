import java.util.Objects;

public class MemoryFlash extends ElectronicDevices{
    private double strongGB;
    private String color;

    public MemoryFlash() {
    }

    public MemoryFlash(double strongGB, String color) {
        this.strongGB = strongGB;
        this.color = color;
    }

    public MemoryFlash(String name, String producingCompany, double weight, double price, double strongGB, String color) {
        super(name, producingCompany, weight, price);
        this.strongGB = strongGB;
        this.color = color;
    }

    public double getStrongGB() {
        return strongGB;
    }

    public void setStrongGB(double strongGB) {
        this.strongGB = strongGB;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MemoryFlash{" +
                "strongGB=" + strongGB +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof MemoryFlash o1) {
            return this.strongGB == o1.strongGB && Objects.equals(this.color, o1.color);

        }else
            return false;
    }

    @Override
//    public void printReport() {
//        StringBuilder strongGBBuilder = new StringBuilder(25);
//        StringBuilder colorBuilder = new StringBuilder(20);
//        strongGBBuilder.append(strongGB);
//        colorBuilder.append(color);
//        System.out.println("Electronic  Devices    "+"Storage capacity in GB   "+"Color");
//        System.out.println("Memory Flash           "+strongGBBuilder+""+colorBuilder);
//    }
    public void printReport() {
        System.out.println(
                "Type          "+"MemoryFlash" +
                "\nstrongGB is   " + strongGB +
                "\ncolor is      " + color );
    }

}
