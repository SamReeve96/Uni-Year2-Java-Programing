/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldappl;

/**
 *
 * @author up839743
 */
public class LibClass {
    public static String acrostic(String[] args) {
        StringBuffer b = new StringBuffer();
    /*"b" is an object of string buffer class
    * StringBuffer is a java class, it is like a string but can be modified.
    * At any point in time it can contain a sequence of characters, 
    * but the length and content of the sequence can be changed through 
    * certain method calls. 
    */
    for(int i=0; i<args.length; i++){
        if(args[i].length() > i) {
            int wordLength = args[i].length();
            b.append(args[i].charAt(wordLength - (i + 1)));
        }
        else {
            b.append("?");
        }
    }
    return b.toString();
    //toString() is a method that returns a string representing the data in the object "b"
}
}
