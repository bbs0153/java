package hw;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EmpDB extends JFrame {

	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;

	EmpVO ev;
	EmpDAO dao;

	public EmpDB() {

		dao = new EmpDAO();
		ev = new EmpVO();

		colNames = new Vector<String>();

		colNames.add("사원번호");
		colNames.add("사원이름");
		colNames.add("연봉");
		colNames.add("수당");
		colNames.add("입사일");
		colNames.add("주민번호");
		colNames.add("부서번호");
		colNames.add("직책");
		colNames.add("주소");
		colNames.add("관리자번호");
		colNames.add("이메일");

		rowData = new Vector<Vector<String>>();

		JPanel p1 = new JPanel();

		ButtonGroup bg = new ButtonGroup();
		JRadioButton btn1 = new JRadioButton("인사팀");
		JRadioButton btn2 = new JRadioButton("개발1팀");
		JRadioButton btn3 = new JRadioButton("개발2팀");
		JRadioButton btn4 = new JRadioButton("영업팀");
		JRadioButton btn5 = new JRadioButton("총무부");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				getList(btn1.getText());
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getList(btn2.getText());
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getList(btn3.getText());
			}
		});
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getList(btn4.getText());
			}
		});
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getList(btn5.getText());
			}
		});

		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);

		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3);
		bg.add(btn4);
		bg.add(btn5);

		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p1.add(btn5);

		add(p1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(1000, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void getList(String dname) {

		rowData.clear();

		ArrayList<EmpVO> arr = new ArrayList<EmpVO>();
		arr = dao.selectEmp(dname);

		for (EmpVO ev : arr) {

			Vector<String> v = new Vector<String>();

			v.add(ev.getEno() + "");
			v.add(ev.getEname());
			v.add(ev.getSal() + "");
			v.add(ev.getComm() + "");
			v.add(ev.getHiredate() + "");
			v.add(ev.getJumin());
			v.add(ev.getDno() + "");
			v.add(ev.getPosition());
			v.add(ev.getAddr());
			v.add(ev.getMgr() + "");
			v.add(ev.getEmail());

			rowData.add(v);
		}

		table.updateUI();
	}

	public static void main(String[] args) {

		new EmpDB();
	}

}
