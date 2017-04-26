package temp;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.events.*;

public class Sample4_5 {
	private static Label lb;

	public static void main(String[] args) {
		Display display = new Display();// ����һ��display����
		final Shell shell = new Shell(display);// shell�ǳ����������
		shell.setText("������ʾ��");
		final Combo combo = new Combo(shell, SWT.NONE);
		combo.setBounds(10, 10, 100, 25);
		lb = new Label(shell, SWT.WRAP); // ������ǩ�����Զ�����
		lb.setBounds(120, 10, 100, 35);
		Button bt1 = new Button(shell, SWT.NONE);
		bt1.setBounds(20, 60, 100, 25);
		bt1.setText("��ֵ");
		bt1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) { // ��ť�ĵ����¼�
				combo.removeAll(); // ���combo
				for (int i = 1; i <= 3; i++) {
					combo.add("��" + i + "��"); // ѭ�����ѡ��
				}
				combo.select(0); // ����Ĭ��ѡ��
			}
		});
		Button bt2 = new Button(shell, SWT.NONE);
		bt2.setBounds(130, 60, 100, 25);
		bt2.setText("ȡֵ");
		bt2.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) { // ��ť�ĵ����¼�
				lb.setText("��ѡ����ǣ�" + combo.getText());
			}
		});
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) { // ���������û�йر���һֱѭ��
			if (!display.readAndDispatch()) { // ���display��æ
				display.sleep(); // ����
			}
		}
		display.dispose(); // ����display
	}

}
