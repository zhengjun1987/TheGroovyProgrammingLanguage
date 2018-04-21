import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JOptionPane
import java.awt.FlowLayout
import java.awt.Frame
import java.awt.event.ActionListener

frame = new Frame([300,300],new FlowLayout(),javax.swing.WindowConstants.EXIT_ON_CLOSE)
button = new JButton("Click")
positionLabel = new JLabel("")
msgLabel = new JLabel("")
frame.contentPane.add button
frame.contentPane.add positionLabel
frame.contentPane.add msgLabel

button.addActionListener({JOptionPane.showMessageDialog(frame,"You clicked!")} as ActionListener)

frame.show()