/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomintgenerator;

import java.util.Random;

/**
 *
 * @author up839743
 */
public class RandomIntGenerator {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(5000);
        System.out.println(randomInt);
        Thread.sleep(randomInt);
        System.out.println("Waited for a while");
    }
}
