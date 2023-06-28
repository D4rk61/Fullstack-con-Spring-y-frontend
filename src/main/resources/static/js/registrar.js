// Call the dataTables jQuery plugin
$(document).ready(function() {
    // en el evento que corresponda, llamar a la función registrarUsuario()
});

async function registrarUsuario() {
    let datos = {};
    datos.nombre = document.getElementById('txtNombre').value;
    datos.apellido = document.getElementById('txtApellido').value;
    datos.email = document.getElementById('txtEmail').value;
    datos.password = document.getElementById('txtPassword').value;

    let repetirPassword = document.getElementById('txtRepetirPassword').value;

    if (repetirPassword !== datos.password) {
        alert("La contraseña que escribiste es diferente!");
        return;
    }

    const request = await fetch('api/usuarios', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });

    /*

    if (request.ok) {
        // Registro exitoso, realizar las acciones necesarias
        alert("Usuario registrado correctamente");
        // Redireccionar o actualizar la página según tus necesidades
    } else {
        // Ocurrió un error en la solicitud POST, manejar el error adecuadamente
        alert("Error al registrar el usuario");
    }
    */
}

