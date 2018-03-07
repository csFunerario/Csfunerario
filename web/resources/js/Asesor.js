function ingresar(){

  var rol = document.getElementById('tipUsu').selectedIndex;
  var usuario = document.getElementById('username').value;
  var contrasena = document.getElementById('password').value;

  if(rol == ""){
    swal(
      'Error!',
      'Debe seleccionar el tipo de usuario',
      'error'
    );
  }else{
    if(usuario == ""){
      swal(
        'Error!',
        'Debe ingresar el usuario',
        'error',
      );
    }else {
      if(contrasena == ""){
        swal(
          'Error!',
          'Debe ingresar la contraseña',
          'error'
        );
      }else {
        if(rol == 2 && usuario == "dmora" && contrasena == "123456"){
          window.location="modulos/Administrador/index.html";
        }

        if (rol == 3 && usuario == "vmunoz" && contrasena == "123456") {
        window.location="modulos/Radicador/index.html";
        }

        if (rol == 4 && usuario == "frojas" && contrasena == "123456") {
        window.location="modulos/Asesor/index.html";
        }

        if (rol == 1 && usuario == "jmolina" && contrasena == "123456") {
        window.location="modulos/Usuario/Principal.html";
        }
      }
    }
  }
}
