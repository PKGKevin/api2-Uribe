document.addEventListener("DOMContentLoaded", function () {
    const formulario = document.getElementById("registroPersonaje");

    formulario.addEventListener("submit", async function (event) {
        event.preventDefault();

        const datos = {
            nombre: formulario.nombre.value,
            cantidadVida: parseInt(formulario.cantidadVida.value),
            poderAtaque: parseInt(formulario.poderAtaque.value),
            poderDefensa: parseInt(formulario.poderDefensa.value),
            fotografia: formulario.fotografia.value,
            vivoMuerto: formulario.vivo.value === "true" ? "Vivo" : "Muerto",
            villano: formulario.villano.value === "true" ? "Villano" : "Heroe",
            heroeVillano: formulario.heroe.value === "true" ? "Heroe" : "Villano",
            fechaCreacion: formulario.fechaCreacion.value
        };

        try {
            const respuesta = await fetch("http://localhost:9090/Personajes", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(datos)
            });

            if (respuesta.ok) {
                alert("✅ Registro exitoso");
                formulario.reset();
            } else {
                const errorTexto = await respuesta.text();
                alert("❌ Error en el registro: " + errorTexto);
            }
        } catch (error) {
            alert("🚫 Error de conexión con el servidor: " + error.message);
        }
    });
});

