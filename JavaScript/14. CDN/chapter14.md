CDN(Content Delivery Network)

콘텐츠를 배송하는 방식이다.

인터넷 서버와 가가운 위치에 미리 파일을 복제해두고, 이를 빠르게 가져다 사용하는 방식이다.

즉, 파일을 쉽고 빠르게 다운받아 사용하는 방법을 말한다.

누군가의 js 파일을 사용하고자 한다면, 코드를 직접 다운받거나 복사해서 프로젝트에 맞게 적용시키는 과정이 필요했다.

하지만, CDN을 이용해 js 파일을 다운로드 받는다면, 단 한 줄의 코드로 파일을 다운로드 받게 된다.

```html
<script src="https://cdn.jsdelivr.net/npm/typed.js@2.0.11"></script>
```



#### CDN 사용법

원하는 기능을 검색하면 다양한 웹사이트에서 CDN 링크를 제공한다.

그 링크를 html 문서의 head 부분에 script 태그의 src를 통해 추가해주면 끝이다.

```html
<head>
    <script src="(링크)"></script>
</head>
```



```js
var app = document.getElementById("typed");

      var typewriter = new Typewriter(app, {
        loop: false,
      });

      typewriter
        .typeString("알아듣지 못한 것 같다.")
        .pauseFor(1300)
        .deleteAll()
        .typeString("다시 한 번 말해보자.")
        .pauseFor(2500)
        .start();
```

