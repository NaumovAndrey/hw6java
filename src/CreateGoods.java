public class CreateGoods {
    Goods temp;

    public CreateGoods() {
        temp = new Goods();
        temp.setCount(1);
        temp.setName("No name");
        temp.setPrice(0.0);
        temp.setDescription(null);
    }
    public CreateGoods setCount(int count){
        temp.setCount(count);
        return this;
    }

    public CreateGoods setName(String name){
        temp.setName(name);
        return this;
    }

    public CreateGoods setPrice(double price){
        temp.setPrice(price);
        return this;
    }

    public CreateGoods setDescription(StringBuilder description){
        temp.setDescription(description);
        return this;
    }

    public Goods Create(){
        return temp;
    }
}
