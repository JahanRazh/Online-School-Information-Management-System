package com.school;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class schoolDBUtil {
	private static Connection con = null;
	// statements are used to execute static SQL queries
	private static Statement stmt = null;
	// Resultset is used to store the result after executing an SQL statement
	private static ResultSet rs = null;

	private static boolean isSuccess;

	public static boolean validateStudent(String username, String password) {
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM student WHERE username='" + username + "' and password='" + password + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next())
				isSuccess = true;
			else
				isSuccess = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	public static List<Student> getStudentDetails(String username) {
		ArrayList<Student> stdArr = new ArrayList<>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM student WHERE username='" + username + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String address = rs.getString(4);
				int grade = rs.getInt(5);
				int phone = rs.getInt(6);
				String uname = rs.getString(7);
				String pwd = rs.getString(8);
				String regstatus = rs.getString(9);

				Student std = new Student(id, name, age, address, phone, grade, uname, pwd, regstatus);
				stdArr.add(std);
				System.out.println("Student added");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stdArr;
	}

	public static List<Student> getStudentDetails(int sid) {
		ArrayList<Student> stdArr = new ArrayList<>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM student WHERE sid='" +sid+ "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String address = rs.getString(4);
				int grade = rs.getInt(5);
				int phone = rs.getInt(6);
				String uname = rs.getString(7);
				String pwd = rs.getString(8);
				String regstatus = rs.getString(9);

				Student std = new Student(id, name, age, address, phone, grade, uname, pwd, regstatus);
				stdArr.add(std);
				System.out.println("Student added");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stdArr;
	}

	public static boolean validateTeacher(String username, String password) {

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM teacher WHERE username='" + username + "' and password='" + password + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				isSuccess = true;
			} else
				isSuccess = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static List<Teacher> getTeacherDetails(String username) {
		ArrayList<Teacher> teacherArr = new ArrayList<>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM teacher WHERE username='" + username + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String NIC = rs.getString(4);
				String address = rs.getString(5);
				int phone = rs.getInt(6);
				String email = rs.getString(7);
				double salary = rs.getDouble(8);
				String uname = rs.getString(9);
				String pwd = rs.getString(10);

				Teacher tc = new Teacher(id, name, age, address, phone, NIC, email, salary, uname, pwd);
				teacherArr.add(tc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return teacherArr;
	}

	public static boolean validateAdmin(String username, String password) {
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM admin WHERE username='" + username + "' and password='" + password + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				isSuccess = true;
			} else
				isSuccess = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static List<Admin> getAdminDetails(String username) {
		ArrayList<Admin> adminArr = new ArrayList<>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM admin WHERE username='" + username + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String NIC = rs.getString(4);
				String address = rs.getString(5);
				int phone = rs.getInt(6);
				String email = rs.getString(7);
				String position = rs.getString(8);
				double salary = rs.getDouble(9);
				;
				String uname = rs.getString(10);
				String pwd = rs.getString(11);

				Admin ad = new Admin(id, name, age, address, phone, NIC, email, position, salary, uname, pwd);
				adminArr.add(ad);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return adminArr;
	}
	public static boolean validatePrinciple(String username, String password) {
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM principle WHERE username='" + username + "' and password='" + password + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				isSuccess = true;
			} else
				isSuccess = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static List<Principle> getPrincipleDetails(String username) {
		ArrayList<Principle> principleArr = new ArrayList<>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM principle WHERE username='" + username + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String address = rs.getString(4);
				int phone = rs.getInt(5);
				String NIC = rs.getString(6);
				String uname = rs.getString(7);
				String pwd = rs.getString(8);

				Principle principle = new Principle(id, name, age, address, phone, NIC, uname, pwd);
				principleArr.add(principle);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return principleArr;
		}

	public static List<Subject> showSubject(String uname) {
		ArrayList<Subject> subArr = new ArrayList<>();
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT s.subjectID, s.teacherID, s.name, s.description, s.hours "
					+ "FROM subject s, teacher t " + "WHERE s.teacherID = t.teacherID AND t.username = '" + uname + "'";

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String id = rs.getString(1);
				int TID = rs.getInt(2);
				String name = rs.getString(3);
				String desc = rs.getString(4);
				int hrs = rs.getInt(5);

				Subject sub = new Subject(id, TID, name, desc, hrs);
				subArr.add(sub);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return subArr;
	}

	public static boolean addSubject(String subID, int teacherID, String subName, String subDesc, int hrs) {
		isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "INSERT INTO subject VALUES('" + subID + "', '" + teacherID + "', '" + subName + "', '" + subDesc
					+ "', '" + hrs + "')";
			int rs = stmt.executeUpdate(sql);

			if (rs > 0)
				isSuccess = true;
			else
				isSuccess = false;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static boolean updateSubject(String subID, String subName, String subDesc, int hrs) {
		isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "update subject set name='" + subName + "', description='" + subDesc + "', hours='" + hrs
					+ "' where subjectID='" + subID + "'";

			int rs = stmt.executeUpdate(sql);
			System.out.println(rs);

			if (rs > 0)
				isSuccess = true;
			else
				isSuccess = false;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static boolean removeSubject(String subID) {
		isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "delete from subject where subjectID='" + subID + "'";

			int rs = stmt.executeUpdate(sql);
			System.out.println(rs);

			if (rs > 0)
				isSuccess = true;
			else
				isSuccess = false;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static List<Grades> viewGradeDetails() {
		ArrayList<Grades> grd = new ArrayList<>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "SELECT * FROM grades";
			rs = stmt.executeQuery(sql);
			System.out.println("Query executed");

			while (rs.next()) {
				int grade = rs.getInt(1);
				int amount = rs.getInt(2);

				Grades g = new Grades(grade, amount);
				grd.add(g);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return grd;
	}

	public static boolean createstudentaccount(String sID,String name, String age, String address, String phone, String grade,
			String username, String password, String regStatus) {

		boolean isSuccess = false;

		try {
			int studentID = Integer.parseInt(sID);
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into Student values ('" +studentID+ "','" +name+ "', '"+age+"','"+address+"', '"+phone
					+"', '"+grade+"','" +regStatus+"', '"+username+"', '"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			System.out.print(rs);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static boolean updatestudentaccount(int sid, String name, int age, String address, int phone, int grade,
			String username, String password) {

		try {

			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update student set name ='" + name + "',age = '" + age + "' ,address = '" + address
					+ "', phone = '" + phone + "' ,grade = '" + grade + "', username='" + username + "',password='"
					+ password + "' where sid='" + sid + "'";
			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static boolean removeStudent(int sid) {
		isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "delete from student where sid = '" + sid + "'";

			int rs = stmt.executeUpdate(sql);
			System.out.println(rs);

			if (rs > 0)
				isSuccess = true;
			else
				isSuccess = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static boolean createteacheraccount(String name, int age, String nic, String address, int phone,
			String email, float salary, String username, String password) {

		boolean isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into teacher values (0, '" + name + "', '" + age + "', '" + nic + "', '" + address
					+ "', '" + phone + "', '" + email + "', '" + salary + "', '" + username + "', '" + password + "')";
			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static boolean updateteacheraccount(int teacherID, String name, int age, String nic, String address,
			int phone, String email, float salary, String username, String password) {

		try {

			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update teacher set name='" + name + "',age= '" + age + "',nic= '" + nic + "' ,address= '"
					+ address + "', phone= '" + phone + "', email= '" + email + "' ,salary= '" + salary
					+ "', username='" + username + "',password='" + password + "' where teacherID='" + teacherID + "'";
			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static boolean removeTeacher(int teacherID) {
		isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "delete from teacher where teacherID = '" + teacherID + "'";

			int rs = stmt.executeUpdate(sql);
			System.out.println(rs);

			if (rs > 0)
				isSuccess = true;
			else
				isSuccess = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}


	public static boolean validatePayment(int sid, String cardNum, String eDate, int c) {

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM payments WHERE stdID='" + sid + "' AND cardNo='" + cardNum
					+ "' AND expiryDate='" + eDate + "' AND cvv='" + c + "'";
			rs = stmt.executeQuery(sql);
			System.out.println("First sql statement executed");

			if (rs.next()) {
				String sql_2 = "SELECT * FROM student WHERE sid='" + sid + "'";
				rs = stmt.executeQuery(sql_2);
				System.out.println("Second sql statement executed");
				
				try {
					if (rs.next()) {
						String status = rs.getString(9);
						System.out.println("status: " + status);

						String sql_3 = "UPDATE student SET regStatus = 'true' WHERE sid='" + sid + "'";
						stmt.executeUpdate(sql_3);

						isSuccess = true;
						System.out.println("Update successfull");
					}
				} catch (Exception e) {
					System.out.println("2nd nested try");
					e.printStackTrace();
				}

			}
				else {
					isSuccess = false;
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static List<Payment> getPaymentDetails(String cardNum) {
		ArrayList<Payment> payArr = new ArrayList<>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM payments WHERE cardNo='" +cardNum+ "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int payID = rs.getInt(1);
				String cardNo = rs.getString(3);
				String name = rs.getString(4);
				String expDate = rs.getString(5);
				int cvv = rs.getInt(6);

				Payment pay = new Payment(payID, cardNo, name, expDate, cvv);
				payArr.add(pay);
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		return payArr;
	}
	
	

	public static List<Notice> viewNotices() {
		ArrayList<Notice> notArr = new ArrayList<>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM notices";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				String desc = rs.getString(3);

				Notice not = new Notice(id, title, desc);
				notArr.add(not);
				System.out.println("Notice added");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return notArr;
	}

	public static boolean addNotice(String title, String desc) {
		isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "INSERT INTO notices VALUES(0, '" + title + "', '" + desc + "')";
			int rs = stmt.executeUpdate(sql);

			if (rs > 0)
				isSuccess = true;
			else
				isSuccess = false;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static boolean updateNotice(int notID, String title, String desc) {
		isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "update notices set title='" + title + "', description='" + desc + "' where noticeID='" + notID
					+ "'";

			int rs = stmt.executeUpdate(sql);
			System.out.println(rs);

			if (rs > 0)
				isSuccess = true;
			else
				isSuccess = false;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static boolean removeNotice(int notID) {
		isSuccess = false;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			String sql = "delete from notices where noticeID='" + notID + "'";

			int rs = stmt.executeUpdate(sql);
			System.out.println(rs);

			if (rs > 0)
				isSuccess = true;
			else
				isSuccess = false;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static List<Subject> viewsubject() {
		ArrayList<Subject> subArr = new ArrayList<>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();

			// Fetch all data related to that user from the DB and display
			String sql = "SELECT * FROM subject";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String subID = rs.getString(1);
				int teacherID = rs.getInt(2);
				String subName=rs.getString(3);
				String desc = rs.getString(4);
				int hrs = rs.getInt(5);
				Subject sub = new Subject(subID,teacherID,subName,desc,hrs);
				subArr.add(sub);
				System.out.println("Subject added");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return subArr;// TODO Auto-generated method stub
		
	}
}
