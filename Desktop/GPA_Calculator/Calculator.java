/* Min Jea Kim    mk4cx    Resources: msdn.microsoft.com, docs.oracle.com */
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import javax.swing.*;
public class Calculator extends JFrame implements ActionListener {
	
	// Swing components as fields
	private JFrame frame;
	private JLabel beginLabel;
	private JPanel panel;

	// FOR COURSE NAMES
	private ArrayList<String> courseNames = new ArrayList<String>();
	private JTextField courseText1;
	private JTextField courseText2;
	private JTextField courseText3;
	private JTextField courseText4;
	private JTextField courseText5;
	private JTextField courseText6;
	private JTextField courseText7;
	private JTextField courseText8;
	private JTextField courseText9;
	private JTextField courseText10;
	private JTextField courseText11;
	private JTextField courseText12;
	private JTextField courseText13;
	private JTextField courseText14;
	private JTextField courseText15;
	private JTextField courseText16;
	private JTextField courseText17;
	private JTextField courseText18;
	private JTextField courseText19;
	private JTextField courseText20;
	private JTextField courseText21;
	private JTextField courseText22;
	private JTextField courseText23;
	private JTextField courseText24;
	private JTextField courseText25;

	// FOR GRADES
	ArrayList<Double> all_grades = new ArrayList<Double>();
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;
	private JTextField grade4;
	private JTextField grade5;
	private JTextField grade6;
	private JTextField grade7;
	private JTextField grade8;
	private JTextField grade9;
	private JTextField grade10;
	private JTextField grade11;
	private JTextField grade12;
	private JTextField grade13;
	private JTextField grade14;
	private JTextField grade15;
	private JTextField grade16;
	private JTextField grade17;
	private JTextField grade18;
	private JTextField grade19;
	private JTextField grade20;
	private JTextField grade21;
	private JTextField grade22;
	private JTextField grade23;
	private JTextField grade24;
	private JTextField grade25;
	private ArrayList<JTextField> gradeArray = new ArrayList<JTextField>();

	// FOR CREDIT HOURS
	ArrayList<Integer> all_ch = new ArrayList<Integer>();
	private JTextField ch1;
	private JTextField ch2;
	private JTextField ch3;
	private JTextField ch4;
	private JTextField ch5;
	private JTextField ch6;
	private JTextField ch7;
	private JTextField ch8;
	private JTextField ch9;
	private JTextField ch10;
	private JTextField ch11;
	private JTextField ch12;
	private JTextField ch13;
	private JTextField ch14;
	private JTextField ch15;
	private JTextField ch16;
	private JTextField ch17;
	private JTextField ch18;
	private JTextField ch19;
	private JTextField ch20;
	private JTextField ch21;
	private JTextField ch22;
	private JTextField ch23;
	private JTextField ch24;
	private JTextField ch25;
	private ArrayList<JTextField> chArray = new ArrayList<JTextField>();

	// Calculated GPA
	private JLabel calcGPA;

	// targetGPA
	JLabel targetLabel;
	JTextField targetField;
	double targetGPA;
	
	
	// EXTRA VARIABLES
	static Color backColor = Color.decode("#ffd8d8");
	static Color buttonColor= Color.decode("#edf6f9");
	JTextField chField;
	int remaining_ch;


	// --------------------------------------------------- main() -----------------------------//
	public static void main(String[] args) {
		Calculator theApp = new Calculator(); // our GUI application
	}

	// --------------------------------------------------- constructor -----------------------//
	public Calculator() {
		// we could do other non-GUI work here if needed
		initialize(); // our method to setup the GUI
	}

	// --------------------------------------------------- initialize() -----------------------------//
	private void initialize() {

		// make the JFrame
		frame = new JFrame();
		frame.setSize(580, 800);
		frame.setResizable(false);
		frame.setTitle("GPA Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// make the Panel and the beginLabel
		panel = new JPanel(); // create panel
		panel.setLayout(null);
		
		Color a_color = Color.decode("#f7fdff");
		panel.setBackground(a_color);
		frame.add(panel);
		
		//Introduction to the program
		beginLabel = new JLabel(
				"<html><div style='text-align: center;'>"
						+ "<html> Welcome to the GPA Calculator! <br> Enter the your course names (previously taken, current, and any anticipated) <br> When you're done, press the button that matches what you want to see! <br><br> TO EDIT TEXT A PREVIOUS BOX, PRESS THE 'Remove' BUTTON INSTEAD AND RETYPE.</html>"); // create
																																																																																				// label
																																																																																				// for
																																																																									// introduction
		beginLabel.setBounds(48, 0, 500, 100);
		panel.add(beginLabel);
		

// ----------------------------------ADDING COURSES-----------------------------------------------------------------------------------------------------------------------------------------------//
		//create a Course Label
		int y_int = 100;
		JLabel coursesLabel = new JLabel("Courses");
		coursesLabel.setBounds(60, y_int, 200, 50);
		panel.add(coursesLabel);

		// make the list of numbers beside the TextField course boxes (the 1,2,3,4,5,6,..25 listing)
		int adder = 0;
		for (int i = 1; i <= 10; i++) {
			adder += 45;
			JLabel courseNbr = new JLabel("" + i);
			courseNbr.setBounds(20, 90 + adder, 50, 50);
			panel.add(courseNbr);

		}
		
		//Create JTextFields for each Course that gets the input for the course name
		int y_holder = 110;

		courseText1 = new JTextField("");
		courseText1.setBounds(60, y_holder += 45, 200, 20);
		panel.add(courseText1);
		courseText1.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = courseText1.getText();
				if (input.trim().equals("") == false) { //if the field is not blank, then add the input into the arraylist
					courseNames.add(input);
				}
			}
		});

		courseText2 = new JTextField("");
		courseText2.setBounds(60, y_holder += 45, 200, 20);
		panel.add(courseText2);
		courseText2.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = courseText2.getText();
				if (input.trim().equals("") == false) {
					courseNames.add(input);
				}
			}
		});

		courseText3 = new JTextField("");
		courseText3.setBounds(60, y_holder += 45, 200, 20);
		panel.add(courseText3);
		courseText3.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = courseText3.getText();
				if (input.trim().equals("") == false) {
					courseNames.add(input);
				}
			}
		});

		courseText4 = new JTextField("");
		courseText4.setBounds(60, y_holder += 45, 200, 20);
		panel.add(courseText4);
		courseText4.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = courseText4.getText();
				if (input.trim().equals("") == false) {
					courseNames.add(input);
				}
			}
		});

		courseText5 = new JTextField("");
		courseText5.setBounds(60, y_holder += 45, 200, 20);
		panel.add(courseText5);
		courseText5.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = courseText5.getText();
				if (input.trim().equals("") == false) {
					courseNames.add(input);
				}
			}
		});

		courseText6 = new JTextField("");
		courseText6.setBounds(60, y_holder += 45, 200, 20);
		panel.add(courseText6);
		courseText6.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = courseText6.getText();
				if (input.trim().equals("") == false) {
					courseNames.add(input);
				}
			}
		});

		courseText7 = new JTextField("");
		courseText7.setBounds(60, y_holder += 45, 200, 20);
		panel.add(courseText7);
		courseText7.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = courseText7.getText();
				if (input.trim().equals("") == false) {
					courseNames.add(input);
				}
			}
		});

		courseText8 = new JTextField("");
		courseText8.setBounds(60, y_holder += 45, 200, 20);
		panel.add(courseText8);
		courseText8.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = courseText8.getText();
				if (input.trim().equals("") == false) {
					courseNames.add(input);
				}
			}
		});

		courseText9 = new JTextField("");
		courseText9.setBounds(60, y_holder += 45, 200, 20);
		panel.add(courseText9);
		courseText9.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = courseText9.getText();
				if (input.trim().equals("") == false) {
					courseNames.add(input);
				}
			}
		});
		courseText10 = new JTextField("");
		courseText10.setBounds(60, y_holder += 45, 200, 20);
		panel.add(courseText10);
		courseText10.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = courseText10.getText();
				if (input.trim().equals("") == false) {
					courseNames.add(input);
				}
			}
		});

