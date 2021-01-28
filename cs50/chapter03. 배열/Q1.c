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
    
    printf("학점 프로그램\n");
    printf("종료를 원하면 \"999\"를 입력\n");
    printf("[학점 테이블]\n");

    printf("점 수 : ");
    print_score(scores, score_count);

    printf("\n학 점 : ");
    print_credit(credit, credit_count);
    printf("\n");

    while(true){
        printf("성적을 입력하세요 (0~100) : ");
        scanf("%d", &score);
        if(score == 999){
            printf("학점 프로그램을 종료합니다.\n");
            break;
        }
        else if(score < 0 || score > 100){
            printf("** %d 성적을 올바르게 입력하세요. 범위는 0~100 입니다.\n", score);
            continue;
        }
        int score_index = find_score_index(scores, score_count, score);
        printf("학점은 %s 입니다.\n", credit[score_index]);
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
