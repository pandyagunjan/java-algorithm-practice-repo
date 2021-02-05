package Assesment;

import java.io.*;
import java.util.*;

class Customer{
    int id;
    String name;
    String city;
    String country ;
    String cperson;
    int emplcnt;
    int contrcnt ;
    double contrcost;

    Customer(int id,String  name,String city,String country, String cperson,int emplcnt,int contrcnt,double contrcost)
    {
        this.id=id;
        this.name=name;
        this.city=city;
        this.country=country ;
        this.cperson=cperson;
        this.emplcnt=emplcnt;
        this.contrcnt=contrcnt ;
        this.contrcost=contrcost;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCperson() {
        return cperson;
    }

    public void setCperson(String cperson) {
        this.cperson = cperson;
    }

    public int getEmplcnt() {
        return emplcnt;
    }

    public void setEmplcnt(int emplcnt) {
        this.emplcnt = emplcnt;
    }

    public int getContrcnt() {
        return contrcnt;
    }

    public void setContrcnt(int contrcnt) {
        this.contrcnt = contrcnt;
    }

    public double getContrcost() {
        return contrcost;
    }

    public void setContrcost(double contrcost) {
        this.contrcost = contrcost;
    }


}

// Main class should be named 'Solution'
class Solution {

    public static void main(String[] args) {
        // System.out.println("Hello, World");
        ArrayList<Customer> customers = new ArrayList<>();

        String csvFile = "/users/gunjanpandya/dev/java-algorithm-practice-repo/data.csv";
        String line ="";
        String csvSplitBy=",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] customer = line.split(csvSplitBy);
                int id = Integer.parseInt(customer[0]);
                String name = customer[1];
                String city = customer[2];
                String country =customer[3];
                String cperson = customer[4];
                int emplcnt = Integer.parseInt(customer[5]);
                int contrcnt = Integer.parseInt(customer[6]);
                double contrcost = Double.parseDouble(customer[7]);
                customers.add(new Customer(id, name, city,country, cperson, emplcnt, contrcnt,contrcost));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        //      System.out.println();
        System.out.println("Total customers\n" +customers.size());
        System.out.println("Customers by city:");
        Map<String ,Integer> cityCounter = new TreeMap<>();
        for(int i =0 ; i < customers.size();i++)
        {
            String tempCity=customers.get(i).getCity();
            cityCounter.put(tempCity,cityCounter.containsKey(tempCity) ? cityCounter.get(tempCity)+1 : 1)  ;

        }

        for(Map.Entry<String,Integer> entry : cityCounter.entrySet())
        {
            System.out.println(entry.getKey() +":"+entry.getValue());

        }
        System.out.println("Customers by country:");
        Map<String ,Integer> countryCounter = new TreeMap<>();
        for(int i =0 ; i < customers.size();i++)
        {
            String tempCountry=customers.get(i).getCountry();
            countryCounter.put(tempCountry,countryCounter.containsKey(tempCountry) ? countryCounter.get(tempCountry)+1 : 1)  ;

        }
        for(Map.Entry<String,Integer> entry : countryCounter.entrySet())
        {
            System.out.println(entry.getKey() +":"+entry.getValue());

        }
        System.out.println("Country with the largest number of customers' contracts");

        HashMap<String ,Integer> largestNumber = new HashMap<>();
        for(int i =0 ; i < customers.size();i++)
        {
            int contractCount=customers.get(i).getContrcnt();
            String countrycnt= customers.get(i).getCountry();
            largestNumber.put(customers.get(i).getCountry(),largestNumber.containsKey(countrycnt) ? largestNumber.get(countrycnt)+contractCount : contractCount)  ;

        }
        String key = Collections.max(largestNumber.entrySet(), Map.Entry.comparingByValue()).getKey();
        int value = largestNumber.get(key);
        System.out.println(key+"("+value+" contracts)");

        HashMap<String ,Integer> uniqueCity = new HashMap<>();
        for(int i =0 ; i < customers.size();i++)
        {

            String citytemp= customers.get(i).getCity();

            uniqueCity.put(citytemp,uniqueCity.containsKey(citytemp) ? uniqueCity.get(citytemp)+1 : 1);

        }

        int cityCounter1=0;
        for(Map.Entry<String,Integer> entry : uniqueCity.entrySet())
        {
            if(entry.getValue()==1 || entry.getValue()==2)
                cityCounter1++;

        }
        System.out.println("Unique cities with at least one customer:\n" +cityCounter1);
    }

///https://www.coursehero.com/tutors-problems/Computer-Science/26639763-You-are-given-a-datacsv-file-in-the-rootcustomers-directory-contai/
    //TechS
}

