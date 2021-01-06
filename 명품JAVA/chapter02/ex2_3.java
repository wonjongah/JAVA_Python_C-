public class ex2_3 {
    public static void main(String[] args){
        byte b = 127;
        int i = 100;
        System.out.println(b+i); // b가 int 타입으로 자동 변환
        System.out.println(10/4); // 정수 나누기이므로 결과는 2
        System.out.println(10.0/4); // 4가 4.0으로 자동 변환 -> 실수 나누기이므로 결과는 2.5
        System.out.println((char)0x12340041); //'A'
        System.out.println((byte)(b+i)); // b+i = 227 -> 256 - 227 = -29
        System.out.println((int)2.9 + 1.8); // 2.0 + 1.8 -> 3.8
        System.out.println((int)(2.9 + 1.8)); // 4.7 -> 4
        System.out.println((int)2.9 + (int)1.8); // 2 + 1 -> 3

        int x = 2, y = 10, z = 0;
        z = x++*2+--y-5+x*(y%2);
        System.out.println(z);
        
    }
}
