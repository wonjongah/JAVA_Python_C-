#### 이벤트 : 웹을 살아 움직이게 하는 요소

변수와 함수, 조건문과 같은 재료로 웹이 살아 움직이고 소통할 수 있게 구성할 것이다.



#### 버튼으로 이해하는 이벤트

화면이 꺼질 수도, 배경색이 바뀔 수도 혹은 버튼이 사라지게 할 수도 있다.

이 과정에서 사용자의 **클릭**이 버튼이 가진 기능의 발동 조건이다.

사용자가 이 버튼을 누르면 나타날 결과를 설정하는 과정이 이벤트 생성이다.



#### 버튼 클릭 횟수를 보여주는 이벤트 만들기

```html
<!DOCTYPE html>
<html >
<head>
<meta charset="utf-8">
</head>
<body>
    <button onclick=click_event()>click me</button>
    <script src="./event.js"></script>
</body>
</html>
```

```js
var n = 0;

function click_event(){
n++;
alert(n + "번 클릭했습니다.");
}
```

```js
alert(실행요소);
```

alert는 사용자에게 특정 경고를 보여주는 기능이다.

button html의 요소에 onclick을 함수와 연결해준다면 클릭 횟수에 따라 alert 창에 뜨는 값이 달라질 것이다.

하지만 위처럼 함수를 직접 연결하는 방식은 유지보수가 어렵기 때문에 addEventListenr를 통해 버튼에 각 기능을 배치한다.

```html
<button id="clickMe">click me</button>
```

```js
function onClick() {
  alert("첫 번째 이벤트");
}
function onClick2() {
  alert("두 번째 이벤트");
}
document.getElementById('clickMe').addEventListener('click', onClick); //첫 번째 이벤트 연결
document.getElementById('clickMe').addEventListener('click', onClick2); // 두 번째 이벤트 연결
```

위와 같이 연결해 사용하면 alert 창의 문자가 바뀌는 것을 확인할 수 있다.

하지만, 눈으로 볼 수 없기 때문에 확인할 수단으로 콜백이 필요하다.



#### 콜백(callback)

다른 함수가 실행을 끝낸 뒤 실행되는 함수를 뜻한다.

간단하게 콜백을 사용하는 방법은 setTimeout() 함수를 사용하는 것이다.

매개변수로 넣은 시간이 지날 때까지 해당 함수는 실행되지 않는다. 

콜백을 사용하는 간단한 예시이다.