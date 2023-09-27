/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ds;
/**
 *
 * @author Jeel
 */
import java.util.*;
public class lab2 {
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        String input = sc.next();
        Stack<String> paren = new Stack<>();
        for (String p : input.split("")) {
        if (!p.isEmpty()) { //THIS WAS MISSING IN THE PREVIOUS METHODS
            if (paren.isEmpty()) {
                paren.push(p);
            } else {
                String top = paren.peek();
                if (p.equals("}") && top.equals("{")
                    || (p.equals("]") && top.equals("[") 
                    || (p.equals(")") && top.equals("(")))) {
                    paren.pop();
                } else {
                    paren.push(p);
                }
            }
        }
    }
    String toPrint = (paren.isEmpty()) ? "true" : "false";
    System.out.println(toPrint);
    }
    }
}
