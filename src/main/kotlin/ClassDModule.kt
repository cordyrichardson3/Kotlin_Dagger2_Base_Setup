import dagger.Module
import dagger.Provides
import letterclasses.ClassD

@Module
class ClassDModule {

    @Provides
    fun getD(): ClassD {
        return ClassD()
    }
}