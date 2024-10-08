// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 
package W12;

public class W12_00_exLoopWhile {

    public static void main(String[] args) {

        // System.out.println("รอบที่ 1");
        // System.out.println("รอบที่ 2");
        // System.out.println("รอบที่ 3");
        // System.out.println("รอบที่ 4");
        // System.out.println("รอบที่ 5");
// โครงสร้างคำสั่งลูป for แบ่งออกเป็น 3 ส่วน
// 1. ส่วนตัวแปรเริ่มต้น
// 2. เงื่อนไข
// 3. การเพิ่มค่า / การลดค่า
// TODO
        for (int i = 1; i <= 5; i++) {
            // คำสั่งที่ต้องการให้ทำซ้ำ
            System.out.println("รอบที่ " + i + " ");
        }

// =================================TODO 1 - End For Loop=====================================
        int n1 = 1;

        while (n1 <= 5) {
            System.out.println("รอบที่ " + n1);
            n1++;
        }

//คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello World
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World
// TODO
        System.out.println("\n");

        for (int j = 1; j <= 5; j++) {
            System.out.print(" รอบที่ " + j + " Hello World ");
        }
        System.out.print("----------------------------------------------");
        System.out.println("TODO 2 While Loop");
// ======================================================================
// TODO 3
//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10
        System.out.println(" ");
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
            sum = sum + j; // sum + =j;

            System.out.println("= " + sum);
        }
// ======================================================================
// TODO 4
//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55

        System.out.println("\n ");
        sum = 0;
        for (int j = 1; j <= 10; j++) {
            System.out.print(j);
            if (j < 10) {
                System.out.println(" " + j);
            } else {
                System.out.println(" " + j + " = " + sum);
            }
        }
// ======================================================================
// TODO 5
//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55
        System.out.println("\n");
        sum = 0;
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
            if (j < 10) {
                System.out.print(j + " +");
            } else {
                System.out.println(j + " = " + sum);
            }
        }
// ========
// ======================================================================
//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// TODO 6
// 10 9 8 7 6 5 4 3 2 1
        for (int j = 10; j > 1; j--) {
            System.out.println(j + " ");

        }
// ======================================================================
//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============
// TODO 7
// 1 3 5 7 9 11 13 15 17 19
        for (int i = 1; i <= 19; i = i + 2) {
            System.out.println(i + " ");

        }

// ======================================================================
// TODO 8
//คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 2 4 6 8 10 12 14 16 18 20
// ======================================================================
// TODO 9
//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 4 9 16 25 36 49 64 81 100
    System.out.println("TODO 9-For Loop");
    int n9 = 2;
    while (n9 <=10){
        n9 = n9 * n9;
        System.out.println(n9 * n9 + " ");
        n9++;
    }
    System.out.println("--------------------------------------------------");

// System.out.println(i*i + " ");
// ======================================================================
// TODO 10
//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println("รอบที่ " + i + "เลขคู่");
            } else {
                System.out.println("รอบที่ " + i + "เลขคี่");
            }
        }
// ======================================================================
    }
}
