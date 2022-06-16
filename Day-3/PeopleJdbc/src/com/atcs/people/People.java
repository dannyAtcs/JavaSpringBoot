package com.atcs.people;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class People {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atcs", "root", "root");

			if (con != null) {
				System.out.println("connected to database");

				Statement st = con.createStatement();

				Scanner sc = new Scanner(System.in);

				while (true) {
					System.out.println(
							" Press 1 for Insert\n Press 2 for Update\n Press 3 for Delete\n Press 4 for DisplayAll\n Press 5 for Display using id\n Press 6 for search using name taking the input from user\n Press 7 for sort and display using first name ");
					int Choice = sc.nextInt();
					if (Choice == 1) {
						System.out.println("Enter Details \n");
						System.out.println("Enter FirstName:  ");
						String First = sc.next();
						System.out.println("Enter LastName:  ");
						String Last = sc.next();
						System.out.println("Enter Age:  ");
						int age = sc.nextInt();
						System.out.println("Enter City:  ");
						String City = sc.next();
						System.out.println("Enter Id:  ");
						int id = sc.nextInt();
						PreparedStatement ps = con
								.prepareStatement("insert into people(first,Last,age,city,id) values(?,?,?,?,?)");
						ps.setString(1, First);
						ps.setString(2, Last);
						ps.setInt(3, age);
						ps.setString(4, City);
						ps.setInt(5, id);
						ps.executeUpdate();
					} else if (Choice == 2) {
						System.out.println("Enter FirstName:  ");
						String First = sc.next();
						System.out.println("Enter LastName:  ");
						String Last = sc.next();
						System.out.println("Enter Age:  ");
						int age = sc.nextInt();
						System.out.println("Enter City:  ");
						String City = sc.next();
						System.out.println("Enter Id:  ");
						int id = sc.nextInt();
						PreparedStatement psUpdate = con
								.prepareStatement("update people set first=?,  last=?,  age=?,  city=? where id =?");
						psUpdate.setString(1, First);
						psUpdate.setString(2, Last);
						psUpdate.setInt(3, age);
						psUpdate.setString(4, City);
						psUpdate.setInt(5, id);
						psUpdate.executeUpdate();
					} else if (Choice == 3) {
						System.out.println("Enter Id:  ");
						int id = sc.nextInt();
						PreparedStatement psDelete = con.prepareStatement("delete from people where id= ?");
						psDelete.setInt(1, id);
						psDelete.executeUpdate();
					} else if (Choice == 4) {
						String query = "select * from people";
						ResultSet rs = st.executeQuery(query);

						while (rs.next()) {
							System.out.println("First " + rs.getString(1) + " Last " + rs.getString(2) + " Age "
									+ rs.getInt(3) + " City " + rs.getString(4) + " ID " + rs.getInt(5));

						}

					} else if (Choice == 5) {
						System.out.println("Enter Id: ");
						int id = sc.nextInt();
						PreparedStatement psDisplay = con.prepareStatement("select * from people where id = ?");
						psDisplay.setInt(1, id);
						ResultSet rs = psDisplay.executeQuery();

						while (rs.next()) {
							System.out.println("First " + rs.getString(1) + " Last " + rs.getString(2) + " Age "
									+ rs.getInt(3) + " City " + rs.getString(4) + " ID " + rs.getInt(5));

						}

					} else if (Choice == 6) {
						System.out.println("Enter name: ");
						String name = sc.next();

						PreparedStatement psSearch = con.prepareStatement("Select * from people where first = ?");
						psSearch.setString(1, name);

						ResultSet rs = psSearch.executeQuery();

						while (rs.next()) {
							System.out.println("First " + rs.getString(1) + " Last " + rs.getString(2) + " Age "
									+ rs.getInt(3) + " City " + rs.getString(4) + " ID " + rs.getInt(5));

						}

					} else if (Choice == 7) {

						PreparedStatement psSort = con.prepareStatement("select * from people order by first");
						ResultSet rs = psSort.executeQuery();

						while (rs.next()) {
							System.out.println("First " + rs.getString(1) + " Last " + rs.getString(2) + " Age "
									+ rs.getInt(3) + " City " + rs.getString(4) + " ID " + rs.getInt(5));

						}
					} else {
						break;
					}

				}
			} else {
				System.out.println("Not connected !");
			}

		} catch (Exception e) {

		}
	}
}
