var celsiusafahrenheit = document.getElementById('button-celsiusafahrenheit');
celsiusafahrenheit.addEventListener('click', function(){
    var celda = document.getElementById('Celsius').value;
    console.log(celda);
    var linkapi1 = 'https://calc-api-be.herokuapp.com/Calculator'
    fetch('${linkapi1}/celsius/$Celsius}').then(res => {
        var obj = JSON.parse(res.data);
        $("fahrenheit").text("Fahrenheit : " + obj);
        console.log(obj);
        })
        .catch(function (error) {
                    console.log(error);
        })
});