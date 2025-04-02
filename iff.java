public class iff {

    public static void main(String[] args) {
        int x = 9 ;
        int y = 7 ;
        int z = 6;

        if (x > y && x > z)
            System.out.println(x);
        else if (y > x && y>z)
            System.out.println(y);
        else 
            System.out.println(z);

    }
}
