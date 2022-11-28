public class Main {
    public static void main(String[] args) {
        Goods currentGoods = new Goods();
        System.out.println(currentGoods);

        currentGoods = new CreateGoods().setCount(40).setName("Petrov").Create();
        System.out.println(currentGoods);
    }
}