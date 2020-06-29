/*
public class MousePressedDemo extends Applet {
	public void init() {
		addMouseListener(new MyMouseAdapter(this));
	}
}
class MyMouseAdapter extends MouseAdapter {
	MousePressedDemo mousePressedDemo;
	public MyMouseAdapter(MousePressedDemo mousePressedDemo) {
		this.mousePressedDemo = mousePressedDemo;
	}
	public void mousePressed(MouseEvent me) {
		mousePressedDemo.showStatus("Mouse Pressed.");
	}
}*/

// Inner class demo.
import java.applet.*;
import java.awt.event.*;
/*
<applet code="InnerClassDemo" width=200 height=100>
</applet>
*/
public class InnerClassDemo extends Applet {
	public void init() {
	addMouseListener(new MyMouseAdapter());
}
class MyMouseAdapter extends MouseAdapter {
	public void mousePressed(MouseEvent me) {
	showStatus("Mouse Pressed");
	}
    }
}