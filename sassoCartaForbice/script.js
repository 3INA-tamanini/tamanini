let sceltaPc = Math.floor(Math.random() * 3) + 1;

let sasso = document.getElementById("#sasso");
let carta = document.getElementById("#carta");
let forbice = document.getElementById("#forbice");

sasso.addEventListener(onclick, tuaScelta = sasso.value);
carta.addEventListener(onclick, tuaScelta = carta.value);
forbice.addEventListener(onclick, tuaScelta = forbice.value);
let tuaScelta = null;

switch (sceltaPc) {
    case 1:
        console.log(tuaScelta);

        break;
    case 2:
        console.log(tuaScelta);
        break;
    case 3:
        console.log(tuaScelta);
        break;

    default:
        break;
}