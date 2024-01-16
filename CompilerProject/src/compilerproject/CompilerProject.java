/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerproject;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class CompilerProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println(test(input));       
    }
   public static String test(String word){
        char state='1';
        for(int i =0;i<word.length();i++)
        {
        if(state=='1'){
            if(word.charAt(i)=='a')
                state='2';
                else
                state='z';}
            else if (state=='2'){
                if(word.charAt(i)=='a')
                    state='1';
                    else if (word.charAt(i)=='b')
                        state='3';
                else
                        state='z';
            }
        
            if(state=='3')
            {if(word.charAt(i)=='b')
                state='3';
            else if(word.charAt(i)=='a')
                state='x';
            else
                state='z';
            }
            else if(state=='x'){
                if(word.charAt(i)=='a')
                    state='x';
                else if(word.charAt(i)=='b')
                    state='3';
                else
                    state='z';
            }            
        }
       if (state=='2'||state=='3'||state=='x')
           return "Accepted";
           else
           return "Rejected";     
        }
    }
    

