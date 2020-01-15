import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateSongInfoGUI {

	private JFrame frmUpdateSongInfo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void NewScreen3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateSongInfoGUI window = new UpdateSongInfoGUI();
					window.frmUpdateSongInfo.setVisible(true);
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
	public UpdateSongInfoGUI() throws ClassNotFoundException, IOException {
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
		frmUpdateSongInfo = new JFrame();
		frmUpdateSongInfo.setTitle("Update Song Info");
		frmUpdateSongInfo.setBounds(100, 100, 450, 300);
		frmUpdateSongInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{112, 317, 0};
		gridBagLayout.rowHeights = new int[]{20, 23, 23, 23, 23, 23, 23, 14, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmUpdateSongInfo.getContentPane().setLayout(gridBagLayout);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 5;
		frmUpdateSongInfo.getContentPane().add(comboBox_1, gbc_comboBox_1);
		
		
		JRadioButton rdbtnChangeRating = new JRadioButton("Change Rating");
		
		rdbtnChangeRating.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	 if (comboBox_1.isEnabled() == false)
		            {
	        		 comboBox_1.setEnabled(true);
		            }
	        	 else if (comboBox_1.isEnabled() == true)
	            {
	        		 comboBox_1.setEnabled(false);
	            }

	        }
	    });
		
		JLabel lblWhichSongTo = new JLabel("Update Song:");
		GridBagConstraints gbc_lblWhichSongTo = new GridBagConstraints();
		gbc_lblWhichSongTo.insets = new Insets(0, 0, 5, 5);
		gbc_lblWhichSongTo.gridx = 0;
		gbc_lblWhichSongTo.gridy = 0;
		frmUpdateSongInfo.getContentPane().add(lblWhichSongTo, gbc_lblWhichSongTo);
		
		int i = 1;
		ArrayList<String> str = new ArrayList<String>();
		for (Song song : songList.songList)
		{
			str.add(Integer.toString(i));
			i++;
		}
		String[] arr = new String[str.size()];
		arr = str.toArray(arr);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(arr));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		frmUpdateSongInfo.getContentPane().add(comboBox, gbc_comboBox);
		
		JRadioButton rdbtnChangeArtist = new JRadioButton("Change Artist");
		rdbtnChangeArtist.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	 if (textField.isEnabled() == false)
			            {
			            	textField.setEnabled(true);
			            }
		        	 else if (textField.isEnabled() == true)
		            {
		            	textField.setEnabled(false);
		            }

		        }
		    });
		GridBagConstraints gbc_rdbtnChangeArtist = new GridBagConstraints();
		gbc_rdbtnChangeArtist.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnChangeArtist.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnChangeArtist.gridx = 0;
		gbc_rdbtnChangeArtist.gridy = 1;
		frmUpdateSongInfo.getContentPane().add(rdbtnChangeArtist, gbc_rdbtnChangeArtist);
		
		textField = new JTextField();
		textField.setEnabled(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		frmUpdateSongInfo.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnChangeTitle = new JRadioButton("Change Title");
		rdbtnChangeTitle.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	 if (textField_1.isEnabled() == false)
		            {
	        		 textField_1.setEnabled(true);
		            }
	        	 else if (textField_1.isEnabled() == true)
	            {
	        		 textField_1.setEnabled(false);
	            }

	        }
	    });
		GridBagConstraints gbc_rdbtnChangeTitle = new GridBagConstraints();
		gbc_rdbtnChangeTitle.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnChangeTitle.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnChangeTitle.gridx = 0;
		gbc_rdbtnChangeTitle.gridy = 2;
		frmUpdateSongInfo.getContentPane().add(rdbtnChangeTitle, gbc_rdbtnChangeTitle);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		frmUpdateSongInfo.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnChangeLength = new JRadioButton("Change Length");
		
		rdbtnChangeLength.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	 if (textField_2.isEnabled() == false)
		            {
	        		 textField_2.setEnabled(true);
		            }
	        	 else if (textField_2.isEnabled() == true)
	            {
	        		 textField_2.setEnabled(false);
	            }

	        }
	    });
		GridBagConstraints gbc_rdbtnChangeLength = new GridBagConstraints();
		gbc_rdbtnChangeLength.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnChangeLength.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnChangeLength.gridx = 0;
		gbc_rdbtnChangeLength.gridy = 3;
		frmUpdateSongInfo.getContentPane().add(rdbtnChangeLength, gbc_rdbtnChangeLength);
		
		JRadioButton rdbtnChangeGenre = new JRadioButton("Change Genre");
		
		rdbtnChangeGenre.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	 if (textField_3.isEnabled() == false)
		            {
	        		 textField_3.setEnabled(true);
		            }
	        	 else if (textField_3.isEnabled() == true)
	            {
	        		 textField_3.setEnabled(false);
	            }

	        }
	    });
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		frmUpdateSongInfo.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		GridBagConstraints gbc_rdbtnChangeGenre = new GridBagConstraints();
		gbc_rdbtnChangeGenre.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnChangeGenre.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnChangeGenre.gridx = 0;
		gbc_rdbtnChangeGenre.gridy = 4;
		frmUpdateSongInfo.getContentPane().add(rdbtnChangeGenre, gbc_rdbtnChangeGenre);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		frmUpdateSongInfo.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		GridBagConstraints gbc_rdbtnChangeRating = new GridBagConstraints();
		gbc_rdbtnChangeRating.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnChangeRating.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnChangeRating.gridx = 0;
		gbc_rdbtnChangeRating.gridy = 5;
		frmUpdateSongInfo.getContentPane().add(rdbtnChangeRating, gbc_rdbtnChangeRating);
		
		JButton btnChange = new JButton("Cancel");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUpdateSongInfo.dispose();
			}
		});
		
		JLabel lblSuccessfullyChangedSong = new JLabel("Successfully Changed Song Info!");
		GridBagConstraints gbc_lblSuccessfullyChangedSong = new GridBagConstraints();
		gbc_lblSuccessfullyChangedSong.anchor = GridBagConstraints.NORTH;
		gbc_lblSuccessfullyChangedSong.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSuccessfullyChangedSong.gridwidth = 2;
		gbc_lblSuccessfullyChangedSong.gridx = 0;
		gbc_lblSuccessfullyChangedSong.gridy = 7;
		frmUpdateSongInfo.getContentPane().add(lblSuccessfullyChangedSong, gbc_lblSuccessfullyChangedSong);
		lblSuccessfullyChangedSong.setVisible(false);
		JButton btnCancel = new JButton("Change");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSuccessfullyChangedSong.setVisible(true);
				int index = Integer.parseInt((String)comboBox.getSelectedItem());
				if (rdbtnChangeArtist.isSelected())
				{
					songList.retrieve(index-1).changeArtist(textField.getText());
				}
				if (rdbtnChangeTitle.isSelected())
				{
					songList.retrieve(index-1).changeTitle(textField_1.getText());
				}
				if (rdbtnChangeLength.isSelected())
				{
					songList.retrieve(index-1).changeLength(textField_2.getText());
				}
				if (rdbtnChangeGenre.isSelected())
				{
					songList.retrieve(index-1).changeGenre(textField_3.getText());
				}
				if (rdbtnChangeRating.isSelected())
				{
					songList.retrieve(index-1).changeRating(Integer.parseInt((String)comboBox_1.getSelectedItem()));
				}
				try {
					songList.saveExit();
				} catch (IOException x) {
					// TODO Auto-generated catch block
					x.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.anchor = GridBagConstraints.NORTH;
		gbc_btnCancel.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 0;
		gbc_btnCancel.gridy = 6;
		frmUpdateSongInfo.getContentPane().add(btnCancel, gbc_btnCancel);
		GridBagConstraints gbc_btnChange = new GridBagConstraints();
		gbc_btnChange.anchor = GridBagConstraints.NORTH;
		gbc_btnChange.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnChange.insets = new Insets(0, 0, 5, 0);
		gbc_btnChange.gridx = 1;
		gbc_btnChange.gridy = 6;
		frmUpdateSongInfo.getContentPane().add(btnChange, gbc_btnChange);;
	}

}
