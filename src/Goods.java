public class Goods {
    private int count;
    private String name;
    private double price;
    private StringBuilder description;

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(StringBuilder description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "count=" + count +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description=" + description +
                '}';
    }
}
