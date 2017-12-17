package portScan;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.swing.*;

public class portScannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JFrame frame=new JFrame("JPortScanGUI");
     frame.setSize(350,300);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JPanel panel=new JPanel();
     frame.add(panel);
     scannerWindows pScanner=new scannerWindows();
     pScanner.windowsComponents(panel);
     frame.setVisible(true);
     }

}
