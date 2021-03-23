#### Console

내 뜻때로 잘 실행됐나 알아보기가 힘들기 때문에 console이 필수적이며 심화된 기능일 수록 console을 사용한다.



#### 콘솔

텍스트 문자로 실행의 결과를 확인하는 일종의 디스플레이 장치이다.

웹 개발을 하면서 사용해야 하는 콘솔은 바로 개발자 도구의 console이다.

크롬 환경에서 f12를 누르거나, 우측 상단의 설정에서 개발자 도구 탭을 클릭한다.



```html
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>
    <script src="./event.js"></script>
</body>
</html>
```

```js
console.log("Hello, World!");
```

위처럼 작성하면 console의 로그를 통해 Hello, World를 출력하겠다는 뜻이다.

console.(기능) -> log는 창에 값을 보여주겠다.

우리가 javascript 파일에서 선언한 n의 값이 현재 어떤 값을 가지고 있는지도 볼 수 있으며, 연산을 했을 때의 결과값도 나오게 된다.