
package ec.edu.espe.ImpuestoALaRenta.util;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 
 */
public abstract class FileManager 
{
    
    public static void createFile (File name)
    {
        if(!name.exists())
        {
            try
            {
                name.createNewFile();
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    
    public static void writeFile (File name,String string)
    {
        try 
        {
            FileWriter write=new FileWriter(name,true);
            write.write(string);
            write.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void readFile (File name)
    {
        try 
        {
            FileReader read = new FileReader(name);
            
            int c=0;
            while (c!=-1)
            {
                c=read.read();
                char letter=(char)c;
                System.out.print(letter);
            }
            read.close();
        }
        catch (IOException ex) 
        {
            System.out.println("No se ha encontrado el archivo");
        }
        
    }
    
    public static String searchInFile (File name,String searchPerson)
    {
        Scanner entrada;
        entrada = null;
        String linea;
        linea = "";
        String aux = null;
        boolean contains = false;
        try
        {
           
            entrada = new Scanner(name);
            while (entrada.hasNext())
            {
                linea = entrada.nextLine();
                if(linea.contains(searchPerson))
                {
                    
                    aux = linea;
                    contains = true;
                    
                }
            }
            if (!contains)
            {
                String exe = "0";
                System.out.println(searchPerson + " no se ha encontrado en el archivo");
                return exe;
            }
            entrada.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.toString());
        }  
        catch (NullPointerException e) 
        {
            System.out.println(e.toString() + "No ha seleccionado ningún archivo");
        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());
        } 
        return aux;
    }
    
    public static void modifyFile(File fNew,String idString,String InputString)
    {
        File fOverride= new File("Override");
        overrideFIle(fNew, fOverride);
        BufferedReader br;
        try
        {
                br = new BufferedReader(new FileReader(fOverride));
                String linea;
                while((linea=br.readLine()) != null)
                {
                    if(linea.contains(idString))
                    {
                        writeFile(fNew,InputString);

                    }
                    else
                    {
                        writeFile(fNew,linea+"\n");
                    }
                }
                br.close();
                
            

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        fOverride.delete();
    }
    
    public static void overrideFIle(File fNew,File fOverride){ 
    BufferedReader br;
    try{
        if(fNew.exists()){
            br = new BufferedReader(new FileReader(fNew));
            String linea;
            while((linea=br.readLine()) != null)
            {
                    writeFile(fOverride,linea+"\n");
            }
            br.close();
        }
        else
        {
            System.out.println("Fichero no Existe");
        }
        fNew.delete();

        }catch(Exception e){
            System.out.println(e);
        }
    }
    
     void delete (String name)
    {
        File file = new File(name);
        try
        {
            if(file.exists())
            {
                file.delete();
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
     
    public static String[] dataSplit(String aux)//Funcion para separar los datos 
    {
        String[] data = null;
        data = aux.split(";");
        return data;
    }

}
