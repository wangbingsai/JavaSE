package work.yukong;

/**
 * @Author 空白
 * @Date 2021/10/18 17:52
 * @Version 1.0
 */
public class DLLinkList extends Object{
   private GoodsNode node =new GoodsNode(0,"",0.0);
   public void add(GoodsNode goodsNode){
       GoodsNode temp = node;
        while (true){
            if(temp.next==null){
                break;
            }
            temp = temp.next;
        }
        temp.next = goodsNode;
   }
}
