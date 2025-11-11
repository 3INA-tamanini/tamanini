orso = document.querySelector("#cisco");
bottone = document.querySelector("#panda");
bottone.addEventListener("click", invia);
const lista = document.querySelector("#lista");
svuota = document.querySelector("#svuota");
elimina = document.querySelector("#elimina");

svuota.addEventListener("click", svuotaEl);
elimina.addEventListener("click", elimEl);

function elimEl() {
    const temp = document.querySelectorAll(".comprato");

    temp.forEach((element) => {
        element.remove();
    });
}

function svuotaEl() {
    lista.innerHTML = "";
}
function invia() {
    event.preventDefault();

    if (!(orso.value === "")) {
        let nuovo = document.createElement("li");
        nuovo.textContent = orso.value;

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
