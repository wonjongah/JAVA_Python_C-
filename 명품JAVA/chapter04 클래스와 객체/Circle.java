public class Circle{
    int radius;
    String name;

    public Circle(){} // 기본 생성자
    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String args[]){
        Circle pizza;
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "종아피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);
    
        Circle donut =  new Circle();
        donut.radius = 5;
        donut.name = "종아도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}