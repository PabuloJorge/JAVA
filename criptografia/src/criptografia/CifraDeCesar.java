package criptografia;

import java.util.Scanner;

public class CifraDeCesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "";
		int chave = 0;
		System.out.println("Digite a frase para criptografar: ");
		Scanner leia = new Scanner(System.in);
		frase = leia.nextLine();
		System.out.println("Digite a chave:");
		chave = leia.nextInt();
		System.out.println("Texto criptografado: "+ encriptar(chave,frase));
		System.out.println("Texto Decriptografado: "+ decriptar(chave,(encriptar(chave,frase))));
		
		
		

	}
	public static String encriptar(int chave, String texto){
        // Variavel que ira guardar o texto crifrado
        String textoCifrado = "";
        // Variavel com tamanho do texto a ser encriptado
        int tamanhoTexto = texto.length();
        int letraCifradaASCII;
       
        // Criptografa cada caractere por vez
        for(int c=0; c < tamanhoTexto; c++){
            // Transforma o caracter em codigo ASCII e faz a criptografia
            // n�o criptografa espa�o.
            int letranormal = ((int) texto.charAt(c));
            if (letranormal != 32)
                letraCifradaASCII = ((int) texto.charAt(c)) + chave;
            else
                letraCifradaASCII = ((int) texto.charAt(c));
           
            // Verifica se o codigo ASCII esta no limite dos caracteres imprimiveis
            while(letraCifradaASCII > 126)  {
                letraCifradaASCII -= 94;
            }
            // Transforma codigo ASCII criptografado em caracter ao novo texto
            textoCifrado = textoCifrado + (char)letraCifradaASCII;
        }
       
        // Por fim retorna a mensagem criptografada por completo
        return textoCifrado;
    }
	public static String decriptar(int chave, String texto){
        // Variavel que ira guardar o texto crifrado
        String textoCifrado = "";
        // Variavel com tamanho do texto a ser encriptado
        int tamanhoTexto = texto.length();
        int letraCifradaASCII;
       
        // Criptografa cada caractere por vez
        for(int c=0; c < tamanhoTexto; c++){
            // Transforma o caracter em codigo ASCII e faz a criptografia
            // n�o criptografa espa�o.
            int letranormal = ((int) texto.charAt(c));
            if (letranormal != 32)
                letraCifradaASCII = ((int) texto.charAt(c)) - chave;
            else
                letraCifradaASCII = ((int) texto.charAt(c));
           
            // Verifica se o codigo ASCII esta no limite dos caracteres imprimiveis
            while(letraCifradaASCII > 126)  {
                letraCifradaASCII -= 94;
            }
            // Transforma codigo ASCII criptografado em caracter ao novo texto
            textoCifrado = textoCifrado + (char)letraCifradaASCII;
        }
       
        // Por fim retorna a mensagem criptografada por completo
        return textoCifrado;
    }
	public static String decriptarOficial(int chave, String textoCifrado)  {
        // Variavel que ira guardar o texto decifrado
        String texto = "";
        // Variavel com tamanho do texto a ser decriptado
        int tamanhoTexto = textoCifrado.length();
        int letraDecifradaASCII=0;
        
        // Descriptografa cada caractere por vez
        for(int c=0; c < tamanhoTexto; c++){
            // Transforma o caracter em codigo ASCII e faz a descriptografia
            int letracifradaASCII = (int) textoCifrado.charAt(c);
            if (letracifradaASCII != 32)
                letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - chave;
            else
                letraDecifradaASCII = ((int) textoCifrado.charAt(c));
            
            // Verifica se o codigo ASCII esta no limite dos caracteres imprimiveis
            while(letraDecifradaASCII < 32)
                letraDecifradaASCII += 94;

 

            // Transforma codigo ASCII descriptografado em caracter ao novo texto
            texto = texto + (char)letraDecifradaASCII ;
        }
        
        // Por fim retorna a mensagem descriptografada por completo
        return texto;
    }
}
