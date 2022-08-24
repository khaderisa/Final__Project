import java.util.Objects;

public class CoffeeMachines extends ElectronicDevices{
    private double capacity;
    private String filter;

    public CoffeeMachines() {
    }

    public CoffeeMachines(double capacity, String filter) {
        this.capacity = capacity;
        this.filter = filter;
    }

    public CoffeeMachines(String name, String producingCompany, double weight, double price, double capacity, String filter) {
        super(name, producingCompany, weight, price);
        this.capacity = capacity;
        this.filter = filter;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }


    @Override
    public String toString() {
        return "CoffeeMachines{" +
                "capacity=" + capacity +
                ", filter='" + filter + '\'' +
                '}';
    }
// this.capacity = capacity;
//        this.filter = filter;
    @Override
    public boolean equals(Object o) {
        if (o instanceof CoffeeMachines o1) {
            return this.capacity == o1.capacity && Objects.equals(this.filter, o1.filter);

        }else
            return false;
    }

    @Override
//    public void printReport() {
//        StringBuilder capacityBuilder = new StringBuilder(15);
//        StringBuilder filterBuilder = new StringBuilder(20);
//        capacityBuilder.append(capacity);
//        filterBuilder.append(filter);
//        System.out.println("Electronic  Devices    "+"Cup capacity   "+"Type of filter");
//        System.out.println("Coffee Machines        "+capacityBuilder+""+filterBuilder);
//
//    }
    public void printReport() {
        System.out.println(
                "Type          "+"CoffeeMachines" +
                "\ncapacity is   " + capacity +
                "\nfilter is     " + filter );
    }
}
