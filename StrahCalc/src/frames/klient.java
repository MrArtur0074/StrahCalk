package frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class klient extends JFrame {
	float k1,k2,k3,k4,k5=(float)1.8,s;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					klient frame = new klient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public klient() {
		String[] items = {
				"<=50 л.с",
			    "От 50 до 70 л.с.",
			    "От 70 до 100 л.с.",
			    "От 100 до 120 л.с.",
			    "От 120 до 150 л.с.",
			    ">150 л.с."
			};
		
		String[] items1 = {
			    "До 22 лет, стаж до 3 лет",
			    "До 22 лет, стаж свыше 3 лет",
			    "Свыше 22 лет, стаж до 3 лет",
			    "Свыше 22 лет, стаж свыше 3 лет"
			};
		String[] items2 = {
			    "Легковой автомобиль",
			    "Мотоцикл",
			    "Грузовой автомобиль (>=16 т.)",
			    "Грузовой автомобиль (<16 т.)",
			    "Автобус (число мест >=20)",
			    "Автобус (число мест <20)"
			};
		String[] items3 = {
			    "Ограниченный список водителей",
			    "Без ограничения"
			};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u041A\u0430\u043B\u044C\u043A\u0443\u043B\u044F\u0442\u043E\u0440 \u041E\u0421\u0410\u0413\u041E");
		label.setBounds(10, 11, 140, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u041C\u043E\u0449\u043D\u043E\u0441\u0442\u044C \u0434\u0432\u0438\u0433\u0430\u0442\u0435\u043B\u044F:");
		label_1.setBounds(10, 36, 140, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0412\u043E\u0437\u0440\u0430\u0441\u0442 \u0438 \u0441\u0442\u0430\u0436 \u0432\u043B\u0430\u0434\u0435\u043B\u044C\u0446\u0430 \u0422\u0421:");
		label_2.setBounds(10, 84, 200, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u0422\u0438\u043F \u0442\u0440\u0430\u043D\u0441\u043F\u043E\u0440\u0442\u043D\u043E\u0433\u043E \u0441\u0440\u0435\u0434\u0441\u0442\u0432\u0430:");
		label_3.setBounds(10, 133, 200, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u0414\u043E\u043F\u0443\u0449\u0435\u043D\u043D\u044B\u0445 \u043A \u0443\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u044E \u0432\u043E\u0434\u0438\u0442\u0435\u043B\u0435\u0439:");
		label_4.setBounds(10, 183, 251, 14);
		contentPane.add(label_4);
		
		JComboBox comboBox = new JComboBox(items);
		comboBox.setBounds(10, 53, 140, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(items1);
		comboBox_1.setBounds(10, 102, 200, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(items2);
		comboBox_2.setBounds(10, 152, 200, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox(items3);
		comboBox_3.setBounds(10, 204, 200, 20);
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel = new JLabel("\u0421\u0442\u043E\u0438\u043C\u043E\u0441\u0442\u044C \u043F\u043E\u043B\u0438\u0441\u0430 \u041E\u0421\u0410\u0413\u041E:");
		lblNewLabel.setBounds(10, 279, 180, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label_5 = new JLabel("0 \u0440\u0443\u0431.");
		label_5.setBounds(170, 279, 112, 14);
		contentPane.add(label_5);
	}
}
