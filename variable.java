public class variable{
    public static void main(String[] args) {
        String A = "merah";
        String B = "biru";

        String C ;

        C = A;
        A = B;
        B = C;

        System.out.println("ember A sekarang adalah "+A);
        System.out.println("ember B sekarang adalah "+B);
    }
}
