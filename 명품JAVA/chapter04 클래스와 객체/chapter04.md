## 클래스와 객체



---------



#### 4.1 객체 지향과 자바



- 모든 것이 객체



주변의 모든 것이 객체(object)라고 생각하면 된다.  

실세계의 객체들은 자신만의 고유한 특성(state)과 행동(behavior)을 가지며 다른 객체들에게 행동을 요청하거나 정보를 주고받는 등 상호 작용하면서 존재한다.



- 객체 지향 언어의 특성



객체 지향 언어는 실세계의 객체를 프로그램 내에 표현하기 위해 클래스와 객체 개념을 도입했다.

객체 지향 언어는 다음과 같은 특성을 가진다.



○ **캡슐화(Encapsulation)**



캡슐화란 객체를 캡슐로 싸서 <u>내부를 보호하고 볼 수 없게 하는 것</u>으로 객체의 가장 본질적인 특징이다. 

캡슐 약을 생각하면 이해하기 쉽다.

캡슐에 든 약은 어떤 색인지, 어떤 성분인지 보이지 않으며, 외부의 접근으로부터 안전하다.

예를 들어, 캡슐의 껍질, tv 케이스, 사람의 장기를 보호하는 겉의 피부와 근육을 들어 캡슐화를 생각해볼 수 있다.

객체는 캡슐화가 기본 원칙이지만 외부와의 접속을 위해 <u>몇 부분만 공개노출</u>한다. 

예를 들어, on/off 버튼 노출, 밝기 조절 버튼, 음량 버튼 등과 같이 통신하고 필요한 부분은 노출시킨다.

자바에서 객체는 <u>클래스(class)</u>라는 캡슐을 사용하며, <u>필드(멤버변수)</u>와 <u>메소드(멤버함수)</u>로 구성된다.



○ **상속(Inheritance)**



실세계에서 상속은 상위 개체의 속성이 하위 개체에 물려져서, 하위 개체가 상위 개체의 속성을 모두 가지는 관계이다.

자바의 상속은 <u>자식 클래스가 부모 클래스의 속성을 물려받고 기능을 추가하여 확장(extends)하는 개념</u>이다.

자바에서 부모 클래스를 <u>슈퍼 클래스(super class)</u>라고 부르고, 자식 클래스를 <u>서브 클래스(sub class)</u>라고 부른다.

상속은 슈퍼 클래스의 필드와 메소드를 물려받아 <u>코드를 재사용함으로써, 코드 작성에 드는 시간과 비용을 줄인다.</u>

서브 클래스 객체는 슈퍼 클래스의 멤버와 서브 클래스의 멤버를 모두 가진다.



○ **다형성(Polymorphism)**



다형성은 같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 동작하도록 구현되는 것을 말한다.

<u>같은 메소드를 객체에 맞도록 동일한 이름이지만 자신의 특징에 맞게 다시 구현하는 메소드 오버라이딩(overriding)</u>이 한 예다.

<u>다형성의 또 다른 사례로 클래스 내에 이름이 같지만 서로 다르게 동작하는 메소드를 여러 개 만드는 메소드 오버로딩(overloading)</u>이 있다.



- 객체 지향 언어의 목적



객체 지향 언어는 절차 지향 언어의 단점을 보완하고 다음을 보완하고 당므의 목적을 달성하기 위해 탄생했다.

○ 소프트웨어의 생산성 향상

컴퓨터 산업의 발전으로 새로운 소프트웨어를 단 시간 내에 만들어야 했다. 이러한 목적 달성을 위해 객체, 캡슐화, 상속, 다형성 등 소프트웨어의 재사용을 위한 여러 기법을 가진 객체 지향 언어가 탄생했다.

객체 지향 언어는 소프트웨어의 생상성을 향상시킨다.

○ 실세계에서 쉬운 모델링

실세계의 일을 프로그래밍하는 경우가 많아지면서 물체(객체)들의 상호 작용으로 묘사하는 것이 적합하다.

○ 절차 지향 프로그래밍과 객체 지향 프로그래밍

절차 지향 프로그래밍은 목적을 달성하기 위한 일의 흐름에 중점을 둔다.

