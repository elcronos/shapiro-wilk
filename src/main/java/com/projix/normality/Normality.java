/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projix.normality;

import com.datumbox.framework.common.dataobjects.FlatDataCollection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camilo
 */
public class Normality {
    public Normality(){
       initValues();
    }

    private void initValues() {
        
        Double[] resid = new Double[]{-0.0695, -0.1568,-0.0501,-0.0325,-0.0450,0.0370
                          ,-0.0362,0.0486,0.0187,0.0930,0.0724,0.1312,0.1355,0.0401
                          ,0.0746,0.0111,0.0446,0.0870,0.0322,-0.0050,-0.0810,-0.0561
                          ,-0.1165,-0.0783,-0.0496,-0.0296,-0.0139,-0.0260,0.0203};
        
        
        double pvalue = ShapiroWilk.ShapiroWilkW(resid);
        System.out.println("p-value:"+pvalue);
        System.out.println("Prob:"+(1-pvalue));
    }
}