// ---------------------------GRADES--------------------------------------------------------------------------------------------------------------------------------------------------//
		//create a grade label
		JLabel gradesLabel = new JLabel("Grade");
		gradesLabel.setBounds(310, 100, 200, 50);
		panel.add(gradesLabel);
	
		//create a grade textfield that gets input from the user
		int y_holder2 = 110; //used variables like this so itd be easier to copy+paste the methods and Replace+Find by numbers
		
		grade1 = new JTextField("");
		grade1.setBounds(305, y_holder2 += 45, 50, 20);
		panel.add(grade1);
		grade1.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = grade1.getText();
				Double d_input = Double.parseDouble(input);
				all_grades.add(d_input);
			}
		});gradeArray.add(grade1);

		grade2 = new JTextField("");
		grade2.setBounds(305, y_holder2 += 45, 50, 20);
		panel.add(grade2);
		grade2.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = grade2.getText();
				Double d_input = Double.parseDouble(input);
				all_grades.add(d_input);
			}
		});gradeArray.add(grade2);

		grade3 = new JTextField("");
		grade3.setBounds(305, y_holder2 += 45, 50, 20);
		panel.add(grade3);
		grade3.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = grade3.getText();
				Double d_input = Double.parseDouble(input);
				all_grades.add(d_input);
			}
		});gradeArray.add(grade3);

		grade4 = new JTextField("");
		grade4.setBounds(305, y_holder2 += 45, 50, 20);
		panel.add(grade4);
		grade4.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = grade4.getText();
				Double d_input = Double.parseDouble(input);
				all_grades.add(d_input);
			}
		});gradeArray.add(grade4);

		grade5 = new JTextField("");
		grade5.setBounds(305, y_holder2 += 45, 50, 20);
		panel.add(grade5);
		grade5.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = grade5.getText();
				Double d_input = Double.parseDouble(input);
				all_grades.add(d_input);
			}
		});gradeArray.add(grade5);

		grade6 = new JTextField("");
		grade6.setBounds(305, y_holder2 += 45, 50, 20);
		panel.add(grade6);
		grade6.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = grade6.getText();
				Double d_input = Double.parseDouble(input);
				all_grades.add(d_input);
			}
		});gradeArray.add(grade6);

		grade7 = new JTextField("");
		grade7.setBounds(305, y_holder2 += 45, 50, 20);
		panel.add(grade7);
		grade7.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = grade7.getText();
				Double d_input = Double.parseDouble(input);
				all_grades.add(d_input);
			}
		});gradeArray.add(grade7);

		grade8 = new JTextField("");
		grade8.setBounds(305, y_holder2 += 45, 50, 20);
		panel.add(grade8);
		grade8.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = grade8.getText();
				Double d_input = Double.parseDouble(input);
				all_grades.add(d_input);
			}
		});gradeArray.add(grade8);

		grade9 = new JTextField("");
		grade9.setBounds(305, y_holder2 += 45, 50, 20);
		panel.add(grade9);
		grade9.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = grade9.getText();
				Double d_input = Double.parseDouble(input);
				all_grades.add(d_input);
			}
		});gradeArray.add(grade9);

		grade10 = new JTextField("");
		grade10.setBounds(305, y_holder2 += 45, 50, 20);
		panel.add(grade10);
		grade10.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = grade10.getText();
				Double d_input = Double.parseDouble(input);
				all_grades.add(d_input);
			}
		});gradeArray.add(grade10);

// ----------------------CREDIT HOURS----------------------------------------------------------------------------------------------------------------------------//
		//Label for Credit Hours
		JLabel chLabel = new JLabel("Credit Hours");
		chLabel.setBounds(400, 100, 200, 50);
		panel.add(chLabel);

		//Create a JTextField for credit hours
		int y_holder3 = 110;
		ch1 = new JTextField("");
		ch1.setBounds(415, y_holder3 += 45, 40, 20);
		panel.add(ch1);
		ch1.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = ch1.getText();
				if (input.trim() != "") {//if the field is not blank, then add the input into the arraylist
					try {
						Integer d_input = Integer.parseInt(input);
						all_ch.add(d_input);
					} catch (Exception all) {

					}
				}
			}
		});
		chArray.add(ch1);

		ch2 = new JTextField("");
		ch2.setBounds(415, y_holder3 += 45, 40, 20);
		panel.add(ch2);
		ch2.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = ch2.getText();
				if (input.trim() != "") {
					try {
						Integer d_input = Integer.parseInt(input);
						all_ch.add(d_input);
					} catch (Exception all) {

					}
				}
			}
		});
		chArray.add(ch2);

		ch3 = new JTextField("");
		ch3.setBounds(415, y_holder3 += 45, 40, 20);
		panel.add(ch3);
		ch3.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = ch3.getText();
				if (input.trim() != "") {
					try {
						Integer d_input = Integer.parseInt(input);
						all_ch.add(d_input);
					} catch (Exception all) {

					}
				}
			}
		});
		chArray.add(ch3);

		ch4 = new JTextField("");
		ch4.setBounds(415, y_holder3 += 45, 40, 20);
		panel.add(ch4);
		ch4.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = ch4.getText();
				if (input.trim() != "") {
					try {
						Integer d_input = Integer.parseInt(input);
						all_ch.add(d_input);
					} catch (Exception all) {

					}
				}
			}
		});

		ch5 = new JTextField("");
		ch5.setBounds(415, y_holder3 += 45, 40, 20);
		panel.add(ch5);
		ch5.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = ch5.getText();
				if (input.trim() != "") {
					try {
						Integer d_input = Integer.parseInt(input);
						all_ch.add(d_input);
					} catch (Exception all) {

					}
				}
			}
		});

		ch6 = new JTextField("");
		ch6.setBounds(415, y_holder3 += 45, 40, 20);
		panel.add(ch6);
		ch6.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = ch6.getText();
				if (input.trim() != "") {
					try {
						Integer d_input = Integer.parseInt(input);
						all_ch.add(d_input);
					} catch (Exception all) {

					}
				}
			}
		});

		ch7 = new JTextField("");
		ch7.setBounds(415, y_holder3 += 45, 40, 20);
		panel.add(ch7);
		ch7.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = ch7.getText();
				if (input.trim() != "") {
					try {
						Integer d_input = Integer.parseInt(input);
						all_ch.add(d_input);
					} catch (Exception all) {

					}
				}
			}
		});
		ch8 = new JTextField("");
		ch8.setBounds(415, y_holder3 += 45, 40, 20);
		panel.add(ch8);
		ch8.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = ch8.getText();
				if (input.trim() != "") {
					try {
						Integer d_input = Integer.parseInt(input);
						all_ch.add(d_input);
					} catch (Exception all) {

					}
				}
			}
		});

		ch9 = new JTextField("");
		ch9.setBounds(415, y_holder3 += 45, 40, 20);
		panel.add(ch9);
		ch9.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = ch9.getText();
				if (input.trim() != "") {
					try {
						Integer d_input = Integer.parseInt(input);
						all_ch.add(d_input);
					} catch (Exception all) {

					}
				}
			}
		});
		ch10 = new JTextField("");
		ch10.setBounds(415, y_holder3 += 45, 40, 20);
		panel.add(ch10);
		ch10.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String input = ch10.getText();
				if (input.trim() != "") {
					try {
						Integer d_input = Integer.parseInt(input);
						all_ch.add(d_input);
					} catch (Exception all) {

					}
				}
			}
		});

