var follow = 0;

function check_text(){
    var value = document.getElementById("console").value;
    var cat = "https://newsimg.hankookilbo.com/cms/articlerelease/2019/04/29/201904291390027161_3.jpg";
    var dog = "http://image.dongascience.com/Photo/2019/11/10ed7359329fe87a2dc84921babb17e0.jpg";
    var target = document.getElementsByClassName("cat_says")[0];
    target.style.marginTop = "30px";
    target.style.paddingTop = "80px";
    target.style.height = "120px";

    if(follow == 1){
        if(value == "그만해! 냥!"){
            follow = 0;
            target.innerHTML = "냥냥 냐냐냥!";
        }
        else{
            target.innerHTML = value + " 냥!";
        }
    }
    else{
        if(value == "고양이"){
            target.innerHTML = '<img src=' + cat + ' style="height:300px; width:450px;"></img>';
            target.style.marginTop = "0px";
            target.style.paddingTop = "0px";
            target.style.height = "300px";
        }
        else if(value == "강아지"){
            target.innerHTML = '<img src=' + dog + ' style="height:300px; width:450px;"></img>';
            target.style.marginTop = "0px";
            target.style.paddingTop = "0px";
            target.style.height = "300px";
        }
        else if(value == "불꺼줘"){
            target.innerHTML = "불꺼주겠다냥";
            target.style.color = "white";
            document.body.style.backgroundColor = "#403A60";
        }
        else if(value == "불켜줘"){
            target.innerHTML = "불켜주겠다냥";
            target.style.color = "black";
            document.body.style.backgroundColor = "white";
        }
        else if(value == "경고"){
            alert("경고입니다!");
        }
        else if(value == "나 따라해봐"){
            follow = 1;
            target.innerHTML = "냥냥 냐냐냥!";
        }
        else{
            target.innerHTML = value;
        }
    }
}

document.getElementById("btn_order").addEventListener("click", check_text);