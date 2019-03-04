package niit.soft.util;

/**
 * Created by ASUS on 2018/10/30.
 */
public class Triangle {
    public String IsTri(int a,int b,int c) {
        String str = " ";
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            str = "不能构成三角形";
            System.out.println(str);
        } else {
            if ((a == b) || (b == c) || (a == c)) {
                if ((a == b) && (b == c)) {
                    str = "等边三角形";
                    System.out.println(str);
                } else {
                    str = "等腰三角形";
                    System.out.println(str);
                }
            } else {
                str = "一般三角形";
                System.out.println(str);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Triangle triangle=new Triangle();
       triangle.IsTri(5,4,4);

           }
    }
