public class Circle2 {
    int radius;
    String name;
    // 생성자는 클래스 이름과 동일하다.
    public Circle2(){ // 매개변수 없는 생성자
        radius = 1;
        name = "";
    }
    // 생성자는 리턴타입 없다.
    public Circle2(int r, String n){ // 매개변수를 가진 생성자
        radius = r;
        name = n;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String args[]){
        Circle2 pizza = new Circle2(10, "종아피자"); // 두 번째 매개변수 있는 생성자로 객체 생성

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle2 donut = new Circle2(); // 첫 번째 생성자로 객체 초기화
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
