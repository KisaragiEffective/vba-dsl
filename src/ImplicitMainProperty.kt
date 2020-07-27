interface ImplicitMainProperty<T> {
    fun getPropertyName(): String

    fun getValue(): T
}