$('.input-group.date').datepicker({
    format: "dd/mm/yyyy",
    clearBtn: true,
    language: "es"
});
swal(
  'Correcto',
  'Usuario registrado correctamente',
  'success'
)
function validacion() {

	var tipodoc,numdoc,contrat,radicado,nombre,nombre2,apellido,apellido2,telefono,correo,direccion,ciudad,fecha,edad,genero,servicio,fechaafiliacion;

	tipodoc=document.getElementById('optionf1').value;

	numdoc=document.getElementById('Numero_de_Documentof1').value;
	contrat=document.getElementById('contrato').value;
	radicado=document.getElementById('radicado').value;
	nombre=document.getElementById('Nombref1').value;
	nombre2=document.getElementById('Segundo_Nombref1').value;
	apellido=document.getElementById('Primer_Apellidof1').value;
	apellido2=document.getElementById('Segundo_Apellidof1').value;
	telefono=document.getElementById('Telefonof1').value;
	correo=document.getElementById('Correo_Electronicof1').value;
	direccion=document.getElementById('Direccionf1').value;
	ciudad=document.getElementById('option2f1').value;
	fecha=document.getElementById('Fecha_de_Nacimientof1').value;
	edad=document.getElementById('Edadf1').value;
	genero=document.getElementById('option3f1').value;
	servicio=document.getElementById('option4f1').value;
	fechaafiliacion=document.getElementById('Fecha_de_Afiliacionf1').value;
	exprecion=/\w+@\w+\.[a-z]/;

	if (tipodoc==="" || numdoc==="" || contrat==="" || radicado===""  || nombre==="" || nombre2==="" || apellido==="" || apellido2==="" || telefono==="" || correo==="" || direccion=="" || ciudad=="" || fecha=="" || edad=="" || genero=="" || servicio=="" || fechaafiliacion=="" ) {
		alert("todos los campos son requeridos");
		return false;
	}
	else if (isNaN(telefono)) {
		alert("el telefono ingresado es incorrecto");
		return false;
	}
	else if (!exprecion.test(correo)) {
		alert("El correo es incorrecto");
		return false;
	}
}

function validacion2(){

	var cont2,radicado2,tipodoc2,numdoc2,nomben,apeben,telefono2,
	correo2,direccion2,ciudad2,nacimiento2,edad2,genero2,parentesco2,afiliacion2;

	cont2=document.getElementById('contrato2').value;
	radicado2=document.getElementById('radicado2').value;
	tipodoc2=document.getElementById('tipodoc2').value;
	numdoc2=document.getElementById('documento2').value;
	nomben=document.getElementById('beneficiario2').value;
	apeben=document.getElementById('apellidob2').value;
	telefono2=document.getElementById('telefono2').value;
	correo2=document.getElementById('correo2').value;
	direccion2=document.getElementById('direccion2').value;
	ciudad2=document.getElementById('ciudad2').value;
	nacimiento2=document.getElementById('Fecha_de_Nacimientof2').value;
	edad2=document.getElementById('edad2').value;
	genero2=document.getElementById('genero2').value;
	parentesco2=document.getElementById('parentesco2').value;
	afiliacion2=document.getElementById('Fecha_de_Afiliacionf2').value;

 if (cont2==="" || radicado2==="" || tipodoc2==="" || numdoc2==="" || nomben==="" || apeben==="" || telefono2==="" || correo2==="" || direccion2==="" || ciudad2==="" || nacimiento2=="" || edad2=="" || genero2=="" || parentesco2=="" || afiliacion2=="") {
		alert("todos los campos son requeridos");
		return false;
	}
	else if (isNaN(telefono2)) {
		alert("el telefono ingresado es incorrecto");
		return false;
	}
	else if (!exprecion.test(correo2)) {
		alert("El correo es incorrecto");
		return false;
	}
}