객체 지향 프로그래밍은 실제 세상에 가깝게 모델링해 실제 세상의 물체를 객체로 표현하고, 객체들의 관계, 상호 작용을 설계한 뒤, 각 객체를 클래스로 작성하면 프로그램이 완성된다.



#### 4.2 자바 클래스 만들기



- 클래스와 객체



클래스는 객체를 만들어내기 위한 설계도 혹은 틀이며, 클래스 모양 그대로 생성된 실체가 객체이다.

이러한 연유로 객체를 클래스의 인스턴스(instance)라고도 부른다.

클래스는 하나이지만 객체들은 수 없이 많이 생성될 수 있다. 객체들은 클래스의 모양대로 모두 동일한 속성을 가지고 탄생하지만, 자신만의 고유한 값을 가짐으로써 구분된다. 객체들마다 속성의 값은 서로 다르다.



- 클래스 구성



자바 클래스는 class 키워드를 사용해 선언한다.

클래스의 구성 요소를 멤버라고 부르며, 멤버는 필드(멤버 변수)와 메소드(멤버 함수) 두 가지이다.

```java
public class Circle{
public int radius; // 원의 반지름 필드
public String name; // 원의 이름 필드
// 위의 두 줄이 필드(변수)
    
public Circle(){ // 원의 생성자 메소드
}
public double getArea(){ // 원의 면적 계산 메소드
return 3.14 * radius * radius;
}
// 위의 네 줄이 메소드
}
```



1. 클래스 선언, class Circle

이 코드는 이름이 Circle인 클래스를 선어한다. class 키워드와 클래스 이름으로 선언하고 중괄호{} 안에 필드와 메소드를 모두 작성한다. 클래스 외부에는 캡슐화의 원칙으로 어떤 필드나 메소드를 둘 수 없다.

2. 필드와 메소드

객체 내에 값을 저장할 멤버 변수를 필드라고 부른다. Circle 클래스에는 radius와 name 두 필드가 있다.

메소드는 함수이며 객체의 행동을 구현한다. 

3. 접근 지정자, public

Circle이나 필드, 메소드에 붙은 public을 접근 지정자라고 한다. public은 다른 클래스에서 활용하거나 접근할 수 있음을 선언한다.

4. 생성자(constructor)

<u>클래스의 이름과 동일한 메소드를 특별히 생성자(constructor)라고 한다.</u>

<u>생성자는 객체가 생성될 때 자동으로 호출되는 특별한 메소드이다.</u>

 

- new 연산자와 객체 생성, 그리고 레퍼런스 변수



```java
public class Circle{
public int radius; // 원의 반지름 필드
public String name; // 원의 이름 필드
// 위의 두 줄이 필드(변수)
    
public Circle(){ // 원의 생성자 메소드
}
public double getArea(){ // 원의 면적 계산 메소드
return 3.14 * radius * radius;
}
// 위의 네 줄이 메소드
}

public static void main(String args[]){
Circle pizza; // Circle 객체에 대한 레퍼런스 변수 pizza 선언, 변수만 생성, 아직 가리키지 않음
pizza = new Circle(); // 객체 메모리 할당 및 Circle 객체 생성, 레퍼런스 변수 가리키도록.

pizza.radius = 10; // radius 필드에 10 저장
pizza.name = "자바피자"; // name 필드에 "자바피자" 저장
double area = pizza.getArea(); // pizza 객체의 면적 알아내기
}
```



1. Circle pizza; 

Circle 객체의 레퍼런스 변수 생성, 변수만 생성된 것이지 아직 객체를 가리키지 않는다.

2. pizza = new Circle(); 

객체 메모리 할당(객체에게 한 방을 주었다고 생각) + 레퍼런스 변수 pizza가 이 객체 가리키도록 지정.

3. pizza.radius = 10; pizza.name = "자바피자";

radius와 name 값 변경

4. double area = pizza.getArea();

getArea() 메소드 실행해 pizza 객체의 면적 알아내기



- 레퍼런스 변수 선언

객체를 생성하기 전, 객체를 가리킬 레퍼런스 변수를 먼저 선언한다. 다음은 Circle 타입의 객체를 가리킬 레퍼런스 변수 pizza를 선언하는 문장이다.

