import java.awt.event.*;
import javax.swing.*;

public class StudReg extends JFrame {
    JTextField nameField, emailField;
    JRadioButton male, female, other;
    JCheckBox reading, traveling, gaming;
    JComboBox<String> courseBox;
    JButton submitBtn, resetBtn;
    ButtonGroup genderGroup;

    StudReg() {
        setTitle("Student Form");
        setSize(350, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); 

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(100, 20, 100, 20);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(100, 40, 150, 20);
        add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(100, 70, 100, 20);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(100, 90, 150, 20);
        add(emailField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(100, 120, 100, 20);
        add(genderLabel);

        male = new JRadioButton("Male");
        male.setBounds(100, 140, 60, 20);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(160, 140, 70, 20);
        add(female);

        other = new JRadioButton("Other");
        other.setBounds(230, 140, 70, 20);
        add(other);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(100, 170, 100, 20);
        add(courseLabel);

        String[] courses = {"B.Tech", "BCA", "MCA"};
        courseBox = new JComboBox<>(courses);
        courseBox.setBounds(100, 190, 150, 20);
        add(courseBox);

        JLabel hobbiesLabel = new JLabel("Hobbies:");
        hobbiesLabel.setBounds(100, 220, 100, 20);
        add(hobbiesLabel);

        reading = new JCheckBox("Reading");
        reading.setBounds(100, 240, 100, 20);
        add(reading);

        traveling = new JCheckBox("Traveling");
        traveling.setBounds(100, 260, 100, 20);
        add(traveling);

        gaming = new JCheckBox("Gaming");
        gaming.setBounds(100, 280, 100, 20);
        add(gaming);

        submitBtn = new JButton("Submit");
        submitBtn.setBounds(70, 330, 90, 30);
        add(submitBtn);

        resetBtn = new JButton("Reset");
        resetBtn.setBounds(180, 330, 90, 30);
        add(resetBtn);

        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();

                if (name.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Name and Email required!");
                    return;
                }

                String gender = "";
                if (male.isSelected()) gender = "Male";
                else if (female.isSelected()) gender = "Female";
                else if (other.isSelected()) gender = "Other";

                String course = (String) courseBox.getSelectedItem();

                String hobbies = "";
                if (reading.isSelected()) hobbies += "Reading ";
                if (traveling.isSelected()) hobbies += "Traveling ";
                if (gaming.isSelected()) hobbies += "Gaming ";
                if (hobbies.equals("")) hobbies = "None";

                String msg = "Name: " + name + "\nEmail: " + email + "\nGender: " + gender +
                        "\nCourse: " + course + "\nHobbies: " + hobbies;

                JOptionPane.showMessageDialog(null, msg);
            }
        });

        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                emailField.setText("");
                genderGroup.clearSelection();
                courseBox.setSelectedIndex(0);
                reading.setSelected(false);
                traveling.setSelected(false);
                gaming.setSelected(false);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudReg();
    }
}
