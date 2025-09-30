package org.generation; 

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * PalindromeTest:
    @BeforeEach void init(): Inicializa una nueva instancia de Palindrome antes de cada prueba para un entorno limpio.
    @Test void palindromeTest(): Contiene múltiples llamadas a assertEquals(). 
    Esta función verifica que el primer argumento (true o false esperado) sea igual al resultado
     del segundo argumento (palindrome.isPalindrome(...)).
 */







@SuppressWarnings("hiding")
public class PalindromeTest<Palindrome> {

    // Declaración de la instancia de la clase Palindrome
    org.generation.Palindrome Palindrome;

    // Se ejecuta antes de cada prueba para asegurar una nueva instancia
    @BeforeEach
    void init() {
        Palindrome = new org.generation.Palindrome();
    }

    // La prueba principal con varios casos de prueba
    @Test
    void palindromeTest() {
        // Casos que deberían ser TRUE:
        
        // Palabra simple
        assertEquals(true, Palindrome.isPalindrome("Oso"), "Debería ser 'true' para Oso");
        
        // Frase con mayúsculas y espacios
        assertEquals(true, Palindrome.isPalindrome("Anita lava la tina"), "Debería ser 'true' para Anita lava la tina");
        
        // Número capicúa como string
        assertEquals(true, Palindrome.isPalindrome("1881"), "Debería ser 'true' para 1881");
        
        // Frase sin sentido pero simétrica
        assertEquals(true, Palindrome.isPalindrome("a mama"), "Debería ser 'true' para a mama");

        // Casos que deberían ser FALSE:
        
        // Palabras que no son palíndromos
        assertEquals(false, Palindrome.isPalindrome("Ver"), "Debería ser 'false' para Ver");
        assertEquals(false, Palindrome.isPalindrome("Hola"), "Debería ser 'false' para Hola");
        assertEquals(false, Palindrome.isPalindrome("Ocho"), "Debería ser 'false' para Ocho");
        assertEquals(false, Palindrome.isPalindrome("Veronica"), "Debería ser 'false' para Veronica");
    }

	private void assertEquals(boolean b, boolean palindrome2, String string) {
		// TODO Auto-generated method stub
		
	}
}