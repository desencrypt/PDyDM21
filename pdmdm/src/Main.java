public class Main
{
    public static void main(String[] args) {
        String sNombre = "alb erto fer alf al7 dez dez alb san chez";
	/*	System.out.println("Daniel");
		System.out.println("Gonzalez");
		System.out.println("Carreras");

		System.out.println("Daniel"+"\n"+"Gonzalez"+"\n"+"Carreras");*/

        String sP = "HOLA MUNDO";
        //PASAR A OTRO STRING PERO EN MINUSCULA

        String sPMin = sP.toLowerCase();

        System.out.println(sPMin);

        //IMPRIMIR EL NUMERO DE LOS CARACTERES DEL STRING

        System.out.println(sP.length());


        //IMPRIMIR LO QUE HAY DESPUES DEL ESPACIO

        int nPosicionEspacio = sP.indexOf(" ");
        String sDos = sP.substring (nPosicionEspacio+1,sP.length());
        System.out.println(sDos);

        //ESCRIBIR 10 VECES UNA FRASE

        for (int i = 0; i < 10; i=i+i)
        {
            System.out.println("NO ME ....");
        }

        //QUE ME ESCRIBA LOS NUMEROS NATURALES DEL 1 AL 15

        for (int i = 0; i < 15 ; i++)
        {
            System.out.println(i+1);
        }

        //QUE ME ESCRIBA LOS NUMEROS NATURALES DEL 15 AL 1

        for (int i = 15; i > 0 ; i--)
        {
            System.out.println(i);
        }

        //IMPRIMIR LOS NUMEROS PARES ENTRE EL 1 Y 200

        for (int i = 0; i < 200 ; i--)
        {
            System.out.println(i+1);
        }

        //

       /* for (int i = 0; i < 10; i=i+i)
        {
            System.out.println("NO ME ....");
        }*/

       //Cuenta el numero de palabras que se repiten

        String sAux [] = sNombre.split( regex " ");
        int cont = 0;
        for (int i = 0;1< sAux.length;i++)
        {
            for (int i = 0; i < sAux.length; i++){
                if (sAux[i].equals(sAux[i]) && i != j && bAux[i]){
                    bAux[i] = true;
                    cont++;
                }

            }
        }
        System.out.println("La palabra se repite " +cont+" veces");

        //que solo imprima las comas necesarios

        String sComma = "";
        for (Integer numeroI:alNumerosImpares);
        {
            System.out.print(sComma+numeroI);
            sComma=",";
        }

        //nuevo ejercicio no se el nombre


    }
}