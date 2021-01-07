import java.util.Scanner;

public class rps {
    public static void main(String args[]){
        
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("철수 >> ");
        String cheol = scanner.next();
        System.out.print("영희 >> ");
        String young = scanner.next();

        if(cheol.equals(young)){
            System.out.println("비겼습니다.");
        }

        if(cheol.equals("가위")){
            if(young.equals("바위")){
                System.out.println("영희가 이겼습니다.");
            }else if(young.equals("보")){
                System.out.println("철수가 이겼습니다.");
            }
        }
        else if(cheol.equals("바위")){
            if(young.equals("가위")){
                System.out.println("철수가 이겼습니다.");
            }else if(young.equals("보")){
                System.out.println("영희가 이겼습니다.");
            }
        }else if(cheol.equals("보")){
            if(young.equals("가위")){
                System.out.println("영희가 이겼습니다.");
            }else if(young.equals("바위")){
                System.out.println("철수가 이겼습니다.");
            }
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }

        scanner.close();
    }
}
