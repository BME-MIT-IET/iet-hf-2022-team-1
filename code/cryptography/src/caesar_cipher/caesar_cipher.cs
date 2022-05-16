// CAESAR CIPHER USING C#
// Sample Input:
// qwertyuiopasdfghjklzxcvbnm@QWERTYUIOPASDFGHJKLZXCVBNM
// 3
// Sample Output:
// Encrypted value is: rxfsuzvjpqbteghiklmaydwcon?RXFSUZVJPQBTEGHIKLMAYDWCON
// Decrypted value is: qwertyuiopasdfghjklzxcvbnm?QWERTYUIOPASDFGHJKLZXCVBNM
// Part of Cosmos by OpenGenus Foundation
using System.IO;
using System;

static class Program
{
    const int NUM_ALPHABETS = 26;
    static char addValue(char character, int valueToShiftBy){
        if(character >= 'a' && character <= 'z'){
            return Convert.ToChar((((character - 'a') + valueToShiftBy) % NUM_ALPHABETS) + 'a');
        }
        else if(character >= 'A' && character <= 'Z'){
            return Convert.ToChar((((character - 'A') + valueToShiftBy) % NUM_ALPHABETS) + 'A');
        }
        // Not sure if Caesar's happy with this :)
        return '?';
    }
    
    static char subtractValue(char character, int valueToShiftBy){
        return addValue(character, NUM_ALPHABETS-(valueToShiftBy % NUM_ALPHABETS));
    }

    static string DecryptByCaesarCipher(string stringToEncrypt, int keyToShiftBy){
        StringBuilder bld = new StringBuilder();
        foreach(var character in stringToEncrypt){
            bld.Append(subtractValue(character, keyToShiftBy));
        }
        return bld.ToString();
    }

    static string EncryptByCaesarCipher(string stringToEncrypt, int keyToShiftBy){
        StringBuilder bld = new StringBuilder();
        foreach(var character in stringToEncrypt){
            bld.Append(addValue(character, keyToShiftBy));
        }
        return bld.ToString();
    }

    static void Main()
    {
        Console.WriteLine("Enter string and key!");
        var stringToEncrypt = Console.ReadLine();
        var keyToShiftBy = int.Parse(Console.ReadLine());
        var encryptedValue = EncryptByCaesarCipher(stringToEncrypt, keyToShiftBy);
        Console.WriteLine($"Encrypted value is: {encryptedValue}");
        var decryptedValue = DecryptByCaesarCipher(encryptedValue, keyToShiftBy);
        Console.WriteLine($"Decrypted value is: {decryptedValue}");
    }
}
