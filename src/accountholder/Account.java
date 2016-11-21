/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountholder;

import java.util.Random;

/**
 *
 * @author iheinala
 */
public class Account implements java.io.Serializable {
    
    private String Name;
    private static double ID = 0;
    private String Password;
    private String Username;
    private String Mail;
//    private String Note;
    
    
public Account(String accountName, String username, String password, String mailaddress){
    
        Name = accountName;
        ID = ID + 0.1;
        System.out.println("Account " + ID + " " + Name + " luotu. Salasana: " + Password + " Username: "+ Username);
    }
    
public Account(String accountName){

        Name = accountName;
        ID = ID + 0.1;
            //luo random salasana, jos mitaan ei anneta
            Random rnd = new Random();
            String word;
            word = "Omenahotelli" + rnd.nextInt(10);
            Password = word + rnd.nextInt(10);

        System.out.println("Account " + ID + " " + Name + " luotu. Salasana: " + Password + " Username: "+ Username);

    }
public void setAccountName(String accountName){
    
        /** */
             Name = accountName;
            System.out.println("Account name on nyt: " + Name);

    }
public String getAccountName(){

    return Name;

    }
public void createRandomPassword(){

    //luo random salasana, jos mitaan ei anneta
    Random rnd = new Random();
    String word;
    word = "Omenahotelli" + rnd.nextInt(10);
    Password = word + rnd.nextInt(10);
    System.out.println("Salasana on nyt: " + Password);
    
}

public void setPassword (String password){
//Tarkistuksia: pituus 8 merkkiä, sisaltaako yhtään numeroita

    String word;    
if ("".equals(password)){
    
        //luo random salasana, jos mitaan ei anneta
    Random rnd = new Random();
    
    word = "Omenahotelli" + rnd.nextInt(10);
    Password = word + rnd.nextInt(10);
    System.out.println("Salasana on nyt: " + Password);
        
}else{
        word = password;
        
        if (word.length() >= 8){
            
            for (int i=0; i== word.length(); i++){   
                
                if (Character.isDigit(word.charAt(i))== true){
                    i = word.length();
                    Password = word;
                    System.out.println("Salasana on nyt: " + Password);
                }else{
                    System.out.println("Salasana ei ole yhtään numeroa");
                }
            }
            
        }else{
            System.out.println("Salasana liian lyhyt. Oltava vahintaan 8 merkkia");
        }
}
    }

public void setPasswordNroLetters (String password, int numberOfLetters){
//Tarkistuksia: pituus

        String word = password;
        int number = numberOfLetters;

        if (word.length() >= number){
            Password = word;
            System.out.println("Salasana on nyt: " + Password);
        }else{
            System.out.println("Salasana liian lyhyt. Oltava vahintaan " + number + " merkkia");
        }
}

public String getPassword(){

    return Password;

}

public void setUsernameRnd(){
        /** luo random käyttäjänimen 4 kirjainta ja 4 numeroa ja tulostaa sen*/
        
        Random rnd = new Random();
        
        String rnd1, rnd2, rnd3, rnd4, username;
        rnd1 = Integer.toString(rnd.nextInt(10));
        rnd2 = Integer.toString(rnd.nextInt(10));
        rnd3 = Integer.toString(rnd.nextInt(10));
        rnd4 = Integer.toString(rnd.nextInt(10));
        
        username = "Iiro" + rnd1 + rnd2 + rnd3 + rnd4;
        Username = username;
        System.out.println("Username is: " + username);
    }
    
public void setUsername(String username){
    
        /**
        Luo käyttäjän syötetystä tiedosta
        vaatii vähintään 7 merkkiä
        */

        if (username.length() >= 7){
            Username = username;
            System.out.println("Käyttäjänimi on nyt: " + username);
        }else{
            System.out.println("Käyttäjänimen liian lyhyt. Oltava vahintaan 7 merkkia");
        }
        
    }
    
public String getUsername(){
    
        return Username;
    
    }

public void setMailAddress (String mailAddress){
    
        Mail = mailAddress;
    
    }

public String getMailAddreass(){

    return Mail;
    
}

public void addNote(){

    //kutsuu note luokkaa, joka luo olion joka on tunnisteella liitettävissä accounttiin
    
}
    
}
