package com.javacollections.day02.mapinterface;

import java.time.LocalDate;
import java.util.*;

//Create a class Policy to indicate the policy details
class Policy {
    //Create private variable policyNumber,policyHolderName and expiryDate
    private String policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;

    //Parameterized Constructor for initializing value
    public Policy(String policyNumber, String policyHolderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
    }

    //Create a getter method to get policy number
    public String getPolicyNumber() {
        return policyNumber;
    }

    //Create a getter method to get policyholder name
    public String getPolicyHolderName() {
        return policyHolderName;
    }

    //Create a getter method to get expiry date
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    //Create a method and override it
    public String toString() {
        return "Policy[" + policyNumber + ", Holder: " + policyHolderName + ", Expiry: " + expiryDate + "]";
    }
}

//Create a class InsurancePolicy
class InsurancePolicy {
    //Create a HashMap to store the policy
     Map<String, Policy> policyMap = new HashMap<>();

     //Create a LinkedHashMap to store the ordered policy
     Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>();

    //Create a TreeMap to store the sorted policy
    Map<LocalDate, Policy> sortedPolicyMap = new TreeMap<>();

    //Create a method to add Policy
    public void addPolicy(Policy policy) {
        //Call the put method
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicyMap.put(policy.getPolicyNumber(), policy);
        sortedPolicyMap.put(policy.getExpiryDate(), policy);
    }

    //Create a method to get policy by number
    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }


    //Create a method to get expiring polices
    public List<Policy> getPoliciesExpiringSoon(int days) {
        //create a reference variable of local date class
        LocalDate threshold = LocalDate.now().plusDays(days);

        //Create an Arraylist to store the value
        List<Policy> expiringPolicies = new ArrayList<>();

        //Use for loop
        for (Map.Entry<LocalDate, Policy> entry : sortedPolicyMap.entrySet()) {
            if (!entry.getKey().isAfter(threshold)) {
                expiringPolicies.add(entry.getValue());
            } else {
                break;
            }
        }
        return expiringPolicies;
    }

    //Create a method getPoliciesByHolder
    public List<Policy> getPoliciesByHolder(String policyHolder) {
        List<Policy> policies = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyHolderName().equalsIgnoreCase(policyHolder)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    //Create a method to removeExpiredPolicies
    public void removeExpiredPolicies() {
        //Create a variable of local date class
        LocalDate today = LocalDate.now();

        //Use Iterator to iterate
        Iterator<Map.Entry<LocalDate, Policy>> iterator = sortedPolicyMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<LocalDate, Policy> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                policyMap.remove(entry.getValue().getPolicyNumber());
                orderedPolicyMap.remove(entry.getValue().getPolicyNumber());
                iterator.remove();
            } else {
                break;
            }
        }
    }

    //Create a method to display all policy
    public void displayAllPolicies() {

        //Use for each loop
        for (Policy policy : orderedPolicyMap.values()) {
            System.out.println(policy);
        }
    }
}

//Create a class InsurancePolicyManagementSystem_2
public class InsurancePolicyManagementSystem_2 {
    public static void main(String[] args) {
        //Create an object of InsurancePolicy class
        InsurancePolicy insurancePolicy = new InsurancePolicy();

        //Call the add method to add policy.
        insurancePolicy.addPolicy(new Policy("P1011601", "Akhil", LocalDate.of(2025, 8, 25)));
        insurancePolicy.addPolicy(new Policy("P1003142", "Manoj", LocalDate.of(2026, 5, 12)));
        insurancePolicy.addPolicy(new Policy("P1004983", "Rishi", LocalDate.of(2024, 12, 5)));

        //Call the method and print the result
        System.out.println("Policies expiring within 30 days: \n"+insurancePolicy.getPoliciesExpiringSoon(30));

        //Call the method and print the result
        System.out.println("\nPolicies for Rishi: "+insurancePolicy.getPoliciesByHolder("Rishi"));

        //Call the method and print the result
        System.out.println("\nRemoving expired policies...");
        insurancePolicy.removeExpiredPolicies();

        //Call the method and print the result
        System.out.println("\nAll Policies: ");
        insurancePolicy.displayAllPolicies();
    }
}


