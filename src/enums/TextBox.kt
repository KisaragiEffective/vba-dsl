package enums

enum class FormBackStyle(val i: Int) {
    TRANSPARENT(0),
    OPAQUE(1),
}

enum class FormBorderStyle(val i: Int) {
    NONE(0),
    SINGLE(1),
}

enum class FormDragBehavior(val i: Int) {
    DISABLED(0),
    ENABLED(1)
}

enum class FormEnterFieldBehavior(val i: Int) {
    SELECT_ALL(0),
    RECALL_SELECTION(1)
}

enum class FormIMEMode(val i: Int) {
    NO_CONTROL(0),
    ON(1),
    OFF(2),
    DISABLE(3),
    HIRAGANA(4),
    KATAKANA(5),
    KATAKANA_HALF(6),
    ALPHA_FULL(7),
    ALPHA(8)
}

enum class FormMousePointer(val i: Int) {
    DEFAULT(0),
    ARROW(1),
    CROSS(2),
    I_BEAM(3),
    SIZE_NESW(6),
    SIZE_NS(7),
    SIZE_NWSE(8),
    SIZE_WE(9),
    UP_ARROW(10),
    HOUR_GLASS(11),
    NO_DROP(12),
    APP_STARTING(13),
    HELP(14),
    SIZE_ALL(15),
    CUSTOM(99)
}