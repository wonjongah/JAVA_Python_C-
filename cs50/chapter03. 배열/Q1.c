#include <stdio.h>
#include <cs50.h>

void print_credit(string c[], int count);
void print_score(int s[], int count);
int find_score_index(int s[], int count, int score);

int main(void){
    string credit[9] = {"A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};
    int scores[9] = {95, 90, 85, 80, 75, 70, 65, 60, 0};
    int credit_count = sizeof(credit) / sizeof(credit[0]);
    int score_count = sizeof(scores) / sizeof(int);
    int score;
    
    printf("���� ���α׷�\n");
    printf("���Ḧ ���ϸ� \"999\"�� �Է�\n");
    printf("[���� ���̺�]\n");

    printf("�� �� : ");
    print_score(scores, score_count);

    printf("\n�� �� : ");
    print_credit(credit, credit_count);
    printf("\n");

    while(true){
        printf("������ �Է��ϼ��� (0~100) : ");
        scanf("%d", &score);
        if(score == 999){
            printf("���� ���α׷��� �����մϴ�.\n");
            break;
        }
        else if(score < 0 || score > 100){
            printf("** %d ������ �ùٸ��� �Է��ϼ���. ������ 0~100 �Դϴ�.\n", score);
            continue;
        }
        int score_index = find_score_index(scores, score_count, score);
        printf("������ %s �Դϴ�.\n", credit[score_index]);
    }

    return 0;
}

int find_score_index(int s[], int count, int score){
    int index;
    for(int i = 0; i < count; i++){
        if(score >= s[i]){
            index = i;
            break;
        }
    }
    return index;
}

void print_credit(string c[], int count){
    for(int i  = 0; i < count; i++){
        printf("%s\t", c[i]);
    }
}

void print_score(int s[], int count){
    for(int i = 0; i < count; i++){
        printf("%d\t", s[i]);
    }
}
