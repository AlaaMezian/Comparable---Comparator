import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	public Employee(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp) {
		// let's sort the employee based on id in ascending order
		// returns a negative integer, zero, or a positive integer as this employee id
		// is less than, equal to, or greater than the specified object.
		return (this.id - emp.id);
	}

	@Override
	// this is required to print the user friendly information about the Employee
	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
	}

	/// custom comparator by age and name
	public static Comparator<Employee> customerComparatro = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			int age = o1.getId() - o2.getAge();
			if (age == 0) {
				age = o1.getName().compareTo(o2.getName());
			}
			return age;
		}

	};
	// comparator implementation anonymous class
	/**
	 * Comparator to sort employees list or array in order of Age
	 */
	public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee emp1, Employee emp2) {
			return emp1.getAge() - emp2.getAge();
		}
	};

	/***
	 * Comparator to sort employees list or array in order of Salary ascending
	 */
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return (int) (e1.getSalary() - e2.getSalary());
		}
	};
	// comparator implementation lambda based / sorting base on name
	/**
	 * Comparator to sort employees based on name in ascending order
	 */
	public static Comparator<Employee> byName = (Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName());
	/* comparator by age lambda */
	public static Comparator<Employee> byAgeLmabda = (Employee o1, Employee o2) -> o1.getAge() - o2.getAge();

}