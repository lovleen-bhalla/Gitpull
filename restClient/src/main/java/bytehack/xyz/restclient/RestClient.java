package bytehack.xyz.restclient;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bytehack.xyz.restclient.models.PullRequest;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private static volatile Retrofit sInstance;

    private static volatile GithubApiClient sClient;

    private static Retrofit getRetrofit() {
        if (sInstance == null) {
            synchronized (RestClient.class) {
                if (sInstance == null) {
                    OkHttpClient.Builder httpClientBuilder = new OkHttpClient().newBuilder();
                    HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
                    loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                    httpClientBuilder.addInterceptor(loggingInterceptor);

                    Retrofit.Builder retrofitBuilder = new Retrofit.Builder();
                    retrofitBuilder.client(httpClientBuilder.build())
                            .addConverterFactory(GsonConverterFactory.create())
                            .baseUrl("https://api.github.com/");
                    sInstance = retrofitBuilder.build();
                }
            }
        }
        return sInstance;
    }

    private static GithubApiClient getGithubClient() {
        getRetrofit();
        if (sClient == null) {
            synchronized (RestClient.class) {
                if (sClient == null) {
                    sClient = sInstance.create(GithubApiClient.class);
                }
            }
        }
        return sClient;
    }

    private static String getNextPageUrl(String links) {
        String nextUrlPattern = ".*<(.*)>; rel=\"next\".*";
        Pattern p = Pattern.compile(nextUrlPattern);
        Matcher m = null;
        if (links != null) {
            m = p.matcher(links);
        }
        if ((m != null) && (m.matches())) {
            return m.group(1);
        }
        return "";
    }

    public static PullRequestResponse getPR(String owner, String repo, String state) {
        PullRequestResponse.Builder builder = new PullRequestResponse.Builder();
        try {
            Response<List<PullRequest>> response = getGithubClient().getPullRequests(owner, repo, state).execute();
            builder.setPullRequests(response.body());
            Headers headers = response.headers();
            String links = headers.get("link");
            builder.setNextPageUrl(getNextPageUrl(links));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.build();
    }

    public static PullRequestResponse getPullRequests(String url) {
        PullRequestResponse.Builder builder = new PullRequestResponse.Builder();
        try {

            Response<List<PullRequest>> response = getGithubClient().getPullRequests(url).execute();
            builder.setPullRequests(response.body());
            Headers headers = response.headers();
            String links = headers.get("link");
            builder.setNextPageUrl(getNextPageUrl(links));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.build();
    }
}
