package com.javacollections.day02.listInterface;

import java.util.*;
//Create a class Policy  which implements Comparable interface
class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    //Parameterized Constructor to initialize varialble
    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    //Create a getter method to get policy number
    public String getPolicyNumber() {
        return policyNumber;
    }

    //Create a getter method to get the holder name
    public String getPolicyholderName() {
        return policyholderName;
    }

    //Create a getter method to get the expiry date
    public Date getExpiryDate() {
        return expiryDate;
    }

    //Create a getter method to get the Coverage Type
    public String getCoverageType() {
        return coverageType;
    }

    //Create a getter method to get the Premium Amount
    public double getPremiumAmount() {
        return premiumAmount;
    }

    //Create a method to compare policy
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    //Create a method toString and override it
    public String toString() {
        return "\nPolicy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}

//Create a class PolicyManagement
class PolicyManagement{
    //Create multiple set to store the policies in different way
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();
    
    //Create a method addPolicy to add the policy into set
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }
    
    //Create a method to get all the policy
    public Set<Policy> getAllPolicies() {
        return new HashSet<>(hashSet);
    }
    
    //Create a method to get policies which is expiring soon
    public Set<Policy> getPoliciesExpiringSoon() {
        //Create a set of policy type
        Set<Policy> expiringSoon = new HashSet<>();
        //Create an object of Date class
        Date currentDate = new Date();

        //Create an object of Calendar class
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        //use for loop to calculate the expiry date
        for (Policy policy : hashSet) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    //Create a method to get the policies  according to the coverage type
    public Set<Policy> getPoliciesCoverageType(String coverageType) {
        //Create another set to store the policy
        Set<Policy> filteredPolicies = new HashSet<>();
        for (Policy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                filteredPolicies.add(policy);
            }
        }
        return filteredPolicies;
    }

    //Create a method to get the duplicate policies
    public Set<Policy> getDuplicatePolicies() {
        //Create two set to store value
        Set<Policy> duplicates = new HashSet<>();
        Set<String> policyNumbers = new HashSet<>();
        for (Policy policy : hashSet) {
            if (!policyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }
}

//Create a class InsurancePolicyManagementSystem
public class InsurancePolicyManagementSystem {

    public static void main(String[] args) {
        //Create an object of PolicyManagement
        PolicyManagement insurancePloicy = new PolicyManagement();

        //Create an object of Calendar class
        Calendar calendar = Calendar.getInstance();
        //Set the date
        calendar.set(2025, Calendar.JANUARY, 1);
        //Create objects of Policy class
        Policy policy1 = new Policy("P0063541651", "Ranjeet Sharma", calendar.getTime(), "Health", 1500);
        //Set the date
        calendar.set(2025, Calendar.APRIL, 10);
        //Create objects of Policy class
        Policy policy2 = new Policy("P000321552", "Palak Yadav", calendar.getTime(), "Auto", 2500);
        //Set the date
        calendar.set(2025, Calendar.FEBRUARY, 5);
        //Create objects of Policy class
        Policy policy3 = new Policy("P15465663", "Ajay Prajapati", calendar.getTime(), "Home", 2000);

        //call the add policy mehtod
        insurancePloicy.addPolicy(policy1);
        insurancePloicy.addPolicy(policy2);
        insurancePloicy.addPolicy(policy3);

        //Print the result
        System.out.println("All Policies: " + insurancePloicy.getAllPolicies());
        System.out.println("\nPolicies Expiring Soon: " + insurancePloicy.getPoliciesExpiringSoon());
        System.out.println("\nAuto Policies: " + insurancePloicy.getPoliciesCoverageType("Auto"));
        System.out.println("\nDuplicate Policies: " + insurancePloicy.getDuplicatePolicies());
    }
}

