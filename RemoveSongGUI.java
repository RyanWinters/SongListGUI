import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoveSongGUI {

	private JFrame frmRemoveSong;

	/**
	 * Launch the application.
	 */
	public static void NewScreen3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveSongGUI window = new RemoveSongGUI();
					window.frmRemoveSong.setVisible(true);
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
	public RemoveSongGUI() throws ClassNotFoundException, IOException {
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
		frmRemoveSong = new JFrame();
		frmRemoveSong.setTitle("Remove Song");
		frmRemoveSong.setBounds(100, 100, 450, 300);
		frmRemoveSong.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{112, 94, 213, 0};
		gridBagLayout.rowHeights = new int[]{20, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		frmRemoveSong.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblWhichSongTo = new JLabel("Remove Song:");
		GridBagConstraints gbc_lblWhichSongTo = new GridBagConstraints();
		gbc_lblWhichSongTo.insets = new Insets(0, 0, 5, 5);
		gbc_lblWhichSongTo.gridx = 0;
		gbc_lblWhichSongTo.gridy = 0;
		frmRemoveSong.getContentPane().add(lblWhichSongTo, gbc_lblWhichSongTo);
		
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
		comboBox.setMaximumRowCount(8);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 0;
		frmRemoveSong.getContentPane().add(comboBox, gbc_comboBox);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRemoveSong.dispose();
			}
		});
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final int index = Integer.parseInt((String)comboBox.getSelectedItem());
				songList.removeSong(index - 1);
				try {
					songList.saveExit();
				} catch (IOException x) {
					// TODO Auto-generated catch block
					x.printStackTrace();
				}
				frmRemoveSong.dispose();
			}
		});
		GridBagConstraints gbc_btnRemove = new GridBagConstraints();
		gbc_btnRemove.anchor = GridBagConstraints.NORTH;
		gbc_btnRemove.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRemove.insets = new Insets(0, 0, 0, 5);
		gbc_btnRemove.gridwidth = 2;
		gbc_btnRemove.gridx = 0;
		gbc_btnRemove.gridy = 1;
		frmRemoveSong.getContentPane().add(btnRemove, gbc_btnRemove);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 1;
		frmRemoveSong.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}

}
