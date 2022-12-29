import java.util.*;

public class W2_HashMap{
    public static void main(String[] args){
        HashMap<Integer,String> hmap = new HashMap<>();
        hmap.put(1, "January");
        hmap.put(2, "February");
        hmap.put(3, "March");
        hmap.put(4, "April");
        hmap.put(5, "May");
        hmap.put(6, "June");
        hmap.put(7, "July");
        hmap.put(8, "August");
        hmap.put(9, "September");
        hmap.put(10, "October");
        hmap.put(11, "November");
        hmap.put(12, "December");

        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.print("請輸入 1~12？ ");
            input = sc.nextInt();
            if(input < 1 || input > 12){
                System.out.println("範圍錯誤！");
            }
        }while(input < 1 || input > 12);
        sc.close();
        System.out.printf("第 %d 月的英文單字為 %s", input, hmap.get(input));
    }
}