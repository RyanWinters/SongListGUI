import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Decorations;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class ListGUI {

	protected Shell shlSongList;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			ListGUI window = new ListGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public void open() throws ClassNotFoundException, IOException {
		Display display = Display.getDefault();
		createContents();
		shlSongList.open();
		shlSongList.layout();
		while (!shlSongList.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	protected void createContents() throws ClassNotFoundException, IOException {
		SongList songList = new SongList();
		try 
		{
		songList.load();
		}
		catch (FileNotFoundException e) 
		{
		}
		shlSongList = new Shell();
		shlSongList.setSize(450, 300);
		shlSongList.setText("Song List");
		shlSongList.setLayout(null);
		
		Label lblWelcomeToYour = new Label(shlSongList, SWT.NONE);
		lblWelcomeToYour.setBounds(10, 10, 240, 40);
		lblWelcomeToYour.setText("Welcome to Your Song List!");
		
		Button button_5 = new Button(shlSongList, SWT.NONE);
		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ViewList nw;
				try {
					nw = new ViewList();
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ViewList.NewScreen();
			}
		});
		button_5.setText("View Song List");
		button_5.setBounds(10, 56, 104, 25);
		
		Button button = new Button(shlSongList, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AddSongGUI nw;
				try {
					nw = new AddSongGUI();
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				AddSongGUI.NewScreen2();
			}
		});
		button.setText("Add Song");
		button.setBounds(10, 87, 104, 25);
		
		Button button_1 = new Button(shlSongList, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ViewList nw;
				try {
					nw = new ViewList();
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ViewList.NewScreen();
				RemoveSongGUI nw1;
				try {
					nw1 = new RemoveSongGUI();
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				RemoveSongGUI.NewScreen3();
			}
		});
		button_1.setText("Remove Song");
		button_1.setBounds(10, 118, 104, 25);
		
		Button button_2 = new Button(shlSongList, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ViewList nw;
				try {
					nw = new ViewList();
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ViewList.NewScreen();
				UpdateSongInfoGUI nw1;
				try {
					nw1 = new UpdateSongInfoGUI();
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				UpdateSongInfoGUI.NewScreen3();
			}
		});
		button_2.setText("Update Song Info");
		button_2.setBounds(10, 149, 104, 25);
		
		Button button_3 = new Button(shlSongList, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int yesOrNo = JOptionPane.showConfirmDialog(null,"Are you sure you want to clear the Song List?","Clear Song List", JOptionPane.YES_NO_OPTION);
				if (yesOrNo == 0)
				{
					songList.clearList();
					try {
						songList.saveExit();
					} catch (IOException x) {
						// TODO Auto-generated catch block
						x.printStackTrace();
					}
				}
			}
		});
		button_3.setText("Clear Song List");
		button_3.setBounds(10, 180, 104, 25);
		
		Button button_4 = new Button(shlSongList, SWT.NONE);
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlSongList.dispose();
			}
		});
		button_4.setText("Save and Exit");
		button_4.setBounds(10, 211, 104, 25);
		try {
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
