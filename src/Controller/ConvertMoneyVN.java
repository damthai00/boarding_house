/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author MyPC
 */
public class ConvertMoneyVN {
    private static ConvertMoneyVN instance;
    
    public static ConvertMoneyVN getInstance(){
        if(instance ==null)
            instance = new ConvertMoneyVN();
        return instance;
    }
    
    private static void setInstance(ConvertMoneyVN instance ){
       instance = instance;
    }
    
    private ConvertMoneyVN(){}
    
    public String LongToMoney(long moneyLong){
        String moneyString = "";
        
        Locale localeVN = new Locale("vi","VN");
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(localeVN);
        moneyString = nf.format(moneyLong);
        return moneyString;
    }
    
}
