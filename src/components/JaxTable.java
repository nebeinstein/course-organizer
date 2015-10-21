package components;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

import java.util.ArrayList;

public class JaxTable extends Panel implements MouseListener,
		MouseMotionListener, KeyListener {

	/**
	 * Written by Jack Rivadeneira
	 */
	private static final long serialVersionUID = -6997673457845285302L;
	private int mousex, mousey;
	private int rows, cols, cwidth = 100, cheight = 32;
	private int[] drawOffsets = { cwidth / 2, cheight / 2 };
	private int fontHeight = 12;
	private Cell[][] data;
	private Image buff;
	private Graphics bg;

	private Font cellFont = new Font("Arial", Font.PLAIN, this.fontHeight);

	private Color fontColor = Color.GREEN;
	private Color cellBorderColor = Color.GREEN;
	private Color cellColor = Color.BLACK;

//	private Color mouseOver = new Color(0, 100, 0);

	private Color selectedCellBackground = Color.GREEN;
	private Color selectedBorderColor = Color.GREEN;
	private Color selectedFontColor = Color.BLACK;

	private ArrayList<Cell> selected = new ArrayList<>();

	public JaxTable(int Rows, int Cols) {
		this.rows = Rows;
		this.cols = Cols;
		this.data = new Cell[rows][cols];
		this.initilizeData();
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		this.setBackground(cellColor);
	}

	// String data, int X, int Y, int Width, int Height,
	// Color Background, Color Border, Color Text,
	// Color SelectedBackground, Color SelectedBorder, Color SelectedText,
	// Font CellFont

	private void initilizeData() {
		int i = 0;
		while (i < rows * cols)
			data[i / cols][i % cols] = new Cell("hiya", (i % cols)
					* this.cwidth, (i++ / cols) * this.cheight, this.cwidth,
					this.cheight, this.cellColor, this.cellBorderColor,
					this.fontColor, this.selectedCellBackground,
					this.selectedBorderColor, this.selectedFontColor,
					this.cellFont);
	}

	public void selectCells() {

	}

	public ArrayList<Cell> getSelectedCells() {

		return selected;
	}

	public String getValueAt(int row, int col) {
		return this.data[row][col].toString();
	}

	public void setValueAt(int row, int col, String newValue) {
		this.data[row][col].setValue(newValue);
		repaint();
	}

	private void init() {
		buff = this.createImage(this.getSize().width, this.getSize().height);
		bg = buff.getGraphics();
		bg.setColor(this.cellBorderColor);
	}

	public void paint(Graphics g) {
		init();
		int i = 0;
		while (i <= this.cols * this.cwidth) {
			bg.drawLine(i, 0, i, this.rows * this.cheight);
			i += cwidth;
		}
		i = 0;
		while (i <= this.rows * this.cheight) {
			bg.drawLine(0, i, this.cols * this.cwidth, i);
			i += cheight;
		}
		drawData();
		newFrame(g);
	}

	public void drawData() {
		bg.setFont(this.cellFont);
		bg.setColor(this.fontColor);
		int y = 0;
		for (Cell c[] : this.data) {
			int x = 0;
			for (Cell s : c) {
				if (s.isWithin(new Dimension(mousex, mousey)))
					s.setMouseover(true);
				else
					s.setMouseover(false);
				bg.setColor(s.getBackgroundColor());
				bg.fillRect(s.getX() + 1, s.getY() + 1, s.getWidth() - 1,
						s.getHeight() - 1);
				Rectangle2D rekt = bg.getFontMetrics(this.cellFont)
						.getStringBounds(s.toString(), bg);
				bg.setColor(s.getFontColor());
				bg.drawString(s.toString(), x + this.drawOffsets[0]
						- ((int) rekt.getWidth() / 2), y + this.drawOffsets[1]
						+ (this.fontHeight / 2));
				x += this.cwidth;
			}
			y += this.cheight;
		}
	}

	private void delay(int t) {
		try {
			Thread.sleep(t);
		} catch (Exception e) {
			System.out.println("INSOMNIAC!!!");
		}
	}

	private void newFrame(Graphics g) {
		g.drawImage(buff, 0, 0, this);
		delay(20);
		bg.setColor(Color.BLACK);
		bg.clearRect(0, 0, this.getWidth(), this.getHeight());
	}

	public void update(Graphics g) {
		paint(g);
	}

	public static void main(String[] args) {
		System.out.println("JaxTable START!");
		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.setTitle("JaxTable tester");
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.add(new JaxTable(9, 8));
		f.setVisible(true);
	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {

	}

	public void keyReleased(KeyEvent e) {

	}

	public void mouseClicked(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mouseDragged(MouseEvent e) {

	}

	public void mouseMoved(MouseEvent e) {
		mousex = e.getX();
		mousey = e.getY();
		repaint();
	}
}
