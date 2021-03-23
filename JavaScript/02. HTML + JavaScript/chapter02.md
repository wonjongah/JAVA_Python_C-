#### HTML 속 JavaScript

html 파일에 javascript 코드를 연동하는 방법은 2가지 방법이 있다.



##### 1. html 파일에 script 태그 사용하기

```js
<script>
	function hello(){
	console.log('hello');
	}
hello();
</script>
```

위와 같이 javascript 코드를 script 태그로 감싸주면 된다.

하지만 이와 같은 방법은 코드가 간단하면 상관 없지만, 코드가 길어지고 복잡해지면 수정하기 힘들고 재사용성도 좋지 않다.



##### 2. script src를 사용해 링크 걸기

두 번째 방법은 javascript 파일을 따로 만들고 src를 통해 그 파일을 연결하는 것이다.

```js
<script src = "hello.js"></script>
```



#### DOM

HTML과 javascript를 연결하는 데 있어 필수적인 개념이 DOM이다.

DOM은 Document Object Model이라는 말의 약어이며, 단순히 텍스트로 작성된 html 파일을 트리 형태로 표현한 객체를 말한다.

DOM을 통해서 javascript와 html 파일이 연결되고 document의 객체는 DOM 트리의 최상단에 있는 객체에 접근하게 해준다.



#### DOM에 접근하기

```js
document.getElementById('header').innerHTML = "화이팅";
```

document라는 객체를 통해 무엇을 할 지 선택하고, id가 header인 태그를 선택하기 위해 getElementById라는 함수를 선택, 태그를 선택한 후 innerHTML을 화이팅으로 교체했다.

```js
document.getElementsByTagName('div');
```

이렇게 사용하면 태그명이 div인 모든 태그를 선택할 수 있다.



| 메소드                                     | 설명                                          |
| ------------------------------------------ | --------------------------------------------- |
| document.getElementsByTagName(태그이름)    | 해당 태그 이름의 요소를 모두 선택함.          |
| document.getElementById(아이디)            | 해당 아이디의 요소를 선택함.                  |
| document.getElementByClassName(클래스이름) | 해당 클래스에 속한 요소를 모두 선택함.        |
| document.getElementByName(name속성값)      | 해당 name 속성값을 가지는 요소를 모두 선택함. |
| document.querySelectorAll(선택자)          | 해당 선택자로 선택된느 요소를 모두 선택함.    |

