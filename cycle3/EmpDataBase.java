import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmpDataBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/empjava", "root", "archa@2003");

            while (true) {
                System.out.println("\n1. Add employee");
                System.out.println("2. View employees");
                System.out.println("3. Update employee");
                System.out.println("4. Delete employee");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int ch = sc.nextInt();
                sc.nextLine(); // consume the newline

                if (ch == 1) {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    String email;
                    while (true) {
                        System.out.print("Enter email: ");
                        email = sc.nextLine();
                        if (Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,4}$", email)) break;
                        System.out.println("Invalid email.");
                    }

                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();

                    String sql = "INSERT INTO employees (name, email, salary) VALUES (?, ?, ?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, name);
                    pst.setString(2, email);
                    pst.setDouble(3, salary);
                    pst.executeUpdate();
                    System.out.println("Employee added.");

                } else if (ch == 2) {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM employees");

                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + " " +
                                           rs.getString("name") + " " +
                                           rs.getString("email") + " " +
                                           rs.getDouble("salary"));
                    }

                } else if (ch == 3) {
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();

                    String email;
                    while (true) {
                        System.out.print("Enter new email: ");
                        email = sc.nextLine();
                        if (Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,4}$", email)) break;
                        System.out.println("Invalid email.");
                    }

                    System.out.print("Enter new salary: ");
                    double salary = sc.nextDouble();

                    String sql = "UPDATE employees SET name=?, email=?, salary=? WHERE id=?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, name);
                    pst.setString(2, email);
                    pst.setDouble(3, salary);
                    pst.setInt(4, id);
                    int rows = pst.executeUpdate();
                    if (rows > 0) {
                        System.out.println("Employee updated.");
                    } else {
                        System.out.println("Employee not found.");
                    }

                } else if (ch == 4) {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();

                    String sql = "DELETE FROM employees WHERE id=?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, id);
                    int rows = pst.executeUpdate();
                    if (rows > 0) {
                        System.out.println("Employee deleted.");
                    } else {
                        System.out.println("Employee not found.");
                    }

                } else if (ch == 5) {
                    System.out.println("Exiting.");
                    break;
                } else {
                    System.out.println("Invalid choice.");
                }

                
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
