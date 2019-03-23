package letterclasses

import javax.inject.Inject

class ClassB @Inject constructor(private val classA: ClassA) {

    override fun toString() = "\nFrom ClassB: " + javaClass.simpleName + classA.toString()
}