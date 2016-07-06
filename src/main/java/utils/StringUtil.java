/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Alexy Duquesnoy
 */
public class StringUtil {
    
    public static String toUCFirst(String string) {
        return string.substring(0, 1).toUpperCase()+ string.substring(1).toLowerCase();
    }
    
}
