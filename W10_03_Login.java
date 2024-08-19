package W10;
import java.util.Scanner;
public class W10_03_Login {
    public static void main(String[] args){
        String username = "admin";
        String password = "1234";

        Scanner kb = new Scanner(System.in);
        //สร้างตัวแปรเก็บ username and password ที่ผู้ใใช้เข้ามา
        System.out.print("ป้อนชื่อผู้ใช้: ");
        String inputUsername = kb.nextLine();

        System.out.print("ป้อนรหัสผ่าน: ");
        String inputPassword = kb.nextLine();

        //ตรวจสอบเงื่อนไข
        if(username.equals(inputUsername) && password.equals(inputPassword)){
            System.out.println("เข้าสู่ระบบสำเร็จ");

        }else{
            if(!username.equals(inputUsername) && password.equals(inputPassword)){
                System.out.println("ชื่อผู้ใช้ไม่ถูกต้อง");


            }else if(username.equals(inputUsername) && !password.equals(inputPassword)){
                System.out.println("รหัสผ่านไม่ถูกต้อง");
                
            }else{
                System.out.println("ชื่อผู้ใช้หรือรหัสผ่านไม่ถูกต้อง");

            }

        }
    }
}