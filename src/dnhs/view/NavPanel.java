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

		JPanel btnPanel = new JPanel(new BorderLayout());
		btnPanel.setBackground(new Color(255, 203, 164));
		String[] artType = { "All", "Pencil", "Ink", "Digital", "Acrylic", "OtherMediums" };

		JPanel westPanel = new JPanel();
		westPanel.setBackground(new Color(255, 203, 164));
		artFilter = new JComboBox<String>(artType);
		artFilter.setSelectedIndex(0);
		westPanel.add(artFilter);
		btnPanel.add(westPanel, BorderLayout.EAST);

		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(new Color(255, 203, 164));
		btnStore = new JButton("Gallery");
		centerPanel.add(btnStore);
		btnCheckout = new JButton("My Bag");
		centerPanel.add(btnCheckout);
		btnPanel.add(centerPanel, BorderLayout.CENTER);

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
