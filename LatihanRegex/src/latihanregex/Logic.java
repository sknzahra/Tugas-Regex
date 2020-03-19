/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanregex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class Logic {
    //Boolean mengembalikan true/false
    //first function
    public Boolean checkEmail(String email){
        //pattern = untuk menyamakan/compile
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_"
                + "\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        //fungsi matcher untuk ngecek apakah inputnya match dengan pattern
        //kalo patternnya bener=true
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();       
    }
    
    //second function
    //parameter list dan data
    //ArrayList bisa nampung segala data
    public ArrayList addData(ArrayList list, String data){
        list.add(data);
        return list;
    }
    
    public Boolean checkName(String name){
        Pattern ptn = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher mtch = ptn.matcher(name);
        return mtch.matches();
    }
}
