#### 1. HTML 속 Javascript

실제 코드를 작성하면서 html 파일에 javascript를 삽입한다.

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>
	<h1>Hello World</h1>
</body>
</html>
```

이 Hello World를 화이팅으로 바꿔보자.

같은 폴더 내에 index.js라는 파일을 만들고 다음과 같이 코드를 작성한다.

```js
var h1 = document.getElementByTagName('h1')
h1[0].innerHTML = "화이팅"
```

h1에는 이제 태그명이 h1인 요소가 모두 선택되어 저장되고, h1의 가장 처음에 나오는 요소만 선택된 후, innerHTML을 화이팅으로 바꿔준다.



이제 html 파일을 다음과 같이 바꿔준다.

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>
	<h1>Hello World</h1>
	<script src="./index.js"></script>
</body>
</html>
```

script라는 태그명을 가진 요소가 추가되었다.

중요한 점은 선택할 태그가 h1이므로, script 태그를 가진 요소는 h1 태그보다 밑에 있어야 한다.

```html
<script src="./index.js"></script>
<h1>Hello World</h1>
```

위와 같이 순서가 바뀌면 안 된다.



버튼을 넣어 기능이 눈에 더 잘 들어오게 만들어보자

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>
	<h1>Hello World</h1>
	<button onclick="changeText()">click me</button>
	<script src="./index.js"></script>
</body>
</html>
```

그 후 index.js의 코드도 조금 바꾼다.

```js
function changeText(){
	var h1 = document.getElementsByTagName('h1');
	h1[0].innerHTML = "화이팅"
}
```

코드를 함수화 시켜서 버튼을 클릭했을 때에만 실행되도록 수정했다.

함수 이름이 changeText이기 때문에 button의 onclick 속성에도 changeText()로 설정했다.