import java.text.Format;

public class Circle{
    public int radius;
    public String name;

    public Circle(){} // 원의 생성자 메소드
    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza; // Circle 객체에 대한 레퍼런스 변수 pizza 선언
        pizza = new Circle(); // Circle 객체 생성

        pizza.radius = 10;
        pizza.name = "종아피자";
        double area = pizza.getArea();

        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.name = "종아도넛";
        donut.radius = 14;
        double d_area = donut.getArea();

        System.out.println(donut.name + "의 면적은 " + d_area);
    }
}

