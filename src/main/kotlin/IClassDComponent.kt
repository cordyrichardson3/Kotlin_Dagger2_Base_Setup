import dagger.Component
import letterclasses.ClassD

@Component(modules = [ClassDModule::class])
interface IClassDComponent {
    fun getD(): ClassD
}