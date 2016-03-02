package org.dsnProject.DSNProject.encryption;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


import org.springframework.security.crypto.codec.Base64;

import sun.misc.*;

public class AESencrp {
	
	private static final String ALGO="AES";
	private static final String KEY = "1Hbfh667adfDEJ78";
	
	public static String encrypt(String Data) throws Exception{
		
			Key key=generateKey();
			Cipher cipher=Cipher.getInstance(ALGO);
			cipher.init(Cipher.ENCRYPT_MODE,key);
			byte[] encVal=cipher.doFinal(Data.getBytes("utf-8"));
            String encryptedValue = new BASE64Encoder().encode(encVal);
			return encryptedValue;
		
		
	}
	
	public static String decrypt(String encryptedData) throws Exception{
		Key key=generateKey();
		Cipher c=Cipher.getInstance(ALGO);
		  c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[]decValue=c.doFinal(decordedValue);
		String decryptedValue=new String(decValue,"utf-8");
		return decryptedValue;
	
	}
	
	
	
	
	private static Key generateKey()throws Exception{
		 Key key = new SecretKeySpec(AESencrp.KEY.getBytes(),AESencrp.ALGO);
	        return key;
	}
	
	

}
