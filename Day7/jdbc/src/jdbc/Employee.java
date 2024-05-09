package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	
	
	private static Connection connection;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		
		Employee emp = new Employee();
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url ="jdbc:mysql://localhost:3306/jdbc";
				String user = "root";
				String password = "Sa123";
				
				connection = DriverManager.getConnection(url,user,password);
						
					System.out.println("Press 1 for Insert Employee");
					System.out.println("Press 2 for Select employee id");
					System.out.println("Press 3 for select all employees");
					System.out.println("Press 4 for Update employee fields");
					System.out.println("Press 5 for delete employee");
					 
				    System.out.println("Select an Option:");
				    
				     int choice = scanner.nextInt();
				
				switch(choice){
					
				case 1:
				{
					emp.insertEmployee();
						break;
				}
				case 2:
				{
					emp.selectById();
						break;
				}
				case 3:
				{
					emp.selectAllEmployee();
					break;
				}
				case 4:
				{
					emp.updateEmployee();
					break;
				}
				case 5:
				{
					emp.updateEmployee();
					break;
				}
				case 6:
				{
					emp.deleteEmployee();
				}
				default :
					System.out.println("Invalid Choice");	
				}
			}
					
		   catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			connection.close();
			}

	private String ch;	

	private  void insertEmployee() throws SQLException {
		String query="insert into student(name,percentage,address) values (?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		while(true) {
			
		System.out.println("Enter the name:");
		preparedStatement.setString(1,scanner.next());
		
		System.out.println("Enter the salary:");
		preparedStatement.setInt(2,scanner.nextInt());
		
		System.out.println("Enter the dept:");
		preparedStatement.setInt(3,scanner.nextInt());	
		
		System.out.println("Employee Data Inserted");
		preparedStatement.execute();
		
		System.out.println("Do you want to add Employee Data:");
		
		String ch = scanner.next();
		
		if(ch!= "yes")
			
		{
			break;
		}
		
	}
		
	}
	
	private  void selectById() throws SQLException {
		System.out.println("Enter id to search:");
		int id = Integer.parseInt(scanner.next());
	
		String query = "Select * from employee where id = " + id;
		
		Statement statement = connection.createStatement();
		
		ResultSet resultset = statement.executeQuery(query);
		
		if(resultset.next())
		{
			int id1 = resultset.getInt("id");
			String name = resultset.getString("name");
			int salary = resultset.getInt(3);
			String dept = resultset.getString(4);
			 
			
			System.out.println("Roll NUmber:" + id1);
			System.out.println("Name:" + name);
			System.out.println("salary:" + salary);
			System.out.println("Dept:" + dept);
		}	
		else
		{
			System.out.println("No record Found");
		}
			
	}

	
	private  void selectAllEmployee() throws SQLException {
		
		String query = "select * from employee";
		
		Statement statement = connection.createStatement();
		
		ResultSet resultset = statement.executeQuery(query);
		
		while(resultset.next()) {
			
			int id = resultset.getInt("id");
			String name = resultset.getString("name");
			int salary = resultset.getInt("salary");
			String dept = resultset.getString("dept");
		}
	}
	
	private  void updateEmployee() throws SQLException {
		
		System.out.println("Press 1 to update name");
		System.out.println("press 2 to update salary");
		System.out.println("press 3 to update dept");
		
		
	}
	
	private   void deleteEmployee() throws SQLException {
		System.out.println("Enter id to delete employee:");
		int id = scanner.nextInt();
		String query = "delete from student where id = " + id;
		
		Statement statement = connection.createStatement();
		
		int row = statement.executeUpdate(query);
		
		if(row!=0)
			System.out.println("Deleted Successfully");
		
		
	}


	
}


