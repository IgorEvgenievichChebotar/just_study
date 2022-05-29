package ru.rutmiit;

public class Cryptography {
    public static String encryptByPermutations(String text, int[] key){
        StringBuilder encrypted_text = new StringBuilder();
        int block_size = key.length;
        int blocks_num = text.length()/key.length;
        int remainder = text.length()%key.length;

        if(remainder!=0){
            blocks_num+=1;
            text += " ".repeat(Math.max(0, (block_size - remainder) + 1));
        }

        int start = 0;
        int end = block_size;
        for(int i = 0; i < blocks_num; i++) {
            char[] source_block = text.substring(start, end).toCharArray();
            char[] encrypted_block = new char[block_size];
            for (int j = 0; j < source_block.length; j++)
                encrypted_block[j] = source_block[key[j]]; // <-----------------------------------
            String encrypted_str = new String(encrypted_block);
            encrypted_text.append(encrypted_str);
            start += block_size;
            end += block_size;
        }

        return encrypted_text.toString();
    }

    public static String decryptByPermutations(String text, int[] key){
        StringBuilder decrypted_text = new StringBuilder();
        int block_size = key.length;
        int blocks_num = text.length()/key.length;

        int start = 0;
        int end = block_size;
        for(int i = 0; i < blocks_num; i++) {
            char[] source_block = text.substring(start, end).toCharArray();
            char[] decrypted_block = new char[block_size];
            for (int j = 0; j < source_block.length; j++)
                decrypted_block[key[j]] = source_block[j]; // <-----------------------------------
            String decrypted_str = new String(decrypted_block);
            decrypted_text.append(decrypted_str);
            start += block_size;
            end += block_size;
        }

        return decrypted_text.toString();
    }

    public static String encryptByGamma(String text, String gamma_key){
        while(gamma_key.length() < text.length())
            gamma_key += gamma_key;

        char[] char_arr = text.toCharArray();
        char[] key_arr = gamma_key.toCharArray();

        for (int i = 0; i < char_arr.length; i++) {
            char_arr[i] += key_arr[i]; // <-----------------------------------
        }
        return new String(char_arr);
    }

    public static String decryptByGamma(String text, String gamma_key){
        while(gamma_key.length() < text.length())
            gamma_key += gamma_key;

        char[] char_arr = text.toCharArray();
        char[] key_arr = gamma_key.toCharArray();

        for (int i = 0; i < char_arr.length; i++) {
            char_arr[i] -= key_arr[i]; // <-----------------------------------
        }
        return new String(char_arr);
    }

    public static void main(String[] args) {
        String text =
                "При построении системы безопасности применяются политики защиты," +
                        " основанные на требованиях," +
                        " определяемых направлениями деятельности компании."; // исходное сообщение

        int[] key = {2, 0, 1, 5, 3, 4, 6};

        System.out.println(encryptByPermutations(text, key));
        System.out.println(decryptByPermutations(encryptByPermutations(text, key), key));

        String gamma_key = "qwertyuiop[]asdfghjkl;'zxcvbnm,./";

        System.out.println(encryptByGamma(text, gamma_key));
        System.out.println(decryptByGamma(encryptByGamma(text, gamma_key), gamma_key));
    }
}
