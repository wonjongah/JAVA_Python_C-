#include <cs50.h>
#include <stdio.h>
#include <string.h>
// strcmp 함수를 사용하기 위해 string.h include

string menu(string yoil);

int main(void){
    string yoil = get_string("요일을 입력하세요: ");
    printf("%s\n", yoil);
    printf("%s: %s\n", yoil, menu(yoil));
}

string menu(string yoil){
    if(!strcmp("월요일", yoil)){
        // strcmp는 두 문자열이 같으면 0을 리턴한다.
        // if 문을 만족시키기 위해서 반전(! 논리 부정 연산자 사용)시켜 두 문자열을 비교한다.
        return "청국장";
    }else if(!strcmp("화요일", yoil)){
        return "비빔밥";
    }else if(!strcmp("수요일", yoil)){
        return "된장찌개";
    }else if(!strcmp("목요일", yoil)){
        return "칼국수";
    }else if(!strcmp("금요일", yoil)){
        return "냉면";
    }else if(!strcmp("토요일", yoil)){
        return "소불고기";
    }else if(!strcmp("일요일", yoil)){
        return "오삼불고기";
    }else{
        return "해당 요일이 없습니다.";
    }
}