// ----------------REMOVES-------------------------------------------------------------------------------------------------------------------------------------------------------//
		//remove label
		JLabel removeLabel = new JLabel("Remove");
		removeLabel.setBounds(500, 100, 200, 50);
		panel.add(removeLabel);

		
		//create buttons for removing a single row of inputs
		int y_holder4 = 110;
		int twenty = 20;
		int five_ten = 510;
		int forty_five = 45;
		
		//going to assume that a button will be the easiest way to get rid of the textfield texts
		//create a button that removes all the fields
		JButton rm1 = new JButton("");
		rm1.setBounds(five_ten, y_holder4 += forty_five, twenty, twenty);
		rm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_courseText1 = courseText1.getText(); //get all the texts from each textfield
				String s_grade1 = grade1.getText();
				String s_ch1 = ch1.getText();

				if (s_courseText1.isEmpty() == false || s_grade1.isEmpty() //if the text box isn't empty, then remove the thing from the arraylist and set text to blank
						|| s_ch1.isEmpty()) {
					courseText1.setText("");
					if (courseNames.contains(s_courseText1)) {
						;
						courseNames.remove(courseNames.indexOf(s_courseText1));
					}}
					if (s_grade1.isEmpty() == false) {//if the text box isn't empty, then remove the thing from the arraylist and set text to blank
						grade1.setText("");
						Double d_grade1 = Double.parseDouble(s_grade1);
						if (all_grades.contains(d_grade1))
							;
						all_grades.remove(all_grades.indexOf(d_grade1));
					}

				
				if (s_ch1.isEmpty() == false) {//if the text box isn't empty, then remove the thing from the arraylist and set text to blank
					ch1.setText("");
					int i_ch1 = Integer.parseInt(s_ch1);
					if (all_ch.contains(i_ch1))
						;
					all_ch.remove(all_ch.indexOf(i_ch1));
				}

			}

		});
		rm1.setBackground(backColor);
		panel.add(rm1);

		JButton rm2 = new JButton("");
		rm2.setBounds(five_ten, y_holder4 += forty_five, twenty, twenty);
		rm2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_courseText2 = courseText2.getText();
				String s_grade2 = grade2.getText();
				String s_ch2 = ch2.getText();

				if (s_courseText2.isEmpty() == false || s_grade2.isEmpty()
						|| s_ch2.isEmpty()) {
					courseText2.setText("");
					if (courseNames.contains(s_courseText2)) {
						;
						courseNames.remove(courseNames.indexOf(s_courseText2));
					}}
					if (s_grade2.isEmpty() == false) {
						grade2.setText("");
						Double d_grade2 = Double.parseDouble(s_grade2);
						if (all_grades.contains(d_grade2))
							;
						all_grades.remove(all_grades.indexOf(d_grade2));
					

				}
				if (s_ch2.isEmpty() == false) {
					ch2.setText("");
					int i_ch2 = Integer.parseInt(s_ch2);
					if (all_ch.contains(i_ch2))
						;
					all_ch.remove(all_ch.indexOf(i_ch2));
				}

			}

		});
		rm2.setBackground(backColor);
		panel.add(rm2);

		JButton rm3 = new JButton("");
		rm3.setBounds(five_ten, y_holder4 += forty_five, twenty, twenty);
		rm3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_courseText3 = courseText3.getText();
				String s_grade3 = grade3.getText();
				String s_ch3 = ch3.getText();

				if (s_courseText3.isEmpty() == false || s_grade3.isEmpty()
						|| s_ch3.isEmpty()) {
					courseText3.setText("");
					if (courseNames.contains(s_courseText3)) {
						;
						courseNames.remove(courseNames.indexOf(s_courseText3));
					}}
					if (s_grade3.isEmpty() == false) {
						grade3.setText("");
						Double d_grade3 = Double.parseDouble(s_grade3);
						if (all_grades.contains(d_grade3))
							;
						all_grades.remove(all_grades.indexOf(d_grade3));
					

				}
				if (s_ch3.isEmpty() == false) {
					ch3.setText("");
					int i_ch3 = Integer.parseInt(s_ch3);
					if (all_ch.contains(i_ch3))
						;
					all_ch.remove(all_ch.indexOf(i_ch3));
				}

			}

		});
		rm3.setBackground(backColor);
		panel.add(rm3);

		JButton rm4 = new JButton("");
		rm4.setBounds(five_ten, y_holder4 += forty_five, twenty, twenty);
		rm4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_courseText4 = courseText4.getText();
				String s_grade4 = grade4.getText();
				String s_ch4 = ch4.getText();

				if (s_courseText4.isEmpty() == false || s_grade4.isEmpty()
						|| s_ch4.isEmpty()) {
					courseText4.setText("");
					if (courseNames.contains(s_courseText4)) {
						;
						courseNames.remove(courseNames.indexOf(s_courseText4));
					}}
					if (s_grade4.isEmpty() == false) {
						grade4.setText("");
						Double d_grade4 = Double.parseDouble(s_grade4);
						if (all_grades.contains(d_grade4))
							;
						all_grades.remove(all_grades.indexOf(d_grade4));
					

				}
				if (s_ch4.isEmpty() == false) {
					ch4.setText("");
					int i_ch4 = Integer.parseInt(s_ch4);
					if (all_ch.contains(i_ch4))
						;
					all_ch.remove(all_ch.indexOf(i_ch4));
				}

			}

		});
		rm4.setBackground(backColor);
		panel.add(rm4);

		JButton rm5 = new JButton("");
		rm5.setBounds(five_ten, y_holder4 += forty_five, twenty, twenty);
		rm5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_courseText5 = courseText5.getText();
				String s_grade5 = grade5.getText();
				String s_ch5 = ch5.getText();

				if (s_courseText5.isEmpty() == false || s_grade5.isEmpty()
						|| s_ch5.isEmpty()) {
					courseText5.setText("");
					if (courseNames.contains(s_courseText5)) {
						;
						courseNames.remove(courseNames.indexOf(s_courseText5));
					}}
					if (s_grade5.isEmpty() == false) {
						grade5.setText("");
						Double d_grade5 = Double.parseDouble(s_grade5);
						if (all_grades.contains(d_grade5))
							;
						all_grades.remove(all_grades.indexOf(d_grade5));
					

				}
				if (s_ch5.isEmpty() == false) {
					ch5.setText("");
					int i_ch5 = Integer.parseInt(s_ch5);
					if (all_ch.contains(i_ch5))
						;
					all_ch.remove(all_ch.indexOf(i_ch5));
				}

			}

		});rm5.setBackground(backColor);
		panel.add(rm5);

		JButton rm6 = new JButton("");
		rm6.setBounds(five_ten, y_holder4 += forty_five, twenty, twenty);
		rm6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_courseText6 = courseText6.getText();
				String s_grade6 = grade6.getText();
				String s_ch6 = ch6.getText();

				if (s_courseText6.isEmpty() == false || s_grade6.isEmpty()
						|| s_ch6.isEmpty()) {
					courseText6.setText("");
					if (courseNames.contains(s_courseText6)) {
						;
						courseNames.remove(courseNames.indexOf(s_courseText6));
					}}
					if (s_grade6.isEmpty() == false) {
						grade6.setText("");
						Double d_grade6 = Double.parseDouble(s_grade6);
						if (all_grades.contains(d_grade6))
							;
						all_grades.remove(all_grades.indexOf(d_grade6));
					

				}
				if (s_ch6.isEmpty() == false) {
					ch6.setText("");
					int i_ch6 = Integer.parseInt(s_ch6);
					if (all_ch.contains(i_ch6))
						;
					all_ch.remove(all_ch.indexOf(i_ch6));
				}

			}

		});
		rm6.setBackground(backColor);
		panel.add(rm6);

		JButton rm7 = new JButton("");
		rm7.setBounds(five_ten, y_holder4 += forty_five, twenty, twenty);
		rm7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_courseText7 = courseText7.getText();
				String s_grade7 = grade7.getText();
				String s_ch7 = ch7.getText();

				if (s_courseText7.isEmpty() == false || s_grade7.isEmpty()
						|| s_ch7.isEmpty()) {
					courseText7.setText("");
					if (courseNames.contains(s_courseText7)) {
						;
						courseNames.remove(courseNames.indexOf(s_courseText7));
					}}
					if (s_grade7.isEmpty() == false) {
						grade7.setText("");
						Double d_grade7 = Double.parseDouble(s_grade7);
						if (all_grades.contains(d_grade7))
							;
						all_grades.remove(all_grades.indexOf(d_grade7));
					

				}
				if (s_ch7.isEmpty() == false) {
					ch7.setText("");
					int i_ch7 = Integer.parseInt(s_ch7);
					if (all_ch.contains(i_ch7))
						;
					all_ch.remove(all_ch.indexOf(i_ch7));
				}

			}

		});rm7.setBackground(backColor);
		panel.add(rm7);
		JButton rm8 = new JButton("");
		rm8.setBounds(five_ten, y_holder4 += forty_five, twenty, twenty);
		rm8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_courseText8 = courseText8.getText();
				String s_grade8 = grade8.getText();
				String s_ch8 = ch8.getText();

				if (s_courseText8.isEmpty() == false || s_grade8.isEmpty()
						|| s_ch8.isEmpty()) {
					courseText8.setText("");
					if (courseNames.contains(s_courseText8)) {
						;
						courseNames.remove(courseNames.indexOf(s_courseText8));
					}}
					if (s_grade8.isEmpty() == false) {
						grade8.setText("");
						Double d_grade8 = Double.parseDouble(s_grade8);
						if (all_grades.contains(d_grade8))
							;
						all_grades.remove(all_grades.indexOf(d_grade8));
					

				}
				if (s_ch8.isEmpty() == false) {
					ch8.setText("");
					int i_ch8 = Integer.parseInt(s_ch8);
					if (all_ch.contains(i_ch8))
						;
					all_ch.remove(all_ch.indexOf(i_ch8));
				}

			}

		});
		rm8.setBackground(backColor);
		panel.add(rm8);

		JButton rm9 = new JButton("");
		rm9.setBounds(five_ten, y_holder4 += forty_five, twenty, twenty);
		rm9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_courseText9 = courseText9.getText();
				String s_grade9 = grade9.getText();
				String s_ch9 = ch9.getText();

				if (s_courseText9.isEmpty() == false || s_grade9.isEmpty()
						|| s_ch9.isEmpty()) {
					courseText9.setText("");
					if (courseNames.contains(s_courseText9)) {
						;
						courseNames.remove(courseNames.indexOf(s_courseText9));
					}}
					if (s_grade9.isEmpty() == false) {
						grade9.setText("");
						Double d_grade9 = Double.parseDouble(s_grade9);
						if (all_grades.contains(d_grade9))
							;
						all_grades.remove(all_grades.indexOf(d_grade9));
					

				}
				if (s_ch9.isEmpty() == false) {
					ch9.setText("");
					int i_ch9 = Integer.parseInt(s_ch9);
					if (all_ch.contains(i_ch9))
						;
					all_ch.remove(all_ch.indexOf(i_ch9));
				}

			}

		});rm9.setBackground(backColor);
		panel.add(rm9);

		JButton rm10 = new JButton("");
		rm10.setBounds(five_ten, y_holder4 += forty_five, twenty, twenty);
		rm10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s_courseText10 = courseText10.getText();
				String s_grade10 = grade10.getText();
				String s_ch10 = ch10.getText();

				if (s_courseText10.isEmpty() == false || s_grade10.isEmpty()
						|| s_ch10.isEmpty()) {
					courseText10.setText("");
					if (courseNames.contains(s_courseText10)) {
						;
						courseNames.remove(courseNames.indexOf(s_courseText10));
					}}
					if (s_grade10.isEmpty() == false) {
						grade10.setText("");
						Double d_grade10 = Double.parseDouble(s_grade10);
						if (all_grades.contains(d_grade10))
							;
						all_grades.remove(all_grades.indexOf(d_grade10));
					

				}
				if (s_ch10.isEmpty() == false) {
					ch10.setText("");
					int i_ch10 = Integer.parseInt(s_ch10);
					if (all_ch.contains(i_ch10))
						;
					all_ch.remove(all_ch.indexOf(i_ch10));
				}

			}

		});rm10.setBackground(backColor);
		panel.add(rm10);
		
		//make a target gpa label and add the corresponding textfield for input
		targetLabel = new JLabel("Target GPA: ");
		targetLabel.setBounds(20, 590, 100, 50);
		panel.add(targetLabel);
		
		targetField = new JTextField("");
		targetField.setBounds(97, 605, 165, 20);
		targetField.addFocusListener(new FocusAdapter()
		{public void focusLost(FocusEvent e){
			String input = targetField.getText();
			Double d_input = Double.parseDouble(input);
			targetGPA = d_input;
			}
			}
		);panel.add(targetField);
		
		//make a remaining credit hours label and add the corresponding textfield for input
		chLabel = new JLabel("Credit Hours Remaining: ");
		chLabel.setBounds(20, 630, 150, 50);
		panel.add(chLabel);
		
		chField = new JTextField("");
		chField.setBounds(165, 645, 97, 20);
		chField.addFocusListener(new FocusAdapter()
		{public void focusLost(FocusEvent e){
			String input = chField.getText();
			int d_input = Integer.parseInt(input);
			remaining_ch = d_input;
			}
			}
		);
		
		panel.add(chField);
		
		//add label that shows average GPA (once the 'CALCULATE Avg GPA' button is pressed)
		calcGPA = new JLabel("Average GPA is :  _____");
		calcGPA.setBounds(130, 695, 200, 50);
		panel.add(calcGPA);

