package components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;

public class Cell {
	// Cell payload
	private String cellData;
	// Positioning and sizing.
	private int x, y, width, height;
	// Colors for regular cells
	private Color background, border, text;
	// Colors for mouseover
	private Color mouseoverBackground, mouseoverBorder, mouseoverText;
	// Colors for selected
	private Color selectedBackground, selectedBorder, selectedText;
	// Font for the cell.
	private Font cellFont;

	private boolean selected = false;
	private boolean mouseOver = false;

	/**
	 * 
	 * @param data
	 */
	public Cell(String data, int X, int Y, int Width, int Height,
			Color Background, Color Border, Color Text,
			Color SelectedBackground, Color SelectedBorder, Color SelectedText,
			Font CellFont) {
		this.cellData = data;
		this.x = X + 1;
		this.y = Y + 1;
		this.width = Width - 1;
		this.height = Height - 1;
		this.background = Background;
		this.border = Border;
		this.text = Text;
		this.selectedBackground = SelectedBackground;
		this.selectedBorder = SelectedBorder;
		this.selectedText = SelectedText;
		this.cellFont = CellFont;
		this.mouseoverBackground = new Color(
				this.selectedBackground.getRed() / 2,
				this.selectedBackground.getGreen() / 2,
				this.selectedBackground.getBlue() / 2);
		this.mouseoverBorder = this.border;
		this.mouseoverText = this.text;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	/**
	 * 
	 * @param data
	 */
	public Cell(String data) {
		this.cellData = data;
	}

	public boolean isSelected() {
		return selected;
	}

	public void select() {
		selected = true;
	}

	public void deselect() {
		selected = false;
	}

	public void setValue(String s) {
		this.cellData = s;
	}

	public String toString() {
		return this.cellData;
	}

	public Color getFontColor() {
		if (this.selected)
			return this.selectedText;
		if (this.mouseOver)
			return this.mouseoverText;
		return this.text;
	}

	public Color getBackgroundColor() {
		if (this.selected)
			return this.selectedBackground;
		else if (this.mouseOver)
			return this.mouseoverBackground;
		return this.background;
	}

	public Color getBorderColor() {
		if (this.selected)
			return this.selectedBorder;
		if (this.mouseOver)
			return this.mouseoverBorder;
		return this.border;
	}

	public void setMouseover(boolean value) {
		this.mouseOver = value;
	}

	public boolean isWithin(Dimension d) {
		return !(d.width > this.x + this.width || d.width < this.x
				|| d.height > this.y + this.height || d.height < this.y);
	}
}
