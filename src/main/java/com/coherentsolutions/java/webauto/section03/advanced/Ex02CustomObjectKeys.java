package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.HashMap;
import java.util.Map;

/**
 * Advanced example class demonstrating how to use custom objects as keys in HashMap.
 */
public class Ex02CustomObjectKeys {

    static class Employee {
        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Employee employee = (Employee) obj;
            return id == employee.id;
        }

        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "'}";
        }
    }

    public static void main(String[] args) {
        // Creating a HashMap instance with custom keys
        Map<Employee, String> employeeMap = new HashMap<>();

        Employee emp1 = new Employee(1, "Alice");
        Employee emp2 = new Employee(2, "Bob");

        // Adding custom objects as keys
        employeeMap.put(emp1, "HR");
        employeeMap.put(emp2, "Finance");

        // Retrieving elements
        String department = employeeMap.get(emp1);
        System.out.println("Department for " + emp1 + ": " + department);

        // Iterating over the map
        for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + ", Department: " + entry.getValue());
        }
    }
}
