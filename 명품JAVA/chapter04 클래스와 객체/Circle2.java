public class Circle2 {
    int radius;
    String name;
    // �����ڴ� Ŭ���� �̸��� �����ϴ�.
    public Circle2(){ // �Ű����� ���� ������
        radius = 1;
        name = "";
    }
    // �����ڴ� ����Ÿ�� ����.
    public Circle2(int r, String n){ // �Ű������� ���� ������
        radius = r;
        name = n;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String args[]){
        Circle2 pizza = new Circle2(10, "��������"); // �� ��° �Ű����� �ִ� �����ڷ� ��ü ����

        double area = pizza.getArea();
        System.out.println(pizza.name + "�� ������ " + area);

        Circle2 donut = new Circle2(); // ù ��° �����ڷ� ��ü �ʱ�ȭ
        donut.name = "��������";
        area = donut.getArea();
        System.out.println(donut.name + "�� ������ " + area);
    }
}
