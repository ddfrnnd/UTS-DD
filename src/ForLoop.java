public class ForLoop {
    public static void main(String[] args) {
        for (int x = 1; x < 100; x++) {
            System.out.println(x);
        }

        String status;
        for (int angka = 10; angka < 90;angka++){
            if (angka % 2 == 0){
                status = "angka genap";
            }else{
                status = "angka ganjil";
            }
            System.out.println(angka + " adalah " + status);
        }

        //for (int angka = 12; angka <= 156; angka += 2) {
            //System.out.println(angka);

        //}
    }
}