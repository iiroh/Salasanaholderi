/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountholder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author iheinala
 */
public class IOoperation {
 private String Filename;
         
         
         public IOoperation(String filename){
         Filename = filename;
         
         }
         
         public void writeText(String text) throws IOException{
         BufferedWriter out = new BufferedWriter(new FileWriter(Filename));
         out.write(text);
         out.close();
         
         }
         
         public String readText() throws IOException{
         BufferedReader in = new BufferedReader(new FileReader(Filename));
         String s =in.readLine();
         in.close();
         return s;
         
         }
         
         public void saveAccount(Account acc) throws IOException{
         
             ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("accoutit"));
             out.writeObject(acc);
             out.close();
         
         }
         
         public Account loadAccount() throws IOException, ClassNotFoundException{
         
             ObjectInputStream in =new ObjectInputStream(new FileInputStream("accountit"));
             
             Account acc = (Account) in.readObject();
             return acc;
         }
         
         
}
