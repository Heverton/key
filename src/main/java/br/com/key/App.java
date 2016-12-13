package br.com.key;

import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;

/**
 * https://ricardospinoza.wordpress.com/2012/06/19/java-apache-commons-codificar-e-decodificar-string/
 */
public class App 
{
    /**
     * @brief Codifica string na base 64 (Encoder)
     * @return string ofuscada
     * @date 12/04/2012
     * codec]
     */
    public static String codificaBase64Encoder(String str) {
        return new Base32().encodeToString(str.getBytes());
    }

    /**
     * @brief DesCodifica string na base 64 (Decoder)
     * @return string desofuscada
     * @date 12/04/2012
     */
    public static String decodificaBase64Decoder(String str) {
        return new String(new Base32().decode(str));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String stringCodificada = codificaBase64Encoder("101123001h");
        //retorna: string ofuscada: dGlvIHBhdGluaGFz
        String stringDecodificada = decodificaBase64Decoder(stringCodificada);
        //retorna: string desofuscada: tio patinhas

        System.out.println("- String Codificada: " + stringCodificada +" "+stringCodificada.length() +
                "\n- String Decodificada: " + stringDecodificada +" "+stringDecodificada.length());
        //retorna: Dada string ofucada 'dGlvIHBhdGluaGFz', retorna a string desofuscada: tio patinhas

    }
}
