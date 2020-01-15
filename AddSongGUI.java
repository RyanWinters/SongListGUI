import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AddSongGUI {

	private JFrame frmAddSong;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSongGUI window = new AddSongGUI();
					window.frmAddSong.setVisible(true);
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
	public AddSongGUI() throws ClassNotFoundException, IOException {
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
		frmAddSong = new JFrame();
		frmAddSong.setTitle("Add Song");
		frmAddSong.setBounds(100, 100, 450, 300);
		frmAddSong.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{37, 160, 227, 0};
		gridBagLayout.rowHeights = new int[]{20, 20, 20, 20, 20, 65, 23, 14, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmAddSong.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblArtist = new JLabel("Artist:");
		GridBagConstraints gbc_lblArtist = new GridBagConstraints();
		gbc_lblArtist.anchor = GridBagConstraints.EAST;
		gbc_lblArtist.insets = new Insets(0, 0, 5, 5);
		gbc_lblArtist.gridx = 0;
		gbc_lblArtist.gridy = 0;
		frmAddSong.getContentPane().add(lblArtist, gbc_lblArtist);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 2;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		frmAddSong.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title:");
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.anchor = GridBagConstraints.EAST;
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 0;
		gbc_lblTitle.gridy = 1;
		frmAddSong.getContentPane().add(lblTitle, gbc_lblTitle);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		frmAddSong.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLength = new JLabel("Length:");
		GridBagConstraints gbc_lblLength = new GridBagConstraints();
		gbc_lblLength.anchor = GridBagConstraints.WEST;
		gbc_lblLength.insets = new Insets(0, 0, 5, 5);
		gbc_lblLength.gridx = 0;
		gbc_lblLength.gridy = 2;
		frmAddSong.getContentPane().add(lblLength, gbc_lblLength);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		frmAddSong.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frmAddSong.dispose();
			}
		});
		
		JLabel lblGenre = new JLabel("Genre:");
		GridBagConstraints gbc_lblGenre = new GridBagConstraints();
		gbc_lblGenre.anchor = GridBagConstraints.EAST;
		gbc_lblGenre.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenre.gridx = 0;
		gbc_lblGenre.gridy = 3;
		frmAddSong.getContentPane().add(lblGenre, gbc_lblGenre);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		frmAddSong.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblRating = new JLabel("Rating:");
		GridBagConstraints gbc_lblRating = new GridBagConstraints();
		gbc_lblRating.anchor = GridBagConstraints.EAST;
		gbc_lblRating.insets = new Insets(0, 0, 5, 5);
		gbc_lblRating.gridx = 0;
		gbc_lblRating.gridy = 4;
		frmAddSong.getContentPane().add(lblRating, gbc_lblRating);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		frmAddSong.getContentPane().add(comboBox, gbc_comboBox);
		
		JLabel lblSongAddedSuccessfully = new JLabel("Song Added Successfully!");
		GridBagConstraints gbc_lblSongAddedSuccessfully = new GridBagConstraints();
		gbc_lblSongAddedSuccessfully.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblSongAddedSuccessfully.gridwidth = 3;
		gbc_lblSongAddedSuccessfully.gridx = 0;
		gbc_lblSongAddedSuccessfully.gridy = 7;
		frmAddSong.getContentPane().add(lblSongAddedSuccessfully, gbc_lblSongAddedSuccessfully);
		lblSongAddedSuccessfully.setVisible(false);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblSongAddedSuccessfully.setVisible(true);
				final String artist = textField.getText();
				final String title = textField_1.getText();
				final String length = textField_2.getText();
				final String genre = textField_3.getText();
				final int rating = Integer.parseInt((String)comboBox.getSelectedItem());
				songList.addSong(new Song(artist, title, length, genre, rating));
				try {
					songList.saveExit();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.anchor = GridBagConstraints.NORTH;
		gbc_btnAdd.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAdd.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdd.gridwidth = 2;
		gbc_btnAdd.gridx = 0;
		gbc_btnAdd.gridy = 6;
		frmAddSong.getContentPane().add(btnAdd, gbc_btnAdd);
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.anchor = GridBagConstraints.NORTH;
		gbc_btnCancel.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancel.insets = new Insets(0, 0, 5, 0);
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 6;
		frmAddSong.getContentPane().add(btnCancel, gbc_btnCancel);
	}
}
