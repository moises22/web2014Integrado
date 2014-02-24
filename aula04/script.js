var valorAguardandoCalc = 0;
var valor = 0;

$(document).ready(function () {
	$('#calc ul .numero').click(function () {
		setValor(this);
	});

	$('#calc ul .operacoes').click(function () {
		$('#display').append($(this).html());
	});


	$('#calc ul .limpa').click(function () {
		$('#display').html("");
	});

	$('#calc ul .resultado').click(function () {
		calcula();
	});

});

function setValor (elemento) {
	$('#display').append($(elemento).html());
}

function getValor () {
	valorAguardandoCalc = parseInt($('#display').html(), 10);
}

function getOperador (elemento) {
	return $(elemento).html();
}

function calcula () {
	var resultado = 0;
	eval("resultado = " + $('#display').html());
	$('#display').html(resultado);
}
