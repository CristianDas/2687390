paquete  polimorfiso ;
importar  Java . útil _ escáner ;
 clase  pública Ejecutar2 {
    public  static  void  mainprincipal ( String [] args ) {
        Scanner  lectura = nuevo  Scanner ( Sistema . en );
        int  op = 1 ;
         opción int ;
        mientras ( op == 1 ) {
            sistema _ fuera _ println ( "digite 1 si quiere jugar carisellazo o 2 si quiere jugar piedra papel o tijera" );
            opción = lectura . siguienteInt ();
            si ( opción == 1 ){
                Carisellazo  game2 = nuevo  Carisellazo ();
                juego2 . iniciar ();
                juego2 . jugar ();
                juego2 . finalizar ();
            }
            más  si ( opción == 2 ){
                Ppt  juego = nuevo   Ppt ();
                juego _ iniciar ();
                juego _ jugar ();
                juego _ finalizar ();
            }
            más {
                sistema _ fuera _ println ( "error, vuelva a empezar" );
            }
            sistema _ fuera _ println ( "digite 1 si quiere volver a jugar o 2 si quiere finalizar" );
        op = lectura . siguienteInt ();
        }
        lectura _ cerrar ();
    }
}