// ----------------------------------BUTTONS----------------------------------------------------------------------------------------------------------------------------------------//
		//assume client wants a button that calculates GPA
		JButton calcButt = new JButton("<html><center>CALCULATE<br><center>Avg GPA</html>"); 
		calcButt.setBounds(20, 682, 100, 50);
		panel.add(calcButt);
		calcButt.setBackground(buttonColor);
		calcButt.addActionListener(new calcPressed());
		
		//removeAll button removes everything. "Restarts" the program so to speak. Going to assume that this will satisfy the task
		JButton removeAll = new JButton("<html><center>Remove <br><center>All Courses</html>");
		removeAll.setBounds(430, 615, 100, 50);
		removeAll.setBackground(buttonColor);
		removeAll.addActionListener(new removeAllPressed());
		panel.add(removeAll);
		

		
		//assume the client meant another frame added to the side when client wants "15 blank course blocks"
		JButton insertCourses = new JButton("<html><center>Insert<br><center>Courses </html");
		insertCourses.setBounds(305, 615, 100, 50);
		insertCourses.addActionListener(new insertCoursesPressed());
		insertCourses.setBackground(buttonColor);
		panel.add(insertCourses);
		
		//assume that client would be fine with a button that would show all the courses entered
		JButton courseList = new JButton("<html><center>Click here <br><center> to see all<br><center>Courses </html>");
		courseList.setBounds(430,680,100,50);
		courseList.addActionListener(new listPressed());
		courseList.setBackground(buttonColor);
		panel.add(courseList);
		
		//assume that a button will be easiest way to show message whether requiredGPA is too high, low, etc. 
		JButton requiredGPA = new JButton("<html><center>How to get<br><center>Target GPA? </html>");
		requiredGPA.setBounds(305,680,100,50);
		requiredGPA.addActionListener(new requiredGPAlistener());
		requiredGPA.setBackground(buttonColor);
		panel.add(requiredGPA);
		
		
		//this will show once the courseList button is pressed
		JTextField courseList1 = new JTextField("");
		courseList1.setBounds(60,790,10,10);
		panel.add(courseList1);
		
		
		
		// start the frame
		frame.setLocationRelativeTo(null);// opens the frame in the middle of
		frame.setVisible(true); // necessary to start event-handling thread
		
	}

