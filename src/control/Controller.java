package control;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import ui.UI;

public interface Controller extends ActionListener,KeyListener,MouseListener{
	public abstract void addUI(UI u);
}
