/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountholder;

import java.util.ArrayList;

/**
 *
 * @author iheinala
 */
public class Shelf {
    //shelf johon accountteja lisätä 
    //esim. business ja personal holderi. 
    //
    //
    
private String ShelfName;
private ArrayList<Account> accountti = new ArrayList();


public Shelf(String name){

    ShelfName = name;

}

public void addAccount(Account a){

    accountti.add(a);

}

public Account getAccount(int i){

    return accountti.get(i);

}
  
}