// -------------------------------ACTION LISTENER METHODS---------------------------------------------------------------------------------------------------------------------//
	public class requiredGPAlistener implements ActionListener{
		public void actionPerformed(ActionEvent u){
			//assume if there aren't two inputs, then there must be an error. No point in just putting a grade without a credit hour, vice versa.
			if(all_grades.size() != all_ch.size()){
				JOptionPane.showMessageDialog(frame,"Please check and see if you have filled in a corresponding Grade for Credit Hour, vice versa.");
			}
			
			double numerator = 0;
			for (int i=0; i < all_grades.size(); i++){
				double multiplied = all_grades.get(i) * all_ch.get(i);
				numerator += multiplied;
			}
			
			double denominator = 0;
			for(int k : all_ch){
				denominator += k;
			}
			
			double required_GPA = ((targetGPA*(remaining_ch + denominator)) - numerator) / remaining_ch;
			
			if(required_GPA > 4.0){//if required GPA is less than 4.0, display message
				JOptionPane.showMessageDialog(frame, "Your Required GPA, " + required_GPA + ", is greater than 4.0. Try adding more credit hours and recalculating.");
			}
			if(required_GPA < 2.0){ //if required GPA is less than 2.0, display message
				JOptionPane.showMessageDialog(frame, "Your Required GPA, " + required_GPA + ", is less than 2.0. You could take fewer credit hours if you wish.");
			}
			
			//make required_GPA and remaining_ch into a string so it can be displayed on an empty textfield
			String reqGPA_string = Double.toString(required_GPA).substring(0,4);
			
			int remCH = remaining_ch;
			String remCH_string = Integer.toString(remCH);
			
			for(JTextField o : chArray){ //array that searches for an empty textfield to place the required gpa
				if(o.getText().isEmpty() == true){
					o.setText(remCH_string);
					break;
				}
				
			}
			
			for(JTextField s : gradeArray){//array that searches for an empty textfield to place the number of credit hours
				if(s.getText().isEmpty() == true){
					s.setText(reqGPA_string);
					break;
				}
			
			}
			
			System.out.println(required_GPA);
			
		}
	}
	
	//if this button is pressed, creates a frame with a label in it that displays all current inputted courses
	public class listPressed implements ActionListener{
		public void actionPerformed(ActionEvent evn){
			JFrame listFrame = new JFrame();
			listFrame.setSize(400,400);
			listFrame.setResizable(false);
			listFrame.setTitle("List of Courses");
			listFrame.setVisible(true);
			listFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			JPanel panelList = new JPanel(); // create panel
			panelList.setLayout(null);
			listFrame.add(panelList);
			//for loop to trim all the strings in courseNames
			ArrayList<String> copy_courseNames = new ArrayList<String>();
			for(int k = 0; k<courseNames.size(); k++){
				String name = courseNames.get(k);
				String trimmed = name.trim();
				copy_courseNames.add(trimmed);
			}
			JTextField coursesLabel = new JTextField(copy_courseNames.toString());
			coursesLabel.setBounds(0,0,400,400);
			panelList.add(coursesLabel);
		}
	}
	
	//if this button is pressed, then it adds a new frame to the right
	public class insertCoursesPressed implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Array of courseTextFields
			frame.setSize(1200, 800);
			// make the list of numbers beside the TextField course boxes
			int adder = 0;
			for (int i = 11; i <= 25; i++) {
				adder += 45;
				JLabel courseNbr = new JLabel("" + i);
				courseNbr.setBounds(600, 0 + adder, 50, 50);
				panel.add(courseNbr);
			}
			JLabel coursesLabel = new JLabel("Courses");
			coursesLabel.setBounds(650, 10, 200, 50);
			panel.add(coursesLabel);
			
			//make more course text boxes that the user can input course names into
			int y = 17;
			int six_fifty = 650;
			int two_hund = 200;
			int twenty = 20;
			courseText11 = new JTextField("");
			courseText11.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText11);
			courseText11.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText11.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText12 = new JTextField("");
			courseText12.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText12);
			courseText12.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText12.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText13 = new JTextField("");
			courseText13.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText13);
			courseText13.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText13.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText14 = new JTextField("");
			courseText14.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText14);
			courseText14.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText14.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText15 = new JTextField("");
			courseText15.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText15);
			courseText15.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText15.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText16 = new JTextField("");
			courseText16.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText16);
			courseText16.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText16.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText17 = new JTextField("");
			courseText17.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText17);
			courseText17.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText17.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText18 = new JTextField("");
			courseText18.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText18);
			courseText18.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText18.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText19 = new JTextField("");
			courseText19.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText19);
			courseText19.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText19.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText20 = new JTextField("");
			courseText20.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText20);
			courseText20.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText20.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText21 = new JTextField("");
			courseText21.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText21);
			courseText21.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText21.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText22 = new JTextField("");
			courseText22.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText22);
			courseText22.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText22.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText23 = new JTextField("");
			courseText23.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText23);
			courseText23.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText23.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText24 = new JTextField("");
			courseText24.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText24);
			courseText24.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText24.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

			courseText25 = new JTextField("");
			courseText25.setBounds(six_fifty, y += 45, two_hund, twenty);
			panel.add(courseText25);
			courseText25.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = courseText25.getText();
					if (input.trim().equals("") == false) {
						courseNames.add(input);
					}
				}
			});

