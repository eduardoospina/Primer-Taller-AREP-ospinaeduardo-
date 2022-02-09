//javascript que maneja la transformacion de celsius a fahrenheit.
var celsiusafahrenheit = document.getElementById('button-celsiusafahrenheit');
celsiusafahrenheit.addEventListener('click', function(){
    var celda = document.getElementById('Celsius').value;
    console.log(celda);
    var linkapi1 = 'https://calc-api-be.herokuapp.com/Calculator'
    fetch(`${linkapi1}/celsius/${celda}`).then(res => {
        return res.json();
        }).then( rta =>  {
            var obj = JSON.parse(rta.fahrenheit);
            $("#fahrenheit").text("Fahrenheit : " + obj);
            console.log(obj);
            })
});

//javascript que maneja la transformacion de fahrenheit a celsius.
var fahrenheitacelsius = document.getElementById('button-fahrenheitacelsius');
fahrenheitacelsius.addEventListener('click', function(){
    var celdas = document.getElementById('fahrenheits').value;
    console.log(celdas);
    var linkapi2 = 'https://calc-api-be.herokuapp.com/Calculator'
    fetch(`${linkapi2}/fahrenheit/${celdas}`).then(resp => {
        return resp.json();
        }).then( rta =>  {
            var obj = JSON.parse(rta.celsius);
            $("#celsiusl").text("Celsius : " + obj);
            console.log(obj);
            })
});