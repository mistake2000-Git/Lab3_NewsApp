package uit.lap3_18521507.Service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import uit.lap3_18521507.Model.Article;
import uit.lap3_18521507.Model.News;

public interface DataService {

    @GET("v2/top-headlines?sources=techcrunch&apiKey=9620235eac914397bea8e7e9327f093b")
    Call<News> GetDataNews();
}
