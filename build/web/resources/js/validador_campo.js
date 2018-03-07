$(document).ready(function() {
    $('#registrationForm').formValidation({
        framework: 'bootstrap',
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {


            Pnombre: {
               
                validators: {
                    notEmpty: {
                        message: 'El nombre es obligatorio'
                    },
                    stringLength: {
                        min: 2,                       
                        message: 'Min. 2 caracteres'
                    },
                     regexp: {
                        regexp: /^[a-zA-_\.]+$/,
                        message: 'Ingrese caracteres alfabeticos '
                    }                  
                }
            },


            Snombre: {
                
                validators: {
                    notEmpty: {
                        message: 'El nombre es obligatorio'
                    },
                    stringLength: {
                        min: 2,                       
                        message: 'Min. 2 caracteres'
                    },
                     regexp: {
                        regexp: /^[a-zA-_\.]+$/,
                        message: 'Ingrese caracteres alfabeticos '
                    }     
                }
            },


             Papellido: {
                
                validators: {
                    notEmpty: {
                        message: 'El apellido es obligatorio'
                    },
                 stringLength: {
                        min: 2,                       
                        message: 'Min. 2 caracteres'
                    },
                     regexp: {
                        regexp: /^[a-zA-_\.]+$/,
                        message: 'Ingrese caracteres alfabeticos '
                    }   
                }
            },
            
            Sapellido: {
                
                validators: {
                    notEmpty: {
                        message: 'El apellido es obligatorio'
                    },
                  tringLength: {
                        min: 2,                       
                        message: 'Min. 2 caracteres'
                    },
                     regexp: {
                        regexp: /^[a-zA-_\.]+$/,
                        message: 'Ingrese caracteres alfabeticos '
                    }   
                }
            },




             cedula: {
                validators: {
                    digits: {
                        message: 'Ingrese solo numeros'
                    },
                    notEmpty: {
                        message: 'El número de identificacion es obligatorio'
                    },
                    stringLength: {
                        min: 4,
                        max: 11,
                        message: 'La cedula debe tener min. 4 y max. 11 caracteres'
                    }
                }
            },




             tel: {
                validators: {
                    digits: {
                        message: 'Ingrese solo numeros'
                    },
                    notEmpty: {
                        message: 'El número de telefono es obligatorio'
                    },
                    stringLength: {
                        min: 7,
                        max: 10,
                        message: 'La cedula debe tener min. 4 y max. 11 caracteres'
                    }
                }
            },



           correo: {
                validators: {
                    notEmpty: {
                        message: 'El correo electronico es obligatorio'
                    },
                    emailAddress: {
                        message: 'La entrada no es una dirección de correo electrónico válida'
                    }
                }
            },    


            direccion: {
                validators: {
                    notEmpty: {
                        message: 'Campo requerido'
                    },
                    stringLength: {
                        min: 6,                        
                        message: 'La direccion debe tener min. 4  caracteres'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: 'The username can only consist of alphabetical, number, dot and underscore'
                    }
                }
            },




            fecha_Nac: {
                validators: {
                    notEmpty: {
                        message: 'La fecha de nacimiento es obligatoria'
                    },
                    date: {
                        format: 'YYYY/MM/DD',
                        message: 'La fecha de nacimiento no es válida'
                    }
                }
            },    


            edad: {
                validators: {
                    digits: {
                        message: 'Ingrese solo numeros'
                    },
                    notEmpty: {
                        message: 'la edad es obligatorio'
                    },
                    stringLength: {
                        min: 2,
                        max: 2,
                        message: 'Ingresa edad mayor de 18 años'
                    }
                }
            },




            genero: {
                validators: {
                    notEmpty: {
                        message: 'El genero es requerido'
                    }
                }
            },



            fecha_afil: {
                validators: {
                    notEmpty: {
                        message: 'La fecha de nacimiento es obligatoria'
                    },
                    date: {
                        format: 'YYYY/MM/DD',
                        message: 'La fecha de nacimiento no es válida'
                    }
                }
            }, 



            fecha_fin: {
                validators: {
                    notEmpty: {
                        message: 'La fecha de nacimiento es obligatoria'
                    },
                    date: {
                        format: 'YYYY/MM/DD',
                        message: 'La fecha de nacimiento no es válida'
                    }
                }
            }, 


            username: {
                validators: {
                    notEmpty: {
                        message: 'The username is required'
                    },
                    stringLength: {
                        min: 6,
                        max: 30,
                        message: 'The username must be more than 6 and less than 30 characters long'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: 'The username can only consist of alphabetical, number, dot and underscore'
                    }
                }
            },

            password: {
                validators: {
                    notEmpty: {
                        message: 'The password is required'
                    },
                    different: {
                        field: 'username',
                        message: 'The password cannot be the same as username'
                    }
                }
            },


        }
    });
});