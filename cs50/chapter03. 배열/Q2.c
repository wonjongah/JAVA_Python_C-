#include <stdio.h>
#include <cs50.h>
#define MAX_SIZE 10

void insert(int n);
int delete(void);
void display(void);
int is_full(void);
int is_empty(void);

int queue[MAX_SIZE];
int front = 0;
int rear = 0;

int main(void){
    int num;
    int quit = 0;
    int insert_num;
    int deleted_num;
    while(true){
        printf("1. ����\n2. ����\n3. ��ȸ\n4. ����\n");
        printf("�Է� : ");
        scanf("%d", &num);
        switch(num){
            case 1:
                if(is_full() == 1){
                    printf("ť�� �� á���ϴ�.\n");
                }else{
                    printf("������ �� : ");
                    scanf("%d", &insert_num);
                    insert(insert_num);
                }
                break;
            case 2:
                if(is_empty() == 1){
                    printf("ť�� �������\n");
                }else{
                    deleted_num = delete();
                    printf("ť���� ������ : %d\n", deleted_num);
                }
                break;
            case 3:
                display();
                break;
            case 4:
                quit = -1;
                break;
        }
        if(quit == -1){
            printf("ť�� �����մϴ�.\n");
            break;
        }
    }
}

void insert(int n){
    queue[rear] = n;
    rear = (rear + 1) % MAX_SIZE;
}

int delete(void){
    int delete_num = queue[front];
    for(int i = 0; i < rear; i++){
        queue[i] = queue[i + 1];
    }
    rear = (rear - 1) % MAX_SIZE;
    return delete_num;
}

void display(void){
    for(int i = front; i != rear; i = (i + 1) % MAX_SIZE){
        printf("%d  ", queue[i]);
    }
    printf("\n");
}

int is_full(void){
    if((rear + 1) % MAX_SIZE == front){
        return 1;
    }else{
        return 0;
    }
}

int is_empty(void){
    if(front == rear){
        return 1;
    }else{
        return 0;
    }
}
