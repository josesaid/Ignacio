package com.mx.development.exceptions;

public class ExceptionExample01 {
    public static void main(String[] args) {
        try{
            division();
        } catch (Exception e) {
            //System.err.println("Error detectado: " +e.getMessage());
            e.printStackTrace();
        }
        //division();
        System.out.println("fin");
    }

    static private void division(){
        a();
    }

    private static void a() {
        //try{
            int x = 10/ 0;
            System.out.println(x);
        /*}catch (Exception e){
            System.out.println("error....");
        }*/
    }
}
