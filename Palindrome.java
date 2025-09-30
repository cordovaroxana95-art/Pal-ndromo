package org.generation;


/*

*En el contexto de Java, la tarea de identificar un palíndromo generalmente involucra cadenas de texto (String):
*Definición General: El concepto es el mismo que en el lenguaje natural. Ejemplos de palíndromos son:
*Palabras: "oso", "reconocer", "rayar".
*Frases (ignorando espacios, puntuación y mayúsculas/minúsculas): "Anita lava la tina" o "Sé verlas al revés".
*Números (llamados capicúa): 121, 4554.
*Programación en Java: Crear un programa para verificar si una cadena es un palíndromo es un ejercicio común que requiere manipular y comparar strings. Los enfoques típicos incluyen:
*Invertir la cadena (a menudo con la clase StringBuilder y su método reverse()) y luego compararla con la original.
*Comparación de dos punteros: Usar un bucle para comparar el carácter en la posición inicial con el carácter en la posición final, y mover los punteros hacia el centro de la cadena.
*Para una explicación más detallada sobre cómo detectar si una palabra o frase es un palíndromo en Java, puedes ver el siguiente video:
 */

/*isPalindrome(String text):

    text.toLowerCase(): Convierte toda la cadena a minúsculas para que "Oso" y "oso" sean tratados igual.

    .replaceAll("[^a-z0-9]", ""): Elimina cualquier carácter que no sea una letra (de 'a' a 'z') o un número (de '0' a '9'). Esto se encarga de los espacios, comas, tildes, etc.

    new StringBuilder(cleanText).reverse().toString(): Toma la cadena limpia, la invierte con StringBuilder.reverse(), y la convierte de nuevo a String.

    cleanText.equals(reversedText): Compara la cadena original limpia con la invertida. Si son idénticas, devuelve true.

*/









public class Palindrome {

    /**
     * Verifica si una cadena de texto es un palíndromo.
     * Un palíndromo se lee igual al derecho que al revés (ignorando espacios y mayúsculas).
     * * @param text La cadena de texto a verificar.
     * @return true si es un palíndromo, false en caso contrario.
     */
    public boolean isPalindrome(String text) {
        // 1. Preprocesar la cadena:
        //    - Convertir a minúsculas (para ignorar mayúsculas/minúsculas).
        //    - Eliminar todos los caracteres no alfanuméricos (espacios, comas, etc.).
        String cleanText = text.toLowerCase().replaceAll("[^a-z0-9]", "");

        // 2. Crear una cadena invertida usando StringBuilder:
        //    - StringBuilder es más eficiente para manipular cadenas.
        String reversedText = new StringBuilder(cleanText).reverse().toString();

        // 3. Comparar la cadena limpia con su versión invertida:
        //    - Si son iguales, es un palíndromo.
        return cleanText.equals(reversedText);
    }
}