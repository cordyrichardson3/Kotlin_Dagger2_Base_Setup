package letterclasses

import javax.inject.Inject

class ClassC @Inject constructor(private val classB: ClassB){


    override fun toString() =
            "From ClassC: "+ javaClass.simpleName + classB.toString()
}