#### 조건문이란?

프로그램의 흐름을 달리 해주는 역할을 하는 문법이다.

즉, 경우의 수를 만들어주는 것이다.



#### 1. if-else

```js
var x = 10;

if (x > 10){
document.write("x는 10보다 크다.");
}else{
document.write("x는 10보다 작거나 같다.");
}
```

```js
if(표현식1){
	실행문1;
}else if(표현식2){
	실행문2;
}else{
	실행문3;
}
```



#### 2. switch문

```js
switch(조건값){
 case 값1:
	실행문1;
	break;
 case 값2:
	실행문2;
	break;
 case 값3:
	실행문3;
	break;
 default:
	실행문4;
	break;
}
```

ex)

```js
var x = 1;

switch(x){
case 1:
document.write("1");
break;
case 2:
document.write("2");
break;
default:
document.write("default");
break;
}
```



#### 반복문이란?

프로그램을 실행문을 여러번 반복하도록 하는 문법이다.



#### 1. while문

while문은 특정 조건을 만족할 때까지 반복 상태를 유지한다.

```js
while(조건문){
	실행문;
}
```

조건문이 참인 경우 while문이 계속 반복된다. 때문에 while문은 무한반복을 사용해야 할 때 많이 사용되는 반복문이다.

조건문에 true를 넣어주면 무한반복문을 사용할 수 있다.

```js
var x = 1;

while(x < 10){
 x++;
}
```



#### 2. do/while 문

일단 1번 먼저 실행한 후 조건문이 참인지 거짓인지 확인한다.

```js
do{
	실행문
}while(조건문);
```



#### 3. for문

for문은 while문과 다르게 반복 횟수, 반복 조건을 설정할 수 있다.

```js
for(초기식; 조건식; 증감식){
	실행문
}
```

초기식은 처음으로 설정하는 식, 조건식은 참 혹은 거짓을 판별하는 식, 증감식은 초기식의 변수를 증가 혹은 감소시키는 식이다.

```js
for(var i = 0; i < 10; i++){
	document.write(i);
}
```



#### 타이머 함수

| 함수 이름               | 설명                              |
| ----------------------- | --------------------------------- |
| setTimeout(함수, 시간)  | 일정 시간 후 함수 실행            |
| setInterval(함수, 시간) | 일정 시간 간격으로 함수 반복 실행 |
| clearTimeout(id)        | 실행되고 있는 timeout을 중지      |
| clearInterval(id)       | 실행되고 있는 interval을 중지     |

밀리세컨드가 단위이며, clear 함수가 받는 인자는 set 함수가 반환하는 것이다.



