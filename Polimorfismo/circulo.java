paquete  polimorfiso ;
importar  Java . útil _ escáner ;
 El círculo de clase  pública extiende la figura {  
     doble  radio privada ;
     área doble  privada ;
    privado  doble  pi = 3.1416 ;
    Scanner  lectura = nuevo  Scanner ( Sistema . en );
     getradio público doble  (){
         radio de retorno ;
    }
    public  void  setradio ( doble  radio ){
        esto _ radio = radio ;
    }
     getArea público doble  () {
         zona de retorno ;
    }
    público  doble  getPi () {
        devolver  pi ;
    }
    public  void  setRadio ( doble  radio ) {
        esto _ radio = radio ;
    }
    public  void  setPi ( doble  pi ) {
        esto _ pi = pi ;
    }
    @ Override //sobreescribir en un metodo

    public  void  calcularArea (){
        sistema _ fuera _ println ( "Digita la radio" );
        radio = lectura . siguienteDoble ();
        radio = radio * radio ;
        área = radio * pi ;
        sistema _ error _ println ( "El radio es: " + radio + " y el area del circulo es: " + area );
    }

}
