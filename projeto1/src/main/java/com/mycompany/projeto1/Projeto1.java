/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1;

import com.formdev.flatlaf.FlatDarkLaf;


/**
 *
 * @author jrgou
 */
public class Projeto1 {
   
    public static void main(String[] args) {
         FlatDarkLaf.setup(); 
         Login form = new Login();
         form.setVisible(true);
    }
}