// ---------------------------GRADE TEXTFIELDS-------------------------------------------------------------------------------------------------------------------------------------------------//
			//make more grade textfields 
			JLabel gradesLabel_2 = new JLabel("Grade");
			gradesLabel_2.setBounds(900, 10, 100, 50);
			panel.add(gradesLabel_2);

			int y2 = 17;
			int eight_97 = 897;
			int frty_five = 45;
			int fifty = 50;
			int twenty_ = 20;
			grade11 = new JTextField("");
			grade11.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade11);
			grade11.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade11.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade11);

			grade12 = new JTextField("");
			grade12.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade12);
			grade12.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade12.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade12);

			grade13 = new JTextField("");
			grade13.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade13);
			grade13.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade13.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade13);

			grade14 = new JTextField("");
			grade14.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade14);
			grade14.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade14.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade14);
			
			grade15 = new JTextField("");
			grade15.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade15);
			grade15.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade15.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade15);

			grade16 = new JTextField("");
			grade16.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade16);
			grade16.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade16.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade16);

			grade17 = new JTextField("");
			grade17.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade17);
			grade17.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade17.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade17);

			grade18 = new JTextField("");
			grade18.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade18);
			grade18.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade18.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade18);

			grade19 = new JTextField("");
			grade19.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade19);
			grade19.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade19.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade19);

			grade20 = new JTextField("");
			grade20.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade20);
			grade20.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade20.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade20);

			grade21 = new JTextField("");
			grade21.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade21);
			grade21.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade21.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade21);

			grade22 = new JTextField("");
			grade22.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade22);
			grade22.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade22.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade22);

			grade23 = new JTextField("");
			grade23.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade23);
			grade23.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade23.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade23);

			grade24 = new JTextField("");
			grade24.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade24);
			grade24.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade24.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade24);

			grade25 = new JTextField("");
			grade25.setBounds(eight_97, y2 += frty_five, fifty, twenty);
			panel.add(grade25);
			grade25.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = grade25.getText();
					Double d_input = Double.parseDouble(input);
					all_grades.add(d_input);
				}
			});gradeArray.add(grade25);

// -----------------------------CREDIT HOUR TEXTFIELDS------------------------------------------------------------------------------------------------------------------------------------//
			//create a credit hour for the additional frame
			JLabel ch_2 = new JLabel("Credit Hours");
			ch_2.setBounds(980, 10, 100, 50);
			panel.add(ch_2);

			int y3 = 17;
			int nine_ninty = 990;

			ch11 = new JTextField("");
			ch11.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch11);
			ch11.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch11.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch11);

			ch12 = new JTextField("");
			ch12.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch12);
			ch12.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch12.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch12);

			ch13 = new JTextField("");
			ch13.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch13);
			ch13.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch13.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch13);

			ch14 = new JTextField("");
			ch14.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch14);
			ch14.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch14.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch14);

			ch15 = new JTextField("");
			ch15.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch15);
			ch15.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch15.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch15);

			ch16 = new JTextField("");
			ch16.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch16);
			ch16.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch16.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch16);

			ch17 = new JTextField("");
			ch17.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch17);
			ch17.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch17.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch17);

			ch18 = new JTextField("");
			ch18.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch18);
			ch18.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch18.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch18);

			ch19 = new JTextField("");
			ch19.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch19);
			ch19.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch19.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch19);

			ch20 = new JTextField("");
			ch20.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch20);
			ch20.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch20.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch20);

			ch21 = new JTextField("");
			ch21.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch21);
			ch21.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch21.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch21);

			ch22 = new JTextField("");
			ch22.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch22);
			ch22.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch22.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch22);

			ch23 = new JTextField("");
			ch23.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch23);
			ch23.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch23.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch23);

			ch24 = new JTextField("");
			ch24.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch24);
			ch24.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch24.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch24);

			ch25 = new JTextField("");
			ch25.setBounds(nine_ninty, y3 += frty_five, fifty, twenty_);
			panel.add(ch25);
			ch25.addFocusListener(new FocusAdapter() {
				public void focusLost(FocusEvent e) {
					String input = ch25.getText();
					if (input.trim() != "") {
						try {
							Integer d_input = Integer.parseInt(input);
							all_ch.add(d_input);
						} catch (Exception all) {

						}
					}
				}
			});chArray.add(ch25);