```java
Circle pizza; // 레퍼런스 변수 pizza 선언
```

<u>Circle 타입 객체가 생성된 것이 아니라, 변수 pizza는 Circle 클래스의 객체에 대한 주소, 즉 레퍼런스를 가지는 변수일 뿐 객체 자체는 아니다.</u>

※ JAVA와 달리 C++은 Circle pizza;로 객체가 생성되며, pizza는 그 자체가 객체이다.



- 객체 생성, new 연산자 이용

자바에서는 반드시 new 연산자를 사용해 다음과 같이 객체를 생성한다.

```java
pizza = new Circle();
```

생성된 Circle 객체의 주소 즉 레퍼런스를 pizza 변수에 대입한다.

new 연산자에 의해 객체가 생성되는 과정은 다음과 같다.

1. <u>Circle 타입 크기의 메모리 할당</u>
2. <u>Circle() 생성자 코드 실행</u>

객체가 생성될 때 필드를 초기화하거나 생성에 꼭 필요한 작업을 위해 두는 것이 생성자인데, 현재 Circle(){} 생성자에는 아무 코드가 작성되지 않아 아무런 작업도 실행되지 않는다.

레퍼런스 변수 선언과 객체 생성은 다음과 같이 동시에 할 수 있다.

```java
Circle pizza = new Circle();
```



- 객체 멤버 접근

객체의 멤버에 접근할 때는 다음과 같이 레퍼런스 변수 뒤에 . 연산자가 붙는다.

```java
객체레퍼런스.멤버
```

예를 들어, pizza 객체의 radius 필드에 10을 대입하는 문장은 다음과 같다.

```java
pizza.radius = 10;
```

pizza 객체의 radius 필드 값을 읽을 경우는 다음과 같다.

```java
int r = pizza.radius;
```

pizza 객체의 getArea() 메소드를 호출하여 면적을 알아내기 위한 문장은 다음과 같다.

```java
double area = pizza.getArea();
```



#### 4.3 생성자



- 생성자의 개념과 목적



<u>생성자(constructor)는 객체가 생성될 때 객체의 초기화를 위해 실행되는 메소드이다.</u>

생성자는 자바, C++, C#, Python 등 모든 객체 지향 언어에 존재한다.



- 생성자 선언 및 활용



생성자는 <u>객체가 생성되는 순간에 자동으로 호출되는 메소드</u>로서, <u>객체에 필요한 초기화를 실행하는 코드를 담아야 한다.</u>



```java
public class Circle2 {
    int radius;
    String name;
    // 생성자는 클래스 이름과 동일하다.
    public Circle2(){ // 매개변수 없는 생성자
        radius = 1;
        name = "";
    }
    // 생성자는 리턴타입 없다.
    public Circle2(int r, String n){ // 매개변수를 가진 생성자
        radius = r;
        name = n;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String args[]){
        Circle2 pizza = new Circle2(10, "종아피자"); // 두 번째 매개변수 있는 생성자로 객체 생성

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle2 donut = new Circle2(); // 첫 번째 생성자로 객체 초기화
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
```

```
종아피자의 면적은 314.0
도넛피자의 면적은 3.14
```



- 생성자의 이름은 클래스 이름과 동일하다.

<u>생성자의 이름은 반드시 클래스 이름과 동일하게 작성해야 한다.</u>



- 생성자는 여러 개 작성(오버로딩)할 수 있다.

<u>매개변수의 개수와 타입만 다르다면, 클래스 내에 생성자를 여러 개 둘 수 있다.</u>

Circle2 클래스 역시 매개변수의 개수가 다른 2개의 생성자가 작성되었다.

```java
public class Circle2{
	public Circle2(){...} // 매개 변수 없는 생성자
	public Circle2(int r, String n){...} // 2개의 매개 변수를 가진 생성자
}
```



- 생성자는 new를 통해 객체를 생성할 때 한 번만 호출된다.

<u>객체 생성은 반드시 **new**를 통해서만 이루어지며, 생성자는 이 때 자동으로 한번만 호출된다.</u>

아무때나 호출하고 싶을 때 호출할 수 있는 메소드가 아니다.

