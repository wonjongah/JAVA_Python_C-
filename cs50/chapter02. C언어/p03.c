#include <cs50.h>
#include <stdio.h>
#include <string.h>
// strcmp �Լ��� ����ϱ� ���� string.h include

string menu(string yoil);

int main(void){
    string yoil = get_string("������ �Է��ϼ���: ");
    printf("%s\n", yoil);
    printf("%s: %s\n", yoil, menu(yoil));
}

string menu(string yoil){
    if(!strcmp("������", yoil)){
        // strcmp�� �� ���ڿ��� ������ 0�� �����Ѵ�.
        // if ���� ������Ű�� ���ؼ� ����(! �� ���� ������ ���)���� �� ���ڿ��� ���Ѵ�.
        return "û����";
    }else if(!strcmp("ȭ����", yoil)){
        return "�����";
    }else if(!strcmp("������", yoil)){
        return "�����";
    }else if(!strcmp("�����", yoil)){
        return "Į����";
    }else if(!strcmp("�ݿ���", yoil)){
        return "�ø�";
    }else if(!strcmp("�����", yoil)){
        return "�ҺҰ��";
    }else if(!strcmp("�Ͽ���", yoil)){
        return "����Ұ��";
    }else{
        return "�ش� ������ �����ϴ�.";
    }
}
