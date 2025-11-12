orso = document.querySelector("#cisco");
bottone = document.querySelector("#panda");
bottone.addEventListener("click", aggiungiEl);
const lista = document.querySelector("#lista");
svuota = document.querySelector("#svuota");
elimina = document.querySelector("#elimina");
svuota.addEventListener("click", svuotaEl);
elimina.addEventListener("click", elimEl);
let array = JSON.parse(localStorage.getItem("spesa")) || ["pane"];

inviaArray();

function elimEl() {
    const temp = document.querySelectorAll(".comprato");

    temp.forEach((element) => element.remove());
}

function svuotaEl() {
    lista.innerHTML = "";

    localStorage.removeItem("spesa");
}


/*if (localStorage.getItem("spesa") !== null) {
    inviaArray();
} else {
    invia();
}
*/
function inviaArray() {
    array.forEach(e=>{
        let nuovo = document.createElement("li");
        nuovo.textContent = e + " ";
        let comprato = document.createElement("button");
        comprato.textContent = "comprato";

        let rimuovi = document.createElement("button");
        rimuovi.textContent = "rimuovi";

        nuovo.appendChild(comprato);
        comprato.addEventListener("click", () => {
            nuovo.classList.toggle("comprato");
        });

        nuovo.appendChild(rimuovi);
        rimuovi.addEventListener("click", () => {
            nuovo.remove();
        });
        lista.appendChild(nuovo);
    })
    
}

function aggiungiEl(event) {
    event.preventDefault();

    if (!(orso.value === "")) {
        let nuovo = document.createElement("li");
        nuovo.textContent = orso.value + " ";
        array.push(nuovo.textContent);
        console.log(array);

        localStorage.setItem("spesa", JSON.stringify(array));

        let comprato = document.createElement("button");
        comprato.textContent = "comprato";

        let rimuovi = document.createElement("button");
        rimuovi.textContent = "rimuovi";

        nuovo.appendChild(comprato);
        comprato.addEventListener("click", () => {
            nuovo.classList.toggle("comprato");
        });

        nuovo.appendChild(rimuovi);
        rimuovi.addEventListener("click", () => {
            nuovo.remove();
        });
        lista.appendChild(nuovo);
    } else {
        alert("inserire un elemento");
    }

}