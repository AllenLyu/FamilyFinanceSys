import java.io.FileNotFoundException;

import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQItem;
import javax.xml.xquery.XQPreparedExpression;
import javax.xml.xquery.XQResultSequence;

import net.sf.saxon.xqj.SaxonXQDataSource;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/*
 * Main.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class Main extends javax.swing.JFrame {

	/** Creates new form Main */
	public Main() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		timeText = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		showAllDataButton = new javax.swing.JButton();
		addDataButton = new javax.swing.JButton();
		deleteDataButton = new javax.swing.JButton();
		fixDataButton = new javax.swing.JButton();
		compareButton = new javax.swing.JButton();
		exitButton = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		serchType = new javax.swing.JComboBox();
		jLabel4 = new javax.swing.JLabel();
		keyWord = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jComboBox3 = new javax.swing.JComboBox();
		serchButton = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		extUsrButton = new javax.swing.JButton();
		extUsrDataButton = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel6 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		incomeText = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		outcomeText = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		lastMoney = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel1.setText("\u65f6\u95f4\uff1a");

		timeText.setText("2015\u5e744\u670829\u65e5 ");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addGroup(
						jPanel1Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										jPanel1Layout.createSequentialGroup()
												.addGap(77, 77, 77)
												.addComponent(jLabel1))
								.addGroup(
										jPanel1Layout.createSequentialGroup()
												.addGap(47, 47, 47)
												.addComponent(timeText)))
						.addContainerGap(89, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(timeText)
										.addContainerGap(44, Short.MAX_VALUE)));

		jPanel2.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		showAllDataButton.setText("\u663e\u793a\u5168\u90e8\u6570\u636e");
		showAllDataButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						showAllDataButtonActionPerformed(evt);
					}
				});

		addDataButton.setText("\u6dfb\u52a0");

		deleteDataButton.setText("\u5220\u9664");

		fixDataButton.setText("\u4fee\u6539\u6a21\u5f0f");

		compareButton.setText("\u5bf9\u6bd4");

		exitButton.setText("\u9000\u51fa\u7cfb\u7edf");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addGap(22, 22, 22)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																showAllDataButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																182,
																Short.MAX_VALUE)
														.addComponent(
																addDataButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																182,
																Short.MAX_VALUE)
														.addComponent(
																deleteDataButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																182,
																Short.MAX_VALUE)
														.addComponent(
																fixDataButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																182,
																Short.MAX_VALUE)
														.addComponent(
																compareButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																182,
																Short.MAX_VALUE)
														.addComponent(
																exitButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																182,
																Short.MAX_VALUE))
										.addGap(21, 21, 21)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(37, 37, 37)
										.addComponent(showAllDataButton)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												57, Short.MAX_VALUE)
										.addComponent(addDataButton).addGap(49,
												49, 49).addComponent(
												deleteDataButton).addGap(47,
												47, 47).addComponent(
												fixDataButton).addGap(48, 48,
												48).addComponent(compareButton)
										.addGap(45, 45, 45).addComponent(
												exitButton).addGap(66, 66, 66)));

		jPanel3.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel3.setText("\u641c\u7d22\u7c7b\u578b\uff1a");

		serchType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"无", "Item 2", "Item 3", "Item 4" }));

		jLabel4.setText("\u5173\u952e\u5b57\uff1a");

		jLabel5.setText("\u6536\u652f\u7c7b\u578b\uff1a");

		jLabel6.setText("\u7c7b\u578b\uff1a");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Item 1", "Item 2", "Item 3", "Item 4" }));

		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"收入", "支出" }));

		serchButton.setText("\u641c\u7d22");
		serchButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				serchButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				serchType,
																				0,
																				165,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				keyWord,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				164,
																				Short.MAX_VALUE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												12,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel6)
														.addComponent(jLabel5))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jComboBox3,
																0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jComboBox2, 0,
																205,
																Short.MAX_VALUE))
										.addGap(35, 35, 35).addComponent(
												serchButton).addGap(59, 59, 59)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jComboBox2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5)
														.addComponent(
																serchType,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																keyWord,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jComboBox3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6)
														.addComponent(
																serchButton))
										.addContainerGap(24, Short.MAX_VALUE)));

		jPanel4.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		extUsrButton.setText("\u5bfc\u51fa\u7528\u6237");

		extUsrDataButton.setText("\u5bfc\u51fa\u6570\u636e");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addContainerGap()
						.addComponent(extUsrButton).addContainerGap(
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel4Layout.createSequentialGroup().addContainerGap(12,
						Short.MAX_VALUE).addComponent(extUsrDataButton)
						.addContainerGap()));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(extUsrButton)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												22, Short.MAX_VALUE)
										.addComponent(extUsrDataButton)
										.addContainerGap()));

		jPanel5.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801,
				Short.MAX_VALUE));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444,
				Short.MAX_VALUE));

		jPanel6.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel7.setText("\u6536\u5165\uff1a");

		incomeText.setText("xxxxx");

		jLabel9.setText("\u652f\u51fa\uff1a");

		outcomeText.setText("xxxxxx");

		jLabel11.setText("\u5269\u4f59\u91d1\u989d\uff1a");

		lastMoney.setText("xxxxx");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel7)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(incomeText)
										.addGap(212, 212, 212)
										.addComponent(jLabel9)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(outcomeText)
										.addGap(174, 174, 174)
										.addComponent(jLabel11)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(lastMoney)
										.addContainerGap(154, Short.MAX_VALUE)));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																incomeText)
														.addComponent(jLabel9)
														.addComponent(
																outcomeText)
														.addComponent(jLabel11)
														.addComponent(lastMoney))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

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
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																jPanel2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel1,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel3,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jPanel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jPanel5,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				jPanel3,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jPanel1,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel4,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
										.addGap(9, 9, 9)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jPanel6,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addComponent(
																jPanel2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	//mainframe 显示全部数据监听
	private void showAllDataButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String usr="allen";
		String content = "";  
        XQItem xqItem = null;  
        XQDataSource ds = new SaxonXQDataSource();  
        try {  
            XQConnection conn = ds.getConnection();  
            XQPreparedExpression exp = conn  
                    .prepareExpression("for $Finance in doc("+usr+".xml)/Finance return $Finance/number");
            XQResultSequence result = exp.executeQuery();
            while (result.next()) {
                xqItem = result.getItem();
                content +=xqItem.getItemAsString(null);
             }
            System.out.println(content);
        } catch (XQException e) {  
            // TODO: handle exception  
            e.printStackTrace();  
        }
	}

	//mainframe 查询功能监听
	private void serchButtonActionPerformed(java.awt.event.ActionEvent evt) {
			
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton addDataButton;
	private javax.swing.JButton compareButton;
	private javax.swing.JButton deleteDataButton;
	private javax.swing.JButton exitButton;
	private javax.swing.JButton extUsrButton;
	private javax.swing.JButton extUsrDataButton;
	private javax.swing.JButton fixDataButton;
	private javax.swing.JLabel incomeText;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JComboBox jComboBox3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField keyWord;
	private javax.swing.JLabel lastMoney;
	private javax.swing.JLabel outcomeText;
	private javax.swing.JButton serchButton;
	private javax.swing.JComboBox serchType;
	private javax.swing.JButton showAllDataButton;
	private javax.swing.JLabel timeText;
	// End of variables declaration//GEN-END:variables

}