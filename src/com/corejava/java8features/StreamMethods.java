package com.corejava.java8features;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {

		List<String> vehicleList = Arrays.asList("car", "bus", "byke", "truck", "byke", "bicycle", "jeep", "bus", "car");
				
		vehicleList.stream().sorted().forEach(System.out::println);
		System.out.println("\n");
		
		vehicleList.stream().distinct().forEach(value -> System.out.println(value));

		List<String> distinctList = vehicleList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		
		for (String s: distinctList) {
            System.out.println(s + ": " + Collections.frequency(vehicleList, s));
        }
		
		Long vehicleCount = vehicleList.stream().distinct().count();
		System.out.println(vehicleCount);

		vehicleList.stream().limit(2).forEach(value -> System.out.println("First two elemnets in List : " + value));

		List<Integer> nums = Arrays.asList(20, 25, 28, 26, 25, 214, 236, 2556, 987, 54, 21, 25, 21);
		
		Optional maxNum = nums.stream().sorted().distinct().max((x, y) -> x.compareTo(y));
		System.out.println("Max Number : " + maxNum.get());

		Optional minNum = nums.stream().sorted().distinct().min((x, y) -> x.compareTo(y));
		System.out.println("Min Number : " + minNum.get());

		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(149, "Srushti Deshmukh", 26, "Female", "System Architect", 2016, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

		Optional<Employee> emp = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(emp.get());

		Optional<Employee> emp1 = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
		System.out.println(emp1.get());

		List<Employee> sortedList = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(sortedList.get(1));

		double maxSalary = employeeList.stream().map(Employee::getSalary).max(Double::compare).get();
		System.out.println("Max salary of the employee:" + maxSalary);
		System.out.print("Employee details having Highest Salary:");

		// filter the employee having max salary
		employeeList.stream().filter(emp3 -> emp3.getSalary() == maxSalary).forEach(System.out::println);

	}

}
