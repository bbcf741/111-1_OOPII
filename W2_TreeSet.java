import java.util.*;

public class W2_TreeSet{
    public static void main(String[] args){
        System.out.println("電腦從 1~100 的整數中，亂數取出 10 個不重複的號碼....");

        TreeSet<Integer> tset = new TreeSet<Integer>();
        int tsize = 0;
        while(tset.size() < 10){
            int num = (int)(Math.random() * 100) + 1;
            tset.add(num);
            if(tset.size() - tsize == 1)
                System.out.println("第 " + tset.size() + " 個號碼：" + num);
            tsize = tset.size();
        }

        System.out.println("物件內元素個數為：" + tset.size());
        System.out.println("物件內元素的內容：" + tset);
        System.out.println("第一個元素內容為：" + tset.first());
        System.out.println("最後一個元素內容：" + tset.last());
        System.out.println("內容介於 30～70 者：" + tset.subSet(30, 70));
    }
}