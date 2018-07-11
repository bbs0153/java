package hw2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class EmpFrame extends JFrame {

	// 데이터베이스에 접근하여 일처리(부서목록을 갖고 오는 동작, 부서명에 해당하는 사원의 검색하는 동작)
	// 을 위한 dao를 선언
	EmpDao dao;
	JButton btn;

	// 모든 부서목록을 출력하기 위한 콤보박스
	JComboBox<Vector<String>> combo;
	// 사원목록을 JTable로 나타낼때의 컬럼의 위한 백터
	Vector<String> colNames;
	// 모든 사원목록을 위한 JTable의 데이터를 위한 백터
	Vector<Vector<String>> rowData;
	JTable table;

	public EmpFrame() {
		// dao를 생성한다.
		dao = new EmpDao();

		// dao를 통해 모든 부서목록을 읽어오고 그것을 매개변수로 하여 콤보박스를 생성한다.
		combo = new JComboBox(dao.getDepts());
		JPanel p1 = new JPanel();
		btn = new JButton("검색");

		p1.add(combo);
		p1.add(btn);
		add(p1, BorderLayout.NORTH);

		colNames = new Vector<String>();
		colNames.add("사원번호");
		colNames.add("사원명");
		colNames.add("급여");
		colNames.add("수당");
		colNames.add("입사일");
		colNames.add("주민번호");
		colNames.add("부서번호");
		colNames.add("직급");
		colNames.add("주소");
		colNames.add("관리자번호");
		colNames.add("전자우편");

		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 백터를 지운다
				rowData.clear();

				// 콤보에서 선택한 부서명을 매개변수로 하여
				// dao를 통해 해당부서의 모든 사원목록을
				// ArrayList를 담아온다.
				ArrayList<EmpVo> list = dao.selectAll(combo.getSelectedItem() + "");

				// list에 담긴 만큼 반복수행 하여 JTable에 데이터를 표현하기위한 벡터 rowData에 담는다.
				// EmpVo v : list
				// list에 담긴 사원의 정보를 하나씩 꺼내와서 v에 담는다.
				for (EmpVo v : list) {

					// EmpVo인 v에 담긴것을
					// 벡터에 감기 위한 벡터 객체 ve를 생성한다.
					Vector<String> ve = new Vector<String>();

					ve.add(v.getEno() + "");
					ve.add(v.getEname());
					ve.add(v.getSal() + "");
					ve.add(v.getComm() + "");
					ve.add(v.getHiredate());
					ve.add(v.getJumin());
					ve.add(v.getDno() + "");
					ve.add(v.getPosition());
					ve.add(v.getAddr());
					ve.add(v.getMgr() + "");
					ve.add(v.getEmail());

					rowData.add(ve); // 한사람의 정보가 담긴 벡터 ve를 전체데이터를 담기위한 rowData에 담는다.
				}
				table.updateUI(); // 테이블을 다시 그려줄것을 요청한다.
			}
		});

		add(jsp, BorderLayout.CENTER);

		setSize(1300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new EmpFrame();
	}

}
