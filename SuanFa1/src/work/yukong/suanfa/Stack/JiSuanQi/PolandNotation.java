package work.yukong.suanfa.Stack.JiSuanQi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author 空白
 * @Date 2022/3/26 23:35
 * @Version 1.0
 */

public class PolandNotation {

    public static void main(String[] args) {
        String t = "3*6-2*6*4+6*5-5";
        System.out.println(toInFixExpressionList(t));
        System.out.println(parseSuffixExpressionList(toInFixExpressionList(t)));
        System.out.println(cal(parseSuffixExpressionList(toInFixExpressionList(t))));
    }
    public static List<String> toInFixExpressionList(String s){
        int index = 0;
        String str ;
        char c ;
        ArrayList<String> list = new ArrayList<String>();
        while (index < s.length()) {
            //如果这个不是数字直接添加到集合中
             if ((c = s.charAt(index)) < 48 || s.charAt(index) > 57) {
                 list.add(c+"");
                 index++;
             } else {
                 //判断是否为多位数，是的话进行字符串拼接
                 str = "";
                 while (index < s.length() && (c = s.charAt(index)) >= 48 && s.charAt(index) <= 57) {
                     str += c;
                     index++;
                 }
                 list.add(str);
                 str = "";
             }
        }
        return list;
    }
    /**
     * 1. 初始化两个栈：运算符栈 s1 和储存中间结果的栈 s2；
     *
     * 2. 从左至右扫描中缀表达式；
     *
     * 3. 遇到操作数时，将其压 s2；
     *
     * 4. 遇到运算符时，比较其与 s1 栈顶运算符的优先级：
     *
     *    1.如果 s1 为空，或栈顶运算符为左括号“(”，则直接将此运算符入栈；
     *
     *    2.否则，若优先级比栈顶运算符的高，也将运算符压入 s1；
     *
     *    3.否则，将 s1 栈顶的运算符弹出并压入到 s2 中，再次转到(4-1)与s1 中新的栈顶运算符相比较；
     *
     * 5. 遇到括号时：
     *
     *    1.  如果是左括号“(”，则直接压入 s1
     *
     *    2.  如果是右括号“)”，则依次弹出 s1 栈顶的运算符，并压入s2，直到遇到左括号为止，此时将这一对
     *
     * 6. 重复步骤 2 至 5，直到表达式的最右边
     *
     * 7. 将 s1 中剩余的运算符依次弹出并压入 s2
     *
     * 8. 依次弹出 s2 中的元素并输出，结果的逆序即为中缀表达式对应的后缀表达式
     */
    public static List<String> parseSuffixExpressionList(List<String> list){
        //初始化符号栈s1
        Stack<String> s1 = new Stack<String>();
        //因为结果集不需要进行弹栈，所以不用创建栈，直接创建集合存储就可以
        ArrayList<String> s2 = new ArrayList<String>();
        int i = 0;
        //从左到右依次扫描中缀表达式
        for (String item : list) {
            if (item.matches("\\d+")) {
                s2.add(item);
                //如果是左括号“(”，则直接压入 s1
            }else if (item.equals("(")) {
                s1.push(item);
                //如果是右括号“)”，则依次弹出 s1 栈顶的运算符，并压入s2，直到遇到左括号为止，此时将这一对括号弹出
            }else if (item.equals(")")) {
                while (!s1.peek().equals("(")) {
                    s2.add(s1.pop());
                }
                //弹出左括号
                s1.pop();
                /**
                 * 遇到运算符时，比较其与 s1 栈顶运算符的优先级：
                 * 1.如果 s1 为空，或栈顶运算符为左括号“(”，则直接将此运算符入栈；
                 * 2.否则，若优先级比栈顶运算符的高，也将运算符压入 s1；
                 * 3.否则，将 s1 栈顶的运算符弹出并压入到 s2 中，再次转到(4-1)与s1 中新的栈顶运算符相比较；
                 */
            }else{
                //错误代码！！！不能重复比较所以不能用选择结构只能用循环结构
                /*if (s1.isEmpty() || s1.peek().equals("(")){
                    s1.push(item);
                    //如果栈顶运算符小于item运算符优先级直接入栈
                }else if (Priority.getPriority(s1.peek()) < Priority.getPriority(item)) {
                    s1.push(item);
                }else{
                    //如果不小于将栈顶运算符弹出添加到运算集合中，再将当前运算符压入栈中
                    s2.add(s1.pop());
                    s1.push(item);
                }*/

                //如果符号栈不为空，用当前符号和栈顶运算符比较优先级，如果大于等于此运算符，直接弹出并且加入s2
                while (s1.size() != 0 && Priority.getPriority(s1.peek()) >= Priority.getPriority(item)){
                    s2.add(s1.pop());
                }
                //然后将此运算符入s1符号栈
                s1.push(item);
            }
        }
        while (!s1.isEmpty()) {
            s2.add(s1.pop());
        }
        return s2;
    }
    //计算方法
    public static int cal(List<String> list){
        //创建一个栈
        Stack<String> stack = new Stack<String>();
        //用于存放结果
        int res = 0;
        for (String s : list) {
            //如果是数字直接压栈
            if (s.matches("\\d+")) {
                stack.push(s);
                //是运算符直接弹出两个栈顶数进行计算
            }else{
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                switch (s) {
                    case "+" :
                        res = num1 + num2;
                        break;
                    case "-" :
                        res = num2 - num1;
                        break;
                    case "*" :
                        res = num1 * num2;
                        break;
                    case "/" :
                        res = num2 / num1;
                        break;
                    default:
                        System.out.println("运算符有误！");
                        break;
                }
                stack.push(res+"");

            }
        }
        return res;

    }
}
class Priority{
    private static int SUM = 1;
    private static int SUB = 1;
    private static int MUL = 2;
    private static int DIV = 2;
    public static int getPriority(String str){
        int result = 0;
        switch (str) {
            case "+" :
                result = SUM;
                break;
            case "-" :
                result = SUB;
                break;
            case "*" :
                result = MUL;
                break;
            case "/" :
                result = DIV;
                break;
            default:
                System.out.println("符号有误！");
                break;
        }
        return result;
    }
}
