import groovy.swing.SwingBuilder
import javax.swing.*
import java.awt.BorderLayout   // <-- this is missing

def swing = new SwingBuilder()
swing.edt {
    frame(title: 'Groovy GUI Example', size: [300,200], show: true) {
        borderLayout()   // now Groovy knows BorderLayout
        textField(id: 'input', constraints: BorderLayout.NORTH)
        button(text: 'Click Me', constraints: BorderLayout.SOUTH, actionPerformed: {
            JOptionPane.showMessageDialog(null, "You typed: ${input.text}")
        })
    }
}
