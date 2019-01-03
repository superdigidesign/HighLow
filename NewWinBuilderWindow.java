import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.TextArea;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JList;
import java.awt.Canvas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.UIManager;

public class NewWinBuilderWindow {

	private JFrame frame;
	private JTextField txtGuessingGame;
	private JTextField txtEnterANumber;
	private JTextField textField_1;
	private JTextField txtPlayAgain;
	private JTextField txtYourComputerWill;
	private JTextField txtPlayAgain_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewWinBuilderWindow window = new NewWinBuilderWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewWinBuilderWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 99, 71));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(frame.getContentPane(), popupMenu);
		
		txtPlayAgain_1 = new JTextField();
		txtPlayAgain_1.setText("Play again?");
		popupMenu.add(txtPlayAgain_1);
		txtPlayAgain_1.setColumns(10);
		frame.getContentPane().setLayout(null);
		
		txtGuessingGame = new JTextField();
		txtGuessingGame.setBounds(145, 11, 136, 23);
		txtGuessingGame.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuessingGame.setBackground(Color.LIGHT_GRAY);
		txtGuessingGame.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtGuessingGame.setText("Guessing Game");
		frame.getContentPane().add(txtGuessingGame);
		txtGuessingGame.setColumns(10);
		
		txtEnterANumber = new JTextField();
		txtEnterANumber.setBackground(Color.LIGHT_GRAY);
		txtEnterANumber.setText("Enter a number between -100 and 1000:");
		txtEnterANumber.setBounds(42, 102, 239, 20);
		frame.getContentPane().add(txtEnterANumber);
		txtEnterANumber.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(290, 102, 58, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnClickToSee = new JButton("Click to see if you guessed correctly");
		btnClickToSee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClickToSee.setBounds(116, 152, 232, 37);
		frame.getContentPane().add(btnClickToSee);
		
		txtPlayAgain = new JTextField();
		txtPlayAgain.setBackground(UIManager.getColor("CheckBox.background"));
		txtPlayAgain.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlayAgain.setText("Play again?");
		txtPlayAgain.setBounds(176, 230, 86, 20);
		frame.getContentPane().add(txtPlayAgain);
		txtPlayAgain.setColumns(10);
		
		txtYourComputerWill = new JTextField();
		txtYourComputerWill.setBackground(Color.LIGHT_GRAY);
		txtYourComputerWill.setHorizontalAlignment(SwingConstants.CENTER);
		txtYourComputerWill.setText("Your computer will generate a random number, can you guess it?");
		txtYourComputerWill.setBounds(43, 56, 365, 20);
		frame.getContentPane().add(txtYourComputerWill);
		txtYourComputerWill.setColumns(10);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
