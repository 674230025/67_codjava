package W13;

public class W13_01_introArray {

    public static void main(String[] args) {
        // ประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จำนวนข้อมูลล่วงหน้า
        String[] colors = {"Purple", "Cyan", "Blue", "Green", "Yellow", "Orang", "Red"};
        int[] banks = {20, 50, 100, 500, 1000};
        char[] alphabets = {'A', 'B', 'C', 'D', 'E'};

        // แสดงผลลัพธ์โดยใช้ index ของ Array
        System.out.println("The first color is " + colors[0]);
        System.out.println("THe Third alphabet is " + alphabets[2]);

        //แสดงผลลัพธ์โดยใช้ Loop
        System.out.println("colors in the array are: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(colors[i] + " ");

        }
        System.out.println(" ");
        System.out.println("========================================");
        for (int i = 6; i >= 0; i--) {
            System.out.print(colors[i] + " ");

        }
        System.out.println(" ");
        System.out.println("========================================");
        System.out.println("Banks in the array are ");
        for (int i = 0; i < banks.length; i++) { //ใช้ .length ในการหาขนาดของ Array
            System.out.print(banks[i] + " ");

        }
    }
}
