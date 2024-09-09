package W13;

public class W13_03_Array_CountOddEven {

    public static void main(String[] args) {
        //ให้นับจำนวนเลขคู่และเลขตี่ใน Array ด้านล่าง

        int[] number = {1, 5, 6, 34, 12, 77, 11, 9, 3, 2, 8, 4, 7, 10, 13, 15, 16, 18, 20, 21};

        int CountOdd = 0;
        int CountEven = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
            if (number[i] % 2 == 0) {
                CountEven++;
            } else {
                CountOdd++;
            }
        }

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println("\n Amout of all number : " + number.length);
        System.out.println("\n Amout of odd number : " + CountOdd);
        System.out.println("\n Amout of Even number : " + CountEven);
    }
}
