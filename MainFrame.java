import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class MainFrame{
       //payroll details
	private JFrame frame;
	private JTextField employeeJina;
	private JTextField rate;
	private JTextField Day_hour;
	private JTextField daysNO;
	private JTextField gross2;
	private JTextField ushuru;
	private JTextField phLevel;
	private JTextField triple_S;
	private JTextField deductions;
	private JLabel grossSalary;
	private JTextField gross2_1;
	private JLabel deduct;
	private JTextField deductAll;
	private JLabel netSalary;
	private JTextField netSalary12;
	private JLabel pH;
	private JLabel sSS;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainFrame() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSimplePayrollSystem = new JLabel("Simple Payroll System");
		lblSimplePayrollSystem.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSimplePayrollSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimplePayrollSystem.setBounds(0, 0, 1087, 49);
		frame.getContentPane().add(lblSimplePayrollSystem);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmployeeName.setBounds(64, 65, 127, 20);
		frame.getContentPane().add(lblEmployeeName);
		
		employeeJina = new JTextField();
		lblEmployeeName.setLabelFor(employeeJina);
		employeeJina.setBounds(210, 62, 120, 26);
		frame.getContentPane().add(employeeJina);
		employeeJina.setColumns(10);
		
		JLabel lblRatePerHour = new JLabel("Rate Per Hour:");
		lblRatePerHour.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRatePerHour.setBounds(64, 101, 127, 20);
		frame.getContentPane().add(lblRatePerHour);
		
		rate = new JTextField();
		lblRatePerHour.setLabelFor(rate);
		rate.setBounds(210, 98, 120, 26);
		frame.getContentPane().add(rate);
		rate.setColumns(10);
		
		JLabel lblHourPerDay = new JLabel("Hour Per Day:");
		lblHourPerDay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHourPerDay.setBounds(64, 137, 127, 20);
		frame.getContentPane().add(lblHourPerDay);
		
		Day_hour = new JTextField();
		lblHourPerDay.setLabelFor(Day_hour);
		Day_hour.setBounds(210, 134, 120, 26);
		frame.getContentPane().add(Day_hour);
		Day_hour.setColumns(10);
		
		JLabel lblNumberOfDays = new JLabel("Number of days worked:");
		lblNumberOfDays.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumberOfDays.setBounds(15, 173, 176, 20);
		frame.getContentPane().add(lblNumberOfDays);
		
		daysNO = new JTextField();
		lblNumberOfDays.setLabelFor(daysNO);
		daysNO.setBounds(210, 170, 120, 26);
		frame.getContentPane().add(daysNO);
		daysNO.setColumns(10);
		
		JLabel lblGrossSalary = new JLabel("GROSS SALARY:");
		lblGrossSalary.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblGrossSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGrossSalary.setBounds(15, 220, 176, 36);
		frame.getContentPane().add(lblGrossSalary);
		
		gross2 = new JTextField();
		lblGrossSalary.setLabelFor(gross2);
		gross2.setEditable(false);
		gross2.setBounds(210, 227, 120, 26);
		frame.getContentPane().add(gross2);
		gross2.setColumns(10);
		
		JLabel deductOfSalary = new JLabel("DEDUCTION OF SALARY:");
		deductOfSalary.setForeground(new Color(139, 0, 0));
		deductOfSalary.setFont(new Font("Tahoma", Font.BOLD, 17));
		deductOfSalary.setBounds(386, 65, 217, 20);
		frame.getContentPane().add(deductOfSalary);
		
		JLabel lblTaxOf = new JLabel("TAX  15% of Monthly Wage");
		lblTaxOf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTaxOf.setBounds(369, 101, 206, 20);
		frame.getContentPane().add(lblTaxOf);
		
		ushuru = new JTextField();
		lblTaxOf.setLabelFor(ushuru);
		ushuru.setEditable(false);
		ushuru.setBounds(590, 98, 146, 26);
		frame.getContentPane().add(ushuru);
		ushuru.setColumns(10);
		
		phLevel = new JTextField();
		phLevel.setEditable(false);
		phLevel.setBounds(590, 134, 146, 26);
		frame.getContentPane().add(phLevel);
		phLevel.setColumns(10);
		
		triple_S = new JTextField();
		triple_S.setEditable(false);
		triple_S.setBounds(590, 170, 146, 26);
		frame.getContentPane().add(triple_S);
		triple_S.setColumns(10);
		
		deductions = new JTextField();
		deductions.setEditable(false);
		deductions.setBounds(590, 227, 146, 26);
		frame.getContentPane().add(deductions);
		deductions.setColumns(10);
		
		JLabel lblTotalDeduction = new JLabel("TOTAL DEDUCTION :");
		lblTotalDeduction.setLabelFor(deductions);
		lblTotalDeduction.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTotalDeduction.setBounds(369, 230, 220, 20);
		frame.getContentPane().add(lblTotalDeduction);
		
		grossSalary = new JLabel("Gross Salary :");
		grossSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		grossSalary.setBounds(786, 81, 99, 20);
		frame.getContentPane().add(grossSalary);
		
		gross2_1 = new JTextField();
		grossSalary.setLabelFor(gross2_1);
		gross2_1.setEditable(false);
		gross2_1.setBounds(913, 78, 123, 26);
		frame.getContentPane().add(gross2_1);
		gross2_1.setColumns(10);
		
		deduct = new JLabel("Deduction :");
		deduct.setHorizontalAlignment(SwingConstants.RIGHT);
		deduct.setBounds(786, 117, 99, 20);
		frame.getContentPane().add(deduct);
		
		deductAll = new JTextField();
		deduct.setLabelFor(deductAll);
		deductAll.setEditable(false);
		deductAll.setBounds(913, 114, 123, 26);
		frame.getContentPane().add(deductAll);
		deductAll.setColumns(10);
		
		netSalary = new JLabel("NET SALARY :");
		netSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		netSalary.setFont(new Font("Tahoma", Font.BOLD, 21));
		netSalary.setBounds(751, 230, 159, 20);
		frame.getContentPane().add(netSalary);
		
		netSalary12 = new JTextField();
		netSalary.setLabelFor(netSalary12);
		netSalary12.setEditable(false);
		netSalary12.setBounds(913, 227, 123, 26);
		frame.getContentPane().add(netSalary12);
		netSalary12.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				int ratePerHour = Integer.valueOf(rate.getText());
				int hourPerDay = Integer.valueOf(Day_hour.getText());
				int numberOfDaysWorked = Integer.valueOf(daysNO.getText());
				int grossSalary = ratePerHour*hourPerDay*numberOfDaysWorked;
				double tax = grossSalary * 0.15;
				double philHealth = grossSalary*0.05;
				double sss = grossSalary*0.02;
				double deduction = tax + philHealth + sss;
				double netSalary = grossSalary - deduction;
				ushuru.setText(String.valueOf((int)tax));
				phLevel.setText(String.valueOf((int)philHealth));
				triple_S.setText(String.valueOf((int)sss));
				gross2.setText(String.valueOf(grossSalary));
				gross2_1.setText(String.valueOf(grossSalary));
				deductAll.setText(String.valueOf((int)deduction));
				deductions.setText(String.valueOf((int)deduction));
				netSalary12.setText(String.valueOf((int)netSalary));
			}
		});
		btnCompute.setBackground(new Color(47, 79, 79));
		btnCompute.setForeground(new Color(255, 255, 255));
		btnCompute.setBounds(422, 271, 193, 41);
		frame.getContentPane().add(btnCompute);
		
		pH = new JLabel("Philhealth 5%");
		pH.setLabelFor(phLevel);
		pH.setHorizontalAlignment(SwingConstants.RIGHT);
		pH.setBounds(476, 137, 99, 20);
		frame.getContentPane().add(pH);
		
		sSS = new JLabel("SSS 2%");
		sSS.setLabelFor(triple_S);
		sSS.setHorizontalAlignment(SwingConstants.RIGHT);
		sSS.setBounds(506, 173, 69, 20);
		frame.getContentPane().add(sSS);
	}
}
