package ui;

public class MyWindows {
	public static void main(String[] args) {
		Window w = new Window();
		CtrllView cv = new CtrllView(w);
		w.controller(cv);
	}
}
