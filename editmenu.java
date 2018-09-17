import javax.swing.*;
import java.awt.event.*;
public class editmenu implements ActionListener 
{
JFrame f;
JMenuBar m;
JMenu file, edit, format, view, help;
JMenuItem cut, copy, paste, SelectAll;
JTextArea a;
editmenu()
{
	f = new JFrame();
	cut = new JMenuItem("Cut");
	copy = new JMenuItem("Copy");
	paste = new JMenuItem("Paste");
	SelectAll = new JMenuItem("Select All");
	cut.addActionListener(this);
	copy.addActionListener(this);
	paste.addActionListener(this);
	SelectAll.addActionListener(this);
	m = new JMenuBar();
	m.setBounds(9, 9, 400, 40);
	file = new JMenu("File");
	edit = new JMenu("Edit");
	format = new JMenu("Format");
	view = new JMenu("View");
	help = new JMenu("Help");
	edit.add(cut);
	edit.add(copy);
	edit.add(paste);
	edit.add(SelectAll);
	m.add(file);
	m.add(edit);
	m.add(format);
	m.add(view);
	m.add(help);
	a = new JTextArea();
	a.setBounds(2, 30, 460, 460);
	f.add(m);
	f.add(a);
	f.setLayout(null);
	f.setSize(500, 500);
	f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==cut)
		a.cut();
	if(e.getSource()==copy)
		a.copy();
	if(e.getSource()==paste)
		a.paste();
	if(e.getSource()==SelectAll)
		a.selectAll();
}
public static void main(String[] args)
{
	new editmenu();
}
}
