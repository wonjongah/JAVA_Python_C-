#def print_hello():
#    print("안녕하세요!")
#
#def add_print_to(original): # 파라미터로 함수 받는다.
#    def wrapper():
#        print("함수 시작")
#        original()
#        print("함수 끝")
#    return wrapper

#print_hello = add_print_to(print_hello)

#print_hello()

def add_print_to(original):
    def wrapper():
        print("함수 시작")
        original()
        print("함수 끝")
    return wrapper

@add_print_to # print_hello를 add_print_to로 꾸미라는 뜻
def print_hello():
    print("안녕하세요")

print_hello()