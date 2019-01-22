/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.control;

import ec.edu.espe.utils.FilePrj;

/**
 *
 * @author Jazbel Gutierrez
 */
public class User {
        private String surname;
        private float salary;
        private int hour;
        private float totalSalary;
        private float iess;
        private float liquid;
        
        /*
        private String login;
        private String password;
        */
        
        
    public void calculateSalary()
    {
        this.totalSalary=this.salary*this.hour;
        this.iess=this.totalSalary*0.0945f;
        this.liquid=this.totalSalary-this.iess;      
    }
        
        
        public void saveIncomplete()
        {
            String text;
           FilePrj file =new FilePrj();
           file.exists("Incomplete.csv");
           text=file.convertsInclomplete(this);
           file.save("Incomplete.csv",text);
            
        }
        
        public void saveCalculate()
        {
            String text;
           FilePrj file =new FilePrj();
           file.exists("Calculate.csv");
           text=file.convertCalculate(this);
           file.save("Calculate.csv",text);
            
        }
        
        
        public void saveSalary()
        {
            String text;
           FilePrj file =new FilePrj();
           file.exists("Salary.csv");
           text=file.convertSalary(this);
           file.save("Salary.csv",text);
           
        }
        
        
        


    public User() {
        
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }

    public float getIess() {
        return iess;
    }

    public void setIess(float iess) {
        this.iess = iess;
    }

    public float getLiquid() {
        return liquid;
    }

    public void setLiquid(float liquid) {
        this.liquid = liquid;
    }




        
        
        
       
        
}
