class sellClass implements Runnable{
    static int total = 10000;
    int sold;
    Thread t;

    public sellClass(String name){
        sold = 0;
        t = new Thread(this, name);
        t.start();
    }

    synchronized private static boolean haveTickets(int num){
        if (total >= num){
            total -= num;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void run(){
        int sell = (int)(Math.random() * 4) + 1;
        while(haveTickets(sell)){
            sold += sell;
            System.out.printf("%s 此次賣了 %d 張票，目前賣了 %d 張\n", t.getName(), sell, sold);
        }
        System.out.printf("%s 最後共賣出 %d 張票\n", t.getName(), sold);
    }
}

public class W3_Tickets{
    public static void main(String[] args){
        new sellClass("機器A");
        new sellClass("機器B");
        new sellClass("機器C");
        new sellClass("機器D");
    }
}