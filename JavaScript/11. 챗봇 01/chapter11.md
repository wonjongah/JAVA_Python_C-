#### 챗봇

기본적인 챗봇을 만드는 과정은 조건문을 통해 유저가 특정 질문을 던졌을 때, 그에 맞는 대답을 해주는 것이다.

값을 전달하고, 이 값이 잘 전달되었는지 조건문을 통해 확인해보자.



#### 값 전달하기

```html
<body>
    <div class="layout">
        <div class="cat_says">
            냐앙~
        </div>
        <div class="cat">
        </div>
        <div class="input_layout">
            <input type="text" id="console" class="input_style">    
        </div>
        <div class="button" onclick=check_text()>
            시키기
        </div>       
    </div>
</body>
```

