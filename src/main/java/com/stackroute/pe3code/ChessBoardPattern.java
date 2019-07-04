package com.stackroute.pe3code;

public class ChessBoardPattern{
    public String generateBoard(){
        //generating chess board
        StringBuffer result=new StringBuffer("");
        for(int i=1;i<=8;i+=2){
            for(int j=1;j<=8;j++){
                if(j%2==1){
                    result.append("WW");
                }else {
                    result.append("BB");
                }

                result.append("|");
            }
            result.append("\n");
            for(int j=1;j<=8;j++){
                if(j%2==0){
                    result.append("WW");
                }else {
                    result.append("BB");
                }

                result.append("|");
            }
            result.append("\n");

        }
        return result.substring(0,result.length()-1);
    }
}