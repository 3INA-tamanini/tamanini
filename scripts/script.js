let num = 2;

if (num%2==0) {
    console.log("pari");
} else {
    console.log("dispari");
}

const jsButton = document.getElementById("jsButton");

const ciccio = document.getElementsByClassName("titolo-bello");

jsButton.textContent = 'wow';


const clickCounter = document.getElementById("clickCounter");
let count = 0;
function increaseClick(){
    count++;
    clickCounter.textContent = 'hai cliccato ' + count + ' volte';
}


const links = document.getElementsByTagName("a");

//querySelector

const jsButton2 = document.querySelector("#jsButton");

const titole = document.querySelectorAll(".titolo-bello");


document.querySelector("h1").style.color="blue";