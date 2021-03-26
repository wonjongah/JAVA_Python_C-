#### 함수란

함수를 사용하는 이유는 코드중복을 막기 위해서이다.

javascript의 함수는 다른 언어에서의 함수와 다른 특징이 있다.

javascript의 함수는 하나의 타입으로 정의가 된다.

그렇기 때문에 함수를 변수에 대입하는 것이 가능하다.



#### 함수 정의

```js
function 함수이름(매개변수1, 매개변수2, ...){
  실행문
}
```

ex)

```js
function add(num1, num2){
	document.write(num1 + num2);
}

add(1, 2);
```



#### return

함수의 호출을 통해 특정 값을 반환할 수 있도록 함수를 선언할 수도 있다.

```js
function add(num1, num2){
	return num1 + num2;
}

var result = add(1, 2);
```



#### 함수를 값으로 사용하기

javascript에서는 함수 또한 하나의 타입이다.

```js
function multiply(num1, nunm2){
	return num1 + num2;
}

var multiplyNums = multiply;
document.write(multiplyNums(2, 3));
```

변수에 함수를 저장해서 사용한 것이다.

이런 식으로 사용하면 함수 자체를 변수처럼 사용할 수 있다.