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

var fahrenheitacelsius = document.getElementById('button-fahrenheitacelsius');
celsiusafahrenheit.addEventListener('click', function(){
    var celda = document.getElementById('fahrenheits').value;
    console.log(celda);
    var linkapi1 = 'https://calc-api-be.herokuapp.com/Calculator'
    fetch(`${linkapi1}/celsius/${celda}`).then(res => {
        return res.json();
        }).then( rta =>  {
            var obj = JSON.parse(rta.fahrenheit);
            $("#celsiusl").text("Celsius : " + obj);
            console.log(obj);
            })
});