import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class View772 extends JFrame implements Observer {

	Model772 m;
	Controller772 c;

	JPanel pan = new JPanel();

	JPanel tf1pan = new JPanel();
	JTextField tf1 = new JTextField(" tf1 ", 10);

	JPanel tf2pan = new JPanel();
	JTextField tf2 = new JTextField(" tf2 ", 10);

	JPanel l1pan = new JPanel();
	JLabel l1 = new JLabel(" l1 ");

	JPanel b1pan = new JPanel();
	JButton b1 = new JButton(" b1 ");

	JPanel b2pan = new JPanel();
	JButton b2 = new JButton(" b2 ");

	JPanel b3pan = new JPanel();
	JButton b3 = new JButton(" b3 ");

	String printV = "printf";
	
	View772(Model772 m, Controller772 c) {
		super("77 Mvc Observer Rdm Num 2");
		this.m = m;
		this.c = c;
		
		m.registerObserver(this);
		buildGUI();
	}

	private void buildGUI() {
		
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pan.setLayout(new GridLayout(2, 3));

		tf1pan.setLayout(new FlowLayout());
		pan.add(tf1pan);
		tf1pan.add(tf1);

		tf2pan.setLayout(new FlowLayout());
		pan.add(tf2pan);
		tf2pan.add(tf2);		

		l1pan.setLayout(new FlowLayout());
		pan.add(l1pan);
		l1pan.add(l1);

		b1pan.setLayout(new FlowLayout());
		pan.add(b1pan);
		b1pan.add(b1);

		b2pan.setLayout(new FlowLayout());
		pan.add(b2pan);
		b2pan.add(b2);

		b3pan.setLayout(new FlowLayout());
		pan.add(b3pan);
		b3pan.add(b3);

		l1.setText(String.format("hello %s", printV));
		//System.out.printf("hello %s", printV);

		registerListener();

		this.setContentPane(pan);
		this.setVisible(true);		
	}

	private void registerListener() {
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c.createRdmNum();
			}});
	}

	@Override
	public void update() {
		l1.setText(Integer.toString(m.getRdmNum()));
	}
}
