public class Book2 {
    String title;
    String author;

    void show() { System.out.println(title + " " + author); }

    public Book2(){
        this("", ""); // �Ű� ���� �� ���� �����ڸ� ȣ��
        System.out.println("������ ȣ���");
    }

    public Book2(String title){
        this(title, "���ڹ̻�"); // �Ű� ���� �� ���� �����ڸ� ȣ��
    }

    public Book2(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book2 littlePrince = new Book2("�����", "�����㺣��");
        Book2 loveStory = new Book2("������");
        Book2 emptyBook = new Book2();
        loveStory.show();
        littlePrince.show();
        emptyBook.show();
    }
}
