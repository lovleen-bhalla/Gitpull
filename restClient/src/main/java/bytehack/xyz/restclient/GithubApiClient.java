package bytehack.xyz.restclient;

import java.util.List;

import bytehack.xyz.restclient.models.PullRequest;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface GithubApiClient {

    @GET("repos/{owner}/{repo}/pulls")
    Call<List<PullRequest>> getPullRequests(
            @Path("owner") String owner,
            @Path("repo") String repo,
            @Query("state") String state // open, closed, all
    );

    @GET
    Call<List<PullRequest>> getPullRequests(@Url String url);
}
