import java.util.Objects;

public class Smartphones extends ElectronicDevices{
    private double width;
    private String processor;
    private double storage;
    private double memory;

    public Smartphones() {
    }

    public Smartphones(double width, String processor, double storage, double memory) {
        this.width = width;
        this.processor = processor;
        this.storage = storage;
        this.memory = memory;
    }

    public Smartphones(String name, String producingCompany, double weight, double price, double width, String processor, double storage, double memory) {
        super(name, producingCompany, weight, price);
        this.width = width;
        this.processor = processor;
        this.storage = storage;
        this.memory = memory;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Smartphones{" +
                "width=" + width +
                ", processor='" + processor + '\'' +
                ", storage=" + storage +
                ", memory=" + memory +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Smartphones o1) {
            return this.width == o1.width && Objects.equals(this.processor, o1.processor)
                    && this.storage == o1.storage && this.memory == o1.memory;

        }else
            return false;
    }
//double width;
//    private String processor;
//    private double storage;
//    private double memory
    @Override
//    public void printReport() {
//        StringBuilder widthBuilder = new StringBuilder(18);
//        StringBuilder processorBuilder = new StringBuilder(20);
//        StringBuilder storageBuilder = new StringBuilder(10);
//        StringBuilder memoryBuilder = new StringBuilder(10);
//        widthBuilder.append(width);
//        processorBuilder.append(processor);
//        storageBuilder.append(storage);
//        memoryBuilder.append(memory);
//        System.out.println("Electronic  Devices     "+"Screen width     "+"Processor type      "+"Storage   "+"Memory    ");
//        System.out.println("smart phone             "+widthBuilder+""+processorBuilder+""+storageBuilder+""+memoryBuilder);




    public void printReport() {
        System.out.println(
                "Type          "+"Smartphones" +
                "\nwidth is      " + width +
                "\nprocessor is  " + processor  +
                "\nstorage is    " + storage +
                "\nmemory is     " + memory );
    }


}
