package letterclasses

import javax.inject.Inject

class ClassA @Inject constructor() {

    override fun toString() = "\nFrom ClassA: " + javaClass.simpleName
}