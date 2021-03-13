Ejercicio 1
Carpeta demo incluye fuentes pregunta 1, las cuales se deben importar en eclipse y ejecutar.
para probar se debe ejecutar en postman de la siguiente manera:

POST http://127.0.0.1:8080/api/v1/todo body : 

 {
        "marca": "suzuki",
        "modelo": "jimny",
        "patente": "as1234",
        "anio": 2020,
        "kilometraje": 0,
        "cilindrada": 1300,
        "todoStatus": "AUTO",
        "tipoAutomovil": "4x4",
        "capPasajeros": 4,
        "capMaletero": 20,
        "tipoCamion": null,
        "capToneladas": 0,
        "ejes": 0,
        "npuertas": 0
    }


GET http://127.0.0.1:8080/api/v1/todo
GET http://127.0.0.1:8080/api/v1/todo/id (id del objeto a consultar)
PUT http://127.0.0.1:8080/api/v1/todo/id (id del objeto a modificar)

body : 

 {
        "marca": "suzuki",
        "modelo": "jimny",
        "patente": "as1234",
        "anio": 2020,
        "kilometraje": 0,
        "cilindrada": 1300,
        "todoStatus": "AUTO",
        "tipoAutomovil": "4x4",
        "capPasajeros": 4,
        "capMaletero": 20,
        "tipoCamion": null,
        "capToneladas": 0,
        "ejes": 0,
        "npuertas": 0
    }
DELETE http://127.0.0.1:8080/api/v1/todo/id  (id del objeto a eliminar)


Para Ejercicio 2 

Se adjuntan las querys en la carpeta query.
