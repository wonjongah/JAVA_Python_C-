import java.util.Scanner;

class Book{
    String title, author;
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args){
        Book [] book = new Book[2]; // ���۷��� ������ ���۷��� �迭�� ����
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < book.length; i++){
            System.out.print("����>>");
            String title = sc.nextLine();
            System.out.print("����>>");
            String author = sc.nextLine();
            book[i] = new Book(title, author);
            // i ��° ���� ��ü ����
        }

        for(int i = 0; i < book.length; i++){
            System.out.print("(" + book[i].title + ", " + book[i].author + ")");
        }
        sc.close();
    }
}
