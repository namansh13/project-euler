package garage.mechanic;

import java.util.Scanner;

public class Masking {
    char character = 'X';
    
    public static void main(String...args){
    Masking mask=new Masking();	
    System.out.println(mask.toString());
    Scanner q=new Scanner(System.in);
    System.out.print("Enter the name : ");
    //String val=q.next();
    Object value=123456783;
    System.out.print("Enter the field name : ");
    String fieldname=q.next();	
    	System.out.println(mask.masker(value, fieldname));
    	long n=1234567899;
    	
    	System.out.println(mask.replace_number(n));
    }
    @SuppressWarnings("finally")
    public Object masker(Object value, String fieldname){//, Properties prop) {
           if(value instanceof String){
        	   System.out.println("string");
           try {
                  
                  if (value != null || value != "") {
           
                      
                	  if (fieldname.toUpperCase().equals("PHI_SSN")) {
                          

                                      value = replace_string(value.toString().substring(0, 5), character)
                                                    + value.toString().substring(5, value.toString().length());

                               } else if (fieldname.toLowerCase().equals(
                                             "PHI_EMAIL")) {
                                      int pos_of = value.toString().indexOf('@');
                                      String email = value.toString().substring(0, pos_of);
                                      value = replace_string(email, character)
                                                    + value.toString().substring(pos_of, value.toString().length());
                               } else if (fieldname.toLowerCase().equals("PHI_IP_ADDR")) {
                                      String[] ip_array = value.toString().split("\\.");
                                      value = replace_string(ip_array[0], character) + "."
                                                    + replace_string(ip_array[1], character) + "."
                                                    + replace_string(ip_array[2], character) + "."
                                                    + ip_array[3];

                               } else {
                                      value = replace_string(value.toString(), character);
                               }
           }
           
                        
                  
           } catch (ArrayIndexOutOfBoundsException e) {
                  value = replace_string(value.toString(), character);
           } catch (StringIndexOutOfBoundsException e) {
                  value = replace_string(value.toString(), character);
           } finally {
                  return value;
           }
           }
           else{
        	   System.out.println("number");
                  value = replace_number((Long)value);//, '0');
                  return value;
           }
           
                  
           
    }

    private String replace_string(String value, char character) {
           String value_replace = "";
           for (int i = 0; i < value.length(); i++) {
                  value_replace = character + value_replace;
           }
           return value_replace;

    }
    private Long replace_number(long value){//, char character) {
           long value_replace = 0;
           while(value>0){
                  long b=value%10;
                  value=value-b;
                  value=value/10;
                  value_replace=value_replace*10+9;
                      }
           return value_replace;

    }

}

