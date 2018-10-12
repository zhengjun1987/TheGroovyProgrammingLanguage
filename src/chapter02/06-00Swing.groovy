import javax.swing.*
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.FocusListener
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener

anInt = 3
println anInt

frame = new Frame("SWING")
frame.setSize(300, 300)
//[300,300],new FlowLayout(),javax.swing.WindowConstants.EXIT_ON_CLOSE
frame.setLayout(new FlowLayout())
button = new JButton("Click")
positionLabel = new JLabel("positionLabel")
msgLabel = new JLabel("msgLabel")
frame.add button
frame.add positionLabel
frame.add msgLabel

//button.addActionListener({ JOptionPane.showMessageDialog(frame, "You clicked!") } as ActionListener)
button.addActionListener(new ActionListener() {
    @Override
    void actionPerformed(ActionEvent e) {
        println "e = $e"
    }
})

displayMouseLocation = { positionLabel.setText("$it.x, $it.y") }
frame.addMouseListener(displayMouseLocation as MouseListener)
frame.addMouseMotionListener(displayMouseLocation as MouseMotionListener)

handleFocus = {
    focusGained:
    {
        msgLabel.setText("Good to see you!")
    }
    focusLost:
    {
        msgLabel.setText("Come back soon!")
    }
}
button.addFocusListener(handleFocus as FocusListener)

events = ['WindowListener','ComponentListener']
handler = { msgLabel.setText("$it")}
for(event in events){
    handlerImpl = handler.asType(Class.forName("java.awt.event.${event}"))
    frame."add${event}" handlerImpl
}
frame.setVisible(true)