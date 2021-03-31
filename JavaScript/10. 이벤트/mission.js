function call_event(){
    document.getElementById("name").innerHTML = "tilt";
    document.getElementById("btn_call").innerText = "010-2658-XXXX";
}

function click_btn(){
    setTimeout(call_event, 2000);
}

document.getElementById("btn_call").addEventListener("click", click_btn);
