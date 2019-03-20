import io.reactivex.Observable
import retrofit2.http.GET

interface INetworkAPI {

    @GET("surah/")
    fun getAllPosts(): Observable<List<Post>>
}
