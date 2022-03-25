package work.yukong;

/**
 * @Author 空白
 * @Date 2021/10/20 11:05
 * @Version 1.0
 */
public class GoodsNode {
    public int id;
    public String name;
    public double price;
    public GoodsNode next;
    public GoodsNode(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