```java
Circle2 pizza = new Circle2(10, "종아피자"); // 생성자 Circle2(int r, String n) 호출
Circle2 donut = new Circle(); // 생성자 Circle2() 호출
```



- <u>생성자에 리턴 **타입**을 지정할 수 없다.</u>

생성자는 어떤 값도 리턴하지 않기 때문에 다음과 같이 리턴 타입을 선언해서는 안 된다.

<u>하지만 리턴값이 없다고 해서, void를 리턴 타입으로 지정하면 안 된다.</u>

```java
public void Circle(){..} // error!! 
```

<u>하지만, 생성자에서 return 문을 사용할 수 없는 것은 아니다. return 문은 메소드의 실행을 끝내고 호출한 곳으로 돌아가라는 명령이므로, 생성자의 실행을 끝내고자 하면 생성자 코드 내 어디서든 return; 문을 사용하면 된다.</u>



- 생성자의 목적은 객체가 생성될 때, 필요한 초기 작업을 위함이다.

다음 객체 생성문은 Circle2(int r, String n) 생성자를 호출해서 pizza 객체의 radius를 10으로, name을 "종아피자"로 초기화한다.

```java
Circle2 pizza = new Circle2(10, "종아피자"); // 생성자 Circle2(int r, String n) 호출
```

이렇게 <u>생성자는 객체가 생성될 때, 필드 초기화, 필요한 메모리 확보, 파일 열기, 네트워크 연결 등 객체가 활동하기 전에 필요한 초기 준비를 하는데 이용한다.</u>



- 기본 생성자

<u>기본 생성자(default constructor)란 매개변수와 실행 코드가 없어 아무 일도 하지 않고 단순 리턴하는 생성자이다.</u>

디폴트 생성자라고도 불리며 다음의 예와 같다.

```java
class Circle(){
	public Circle(){} // 기본 생성자. 매개변수, 코드 아무것도 없고 아무 일 없이 리턴
}
```



- 기본 생성자가 자동으로 생성되는 경우

<u>생성자가 없는 클래스는 있을 수 없다.</u>

<u>객체가 생성될 때 반드시 생성자가 실행되기 때문이다.</u>

<u>그러므로 생성자가 하나도 없는 경우, 컴파일러는 기본 생성자를 자동으로 생성한다.</u>

<u>만일 지정한 생성자가 없다면, 자바 컴파일러는 기본 생성자를 삽입해, 객체를 생성할 때 기본 생성자를 자동으로 생성한다.</u>



- 기본 생성자가 자동으로 생성되지 않는 경우

<u>생성자가 하나라도 존재하는 클래스에는 컴파일러가 기본 생성자를 삽입해주지 않는다.</u> 클래스를 만든 개발자의 의도를 지켜주기 위함이다.

예시로, 기본 생성자가 없는데(매개변수X)(컴파일러가 기본 생성자 생성X) 기본 생성자를 사용해 객체를 생성하려고 하면 컴파일 오류가 난다.



- this 레퍼런스



this는 자바의 중요한 키워드이다. 뜻 그대로 객체 자신을 가리키는 레퍼런스이다.



- this의 기초 개념

<u>this는 현재 객체 자신에 대한 레퍼런스이다.</u>

<u>더 정확히 말하면 현재 실행되고 있는 메소드가 속한 객체에 대한 레퍼런스이다.</u>

this는 컴파일러에 의해 자동 관리되므로 개발자는 this를 사용하기만 하면 된다.

ex)

```java
public class Circle{
	int radius;
	public Circle(int r) { this.radius = r; } // 멤버 radius
	public int getRadius() { return radius; }
}
```



- this의 필요성

앞의 Circle 클래스의 메소드 getRadius()는 다음과 같이 this를 사용하지 않았다.

클래스 내의 멤버 radius를 접근할 때 굳이 this.radius로 할 필요가 없다.

```java
return radius; // return this.radius;와 동일하다.
```

그렇다면 this는 언제 필요할까?

매개변수의 이름은 용도를 나타내므로, 적합한 이름을 붙이는 일은 중요하다.

그래서 Circle(int r) 생성자의 매개변수를 r 대신 radius로 변경하는 것이 좋다.

```java
public Circle(int radius){ radius = radius; }
```

