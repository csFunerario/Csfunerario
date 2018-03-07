$(document).ready(function(){    

    $(document).on('click', '.save', function(){

  
  
      swal({
      title: 'Desea Guardar Cambio?',  
      type: 'warning',
      showCancelButton: true,
      confirmButtonColor: '##286090',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Sí, Guardar!'
      });
    });
});

