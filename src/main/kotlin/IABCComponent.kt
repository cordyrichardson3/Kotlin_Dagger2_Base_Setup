import dagger.Component
import letterclasses.ClassC

@Component
interface IABCComponent {
    fun getC(): ClassC
}