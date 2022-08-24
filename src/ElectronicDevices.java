public abstract class ElectronicDevices {
    private String name;
    private String producingCompany;
    private double weight;
    private double price;

    public ElectronicDevices() {
    }

    public ElectronicDevices(String name, String producingCompany, double weight, double price) {
        this.name = name;
        this.producingCompany = producingCompany;
        this.weight = weight;
        this.price = price;
    }

//    @Override
//    public String toString() {
//        return "ElectronicDevices{" +
//                "name='" + name + '\'' +
//                ", producingCompany='" + producingCompany + '\'' +
//                ", weight=" + weight +
//                ", price=" + price +
//                '}';
//    }

    public abstract String toString();

    public abstract boolean equals(Object o);

    public abstract void printReport();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducingCompany() {
        return producingCompany;
    }

    public void setProducingCompany(String producingCompany) {
        this.producingCompany = producingCompany;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
