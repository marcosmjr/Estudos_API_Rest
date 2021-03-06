package br.com.zup.api;

import java.text.DecimalFormat;

public class GeradorLoteria {

    DecimalFormat decimalFormat = new DecimalFormat("#0");
    double[] numero = new double[6];
    String[] numeroLoteriaArray = new String[6];
    String numeroLoteria = "";

    public String getNumeroLoteria() {
        return numeroLoteria;
    }

    public void gerador() {
        for (int i = 0; i < numero.length; i++ ){

            numero[i] = Math.random()*59;
            numeroLoteriaArray[i] = decimalFormat.format(numero[i]);

            if(i != 0){
                for(int j = 0; j < numero.length; j++){
                    if( j != i && numeroLoteriaArray[i].equals(numeroLoteriaArray[j])){
                        i--;
                    }
                }
            }
        }
        for(int k = 0; k < numeroLoteriaArray.length; k++){
            numeroLoteria += numeroLoteriaArray[k];
            if(k < numeroLoteriaArray.length - 1 ){
                numeroLoteria += ", ";
            }
        }
    }
}

