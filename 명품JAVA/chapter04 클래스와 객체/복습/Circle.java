import java.text.Format;

public class Circle{
    public int radius;
    public String name;

    public Circle(){} // ���� ������ �޼ҵ�
    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza; // Circle ��ü�� ���� ���۷��� ���� pizza ����
        pizza = new Circle(); // Circle ��ü ����

        pizza.radius = 10;
        pizza.name = "��������";
        double area = pizza.getArea();

        System.out.println(pizza.name + "�� ������ " + area);

        Circle donut = new Circle();
        donut.name = "���Ƶ���";
        donut.radius = 14;
        double d_area = donut.getArea();

        System.out.println(donut.name + "�� ������ " + d_area);
    }
}

