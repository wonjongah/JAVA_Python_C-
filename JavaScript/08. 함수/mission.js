nick = ["<font color='red'>I ", "<font color='orange'>am ", "<font color='yellow'>t", "<font color='green'>i", "<font color='blue'>l", "<font color='purple'>t"]
var num = 0
var show_nick = "";

function showNick(){
    show_nick = show_nick + nick[num];
    document.getElementById('nick').innerHTML = show_nick;
    if(num < nick.length){
        num++;
        if(num == nick.length){
            document.getElementById("btn_nick").onclick = null;
        }
    }
}