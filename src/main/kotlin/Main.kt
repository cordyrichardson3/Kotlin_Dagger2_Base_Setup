

fun main(args: Array<String>) {

    val component: IABCComponent = DaggerIABCComponent.create()
    System.out.print(component.getC().toString())

    System.out.print(DaggerIClassDComponent.builder().build().getD().toString())
}