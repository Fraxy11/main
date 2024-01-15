public class Pengitungan {
    public static void main(String[] args){
        for (int a = 1; a <= 100; a++) {
        if (a % 3 == 0 && a % 5 == 0){
            System.out.println("Snip-snap");
        }
        else if (a % 5 == 0){
            System.out.println("snap");
        }
        else if (a % 3 == 0){
            System.out.println("Snip");
        }
        else {
            System.out.println(a);
        }
        }
        }
        
    } 


