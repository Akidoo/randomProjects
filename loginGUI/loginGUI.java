import java.net.URL;
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
	
	String[] cmd = {"bash","-c","google-chrome https://newskit.social/blog/posts/homepageindex"};
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	public static void main (String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(140, 80, 80, 25);
		button.addActionListener(new loginGUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + ", " + password);
		
		if(user.equals("testUser") && password.equals("password")){
			success.setText("Successfully logged in!");
			//URL link = new URL("https://newskit.social/blog/posts/homepageindex");
			
			//Desktop desk = Desktop.getDesktop();
			//desk.browse(link.toURI());
			}
			//URI uri = URI.create("https://newskit.social/blog/posts/homepageindex");
			 //java.awt.Desktop.getDesktop().browse(uri);
			//String myUrl = "https://newskit.social/blog/posts/homepageindex";
			//Runtime rt = Runtime.getRuntime();
			//String url = "https://newskit.social/blog/posts/homepageindex";
			//try {
				//rt.exec("runso url.so,FileProtocolHandler " + url);
			//}
			//catch (IOException f) {
				//f.printStackTrace();
			//}
			
			
			
		}
}

