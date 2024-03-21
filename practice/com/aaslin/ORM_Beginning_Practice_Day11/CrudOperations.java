package com.aaslin.ORM_Beginning_Practice_Day11;

import java.util.Arrays;

public class CrudOperations {
	private int id;
	private String name;
	private String[] dept;

	public CrudOperations(int id, String name, String[] dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	// Getter and setter methods
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

	public String[] getDept() {
		return dept;
	}

	public void setDept(String[] dept) {
		this.dept = dept;
	}

	// CRUD operations
	public void addDept(String newDept) {
		String[] newDepts = Arrays.copyOf(dept, dept.length + 1);
		newDepts[dept.length] = newDept;
		dept = newDepts;
	}

	public void removeDept(String deptToRemove) {
		int index = -1;
		for (int i = 0; i < dept.length; i++) {
			if (dept[i].equals(deptToRemove)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			String[] newDepts = new String[dept.length - 1];
			System.arraycopy(dept, 0, newDepts, 0, index);
			System.arraycopy(dept, index + 1, newDepts, index, dept.length - index - 1);
			dept = newDepts;
		}
	}

	// Main method for testing
	public static void main(String[] args) {
		CrudOperations employee = new CrudOperations(1, "Varma", new String[] { "IT", "HR" });
		System.out.println("Original Dept: " + Arrays.toString(employee.getDept()));

		// Remove "HR" from dept
		employee.removeDept("HR");
		System.out.println("Dept after removing HR: " + Arrays.toString(employee.getDept()));

		// Add "IT" again
		employee.addDept("IT");
		System.out.println("Dept after adding IT again: " + Arrays.toString(employee.getDept()));

		// Remove "IT"
		employee.removeDept("IT");
		System.out.println("Dept after removing IT: " + Arrays.toString(employee.getDept()));
	}
}
