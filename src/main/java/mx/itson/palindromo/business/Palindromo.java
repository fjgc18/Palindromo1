/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.palindromo.business;

/**
 *
 * @author alumnog
 */
public class Palindromo {
    public static boolean esPalindromo(String phrase) {
    /**
     * Identificar si una cadena de palabras es un palindromo
     * @param cleanPhrase = depuramos la frase que se inserto en al terminal y lo convertimos en letras minusculas.
     * @param palindrome = agarramos nuestra frase depurada y acomodamos al reves todos sus caracteres.
     * @return Si el valor de nuestra frase ya depurada (cleanPhrase) es el mismo que nuestra frase al reves (palindrome) al reves (retorna un boolean).
     */
    String cleanPhrase = phrase.replace(" ", "").replace("¡", "").replace(",", "").replace("!", "").toLowerCase();
    String palindrome = new StringBuilder(cleanPhrase).reverse().toString();
        return cleanPhrase.equals(palindrome);
        
    }
}
 //me ayude con: https://www.youtube.com/watch?v=A3OamGCKQfM
