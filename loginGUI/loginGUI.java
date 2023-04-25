import java.net.URL;
import java.awt.*;
import javax.swing.*;
import java.net.MalformedURLException;
import java.awt.Desktop;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;




public class loginGUI implements ActionListener {
	
	boolean darkMode = false;
	private static JPanel panel;
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JLabel failure;
	private static JButton dModeToggle;
	private static JButton LModeToggle;
	private static JFrame frame;
	private static JPanel rickpanel;
	private static JFrame rickframel;
	
	public static void main (String[] args) {
		
		panel = new JPanel();
		panel.setBackground(Color.white);
		JFrame frame = new JFrame();
		frame.setSize(550,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		JLabel userLabel = new JLabel("User");
		userLabel.setForeground(Color.GRAY);
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(Color.GRAY);
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(140, 80, 80, 25);
		button.addActionListener(new loginGUI());
		panel.add(button);
		
		dModeToggle = new JButton("Toggle Dark Mode");
		dModeToggle.setBounds(300, 50, 165, 25);
		dModeToggle.addActionListener(new loginGUI());
		panel.add(dModeToggle);
		
		LModeToggle = new JButton("Toggle Light Mode");
		LModeToggle.setBounds(300, 20, 165, 25);
		LModeToggle.addActionListener(new loginGUI());
		panel.add(LModeToggle);
		
		success = new JLabel("");
		success.setForeground(Color.GRAY);
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		failure = new JLabel("");
		failure.setForeground(Color.GRAY);
		failure.setBounds(10,110,300,25);
		panel.add(failure);
		
		frame.setVisible(true);
	}
	@Override
		public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
        // login button was clicked
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);
		
        if(user.equals("testUser") && password.equals("password")){
            success.setText("Successfully logged in!");
			
             try {
        String yUrl = "https://newskit.social/blog/posts/homepageindex";
        URL myURL = new URL(yUrl);
        openWebpage(myURL);
    } catch (MalformedURLException f) {
        f.printStackTrace();
    }
    rickpanel = new JPanel();
    if(darkMode = false){
		rickpanel.setBackground(Color.white);
	}
	else if (darkMode = true) {
		rickpanel.setBackground(Color.black);
		}
		JFrame rickframe = new JFrame();
		rickframe.setSize(550,400);
		rickframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rickframe.add(rickpanel);
		
		rickpanel.setLayout(null);
		JLabel rickLabel = new JLabel("bro got rickrolled in 2023 :skull:");
		rickLabel.setForeground(Color.GRAY);
		rickLabel.setBounds(10, 20, 300, 100);
		rickpanel.add(rickLabel);
		
		rickframe.setVisible(true);
    
        }
        else {
            failure.setText("Incorrect username or password");
        }
    }
    else if (e.getSource() == dModeToggle) {
        // dark mode toggle button was clicked
        actionPerformed2(e);
        darkMode = true;
  
    }
     else if (e.getSource() == LModeToggle) {
        // light mode toggle button was clicked
        actionPerformed3(e);
        darkMode = false;
}

			
		}
		
		
	public void actionPerformed2(ActionEvent arg0) {
		if(arg0.getSource() == dModeToggle) {
			
			panel.setBackground(Color.black);
			darkMode = true;
			}
		
		}
		public void actionPerformed3(ActionEvent arg0) {
		if(arg0.getSource() == LModeToggle) {
			
			panel.setBackground(Color.white);
			darkMode = false;
			}
		
	}
	public static boolean openWebpage(URI uri) {
    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
        try {
            desktop.browse(uri);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    return false;
}

public static boolean openWebpage(URL url) {
    try {
        return openWebpage(url.toURI());
    } catch (URISyntaxException e) {
        e.printStackTrace();
    }
    return false;
}
}		


