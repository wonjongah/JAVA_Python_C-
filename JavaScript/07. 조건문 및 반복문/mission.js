var second = 0;
var minute = 0;
var hour = 0;
var total_time = 0;
var intervalID;

String.format = function() { 
    let args = arguments; 
    return args[0].replace(/{(\d+)}/g, function(match, num) {
        num = Number(num) + 1; 
        return typeof(args[num]) != undefined ? args[num] : match;
     }); 
    }

function init(){
    document.getElementById("time").innerHTML = "00:00:00";
}

function Timer(){
    total_time++;
    
    minute = Math.floor(total_time/60);
    hour = Math.floor(minute/60);
    second = total_time % 60;
    minute = minute % 60;

    var show_sec = second;
    var show_min = minute;
    var show_hour = hour;

    if(second < 10){
        show_sec = "0" + second;
    }
    if (minute < 10){
        show_min = "0" + minute;
    }
    if (hour < 10){
        show_hour = "0" + hour;
    }
    document.getElementById("time").innerHTML = String.format("{0}:{1}:{2}", show_hour, show_min, show_sec);
}

function start(){
    intervalID = setInterval(Timer, 1000);
}

function stop(){
    if(total_time != 0){
        clearInterval(intervalID);
    }
}

function reset(){
    if(total_time != 0){
        clearInterval(intervalID);
        second = 0;
        minute = 0;
        hour = 0;
        total_time = 0;
        init();
    }
}