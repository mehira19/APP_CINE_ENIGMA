function getValue() {
    // Sélectionner l'élément input et récupérer sa valeur
    var input = document.getElementById("name").value;
    var input1 = document.getElementById("firstname").value;
    var input2 = document.getElementById("pdf").value;

    // Afficher la valeur
    alert(
        "{  \n" + 
        "\t Nom du candidat : "  + input + "\n" +
        "\t Préom du candidat : "  + input1 + "\n" +
        "\t Url du pdf : "  + input2 + "\n" +
        "}"
        
    );
}

function getValue2() {
    // Sélectionner l'élément input et récupérer sa valeur
    var input3 = document.getElementById("name").value;
    var input4 = document.getElementById("candidats").value;
    var input5 = document.getElementById("startDate").value;
    var input6 = document.getElementById("endDate").value;


    // Afficher la valeur
    alert(
        "{  \n" + 
        "\t Nom de l'élection : "  + input3 + "\n" +
        "\t Id du Candidat : "  + input4 + "\n" +
        "\t Date de début : "  + input5 + "\n" +
        "\t Date de fin : "  + input6 + "\n" +
        "}"
        
    );
}