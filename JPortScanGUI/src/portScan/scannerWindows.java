package portScan;

import javax.swing.*;
import java.awt.event.*;
import java.net.*;


public class scannerWindows {
	public static void windowsComponents(JPanel panel) {
		panel.setLayout(null);
		
		JLabel domainText=new JLabel("Please insert your ip or address: ");
		domainText.setBounds(70,5,200,20);
		panel.add(domainText);
		
		JTextField ipAddress=new JTextField();
		ipAddress.setBounds(70,40,200,20);
		panel.add(ipAddress);
		
		JButton findPorts=new JButton("Find ports");
		findPorts.setBounds(110,90,100,20);
		panel.add(findPorts);
	    JTextArea output=new JTextArea();
		findPorts.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			Thread parallel=new Thread() {
		         public void run() {
				 for(int i=1;i<=49151;i++) {
					 try {
						 Socket connectSocket=new Socket();
						 connectSocket.connect(new InetSocketAddress(ipAddress.getText(),i),100);
						 connectSocket.close();
						 String port=""+i;
						 output.append("Port "+port+" is open");
						 output.append("\n");
						 
					 }catch(Exception e1) {
						
				 }
			 }
		         }
		         
			
			};
			parallel.start();
			}
		});
		output.setBounds(70,120,200,130);
		panel.add(output);
	}

}