// ---------------------------REMOVE BUTTONS--------------------------------------------------------------------------------------------------------------------------------------//
			//make more remove buttons
			JLabel rm_2 = new JLabel("Remove");
			rm_2.setBounds(1080, 10, 100, 50);
			panel.add(rm_2);

			int y_holder4 = 17;
			int eleven_ninty = 1090;
			int forty_five = 45;

			JButton rm11 = new JButton("");
			rm11.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText11 = courseText11.getText();
					String s_grade11 = grade11.getText();
					String s_ch11 = ch11.getText();
					if (s_courseText11.isEmpty() == false
							|| s_grade11.isEmpty() || s_ch11.isEmpty()) {
						courseText11.setText("");
						if (courseNames.contains(s_courseText11)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText11));
						}}
						if (s_grade11.isEmpty() == false) {
							grade11.setText("");
							Double d_grade11 = Double.parseDouble(s_grade11);
							if (all_grades.contains(d_grade11))
								;
							all_grades.remove(all_grades.indexOf(d_grade11));
						
					}
					if (s_ch11.isEmpty() == false) {
						ch11.setText("");
						int i_ch11 = Integer.parseInt(s_ch11);
						if (all_ch.contains(i_ch11))
							;
						all_ch.remove(all_ch.indexOf(i_ch11));
					}
				}
			});rm11.setBackground(backColor);
			panel.add(rm11);

			JButton rm12 = new JButton("");
			rm12.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText12 = courseText12.getText();
					String s_grade12 = grade12.getText();
					String s_ch12 = ch12.getText();
					if (s_courseText12.isEmpty() == false
							|| s_grade12.isEmpty() || s_ch12.isEmpty()) {
						courseText12.setText("");
						if (courseNames.contains(s_courseText12)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText12));
						}}
						if (s_grade12.isEmpty() == false) {
							grade12.setText("");
							Double d_grade12 = Double.parseDouble(s_grade12);
							if (all_grades.contains(d_grade12))
								;
							all_grades.remove(all_grades.indexOf(d_grade12));
						
					}
					if (s_ch12.isEmpty() == false) {
						ch12.setText("");
						int i_ch12 = Integer.parseInt(s_ch12);
						if (all_ch.contains(i_ch12))
							;
						all_ch.remove(all_ch.indexOf(i_ch12));
					}
				}
			});rm12.setBackground(backColor);
			panel.add(rm12);

			JButton rm13 = new JButton("");
			rm13.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText13 = courseText13.getText();
					String s_grade13 = grade13.getText();
					String s_ch13 = ch13.getText();
					if (s_courseText13.isEmpty() == false
							|| s_grade13.isEmpty() || s_ch13.isEmpty()) {
						courseText13.setText("");
						if (courseNames.contains(s_courseText13)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText13));
						}}
						if (s_grade13.isEmpty() == false) {
							grade13.setText("");
							Double d_grade13 = Double.parseDouble(s_grade13);
							if (all_grades.contains(d_grade13))
								;
							all_grades.remove(all_grades.indexOf(d_grade13));
						
					}
					if (s_ch13.isEmpty() == false) {
						ch13.setText("");
						int i_ch13 = Integer.parseInt(s_ch13);
						if (all_ch.contains(i_ch13))
							;
						all_ch.remove(all_ch.indexOf(i_ch13));
					}
				}
			});rm13.setBackground(backColor);
			panel.add(rm13);

			JButton rm14 = new JButton("");
			rm14.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText14 = courseText14.getText();
					String s_grade14 = grade14.getText();
					String s_ch14 = ch14.getText();
					if (s_courseText14.isEmpty() == false
							|| s_grade14.isEmpty() || s_ch14.isEmpty()) {
						courseText14.setText("");
						if (courseNames.contains(s_courseText14)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText14));
						}}
						if (s_grade14.isEmpty() == false) {
							grade14.setText("");
							Double d_grade14 = Double.parseDouble(s_grade14);
							if (all_grades.contains(d_grade14))
								;
							all_grades.remove(all_grades.indexOf(d_grade14));
						
					}
					if (s_ch14.isEmpty() == false) {
						ch14.setText("");
						int i_ch14 = Integer.parseInt(s_ch14);
						if (all_ch.contains(i_ch14))
							;
						all_ch.remove(all_ch.indexOf(i_ch14));
					}
				}
			});rm14.setBackground(backColor);
			panel.add(rm14);

			JButton rm15 = new JButton("");
			rm15.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText15 = courseText15.getText();
					String s_grade15 = grade15.getText();
					String s_ch15 = ch15.getText();
					if (s_courseText15.isEmpty() == false
							|| s_grade15.isEmpty() || s_ch15.isEmpty()) {
						courseText15.setText("");
						if (courseNames.contains(s_courseText15)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText15));
						}}
						if (s_grade15.isEmpty() == false) {
							grade15.setText("");
							Double d_grade15 = Double.parseDouble(s_grade15);
							if (all_grades.contains(d_grade15))
								;
							all_grades.remove(all_grades.indexOf(d_grade15));
						
					}
					if (s_ch15.isEmpty() == false) {
						ch15.setText("");
						int i_ch15 = Integer.parseInt(s_ch15);
						if (all_ch.contains(i_ch15))
							;
						all_ch.remove(all_ch.indexOf(i_ch15));
					}
				}
			});rm15.setBackground(backColor);
			panel.add(rm15);

			JButton rm16 = new JButton("");
			rm16.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText16 = courseText16.getText();
					String s_grade16 = grade16.getText();
					String s_ch16 = ch16.getText();
					if (s_courseText16.isEmpty() == false
							|| s_grade16.isEmpty() || s_ch16.isEmpty()) {
						courseText16.setText("");
						if (courseNames.contains(s_courseText16)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText16));
						}}
						if (s_grade16.isEmpty() == false) {
							grade16.setText("");
							Double d_grade16 = Double.parseDouble(s_grade16);
							if (all_grades.contains(d_grade16))
								;
							all_grades.remove(all_grades.indexOf(d_grade16));
						
					}
					if (s_ch16.isEmpty() == false) {
						ch16.setText("");
						int i_ch16 = Integer.parseInt(s_ch16);
						if (all_ch.contains(i_ch16))
							;
						all_ch.remove(all_ch.indexOf(i_ch16));
					}
				}
			});rm16.setBackground(backColor);
			panel.add(rm16);

			JButton rm17 = new JButton("");
			rm17.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText17 = courseText17.getText();
					String s_grade17 = grade17.getText();
					String s_ch17 = ch17.getText();
					if (s_courseText17.isEmpty() == false
							|| s_grade17.isEmpty() || s_ch17.isEmpty()) {
						courseText17.setText("");
						if (courseNames.contains(s_courseText17)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText17));
						}}
						if (s_grade17.isEmpty() == false) {
							grade17.setText("");
							Double d_grade17 = Double.parseDouble(s_grade17);
							if (all_grades.contains(d_grade17))
								;
							all_grades.remove(all_grades.indexOf(d_grade17));
						
					}
					if (s_ch17.isEmpty() == false) {
						ch17.setText("");
						int i_ch17 = Integer.parseInt(s_ch17);
						if (all_ch.contains(i_ch17))
							;
						all_ch.remove(all_ch.indexOf(i_ch17));
					}
				}
			});rm17.setBackground(backColor);
			panel.add(rm17);

			JButton rm18 = new JButton("");
			rm18.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText18 = courseText18.getText();
					String s_grade18 = grade18.getText();
					String s_ch18 = ch18.getText();
					if (s_courseText18.isEmpty() == false
							|| s_grade18.isEmpty() || s_ch18.isEmpty()) {
						courseText18.setText("");
						if (courseNames.contains(s_courseText18)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText18));
						}}
						if (s_grade18.isEmpty() == false) {
							grade18.setText("");
							Double d_grade18 = Double.parseDouble(s_grade18);
							if (all_grades.contains(d_grade18))
								;
							all_grades.remove(all_grades.indexOf(d_grade18));
						
					}
					if (s_ch18.isEmpty() == false) {
						ch18.setText("");
						int i_ch18 = Integer.parseInt(s_ch18);
						if (all_ch.contains(i_ch18))
							;
						all_ch.remove(all_ch.indexOf(i_ch18));
					}
				}
			});rm18.setBackground(backColor);
			panel.add(rm18);

			JButton rm19 = new JButton("");
			rm19.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText19 = courseText19.getText();
					String s_grade19 = grade19.getText();
					String s_ch19 = ch19.getText();
					if (s_courseText19.isEmpty() == false
							|| s_grade19.isEmpty() || s_ch19.isEmpty()) {
						courseText19.setText("");
						if (courseNames.contains(s_courseText19)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText19));
						}}
						if (s_grade19.isEmpty() == false) {
							grade19.setText("");
							Double d_grade19 = Double.parseDouble(s_grade19);
							if (all_grades.contains(d_grade19))
								;
							all_grades.remove(all_grades.indexOf(d_grade19));
						
					}
					if (s_ch19.isEmpty() == false) {
						ch19.setText("");
						int i_ch19 = Integer.parseInt(s_ch19);
						if (all_ch.contains(i_ch19))
							;
						all_ch.remove(all_ch.indexOf(i_ch19));
					}
				}
			});rm19.setBackground(backColor);
			panel.add(rm19);

			JButton rm20 = new JButton("");
			rm20.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm20.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText20 = courseText20.getText();
					String s_grade20 = grade20.getText();
					String s_ch20 = ch20.getText();
					if (s_courseText20.isEmpty() == false
							|| s_grade20.isEmpty() || s_ch20.isEmpty()) {
						courseText20.setText("");
						if (courseNames.contains(s_courseText20)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText20));
						}}
						if (s_grade20.isEmpty() == false) {
							grade20.setText("");
							Double d_grade20 = Double.parseDouble(s_grade20);
							if (all_grades.contains(d_grade20))
								;
							all_grades.remove(all_grades.indexOf(d_grade20));
						
					}
					if (s_ch20.isEmpty() == false) {
						ch20.setText("");
						int i_ch20 = Integer.parseInt(s_ch20);
						if (all_ch.contains(i_ch20))
							;
						all_ch.remove(all_ch.indexOf(i_ch20));
					}
				}
			});rm20.setBackground(backColor);
			panel.add(rm20);

			JButton rm21 = new JButton("");
			rm21.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm21.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText21 = courseText21.getText();
					String s_grade21 = grade21.getText();
					String s_ch21 = ch21.getText();
					if (s_courseText21.isEmpty() == false
							|| s_grade21.isEmpty() || s_ch21.isEmpty()) {
						courseText21.setText("");
						if (courseNames.contains(s_courseText21)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText21));
						}}
						if (s_grade21.isEmpty() == false) {
							grade21.setText("");
							Double d_grade21 = Double.parseDouble(s_grade21);
							if (all_grades.contains(d_grade21))
								;
							all_grades.remove(all_grades.indexOf(d_grade21));
						
					}
					if (s_ch21.isEmpty() == false) {
						ch21.setText("");
						int i_ch21 = Integer.parseInt(s_ch21);
						if (all_ch.contains(i_ch21))
							;
						all_ch.remove(all_ch.indexOf(i_ch21));
					}
				}
			});rm21.setBackground(backColor);
			panel.add(rm21);

			JButton rm22 = new JButton("");
			rm22.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm22.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText22 = courseText22.getText();
					String s_grade22 = grade22.getText();
					String s_ch22 = ch22.getText();
					if (s_courseText22.isEmpty() == false
							|| s_grade22.isEmpty() || s_ch22.isEmpty()) {
						courseText22.setText("");
						if (courseNames.contains(s_courseText22)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText22));
						}}
						if (s_grade22.isEmpty() == false) {
							grade22.setText("");
							Double d_grade22 = Double.parseDouble(s_grade22);
							if (all_grades.contains(d_grade22))
								;
							all_grades.remove(all_grades.indexOf(d_grade22));
						
					}
					if (s_ch22.isEmpty() == false) {
						ch22.setText("");
						int i_ch22 = Integer.parseInt(s_ch22);
						if (all_ch.contains(i_ch22))
							;
						all_ch.remove(all_ch.indexOf(i_ch22));
					}
				}
			});rm22.setBackground(backColor);
			panel.add(rm22);

			JButton rm23 = new JButton("");
			rm23.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm23.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText23 = courseText23.getText();
					String s_grade23 = grade23.getText();
					String s_ch23 = ch23.getText();
					if (s_courseText23.isEmpty() == false
							|| s_grade23.isEmpty() || s_ch23.isEmpty()) {
						courseText23.setText("");
						if (courseNames.contains(s_courseText23)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText23));
						}}
						if (s_grade23.isEmpty() == false) {
							grade23.setText("");
							Double d_grade23 = Double.parseDouble(s_grade23);
							if (all_grades.contains(d_grade23))
								;
							all_grades.remove(all_grades.indexOf(d_grade23));
						
					}
					if (s_ch23.isEmpty() == false) {
						ch23.setText("");
						int i_ch23 = Integer.parseInt(s_ch23);
						if (all_ch.contains(i_ch23))
							;
						all_ch.remove(all_ch.indexOf(i_ch23));
					}
				}
			});rm23.setBackground(backColor);
			panel.add(rm23);

			JButton rm24 = new JButton("");
			rm24.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm24.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText24 = courseText24.getText();
					String s_grade24 = grade24.getText();
					String s_ch24 = ch24.getText();
					if (s_courseText24.isEmpty() == false
							|| s_grade24.isEmpty() || s_ch24.isEmpty()) {
						courseText24.setText("");
						if (courseNames.contains(s_courseText24)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText24));
						}}
						if (s_grade24.isEmpty() == false) {
							grade24.setText("");
							Double d_grade24 = Double.parseDouble(s_grade24);
							if (all_grades.contains(d_grade24))
								;
							all_grades.remove(all_grades.indexOf(d_grade24));
						
					}
					if (s_ch24.isEmpty() == false) {
						ch24.setText("");
						int i_ch24 = Integer.parseInt(s_ch24);
						if (all_ch.contains(i_ch24))
							;
						all_ch.remove(all_ch.indexOf(i_ch24));
					}
				}
			});rm24.setBackground(backColor);
			panel.add(rm24);

			JButton rm25 = new JButton("");
			rm25.setBounds(eleven_ninty, y_holder4 += forty_five, twenty,
					twenty);
			rm25.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s_courseText25 = courseText25.getText();
					String s_grade25 = grade25.getText();
					String s_ch25 = ch25.getText();
					if (s_courseText25.isEmpty() == false
							|| s_grade25.isEmpty() || s_ch25.isEmpty()) {
						courseText25.setText("");
						if (courseNames.contains(s_courseText25)) {
							;
							courseNames.remove(courseNames
									.indexOf(s_courseText25));
						}}
						if (s_grade25.isEmpty() == false) {
							grade25.setText("");
							Double d_grade25 = Double.parseDouble(s_grade25);
							if (all_grades.contains(d_grade25))
								;
							all_grades.remove(all_grades.indexOf(d_grade25));
						
					}
					if (s_ch25.isEmpty() == false) {
						ch25.setText("");
						int i_ch25 = Integer.parseInt(s_ch25);
						if (all_ch.contains(i_ch25))
							;
						all_ch.remove(all_ch.indexOf(i_ch25));
					}
				}
			});rm25.setBackground(backColor);
			panel.add(rm25);

	
		}
