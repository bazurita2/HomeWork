
package ec.edu.espe.lab9.utils;

import ec.edu.espe.lab9.model.Person;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author bryan
 */
public class FileManager {
    
    private String name;
    private String text;
public String convert(){
        
        Person person =new Person(0,0,0,0,0,0); 
        int validation;
        System.out.println("Enter your name");
        Scanner fc = new Scanner(System.in);
        person.setName(fc.next());
        do
        {
            System.out.println("Enter the year of your birth");
            Scanner a = new Scanner(System.in);
            person.setBirthYear(a.nextInt());
            System.out.println("Enter the month of your birth");
            Scanner ac = new Scanner(System.in);
            person.setBirthMonth(ac.nextInt());

            System.out.println("Enter the day of your birth");
            Scanner bc = new Scanner(System.in);
            person.setBirthDay(bc.nextInt());

            validation=person.validation(person.getBirthDay(), person.getBirthMonth(), person.getBirthYear());
        
        }while (validation==1);
         
        person.calculateAge(person.getBirthDay(), person.getBirthMonth(), person.getBirthYear(), 0, 0, 0);
        String text;
        text=person.getName()+";"+person.getAgeDay()+";"+person.getAgeMonth()+";"+person.getAgeYear()+";"+person.getBirthDay()+";"+person.getBirthMonth()+";"+person.getBirthYear()+";\n";
        return text;
}

public String convert(Person person)
{
        String text;
        text=person.getName()+";"+person.getAgeDay()+";"+person.getAgeMonth()+";"+person.getAgeYear()+";"+person.getBirthDay()+";"+person.getBirthMonth()+";"+person.getBirthYear()+";\n";
        return text;
}
    
public void save(String name, String text)
{
                File file = new File (name);
                try
                {
                    BufferedWriter bw;
                if(file.exists()){
                    bw = new BufferedWriter(new FileWriter(file,true));
                    bw.write(text);
                    System.out.println("The text is writen");
                }else{
                    bw = new BufferedWriter(new FileWriter(file,true));
                    bw.write(text);
                    System.out.println("The file is created and the text is writen");
                }
                bw.close();
         
                }catch (IOException e){}
                
                
}


public void read(String name, Person personr) throws IOException 
{
    String line= null;
    File file = new File (name);
    personr= new Person(0,0,0,0,0,0);
    if(file.exists()){
        try {
            BufferedReader read = new BufferedReader(new FileReader(name));
            while((line=read.readLine())!=null){
            StringTokenizer mistokens = new StringTokenizer(line, ";");
            personr.setName(mistokens.nextToken().trim());
            String ageDay =  mistokens.nextToken().trim();
            String ageMonth =  mistokens.nextToken().trim();
            String ageYear =  mistokens.nextToken().trim();
            String birthDay =  mistokens.nextToken().trim();
            String birthMonth =  mistokens.nextToken().trim();
            String birthYear =  mistokens.nextToken().trim();
            
            
            personr.setAgeDay(Integer.parseInt(ageDay));
            personr.setAgeMonth(Integer.parseInt(ageMonth));
            personr.setAgeYear(Integer.parseInt(ageYear));
            personr.setBirthDay(Integer.parseInt(birthDay));
            personr.setBirthMonth(Integer.parseInt(birthMonth));
            personr.setBirthYear(Integer.parseInt(birthYear));
            System.out.println(personr.getName()+";"+personr.getAgeDay()+";"+personr.getAgeMonth()+";"+personr.getAgeYear()+";"+personr.getBirthDay()+";"+personr.getBirthMonth()+";"+personr.getBirthYear());
            
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("An error occured, try later");
        }
    }
    
        
}


public void modify(String oldText, String newText ,String name)
{
     try
        {
                BufferedReader a = new BufferedReader(new FileReader(name));
                String line;
                String input = "";
                while ((line = a.readLine()) != null) 
                {
                    input = input + line + "\n";
                }
                
                input=input.replace(oldText,newText);
                FileOutputStream getText = new FileOutputStream(name);
                getText.write(input.getBytes());
                a.close();
                getText.close();
              
        }
        catch (IOException e)
        {
           System.out.println("An error occur, please try later");
        }
           
    }

public void search(String name) throws IOException
{
    String nameS;
    System.out.println("Enter the name to search");
    Scanner a = new Scanner(System.in);
    nameS=a.next();
    int op;
    String line1= null;
    File file = new File (name);
    Person personS = new Person(0,0,0,0,0,0);
    String oldText;
    if(file.exists())
    {
        try {
            BufferedReader read = new BufferedReader(new FileReader(name));
            label1:
            while((line1=read.readLine())!=null){
            StringTokenizer mistokens = new StringTokenizer(line1, ";");
            personS.setName(mistokens.nextToken().trim());
            String ageDay =  mistokens.nextToken().trim();
            String ageMonth =  mistokens.nextToken().trim();
            String ageYear =  mistokens.nextToken().trim();
            String birthDay =  mistokens.nextToken().trim();
            String birthMonth =  mistokens.nextToken().trim();
            String birthYear =  mistokens.nextToken().trim();
            
            
            personS.setAgeDay(Integer.parseInt(ageDay));
            personS.setAgeMonth(Integer.parseInt(ageMonth));
            personS.setAgeYear(Integer.parseInt(ageYear));
            personS.setBirthDay(Integer.parseInt(birthDay));
            personS.setBirthMonth(Integer.parseInt(birthMonth));
            personS.setBirthYear(Integer.parseInt(birthYear));
            oldText=convert(personS);
            
            if (nameS == personS.getName() || (nameS != null && nameS.equals(personS.getName())))
            {
                System.out.println("This person is found!");
                System.out.println(personS.getName()+";"+personS.getAgeDay()+";"+personS.getAgeMonth()+";"+personS.getAgeYear()+";"+personS.getBirthDay()+";"+personS.getBirthMonth()+";"+personS.getBirthYear()+";\n");
                System.out.println("Do you want to modify this person");
                System.out.println("1. Yes");
                System.out.println("2. No");
                Scanner b = new Scanner(System.in);
                op=b.nextInt();
                switch (op)
                {
                    case 1:
                        String newText;
                        System.out.println("Enter the new person:");
                        newText=convert();
                        modify(oldText,newText,name);
                        deleteLine(oldText,name);
                        break label1;
                    case 2:
                        break;
                    default: break;

                }
            }   
            }
            } catch (FileNotFoundException ex) 
            {
                    Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("An error occured, try later");
            }
    }
    
    
            
                
        
    }


public void deleteLine(String delete, String file){        

      try
        {
                BufferedReader rd = new BufferedReader(new FileReader(file));
                String line;
                String input = "";
                while ((line = rd.readLine()) != null) 
                {
                    //System.out.println(line);
                    if (line.contains(delete))
                    {
                        line = "";
                    }
                    input += line;
                }
                FileOutputStream getText = new FileOutputStream(file);
                getText.write(input.getBytes());
                rd.close();
                getText.close();
              
        }
        catch (Exception e)
        {
           System.out.println("ERROR en leer el archivo");
        }
      
    }

    
    




    


    public FileManager(String name, String text) {
        this.name = name;
        this.text = text;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    
    
    
    
}

