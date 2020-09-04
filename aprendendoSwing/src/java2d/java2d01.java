package java2d;

import java.awt.*;
import javax.swing.*;

public class java2d01 {
	public static void main(String args[]) {
		JFrame f = new JFrame("Exemplo Linhas, ret�ngulos e ovais");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LROJPanel painelLRO = new LROJPanel();
		painelLRO.setBackground(Color.WHITE);
		f.add(painelLRO); // adiciona painel ao frame
		f.setSize(400, 210); // configura o tamanho do frame
		f.setVisible(true); // exibe o frame
	}
}

class LROJPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);

		g.setColor(Color.RED);
		g.drawLine(5, 30, 380, 30);

		g.setColor(Color.BLUE);
		g.drawRect(5, 40, 90, 55); // ret�ngulo azul vazio
		g.fillRect(100, 40, 90, 55); // ret�ngulo preenchido azul

		g.setColor(Color.green);
		g.fillRoundRect(195, 40, 90, 55, 50, 50);
		g.drawRoundRect(290, 40, 90, 55, 20, 20);

		g.setColor(Color.YELLOW);
		g.draw3DRect(5, 100, 90, 55, true);
		g.fill3DRect(100, 100, 90, 55, false);

		g.setColor(Color.MAGENTA);
		g.drawOval(195, 100, 90, 55);
		g.fillOval(290, 100, 90, 55);
	}
}