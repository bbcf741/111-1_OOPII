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
            System.out.print("�п�J 1~12�H ");
            input = sc.nextInt();
            if(input < 1 || input > 12){
                System.out.println("�d����~�I");
            }
        }while(input < 1 || input > 12);
        sc.close();
        System.out.printf("�� %d �몺�^���r�� %s", input, hmap.get(input));
    }
}