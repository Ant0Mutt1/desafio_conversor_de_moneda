![Subtítulo](https://github.com/user-attachments/assets/8cb5ec89-5aa7-44c5-9b3a-4bb8ffae0d73)


<p align="left">
   <img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-blue">
</p>

---

# Conversor de Monedas

## 📚 Índice

* [📖 Descripción del Proyecto](#descripción-del-proyecto)
* [🚧 Estado del proyecto](#estado-del-proyecto)
* [🎯 Demostración de funciones y aplicaciones](#demostración-de-funciones-y-aplicaciones)
* [📂 Acceso al Proyecto](#acceso-al-proyecto)
* [🔑 Configuración de la API Key](#configuración-de-la-API-Key)
* [🛠️ Tecnologías utilizadas](#tecnologías-utilizadas)
* [🤝 Personas Contribuyentes](#personas-contribuyentes)
* [📝 Licencia](#licencia)

---

## 📖 Descripción del Proyecto

Este es un proyecto simple en Java que implementa un conversor de monedas mediante el uso de una API externa. El programa permite al usuario seleccionar entre varios pares de monedas y consultar el tipo de cambio actual, ingresando un monto específico.

El objetivo principal es practicar entrada de datos, manejo de excepciones, estructuras de control y consumo de APIs REST en Java.

---

## 🚧 Estado del proyecto

✅ **Finalizado** – Versión básica funcional completa.
🔜 Mejoras futuras pueden incluir:

* Interfaz gráfica (GUI)
* Soporte para más monedas
* Validaciones avanzadas y pruebas unitarias

---

## 🎯 Demostración de funciones y aplicaciones

**Funciones principales:**

* Menú interactivo por consola
* Selección de pares de monedas (USD/ARS, ARS/USD, etc.)
* Validación del monto ingresado (solo acepta valores numéricos)
* Consulta de tipo de cambio mediante una clase `ConsultaCambioMoneda`
* Presentación del resultado al usuario

**Ejemplo de uso:**

```
****************************************************
Bienvenido/a a MoneySwap

Seleccione una opción:

1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileño
4) Real brasileño =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Salir


2
Ingrese un monto: 
400
El valor 400 [ARS] corresponde al valor final de ==> 0.332272 [USD]
```

---

## 📂 Acceso al Proyecto

Para clonar este repositorio localmente:

```bash
git clone https://github.com/Ant0Mutt1/desafio_conversor_de_moneda.git
```

Luego compílalo y ejecútalo desde tu IDE o consola con:

```bash
javac Main.java
java Main
```

---
## 🔑 Configuración de la API Key

Este proyecto depende de una API externa para obtener tasas de cambio. Para que funcione correctamente:

    Regístrate en un proveedor de APIs de tipo de cambio, como:
    https://www.exchangerate-api.com
    o https://apilayer.com/marketplace/exchangerates_data-api

    Obtén tu API Key.

    Abre el archivo ConsultaCambioMoneda.java.

    Reemplaza la parte de la URL que contiene la clave de API con la tuya propia. Por ejemplo:
   ```bash
      URI direccion = URI.create("https://v6.exchangerate-api.com/v6/APIKEY/pair/" + monedaOrigen + "/" + monedaDestino + "/" + monto);
   ```
⚠️ No compartas tu API Key públicamente.
---
## 🛠️ Tecnologías utilizadas

* Java 17+
* API REST para tipo de cambio ([exchangerate-api.com](https://www.exchangerate-api.com/))
* IDE recomendado: IntelliJ IDEA o VSCode con soporte para Java

---

## 🤝 Personas Contribuyentes

> Actualmente no hay contribuyentes externos. ¡Las contribuciones son bienvenidas!

---


## 📝 Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más información.

---

