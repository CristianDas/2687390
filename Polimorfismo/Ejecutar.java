importar  Java . útil _ escáner ;
 clase  pública Ejecutar {
    public  static  void  main ( String [] args ) {
        Scanner  lectura = nuevo  Scanner ( Sistema . en );
        int  op = 1 ;
         opción int ;
        mientras ( op == 1 ) {
            sistema _ fuera _ println ( "Digite 1 si quiere calcular el area de un circulo,2 si es el area del cuadrado, 3 si es el area del triangulo y 4 si es el area del rectangulo" ) ;
            opción = lectura . siguienteInt ();
            si ( opción == 1 ){
                Circulo  circulo = new  Circulo ();
                circulo _ calcularArea ();
            }
            más  si ( opción == 2 ){
                Cuadrado  cuadrado = nuevo  Cuadrado ();
                cuadrado _ calcularArea ();
            }
            más  si ( opción == 3 ){
                Triángulo  triágulo = nuevo  Triángulo ();
                triágulo _ calcularArea ();
            }
            más  si ( opción == 4 ){
                Rectángulo  rectangulo = new  Rectángulo ();
                rectangulo _ calcularArea ();
            }
            sistema _ fuera _ println ( "quiere volver a calcular, digite 1 para si y 2 para no" );
            op = lectura . siguienteInt ();
        }
        lectura _ cerrar ();
    }
}