//-----------------------------------END OF FRAME---------------------------------------------------------//
	}
// --------------------------MORE ACTION LISTENER METHODS--------------------------------------------------------//
	//assume that a button will satisfy the task in showing the GPA. This will help display a message whether fields are satisifed in order to calculate GPA.
	public class calcPressed implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// frame.setVisible(false);
			System.out.println(courseNames);
			System.out.println(all_grades);
			System.out.println(all_ch);
		

			//assume if there aren't two inputs, then there must be an error. No point in just putting a grade without a credit hour, vice versa.
			if(all_grades.size() != all_ch.size()){
				JOptionPane.showMessageDialog(frame,"Please check and see if you have filled in a corresponding Grade for Credit Hour, vice versa.");
			}
			
			double numerator = 0;
			//get each grade and multiply by its corresponding number of credit hours
			for (int i=0; i < all_grades.size(); i++){
				double multiplied = all_grades.get(i) * all_ch.get(i);
				numerator += multiplied;
			}
			
			double denominator = 0;
			for(int k : all_ch){
				denominator += k;
			}
			
			//calculate the average GPA
			double avg = numerator / denominator;
			String avg_string = Double.toString(avg);
			
			calcGPA.setText("Average GPA is: " + avg_string);
		}
	}
	
	//when removeAllPressed, restarts the program by creating another Calculator object
	public class removeAllPressed implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
			Calculator newCalc = new Calculator();
			newCalc.initialize();
		}
	}
	//ignore this method
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}
