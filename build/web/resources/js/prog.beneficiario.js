$(document).ready(function(){

  $(document).on('click','.delete', function(){
    var fila = $(this);

      swal({
      title: 'Desea eliminar datos?',
      text: "No podra revertir esto!",
      type: 'warning',
      showCancelButton: true,
      confirmButtonColor: '##c9302c',
      cancelButtonColor: '#d33',
      confirmButtonText: 'si, eliminar!',
      closeOnConfirm: false,
      closeOnCancel: false




    },
    function(isConfirm){
      if (isConfirm) {
        fila.parent().parent().remove();
        swal("Eliminado!", "Su archivo ha sido eliminado.", "success");
      } else {
        swal("Cancelado", "Su archivo es seguro :)", "error");
      }
    });
  });



  $(document).on('click', '.add', function(){
    var tbody = $('#tbody');

  swal({
  title: 'Desea agregar datos?',  
  type: 'warning',
  showCancelButton: true,
  confirmButtonColor: '##31afd3',
  cancelButtonColor: '#d33',
  confirmButtonText: 'Sí, agregar!'
 

  },
    function(isConfirm){
      if (isConfirm) {
       tbody.append(
      "<tr>"+
      "<td><input type='text'/></td>"+
      "<td><input type='text'/></td>"+
      "<td><input type='text'/></td>"+   
      "<td><input type='text'/></td>"+ 
      "<td><input type='text'/></td>"+ 
      "<td><input type='text'/></td>"+ 
      "<td><input type='text'/></td>"+    
      "<td><button class=\"btn btn-success save\"><i class=\"fa fa-floppy-o fa-lg\" aria-hidden=\"true\"></i></button></td>"+
      "</tr>");

        
      } 
    });
  });



    $(document).on('click', '.save', function(){ 
  

      var fila_Padre = $(this).parent().parent();
      var nombre = fila_Padre.children("td:nth-child(1)");
      var apellido = fila_Padre.children("td:nth-child(2)");
      var cedula = fila_Padre.children("td:nth-child(3)");
      var telefono = fila_Padre.children("td:nth-child(4)");
      var correo = fila_Padre.children("td:nth-child(5)");
      var direccion = fila_Padre.children("td:nth-child(6)");
      var ciudad = fila_Padre.children("td:nth-child(7)");
      var opciones = fila_Padre.children("td:nth-child(8)");


      swal({
      title: 'Desea Guardar datos?',  
      type: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#5cb85c',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Sí, Guardar!'
      }, function(){

      nombre.html(nombre.children("input[type=text]").val());
      apellido.html(apellido.children("input[type=text]").val());
      cedula.html(cedula.children("input[type=text]").val());
      telefono.html(telefono.children("input[type=text]").val());
      correo.html(correo.children("input[type=text]").val());
      direccion.html(direccion.children("input[type=text]").val());
      ciudad.html(ciudad.children("input[type=text]").val());
      opciones.html(
       
        "<button class=\"btn btn-danger active delete\"><i class=\"fa fa-trash-o fa-lg\" aria-hidden=\"true\"></i></button>" + " " +
        "<button class=\"btn btn-primary active edit\" ><i class=\"fa fa-pencil fa-lg\" aria-hidden=\"true\"></i></button>" + " " +
        "<button class=\"btn btn-info active add\"><i class=\"fa fa-plus fa-lg\" aria-hidden=\"true\"></i></button>"

      );


    
    
      });  
      
    });


    $(document).on('click', '.edit', function(){

      var fila=$(this);
  
      swal({
      title: 'Desea editar datos?',  
      type: 'warning',
      showCancelButton: true,
      confirmButtonColor: '##286090',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Sí, editar!',
      closeOnConfirm: false,
      closeOnCancel: false
      });
    });
    
});

 

