#include <iostream>

namespace BestComImpl{  // �̸����� �ȿ��� �Լ��� ���� ����
    void SimpleFunc(void);
}

namespace ProgComImpl{
    void SimpleFunc(void);
}

namespace ProgComImpl{
    void SimpleFunc2(void);
}

int main(void){
    BestComImpl::SimpleFunc();
    ProgComImpl::SimpleFunc();
    return 0;
}

void BestComImpl::SimpleFunc(void){  // �̸����� �ȿ� ����� �Լ��� ���� �κ�
    std::cout << "BestCom�� ������ �Լ�" << std::endl;
    ProgComImpl::SimpleFunc2(); // �ٸ� �̸�����
}

void ProgComImpl::SimpleFunc(void){
    std::cout << "ProgCom�� ������ �Լ�" << std::endl;
    SimpleFunc2();  // ���� �̸�����
}

void ProgComImpl::SimpleFunc2(void){
    std::cout << "ProgCom�� func2" << std::endl;
}