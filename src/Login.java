import java.util.List;

import javax.swing.JOptionPane;

import DOM.DOM4User;
import DOM.User;

/*
 * Login.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class Login extends javax.swing.JFrame {

	/** Creates new form Login */
	public Login() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		username = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		loginButton = new javax.swing.JButton();
		registerButton = new javax.swing.JButton();
		password = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("\u7528\u6237\u540d\uff1a");

		jLabel2.setText("\u5bc6\u7801\uff1a");

		loginButton.setText("\u767b\u9646");
		loginButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					loginButtonActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		registerButton.setText("\u6ce8\u518c");
		registerButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				registerButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(63, 63, 63)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				loginButton)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				registerButton))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								jLabel2))
																		.addGap(
																				35,
																				35,
																				35)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								password)
																						.addComponent(
																								username,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								185,
																								Short.MAX_VALUE))))
										.addContainerGap(69, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(70, 70, 70)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																username,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(62, 62, 62)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																password,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												52, Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																loginButton)
														.addComponent(
																registerButton))
										.addGap(47, 47, 47)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		// TODO add your handling code here:
		List<User> list = DOM4User.getUsers("H:/students.xml");
		String name = username.getText();
		String pwd = password.getText().hashCode()+"";
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName()))
			{
				String interPwd = list.get(i).getPwd();
				if(pwd.equalsIgnoreCase(interPwd))
				{
					Main main = new Main();
					main.setVisible(true);
					flag = true;
					break;
				}
			}
		}
		if(!flag)
		{
			JOptionPane.showMessageDialog(null,  "用户名密码错误，从新输入","警告", JOptionPane.PLAIN_MESSAGE);
		}
	}

	private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		register reg = new register();
		reg.setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JButton loginButton;
	private javax.swing.JPasswordField password;
	private javax.swing.JButton registerButton;
	private javax.swing.JTextField username;
	// End of variables declaration//GEN-END:variables

}