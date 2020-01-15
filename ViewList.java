import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewList {

	private JFrame frmFhg;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewList window = new ViewList();
					window.frmFhg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public ViewList() throws ClassNotFoundException, IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	private void initialize() throws ClassNotFoundException, IOException {
		SongList songList = new SongList();
		try 
		{
		songList.load();
		}
		catch (FileNotFoundException e) 
		{
		}
		frmFhg = new JFrame();
		frmFhg.setTitle("View Song List");
		frmFhg.setBounds(100, 100, 450, 300);
		frmFhg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFhg.getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea(songList.toString());
		textArea.setBounds(0, 0, 434, 224);
		frmFhg.getContentPane().add(textArea);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frmFhg.dispose();
			}
		});
		btnCancel.setBounds(0, 230, 424, 23);
		frmFhg.getContentPane().add(btnCancel);
	}
}
