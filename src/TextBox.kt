import enums.*
import java.awt.Color
import java.awt.Font
import java.awt.image.BufferedImage

class TextBox : FormComponent() {
    var autoSize = false
    var autoTab = false
    var autoWordSelect = true
    var backColor = Color.WHITE
    var backStyle = FormBackStyle.OPAQUE
    var borderColor = Color.DARK_GRAY
    var borderStyle = FormBorderStyle.NONE
    var controlSource = ""
    var controlTipText = ""
    var dragBehavior = FormDragBehavior.DISABLED
    var enterFieldBehavior = FormEnterFieldBehavior.SELECT_ALL
    var enterKeyBehavior = false
    var font: Font? = Font.decode("MS UI Gothic-8")
    var foreColor = Color.BLACK
    var height = 24
    var helpContentId = 0
    var hideSelection = true
    var imeMode = FormIMEMode.NO_CONTROL
    var internalHeight = true
    var left = 12
    var locked = false
    var maxLength = 0
    var mouseIcon: BufferedImage? = TODO()
    var mousePointer = FormMousePointer.DEFAULT
}