<u>하지만 이렇게 변경하면 radius = radius; 두 radius는 모두 매개변수 radius에 접근한다.</u>

그렇기 때문에 멤버 radius를 변경하지 못한다.

자바에서 이처럼 매개변수의 이름을 멤버변수와 같은 이름으로 붙이고자 하는 경우가 많은데, 이렇게 이름충돌이 날 때 this를 이용하면 된다.

```java
public Circle(int radius){ this.radius = radius; }
// 멤버 radius = 매개변수 radius
```

또한 <u>메소드가 객체 자신의 레퍼런스를 리턴해야 하는 경우가 있는데, 이때 다음과 같이 this를 리턴하면 된다.</u>

```java
public Circle getME(){ return this; } // 객체 자신의 레퍼런스 리턴
```



- this의 상세 설명

<u>객체가 있어야 this를 사용할 수 있다. 또한 static 메소드에서는 사용할 수 없다.</u>

ex)

```java
public class Circle{
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
}

Circle ob1 = new Circle(1);
Circle ob2 = new Circle(2);
Circle ob3 = new Circle(3);
```

ob1, ob2, ob3 객체에서 this는 각각 자기가 속한 객체에 대한 레퍼런스이다.

말로 풀어쓰면 ob1 객체를 생성할 때 this는 ob1 객체에 대한 레퍼런스이다. 해당 객체"의" 멤버변수, 레퍼런스, 메소드를 이용하겠다는 뜻이다.



- this()로 다른 생성자 호출

<u>this()는 클래스 내에서 생성자가 다른 생성자를 호출할 때 사용하는 자바 코드이다.</u>

비슷한 코드가 반복된다면, this() 사용으로 코드 중복을 줄일 수 있을 것이다.

ex)

```java
public class Book2 {
    String title;
    String author;

    void show() { System.out.println(title + " " + author); }

    public Book2(){
        this("", ""); // 매개 변수 두 개의 생성자를 호출
        System.out.println("생성자 호출됨");
    }

    public Book2(String title){
        this(title, "작자미상"); // 매개 변수 두 개의 생성자를 호출
    }

    public Book2(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book2 littlePrince = new Book2("어린왕자", "생텍쥐베리");
        Book2 loveStory = new Book2("춘향전");
        Book2 emptyBook = new Book2();
        loveStory.show();
        littlePrince.show();
        emptyBook.show();
    }
}
```

```java
생성자 호출됨 // emptyBook 객체 만들 때 Book2() 생성자 호출
춘향전 작자미상
어린왕자 생텍쥐베리

```

Book2 loveStory = new Book("춘향전");을 볼 때 new가 실행될 때 Book2(String title) 생성자가 호출되며, 생성자는 바로 this()를 사용해 2개의 매개변수를 가진 public Book2(String title, String author) 생성자를 다시 호출한다.



- this() 사용 시 주의할 점

1. <u>this()는 반드시 생성자 코드에서만 호출할 수 있다.</u>
2. <u>this()는 반드시 같은 클래스 내 다른 생성자를 호출할 때 사용된다.</u>
3. <u>this()는 반드시 생성자의 첫 번재 문장이 되어야 한다.</u>



- 객체 치환 시 주의점



<u>= 연산자로 객체를 치환하는 것은 객체를 복사하는 것이 아니다.</u>

```java
Circle ob1 = new Circle(1);
Circle ob2 = new Circle(2);

s = ob2; // ob2의 레퍼런스가 레퍼런스 s에 치환(대입)되어 s는 ob2가 가리키는 객체를 함께 가리키게 된다.
```

<u>객체를 가리키는 레퍼런스(별명)이 하나 더 생기는 셈이다.</u>

```java
ob1 = ob2;
```

역시 ob1의 레퍼런스가 ob2의 레퍼런스와 동일하게 되어 ob2의 객체를 함께 가리키게 된다.

그리고 나면 ob1의 객체를 가리키는 <u>레퍼런스 변수가 없어지게 되어 프로그램에서 접근할 수 없는 상태가 된다.</u>

<u>이 객체를 가비지(garbage)라고 부른다.</u>

가비지는 JVM에 의해 자동으로 수거되어 재사용된다.



#### 4.4 객체 배열



- 객체 배열



