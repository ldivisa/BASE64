/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.hopto.luiztjm.testebase64;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

/**
 *
 * @author ZeDaManga
 */
public class TesteBASE64 {

    public static void main(String[] args)  {
        String mensagem = "Hello world!!!!";
        byte[] msgCrypto = Base64.getEncoder().encode(mensagem.getBytes());
        System.out.println(Arrays.toString(msgCrypto));
        byte[] msgDecrypto = Base64.getDecoder().decode(msgCrypto);
        String strFinal =new String(msgDecrypto);
        
        System.out.println("\n"+strFinal);
    }
}
