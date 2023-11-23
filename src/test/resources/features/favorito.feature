# language: es

Característica: Agregar un articulo a favorito
  Escenario: Se agrega articulo a favorito
    Dado que el usuario ingresa a la pag de opencart
    Y el usuario ingresa al login
    Y el usuario ingresa credenciales validas
    Cuando el usuario ingresa a camaras
    Y el usuario agrega articulo a favoritos
    Y el usuario ingresa a la wishlist
    Entonces se valida que el usuario agrego articulo a favoritos
