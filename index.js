$(function (){
    hentAlle();
});



function input() {
    const biletter = {
        film : $("#film").val(),
        antall : $("#antall").val(),
        fnavn : $("#fnavn").val(),
        enavn : $("#enavn").val(),
        tlfnr : $("#tlfnr").val(),
        epost : $("#epost").val(),
    };

    $.post("/lagre", biletter, function (){
        hentAlle();
    });
    $("#Film").val("");
    $("#Antall").val("");
    $("#Fnavn").val("");
    $("#Enavn").val("");
    $("#Tlfnr").val("");
    $("#Epost").val("");
}
let button = document.querySelector('button');
let inputs = document.querySelectorAll('input');
button.addEventListener('click', () => {
    inputs.forEach(input => input.value = '');
})

function hentAlle(){
    $.get("/hentAlle", function (Biletter){
        formaterData(Biletter);
    });
}

function formaterData(Biletter) {
    let ut = "<table class='table table-striped'><tr><th>Film</th><th>Antall</th><th>Fornavn</th>" +
        "<th>Etternavn</th><th>Tlfnr</th><th>Epost</th></tr>";
    for (const kunde of Biletter) {
        ut += "<tr><td>" + kunde.film + "</td><td>" + kunde.antall + "</td><td>" + kunde.fnavn + "</td>" +
            "<td>" + kunde.enavn + "</td><td>" + kunde.tlfnr + "</td><td>" + kunde.epost + "</td>" +
            "</tr>";
    }
    ut += "</table>";
    $("#utskrift").html(ut);
}

function slett() {
    $.get("/fjerntabel", function () {
        hentAlle();
    })
}