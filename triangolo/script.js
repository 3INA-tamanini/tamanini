
const base = document.getElementById("base");
const altezza = document.getElementById("altezza");
const finito = document.getElementById("finito")
function calcola() {

    if (base.value > 0 && altezza.value > 0) {
        let calcolo = (base.value * altezza.value) / 2;
        document.getElementById("finito").textContent = "l'area del triangolo è: " + calcolo;
    } else {
        finito.textContent = "inserire TUTTI i dati necessari (base, altezza)";
    }

}
