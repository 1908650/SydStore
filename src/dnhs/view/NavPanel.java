package dnhs.view;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NavPanel extends JPanel {
	private JPanel NavPanel;
	JComboBox<String> artFilter;
	private JButton btnStore;
	private JButton btnCheckout;

	public NavPanel() {
		NavPanel = new JPanel(new BorderLayout());

		JPanel titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(1500, 100));
		JLabel image = new JLabel();
		image.setIcon(new ImageIcon("img//title.jpg"));
		titlePanel.add(image);
		NavPanel.add(titlePanel, BorderLayout.NORTH);

		JPanel btnPanel = new JPanel();
		String[] artType = { "All", "Pencil", "Ink", "Digital","Acrylic" };
		artFilter = new JComboBox<String>(artType);
		artFilter.setSelectedIndex(0);
		btnPanel.add(artFilter);

		btnPanel.setBackground(new Color(255, 203, 164));
		btnStore = new JButton("Gallery");
		btnPanel.add(btnStore);
		btnCheckout = new JButton("My Bag");
		btnPanel.add(btnCheckout);

		NavPanel.add(btnPanel, BorderLayout.SOUTH);
	}

	public void addFilterListener(ActionListener listener) {
		artFilter.addActionListener(listener);
	}

	public void addStoreListener(ActionListener listener) {
		btnStore.addActionListener(listener);
	}

	public void addCartListener(ActionListener listener) {
		btnCheckout.addActionListener(listener);
	}

	public JPanel getPanel() {
		return NavPanel;
	}

}
