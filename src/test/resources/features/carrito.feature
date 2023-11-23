# language: es

Característica: Agregar un articulo al carrito de compras
  Escenario: Se agrega articulo al carrito de compras
    Dado que el usuario ingresa a la pag de opencart
    Y el usuario ingresa al login
    Y el usuario ingresa credenciales validas
    Cuando el usuario ingresa a tablets
    Y el usuario agrega una tablet al carrito de compras
    Y el usuario ingresa al carrito de compras
    Entonces se valida que el usuario agrego articulo al carrito de compras