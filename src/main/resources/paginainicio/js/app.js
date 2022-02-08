var celsiusafahrenheit = document.getElementById('button-celsiusafahrenheit');
celsiusafahrenheit.addEventListener('click', function(){
    var celda = document.getElementById('Celsius').value;
    console.log(celda);
    var linkapi1 = 'https://calc-api-be.herokuapp.com/Calculator'
    fetch(`${linkapi1}/celsius/${celda}`).then(res => {
        return res.json();
        }).then( rta =>  {
            $("fahrenheit").text("Fahrenheit : " + rta.fahrenheit);
            console.log(rta.fahrenheit)});
});