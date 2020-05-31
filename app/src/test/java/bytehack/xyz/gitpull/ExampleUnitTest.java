package bytehack.xyz.gitpull;

import com.google.gson.Gson;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testMode() {
       String json =  "  {\n" +
                "    \"url\": \"https://api.github.com/repos/octocat/Hello-World/pulls/1347\",\n" +
                "    \"id\": 1,\n" +
                "    \"node_id\": \"MDExOlB1bGxSZXF1ZXN0MQ==\",\n" +
                "    \"html_url\": \"https://github.com/octocat/Hello-World/pull/1347\",\n" +
                "    \"diff_url\": \"https://github.com/octocat/Hello-World/pull/1347.diff\",\n" +
                "    \"patch_url\": \"https://github.com/octocat/Hello-World/pull/1347.patch\",\n" +
                "    \"issue_url\": \"https://api.github.com/repos/octocat/Hello-World/issues/1347\",\n" +
                "    \"commits_url\": \"https://api.github.com/repos/octocat/Hello-World/pulls/1347/commits\",\n" +
                "    \"review_comments_url\": \"https://api.github.com/repos/octocat/Hello-World/pulls/1347/comments\",\n" +
                "    \"review_comment_url\": \"https://api.github.com/repos/octocat/Hello-World/pulls/comments{/number}\",\n" +
                "    \"comments_url\": \"https://api.github.com/repos/octocat/Hello-World/issues/1347/comments\",\n" +
                "    \"statuses_url\": \"https://api.github.com/repos/octocat/Hello-World/statuses/6dcb09b5b57875f334f61aebed695e2e4193db5e\",\n" +
                "    \"number\": 1347,\n" +
                "    \"state\": \"open\",\n" +
                "    \"locked\": true,\n" +
                "    \"title\": \"Amazing new feature\",\n" +
                "    \"user\": {\n" +
                "      \"login\": \"octocat\",\n" +
                "      \"id\": 1,\n" +
                "      \"node_id\": \"MDQ6VXNlcjE=\",\n" +
                "      \"avatar_url\": \"https://github.com/images/error/octocat_happy.gif\",\n" +
                "      \"gravatar_id\": \"\",\n" +
                "      \"url\": \"https://api.github.com/users/octocat\",\n" +
                "      \"html_url\": \"https://github.com/octocat\",\n" +
                "      \"followers_url\": \"https://api.github.com/users/octocat/followers\",\n" +
                "      \"following_url\": \"https://api.github.com/users/octocat/following{/other_user}\",\n" +
                "      \"gists_url\": \"https://api.github.com/users/octocat/gists{/gist_id}\",\n" +
                "      \"starred_url\": \"https://api.github.com/users/octocat/starred{/owner}{/repo}\",\n" +
                "      \"subscriptions_url\": \"https://api.github.com/users/octocat/subscriptions\",\n" +
                "      \"organizations_url\": \"https://api.github.com/users/octocat/orgs\",\n" +
                "      \"repos_url\": \"https://api.github.com/users/octocat/repos\",\n" +
                "      \"events_url\": \"https://api.github.com/users/octocat/events{/privacy}\",\n" +
                "      \"received_events_url\": \"https://api.github.com/users/octocat/received_events\",\n" +
                "      \"type\": \"User\",\n" +
                "      \"site_admin\": false\n" +
                "    },\n" +
                "    \"body\": \"Please pull these awesome changes in!\",\n" +
                "    \"labels\": [\n" +
                "      {\n" +
                "        \"id\": 208045946,\n" +
                "        \"node_id\": \"MDU6TGFiZWwyMDgwNDU5NDY=\",\n" +
                "        \"url\": \"https://api.github.com/repos/octocat/Hello-World/labels/bug\",\n" +
                "        \"name\": \"bug\",\n" +
                "        \"description\": \"Something isn't working\",\n" +
                "        \"color\": \"f29513\",\n" +
                "        \"default\": true\n" +
                "      }\n" +
                "    ],\n" +
                "    \"milestone\": {\n" +
                "      \"url\": \"https://api.github.com/repos/octocat/Hello-World/milestones/1\",\n" +
                "      \"html_url\": \"https://github.com/octocat/Hello-World/milestones/v1.0\",\n" +
                "      \"labels_url\": \"https://api.github.com/repos/octocat/Hello-World/milestones/1/labels\",\n" +
                "      \"id\": 1002604,\n" +
                "      \"node_id\": \"MDk6TWlsZXN0b25lMTAwMjYwNA==\",\n" +
                "      \"number\": 1,\n" +
                "      \"state\": \"open\",\n" +
                "      \"title\": \"v1.0\",\n" +
                "      \"description\": \"Tracking milestone for version 1.0\",\n" +
                "      \"creator\": {\n" +
                "        \"login\": \"octocat\",\n" +
                "        \"id\": 1,\n" +
                "        \"node_id\": \"MDQ6VXNlcjE=\",\n" +
                "        \"avatar_url\": \"https://github.com/images/error/octocat_happy.gif\",\n" +
                "        \"gravatar_id\": \"\",\n" +
                "        \"url\": \"https://api.github.com/users/octocat\",\n" +
                "        \"html_url\": \"https://github.com/octocat\",\n" +
                "        \"followers_url\": \"https://api.github.com/users/octocat/followers\",\n" +
                "        \"following_url\": \"https://api.github.com/users/octocat/following{/other_user}\",\n" +
                "        \"gists_url\": \"https://api.github.com/users/octocat/gists{/gist_id}\",\n" +
                "        \"starred_url\": \"https://api.github.com/users/octocat/starred{/owner}{/repo}\",\n" +
                "        \"subscriptions_url\": \"https://api.github.com/users/octocat/subscriptions\",\n" +
                "        \"organizations_url\": \"https://api.github.com/users/octocat/orgs\",\n" +
                "        \"repos_url\": \"https://api.github.com/users/octocat/repos\",\n" +
                "        \"events_url\": \"https://api.github.com/users/octocat/events{/privacy}\",\n" +
                "        \"received_events_url\": \"https://api.github.com/users/octocat/received_events\",\n" +
                "        \"type\": \"User\",\n" +
                "        \"site_admin\": false\n" +
                "      },\n" +
                "      \"open_issues\": 4,\n" +
                "      \"closed_issues\": 8,\n" +
                "      \"created_at\": \"2011-04-10T20:09:31Z\",\n" +
                "      \"updated_at\": \"2014-03-03T18:58:10Z\",\n" +
                "      \"closed_at\": \"2013-02-12T13:22:01Z\",\n" +
                "      \"due_on\": \"2012-10-09T23:39:01Z\"\n" +
                "    },\n" +
                "    \"active_lock_reason\": \"too heated\",\n" +
                "    \"created_at\": \"2011-01-26T19:01:12Z\",\n" +
                "    \"updated_at\": \"2011-01-26T19:01:12Z\",\n" +
                "    \"closed_at\": \"2011-01-26T19:01:12Z\",\n" +
                "    \"merged_at\": \"2011-01-26T19:01:12Z\",\n" +
                "    \"merge_commit_sha\": \"e5bd3914e2e596debea16f433f57875b5b90bcd6\",\n" +
                "    \"assignee\": {\n" +
                "      \"login\": \"octocat\",\n" +
                "      \"id\": 1,\n" +
                "      \"node_id\": \"MDQ6VXNlcjE=\",\n" +
                "      \"avatar_url\": \"https://github.com/images/error/octocat_happy.gif\",\n" +
                "      \"gravatar_id\": \"\",\n" +
                "      \"url\": \"https://api.github.com/users/octocat\",\n" +
                "      \"html_url\": \"https://github.com/octocat\",\n" +
                "      \"followers_url\": \"https://api.github.com/users/octocat/followers\",\n" +
                "      \"following_url\": \"https://api.github.com/users/octocat/following{/other_user}\",\n" +
                "      \"gists_url\": \"https://api.github.com/users/octocat/gists{/gist_id}\",\n" +
                "      \"starred_url\": \"https://api.github.com/users/octocat/starred{/owner}{/repo}\",\n" +
                "      \"subscriptions_url\": \"https://api.github.com/users/octocat/subscriptions\",\n" +
                "      \"organizations_url\": \"https://api.github.com/users/octocat/orgs\",\n" +
                "      \"repos_url\": \"https://api.github.com/users/octocat/repos\",\n" +
                "      \"events_url\": \"https://api.github.com/users/octocat/events{/privacy}\",\n" +
                "      \"received_events_url\": \"https://api.github.com/users/octocat/received_events\",\n" +
                "      \"type\": \"User\",\n" +
                "      \"site_admin\": false\n" +
                "    },\n" +
                "    \"assignees\": [\n" +
                "      {\n" +
                "        \"login\": \"octocat\",\n" +
                "        \"id\": 1,\n" +
                "        \"node_id\": \"MDQ6VXNlcjE=\",\n" +
                "        \"avatar_url\": \"https://github.com/images/error/octocat_happy.gif\",\n" +
                "        \"gravatar_id\": \"\",\n" +
                "        \"url\": \"https://api.github.com/users/octocat\",\n" +
                "        \"html_url\": \"https://github.com/octocat\",\n" +
                "        \"followers_url\": \"https://api.github.com/users/octocat/followers\",\n" +
                "        \"following_url\": \"https://api.github.com/users/octocat/following{/other_user}\",\n" +
                "        \"gists_url\": \"https://api.github.com/users/octocat/gists{/gist_id}\",\n" +
                "        \"starred_url\": \"https://api.github.com/users/octocat/starred{/owner}{/repo}\",\n" +
                "        \"subscriptions_url\": \"https://api.github.com/users/octocat/subscriptions\",\n" +
                "        \"organizations_url\": \"https://api.github.com/users/octocat/orgs\",\n" +
                "        \"repos_url\": \"https://api.github.com/users/octocat/repos\",\n" +
                "        \"events_url\": \"https://api.github.com/users/octocat/events{/privacy}\",\n" +
                "        \"received_events_url\": \"https://api.github.com/users/octocat/received_events\",\n" +
                "        \"type\": \"User\",\n" +
                "        \"site_admin\": false\n" +
                "      },\n" +
                "      {\n" +
                "        \"login\": \"hubot\",\n" +
                "        \"id\": 1,\n" +
                "        \"node_id\": \"MDQ6VXNlcjE=\",\n" +
                "        \"avatar_url\": \"https://github.com/images/error/hubot_happy.gif\",\n" +
                "        \"gravatar_id\": \"\",\n" +
                "        \"url\": \"https://api.github.com/users/hubot\",\n" +
                "        \"html_url\": \"https://github.com/hubot\",\n" +
                "        \"followers_url\": \"https://api.github.com/users/hubot/followers\",\n" +
                "        \"following_url\": \"https://api.github.com/users/hubot/following{/other_user}\",\n" +
                "        \"gists_url\": \"https://api.github.com/users/hubot/gists{/gist_id}\",\n" +
                "        \"starred_url\": \"https://api.github.com/users/hubot/starred{/owner}{/repo}\",\n" +
                "        \"subscriptions_url\": \"https://api.github.com/users/hubot/subscriptions\",\n" +
                "        \"organizations_url\": \"https://api.github.com/users/hubot/orgs\",\n" +
                "        \"repos_url\": \"https://api.github.com/users/hubot/repos\",\n" +
                "        \"events_url\": \"https://api.github.com/users/hubot/events{/privacy}\",\n" +
                "        \"received_events_url\": \"https://api.github.com/users/hubot/received_events\",\n" +
                "        \"type\": \"User\",\n" +
                "        \"site_admin\": true\n" +
                "      }\n" +
                "    ],\n" +
                "    \"requested_reviewers\": [\n" +
                "      {\n" +
                "        \"login\": \"other_user\",\n" +
                "        \"id\": 1,\n" +
                "        \"node_id\": \"MDQ6VXNlcjE=\",\n" +
                "        \"avatar_url\": \"https://github.com/images/error/other_user_happy.gif\",\n" +
                "        \"gravatar_id\": \"\",\n" +
                "        \"url\": \"https://api.github.com/users/other_user\",\n" +
                "        \"html_url\": \"https://github.com/other_user\",\n" +
                "        \"followers_url\": \"https://api.github.com/users/other_user/followers\",\n" +
                "        \"following_url\": \"https://api.github.com/users/other_user/following{/other_user}\",\n" +
                "        \"gists_url\": \"https://api.github.com/users/other_user/gists{/gist_id}\",\n" +
                "        \"starred_url\": \"https://api.github.com/users/other_user/starred{/owner}{/repo}\",\n" +
                "        \"subscriptions_url\": \"https://api.github.com/users/other_user/subscriptions\",\n" +
                "        \"organizations_url\": \"https://api.github.com/users/other_user/orgs\",\n" +
                "        \"repos_url\": \"https://api.github.com/users/other_user/repos\",\n" +
                "        \"events_url\": \"https://api.github.com/users/other_user/events{/privacy}\",\n" +
                "        \"received_events_url\": \"https://api.github.com/users/other_user/received_events\",\n" +
                "        \"type\": \"User\",\n" +
                "        \"site_admin\": false\n" +
                "      }\n" +
                "    ],\n" +
                "    \"requested_teams\": [\n" +
                "      {\n" +
                "        \"id\": 1,\n" +
                "        \"node_id\": \"MDQ6VGVhbTE=\",\n" +
                "        \"url\": \"https://api.github.com/teams/1\",\n" +
                "        \"html_url\": \"https://api.github.com/teams/justice-league\",\n" +
                "        \"name\": \"Justice League\",\n" +
                "        \"slug\": \"justice-league\",\n" +
                "        \"description\": \"A great team.\",\n" +
                "        \"privacy\": \"closed\",\n" +
                "        \"permission\": \"admin\",\n" +
                "        \"members_url\": \"https://api.github.com/teams/1/members{/member}\",\n" +
                "        \"repositories_url\": \"https://api.github.com/teams/1/repos\",\n" +
                "        \"parent\": null\n" +
                "      }\n" +
                "    ],\n" +
                "    \"head\": {\n" +
                "      \"label\": \"octocat:new-topic\",\n" +
                "      \"ref\": \"new-topic\",\n" +
                "      \"sha\": \"6dcb09b5b57875f334f61aebed695e2e4193db5e\",\n" +
                "      \"user\": {\n" +
                "        \"login\": \"octocat\",\n" +
                "        \"id\": 1,\n" +
                "        \"node_id\": \"MDQ6VXNlcjE=\",\n" +
                "        \"avatar_url\": \"https://github.com/images/error/octocat_happy.gif\",\n" +
                "        \"gravatar_id\": \"\",\n" +
                "        \"url\": \"https://api.github.com/users/octocat\",\n" +
                "        \"html_url\": \"https://github.com/octocat\",\n" +
                "        \"followers_url\": \"https://api.github.com/users/octocat/followers\",\n" +
                "        \"following_url\": \"https://api.github.com/users/octocat/following{/other_user}\",\n" +
                "        \"gists_url\": \"https://api.github.com/users/octocat/gists{/gist_id}\",\n" +
                "        \"starred_url\": \"https://api.github.com/users/octocat/starred{/owner}{/repo}\",\n" +
                "        \"subscriptions_url\": \"https://api.github.com/users/octocat/subscriptions\",\n" +
                "        \"organizations_url\": \"https://api.github.com/users/octocat/orgs\",\n" +
                "        \"repos_url\": \"https://api.github.com/users/octocat/repos\",\n" +
                "        \"events_url\": \"https://api.github.com/users/octocat/events{/privacy}\",\n" +
                "        \"received_events_url\": \"https://api.github.com/users/octocat/received_events\",\n" +
                "        \"type\": \"User\",\n" +
                "        \"site_admin\": false\n" +
                "      },\n" +
                "      \"repo\": {\n" +
                "        \"id\": 1296269,\n" +
                "        \"node_id\": \"MDEwOlJlcG9zaXRvcnkxMjk2MjY5\",\n" +
                "        \"name\": \"Hello-World\",\n" +
                "        \"full_name\": \"octocat/Hello-World\",\n" +
                "        \"owner\": {\n" +
                "          \"login\": \"octocat\",\n" +
                "          \"id\": 1,\n" +
                "          \"node_id\": \"MDQ6VXNlcjE=\",\n" +
                "          \"avatar_url\": \"https://github.com/images/error/octocat_happy.gif\",\n" +
                "          \"gravatar_id\": \"\",\n" +
                "          \"url\": \"https://api.github.com/users/octocat\",\n" +
                "          \"html_url\": \"https://github.com/octocat\",\n" +
                "          \"followers_url\": \"https://api.github.com/users/octocat/followers\",\n" +
                "          \"following_url\": \"https://api.github.com/users/octocat/following{/other_user}\",\n" +
                "          \"gists_url\": \"https://api.github.com/users/octocat/gists{/gist_id}\",\n" +
                "          \"starred_url\": \"https://api.github.com/users/octocat/starred{/owner}{/repo}\",\n" +
                "          \"subscriptions_url\": \"https://api.github.com/users/octocat/subscriptions\",\n" +
                "          \"organizations_url\": \"https://api.github.com/users/octocat/orgs\",\n" +
                "          \"repos_url\": \"https://api.github.com/users/octocat/repos\",\n" +
                "          \"events_url\": \"https://api.github.com/users/octocat/events{/privacy}\",\n" +
                "          \"received_events_url\": \"https://api.github.com/users/octocat/received_events\",\n" +
                "          \"type\": \"User\",\n" +
                "          \"site_admin\": false\n" +
                "        },\n" +
                "        \"private\": false,\n" +
                "        \"html_url\": \"https://github.com/octocat/Hello-World\",\n" +
                "        \"description\": \"This your first repo!\",\n" +
                "        \"fork\": false,\n" +
                "        \"url\": \"https://api.github.com/repos/octocat/Hello-World\",\n" +
                "        \"archive_url\": \"http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}\",\n" +
                "        \"assignees_url\": \"http://api.github.com/repos/octocat/Hello-World/assignees{/user}\",\n" +
                "        \"blobs_url\": \"http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}\",\n" +
                "        \"branches_url\": \"http://api.github.com/repos/octocat/Hello-World/branches{/branch}\",\n" +
                "        \"collaborators_url\": \"http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}\",\n" +
                "        \"comments_url\": \"http://api.github.com/repos/octocat/Hello-World/comments{/number}\",\n" +
                "        \"commits_url\": \"http://api.github.com/repos/octocat/Hello-World/commits{/sha}\",\n" +
                "        \"compare_url\": \"http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}\",\n" +
                "        \"contents_url\": \"http://api.github.com/repos/octocat/Hello-World/contents/{+path}\",\n" +
                "        \"contributors_url\": \"http://api.github.com/repos/octocat/Hello-World/contributors\",\n" +
                "        \"deployments_url\": \"http://api.github.com/repos/octocat/Hello-World/deployments\",\n" +
                "        \"downloads_url\": \"http://api.github.com/repos/octocat/Hello-World/downloads\",\n" +
                "        \"events_url\": \"http://api.github.com/repos/octocat/Hello-World/events\",\n" +
                "        \"forks_url\": \"http://api.github.com/repos/octocat/Hello-World/forks\",\n" +
                "        \"git_commits_url\": \"http://api.github.com/repos/octocat/Hello-World/git/commits{/sha}\",\n" +
                "        \"git_refs_url\": \"http://api.github.com/repos/octocat/Hello-World/git/refs{/sha}\",\n" +
                "        \"git_tags_url\": \"http://api.github.com/repos/octocat/Hello-World/git/tags{/sha}\",\n" +
                "        \"git_url\": \"git:github.com/octocat/Hello-World.git\",\n" +
                "        \"issue_comment_url\": \"http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}\",\n" +
                "        \"issue_events_url\": \"http://api.github.com/repos/octocat/Hello-World/issues/events{/number}\",\n" +
                "        \"issues_url\": \"http://api.github.com/repos/octocat/Hello-World/issues{/number}\",\n" +
                "        \"keys_url\": \"http://api.github.com/repos/octocat/Hello-World/keys{/key_id}\",\n" +
                "        \"labels_url\": \"http://api.github.com/repos/octocat/Hello-World/labels{/name}\",\n" +
                "        \"languages_url\": \"http://api.github.com/repos/octocat/Hello-World/languages\",\n" +
                "        \"merges_url\": \"http://api.github.com/repos/octocat/Hello-World/merges\",\n" +
                "        \"milestones_url\": \"http://api.github.com/repos/octocat/Hello-World/milestones{/number}\",\n" +
                "        \"notifications_url\": \"http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}\",\n" +
                "        \"pulls_url\": \"http://api.github.com/repos/octocat/Hello-World/pulls{/number}\",\n" +
                "        \"releases_url\": \"http://api.github.com/repos/octocat/Hello-World/releases{/id}\",\n" +
                "        \"ssh_url\": \"git@github.com:octocat/Hello-World.git\",\n" +
                "        \"stargazers_url\": \"http://api.github.com/repos/octocat/Hello-World/stargazers\",\n" +
                "        \"statuses_url\": \"http://api.github.com/repos/octocat/Hello-World/statuses/{sha}\",\n" +
                "        \"subscribers_url\": \"http://api.github.com/repos/octocat/Hello-World/subscribers\",\n" +
                "        \"subscription_url\": \"http://api.github.com/repos/octocat/Hello-World/subscription\",\n" +
                "        \"tags_url\": \"http://api.github.com/repos/octocat/Hello-World/tags\",\n" +
                "        \"teams_url\": \"http://api.github.com/repos/octocat/Hello-World/teams\",\n" +
                "        \"trees_url\": \"http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}\",\n" +
                "        \"clone_url\": \"https://github.com/octocat/Hello-World.git\",\n" +
                "        \"mirror_url\": \"git:git.example.com/octocat/Hello-World\",\n" +
                "        \"hooks_url\": \"http://api.github.com/repos/octocat/Hello-World/hooks\",\n" +
                "        \"svn_url\": \"https://svn.github.com/octocat/Hello-World\",\n" +
                "        \"homepage\": \"https://github.com\",\n" +
                "        \"language\": null,\n" +
                "        \"forks_count\": 9,\n" +
                "        \"stargazers_count\": 80,\n" +
                "        \"watchers_count\": 80,\n" +
                "        \"size\": 108,\n" +
                "        \"default_branch\": \"master\",\n" +
                "        \"open_issues_count\": 0,\n" +
                "        \"is_template\": true,\n" +
                "        \"topics\": [\n" +
                "          \"octocat\",\n" +
                "          \"atom\",\n" +
                "          \"electron\",\n" +
                "          \"api\"\n" +
                "        ],\n" +
                "        \"has_issues\": true,\n" +
                "        \"has_projects\": true,\n" +
                "        \"has_wiki\": true,\n" +
                "        \"has_pages\": false,\n" +
                "        \"has_downloads\": true,\n" +
                "        \"archived\": false,\n" +
                "        \"disabled\": false,\n" +
                "        \"visibility\": \"public\",\n" +
                "        \"pushed_at\": \"2011-01-26T19:06:43Z\",\n" +
                "        \"created_at\": \"2011-01-26T19:01:12Z\",\n" +
                "        \"updated_at\": \"2011-01-26T19:14:43Z\",\n" +
                "        \"permissions\": {\n" +
                "          \"admin\": false,\n" +
                "          \"push\": false,\n" +
                "          \"pull\": true\n" +
                "        },\n" +
                "        \"allow_rebase_merge\": true,\n" +
                "        \"template_repository\": null,\n" +
                "        \"temp_clone_token\": \"ABTLWHOULUVAXGTRYU7OC2876QJ2O\",\n" +
                "        \"allow_squash_merge\": true,\n" +
                "        \"allow_merge_commit\": true,\n" +
                "        \"subscribers_count\": 42,\n" +
                "        \"network_count\": 0\n" +
                "      }\n" +
                "    },\n" +
                "    \"base\": {\n" +
                "      \"label\": \"octocat:master\",\n" +
                "      \"ref\": \"master\",\n" +
                "      \"sha\": \"6dcb09b5b57875f334f61aebed695e2e4193db5e\",\n" +
                "      \"user\": {\n" +
                "        \"login\": \"octocat\",\n" +
                "        \"id\": 1,\n" +
                "        \"node_id\": \"MDQ6VXNlcjE=\",\n" +
                "        \"avatar_url\": \"https://github.com/images/error/octocat_happy.gif\",\n" +
                "        \"gravatar_id\": \"\",\n" +
                "        \"url\": \"https://api.github.com/users/octocat\",\n" +
                "        \"html_url\": \"https://github.com/octocat\",\n" +
                "        \"followers_url\": \"https://api.github.com/users/octocat/followers\",\n" +
                "        \"following_url\": \"https://api.github.com/users/octocat/following{/other_user}\",\n" +
                "        \"gists_url\": \"https://api.github.com/users/octocat/gists{/gist_id}\",\n" +
                "        \"starred_url\": \"https://api.github.com/users/octocat/starred{/owner}{/repo}\",\n" +
                "        \"subscriptions_url\": \"https://api.github.com/users/octocat/subscriptions\",\n" +
                "        \"organizations_url\": \"https://api.github.com/users/octocat/orgs\",\n" +
                "        \"repos_url\": \"https://api.github.com/users/octocat/repos\",\n" +
                "        \"events_url\": \"https://api.github.com/users/octocat/events{/privacy}\",\n" +
                "        \"received_events_url\": \"https://api.github.com/users/octocat/received_events\",\n" +
                "        \"type\": \"User\",\n" +
                "        \"site_admin\": false\n" +
                "      },\n" +
                "      \"repo\": {\n" +
                "        \"id\": 1296269,\n" +
                "        \"node_id\": \"MDEwOlJlcG9zaXRvcnkxMjk2MjY5\",\n" +
                "        \"name\": \"Hello-World\",\n" +
                "        \"full_name\": \"octocat/Hello-World\",\n" +
                "        \"owner\": {\n" +
                "          \"login\": \"octocat\",\n" +
                "          \"id\": 1,\n" +
                "          \"node_id\": \"MDQ6VXNlcjE=\",\n" +
                "          \"avatar_url\": \"https://github.com/images/error/octocat_happy.gif\",\n" +
                "          \"gravatar_id\": \"\",\n" +
                "          \"url\": \"https://api.github.com/users/octocat\",\n" +
                "          \"html_url\": \"https://github.com/octocat\",\n" +
                "          \"followers_url\": \"https://api.github.com/users/octocat/followers\",\n" +
                "          \"following_url\": \"https://api.github.com/users/octocat/following{/other_user}\",\n" +
                "          \"gists_url\": \"https://api.github.com/users/octocat/gists{/gist_id}\",\n" +
                "          \"starred_url\": \"https://api.github.com/users/octocat/starred{/owner}{/repo}\",\n" +
                "          \"subscriptions_url\": \"https://api.github.com/users/octocat/subscriptions\",\n" +
                "          \"organizations_url\": \"https://api.github.com/users/octocat/orgs\",\n" +
                "          \"repos_url\": \"https://api.github.com/users/octocat/repos\",\n" +
                "          \"events_url\": \"https://api.github.com/users/octocat/events{/privacy}\",\n" +
                "          \"received_events_url\": \"https://api.github.com/users/octocat/received_events\",\n" +
                "          \"type\": \"User\",\n" +
                "          \"site_admin\": false\n" +
                "        },\n" +
                "        \"private\": false,\n" +
                "        \"html_url\": \"https://github.com/octocat/Hello-World\",\n" +
                "        \"description\": \"This your first repo!\",\n" +
                "        \"fork\": false,\n" +
                "        \"url\": \"https://api.github.com/repos/octocat/Hello-World\",\n" +
                "        \"archive_url\": \"http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}\",\n" +
                "        \"assignees_url\": \"http://api.github.com/repos/octocat/Hello-World/assignees{/user}\",\n" +
                "        \"blobs_url\": \"http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}\",\n" +
                "        \"branches_url\": \"http://api.github.com/repos/octocat/Hello-World/branches{/branch}\",\n" +
                "        \"collaborators_url\": \"http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}\",\n" +
                "        \"comments_url\": \"http://api.github.com/repos/octocat/Hello-World/comments{/number}\",\n" +
                "        \"commits_url\": \"http://api.github.com/repos/octocat/Hello-World/commits{/sha}\",\n" +
                "        \"compare_url\": \"http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}\",\n" +
                "        \"contents_url\": \"http://api.github.com/repos/octocat/Hello-World/contents/{+path}\",\n" +
                "        \"contributors_url\": \"http://api.github.com/repos/octocat/Hello-World/contributors\",\n" +
                "        \"deployments_url\": \"http://api.github.com/repos/octocat/Hello-World/deployments\",\n" +
                "        \"downloads_url\": \"http://api.github.com/repos/octocat/Hello-World/downloads\",\n" +
                "        \"events_url\": \"http://api.github.com/repos/octocat/Hello-World/events\",\n" +
                "        \"forks_url\": \"http://api.github.com/repos/octocat/Hello-World/forks\",\n" +
                "        \"git_commits_url\": \"http://api.github.com/repos/octocat/Hello-World/git/commits{/sha}\",\n" +
                "        \"git_refs_url\": \"http://api.github.com/repos/octocat/Hello-World/git/refs{/sha}\",\n" +
                "        \"git_tags_url\": \"http://api.github.com/repos/octocat/Hello-World/git/tags{/sha}\",\n" +
                "        \"git_url\": \"git:github.com/octocat/Hello-World.git\",\n" +
                "        \"issue_comment_url\": \"http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}\",\n" +
                "        \"issue_events_url\": \"http://api.github.com/repos/octocat/Hello-World/issues/events{/number}\",\n" +
                "        \"issues_url\": \"http://api.github.com/repos/octocat/Hello-World/issues{/number}\",\n" +
                "        \"keys_url\": \"http://api.github.com/repos/octocat/Hello-World/keys{/key_id}\",\n" +
                "        \"labels_url\": \"http://api.github.com/repos/octocat/Hello-World/labels{/name}\",\n" +
                "        \"languages_url\": \"http://api.github.com/repos/octocat/Hello-World/languages\",\n" +
                "        \"merges_url\": \"http://api.github.com/repos/octocat/Hello-World/merges\",\n" +
                "        \"milestones_url\": \"http://api.github.com/repos/octocat/Hello-World/milestones{/number}\",\n" +
                "        \"notifications_url\": \"http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}\",\n" +
                "        \"pulls_url\": \"http://api.github.com/repos/octocat/Hello-World/pulls{/number}\",\n" +
                "        \"releases_url\": \"http://api.github.com/repos/octocat/Hello-World/releases{/id}\",\n" +
                "        \"ssh_url\": \"git@github.com:octocat/Hello-World.git\",\n" +
                "        \"stargazers_url\": \"http://api.github.com/repos/octocat/Hello-World/stargazers\",\n" +
                "        \"statuses_url\": \"http://api.github.com/repos/octocat/Hello-World/statuses/{sha}\",\n" +
                "        \"subscribers_url\": \"http://api.github.com/repos/octocat/Hello-World/subscribers\",\n" +
                "        \"subscription_url\": \"http://api.github.com/repos/octocat/Hello-World/subscription\",\n" +
                "        \"tags_url\": \"http://api.github.com/repos/octocat/Hello-World/tags\",\n" +
                "        \"teams_url\": \"http://api.github.com/repos/octocat/Hello-World/teams\",\n" +
                "        \"trees_url\": \"http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}\",\n" +
                "        \"clone_url\": \"https://github.com/octocat/Hello-World.git\",\n" +
                "        \"mirror_url\": \"git:git.example.com/octocat/Hello-World\",\n" +
                "        \"hooks_url\": \"http://api.github.com/repos/octocat/Hello-World/hooks\",\n" +
                "        \"svn_url\": \"https://svn.github.com/octocat/Hello-World\",\n" +
                "        \"homepage\": \"https://github.com\",\n" +
                "        \"language\": null,\n" +
                "        \"forks_count\": 9,\n" +
                "        \"stargazers_count\": 80,\n" +
                "        \"watchers_count\": 80,\n" +
                "        \"size\": 108,\n" +
                "        \"default_branch\": \"master\",\n" +
                "        \"open_issues_count\": 0,\n" +
                "        \"is_template\": true,\n" +
                "        \"topics\": [\n" +
                "          \"octocat\",\n" +
                "          \"atom\",\n" +
                "          \"electron\",\n" +
                "          \"api\"\n" +
                "        ],\n" +
                "        \"has_issues\": true,\n" +
                "        \"has_projects\": true,\n" +
                "        \"has_wiki\": true,\n" +
                "        \"has_pages\": false,\n" +
                "        \"has_downloads\": true,\n" +
                "        \"archived\": false,\n" +
                "        \"disabled\": false,\n" +
                "        \"visibility\": \"public\",\n" +
                "        \"pushed_at\": \"2011-01-26T19:06:43Z\",\n" +
                "        \"created_at\": \"2011-01-26T19:01:12Z\",\n" +
                "        \"updated_at\": \"2011-01-26T19:14:43Z\",\n" +
                "        \"permissions\": {\n" +
                "          \"admin\": false,\n" +
                "          \"push\": false,\n" +
                "          \"pull\": true\n" +
                "        },\n" +
                "        \"allow_rebase_merge\": true,\n" +
                "        \"template_repository\": null,\n" +
                "        \"temp_clone_token\": \"ABTLWHOULUVAXGTRYU7OC2876QJ2O\",\n" +
                "        \"allow_squash_merge\": true,\n" +
                "        \"allow_merge_commit\": true,\n" +
                "        \"subscribers_count\": 42,\n" +
                "        \"network_count\": 0\n" +
                "      }\n" +
                "    },\n" +
                "    \"_links\": {\n" +
                "      \"self\": {\n" +
                "        \"href\": \"https://api.github.com/repos/octocat/Hello-World/pulls/1347\"\n" +
                "      },\n" +
                "      \"html\": {\n" +
                "        \"href\": \"https://github.com/octocat/Hello-World/pull/1347\"\n" +
                "      },\n" +
                "      \"issue\": {\n" +
                "        \"href\": \"https://api.github.com/repos/octocat/Hello-World/issues/1347\"\n" +
                "      },\n" +
                "      \"comments\": {\n" +
                "        \"href\": \"https://api.github.com/repos/octocat/Hello-World/issues/1347/comments\"\n" +
                "      },\n" +
                "      \"review_comments\": {\n" +
                "        \"href\": \"https://api.github.com/repos/octocat/Hello-World/pulls/1347/comments\"\n" +
                "      },\n" +
                "      \"review_comment\": {\n" +
                "        \"href\": \"https://api.github.com/repos/octocat/Hello-World/pulls/comments{/number}\"\n" +
                "      },\n" +
                "      \"commits\": {\n" +
                "        \"href\": \"https://api.github.com/repos/octocat/Hello-World/pulls/1347/commits\"\n" +
                "      },\n" +
                "      \"statuses\": {\n" +
                "        \"href\": \"https://api.github.com/repos/octocat/Hello-World/statuses/6dcb09b5b57875f334f61aebed695e2e4193db5e\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"author_association\": \"OWNER\",\n" +
                "    \"draft\": false\n" +
                "  }";

       Gson gson = new Gson();
       PullRequests pr = gson.fromJson(json, PullRequests.class);
       System.out.println("PR");
    }
}