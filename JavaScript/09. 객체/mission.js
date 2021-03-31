var ladybird = {
    name : "레이디버드",
    year : "2017",
    genre : "코미디"
}

var soul = {
    name : "소울",
    year : "2021",
    genre : "애니메이션"
}

var century20 = {
    name : "우리의 20세기",
    year : "2017",
    genre : "드라마"
}

function show_ladybird(){
    document.getElementsByClassName("name")[0].innerHTML = ladybird.name;
    document.getElementsByClassName("year")[0].innerHTML = ladybird.year;
    document.getElementsByClassName("genre")[0].innerHTML = ladybird.genre;
}

function show_soul(){
    document.getElementsByClassName("name")[0].innerHTML = soul.name;
    document.getElementsByClassName("year")[0].innerHTML = soul.year;
    document.getElementsByClassName("genre")[0].innerHTML = soul.genre;
}

function show_20century(){
    document.getElementsByClassName("name")[0].innerHTML = century20.name;
    document.getElementsByClassName("year")[0].innerHTML = century20.year;
    document.getElementsByClassName("genre")[0].innerHTML = century20.genre;
}