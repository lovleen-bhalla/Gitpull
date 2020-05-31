package bytehack.xyz.gitpull.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import bytehack.xyz.gitpull.models.PullRequestModel;
import bytehack.xyz.gitpull.models.PullRequests;
import bytehack.xyz.restclient.models.PullRequest;

public class MockPullRequestRepo implements PullRequestsRepository {

    String json = "[ { \"url\": \"https://api.github.com/repos/golang/go/pulls/39245\", \"id\": 422843352, \"node_id\": \"MDExOlB1bGxSZXF1ZXN0NDIyODQzMzUy\", \"html_url\": \"https://github.com/golang/go/pull/39245\", \"diff_url\": \"https://github.com/golang/go/pull/39245.diff\", \"patch_url\": \"https://github.com/golang/go/pull/39245.patch\", \"issue_url\": \"https://api.github.com/repos/golang/go/issues/39245\", \"number\": 39245, \"state\": \"open\", \"locked\": false, \"title\": \"syscall: support O_SYNC flag for os.OpenFile on windows\", \"user\": { \"login\": \"jarifibrahim\", \"id\": 12949454, \"node_id\": \"MDQ6VXNlcjEyOTQ5NDU0\", \"avatar_url\": \"https://avatars3.githubusercontent.com/u/12949454?v=4\", \"gravatar_id\": \"\", \"url\": \"https://api.github.com/users/jarifibrahim\", \"html_url\": \"https://github.com/jarifibrahim\", \"followers_url\": \"https://api.github.com/users/jarifibrahim/followers\", \"following_url\": \"https://api.github.com/users/jarifibrahim/following{/other_user}\", \"gists_url\": \"https://api.github.com/users/jarifibrahim/gists{/gist_id}\", \"starred_url\": \"https://api.github.com/users/jarifibrahim/starred{/owner}{/repo}\", \"subscriptions_url\": \"https://api.github.com/users/jarifibrahim/subscriptions\", \"organizations_url\": \"https://api.github.com/users/jarifibrahim/orgs\", \"repos_url\": \"https://api.github.com/users/jarifibrahim/repos\", \"events_url\": \"https://api.github.com/users/jarifibrahim/events{/privacy}\", \"received_events_url\": \"https://api.github.com/users/jarifibrahim/received_events\", \"type\": \"User\", \"site_admin\": false }, \"body\": \"The current implementation of `os.OpenFile` function for windows does\\r\\nnot use the O_SYNC flag. This means that even if the user has set the\\r\\n`O_SYNC flag`, the `os.OpenFile` call will ignore the `SYNC` flag. This\\r\\ncommit fixes the issue by adding the `FILE_FLAG_WRITE_THROUGH`\\r\\nwhich is the equivalent of `O_SYNC` flag on Linux.\\r\\n\\r\\nFixes https://github.com/golang/go/issues/35358\", \"created_at\": \"2020-05-25T17:35:28Z\", \"updated_at\": \"2020-05-26T20:02:04Z\", \"closed_at\": null, \"merged_at\": null, \"merge_commit_sha\": \"d1e46aa83ef6e4d86bc4d2d7a1d046e72d049ed8\", \"assignee\": null, \"assignees\": [], \"requested_reviewers\": [], \"requested_teams\": [], \"labels\": [ { \"id\": 831707000, \"node_id\": \"MDU6TGFiZWw4MzE3MDcwMDA=\", \"url\": \"https://api.github.com/repos/golang/go/labels/cla:%20yes\", \"name\": \"cla: yes\", \"color\": \"0e8a16\", \"default\": false, \"description\": \"Used by googlebot to label PRs as having a valid CLA. The text of this label should not change.\" } ], \"milestone\": null, \"draft\": false, \"commits_url\": \"https://api.github.com/repos/golang/go/pulls/39245/commits\", \"review_comments_url\": \"https://api.github.com/repos/golang/go/pulls/39245/comments\", \"review_comment_url\": \"https://api.github.com/repos/golang/go/pulls/comments{/number}\", \"comments_url\": \"https://api.github.com/repos/golang/go/issues/39245/comments\", \"statuses_url\": \"https://api.github.com/repos/golang/go/statuses/0a1a504fc27f345bd37fd48713f8f4fa9bffcf2d\", \"head\": { \"label\": \"jarifibrahim:windows_fsync\", \"ref\": \"windows_fsync\", \"sha\": \"0a1a504fc27f345bd37fd48713f8f4fa9bffcf2d\", \"user\": { \"login\": \"jarifibrahim\", \"id\": 12949454, \"node_id\": \"MDQ6VXNlcjEyOTQ5NDU0\", \"avatar_url\": \"https://avatars3.githubusercontent.com/u/12949454?v=4\", \"gravatar_id\": \"\", \"url\": \"https://api.github.com/users/jarifibrahim\", \"html_url\": \"https://github.com/jarifibrahim\", \"followers_url\": \"https://api.github.com/users/jarifibrahim/followers\", \"following_url\": \"https://api.github.com/users/jarifibrahim/following{/other_user}\", \"gists_url\": \"https://api.github.com/users/jarifibrahim/gists{/gist_id}\", \"starred_url\": \"https://api.github.com/users/jarifibrahim/starred{/owner}{/repo}\", \"subscriptions_url\": \"https://api.github.com/users/jarifibrahim/subscriptions\", \"organizations_url\": \"https://api.github.com/users/jarifibrahim/orgs\", \"repos_url\": \"https://api.github.com/users/jarifibrahim/repos\", \"events_url\": \"https://api.github.com/users/jarifibrahim/events{/privacy}\", \"received_events_url\": \"https://api.github.com/users/jarifibrahim/received_events\", \"type\": \"User\", \"site_admin\": false }, \"repo\": { \"id\": 266840318, \"node_id\": \"MDEwOlJlcG9zaXRvcnkyNjY4NDAzMTg=\", \"name\": \"go\", \"full_name\": \"jarifibrahim/go\", \"private\": false, \"owner\": { \"login\": \"jarifibrahim\", \"id\": 12949454, \"node_id\": \"MDQ6VXNlcjEyOTQ5NDU0\", \"avatar_url\": \"https://avatars3.githubusercontent.com/u/12949454?v=4\", \"gravatar_id\": \"\", \"url\": \"https://api.github.com/users/jarifibrahim\", \"html_url\": \"https://github.com/jarifibrahim\", \"followers_url\": \"https://api.github.com/users/jarifibrahim/followers\", \"following_url\": \"https://api.github.com/users/jarifibrahim/following{/other_user}\", \"gists_url\": \"https://api.github.com/users/jarifibrahim/gists{/gist_id}\", \"starred_url\": \"https://api.github.com/users/jarifibrahim/starred{/owner}{/repo}\", \"subscriptions_url\": \"https://api.github.com/users/jarifibrahim/subscriptions\", \"organizations_url\": \"https://api.github.com/users/jarifibrahim/orgs\", \"repos_url\": \"https://api.github.com/users/jarifibrahim/repos\", \"events_url\": \"https://api.github.com/users/jarifibrahim/events{/privacy}\", \"received_events_url\": \"https://api.github.com/users/jarifibrahim/received_events\", \"type\": \"User\", \"site_admin\": false }, \"html_url\": \"https://github.com/jarifibrahim/go\", \"description\": \"The Go programming language\", \"fork\": true, \"url\": \"https://api.github.com/repos/jarifibrahim/go\", \"forks_url\": \"https://api.github.com/repos/jarifibrahim/go/forks\", \"keys_url\": \"https://api.github.com/repos/jarifibrahim/go/keys{/key_id}\", \"collaborators_url\": \"https://api.github.com/repos/jarifibrahim/go/collaborators{/collaborator}\", \"teams_url\": \"https://api.github.com/repos/jarifibrahim/go/teams\", \"hooks_url\": \"https://api.github.com/repos/jarifibrahim/go/hooks\", \"issue_events_url\": \"https://api.github.com/repos/jarifibrahim/go/issues/events{/number}\", \"events_url\": \"https://api.github.com/repos/jarifibrahim/go/events\", \"assignees_url\": \"https://api.github.com/repos/jarifibrahim/go/assignees{/user}\", \"branches_url\": \"https://api.github.com/repos/jarifibrahim/go/branches{/branch}\", \"tags_url\": \"https://api.github.com/repos/jarifibrahim/go/tags\", \"blobs_url\": \"https://api.github.com/repos/jarifibrahim/go/git/blobs{/sha}\", \"git_tags_url\": \"https://api.github.com/repos/jarifibrahim/go/git/tags{/sha}\", \"git_refs_url\": \"https://api.github.com/repos/jarifibrahim/go/git/refs{/sha}\", \"trees_url\": \"https://api.github.com/repos/jarifibrahim/go/git/trees{/sha}\", \"statuses_url\": \"https://api.github.com/repos/jarifibrahim/go/statuses/{sha}\", \"languages_url\": \"https://api.github.com/repos/jarifibrahim/go/languages\", \"stargazers_url\": \"https://api.github.com/repos/jarifibrahim/go/stargazers\", \"contributors_url\": \"https://api.github.com/repos/jarifibrahim/go/contributors\", \"subscribers_url\": \"https://api.github.com/repos/jarifibrahim/go/subscribers\", \"subscription_url\": \"https://api.github.com/repos/jarifibrahim/go/subscription\", \"commits_url\": \"https://api.github.com/repos/jarifibrahim/go/commits{/sha}\", \"git_commits_url\": \"https://api.github.com/repos/jarifibrahim/go/git/commits{/sha}\", \"comments_url\": \"https://api.github.com/repos/jarifibrahim/go/comments{/number}\", \"issue_comment_url\": \"https://api.github.com/repos/jarifibrahim/go/issues/comments{/number}\", \"contents_url\": \"https://api.github.com/repos/jarifibrahim/go/contents/{+path}\", \"compare_url\": \"https://api.github.com/repos/jarifibrahim/go/compare/{base}...{head}\", \"merges_url\": \"https://api.github.com/repos/jarifibrahim/go/merges\", \"archive_url\": \"https://api.github.com/repos/jarifibrahim/go/{archive_format}{/ref}\", \"downloads_url\": \"https://api.github.com/repos/jarifibrahim/go/downloads\", \"issues_url\": \"https://api.github.com/repos/jarifibrahim/go/issues{/number}\", \"pulls_url\": \"https://api.github.com/repos/jarifibrahim/go/pulls{/number}\", \"milestones_url\": \"https://api.github.com/repos/jarifibrahim/go/milestones{/number}\", \"notifications_url\": \"https://api.github.com/repos/jarifibrahim/go/notifications{?since,all,participating}\", \"labels_url\": \"https://api.github.com/repos/jarifibrahim/go/labels{/name}\", \"releases_url\": \"https://api.github.com/repos/jarifibrahim/go/releases{/id}\", \"deployments_url\": \"https://api.github.com/repos/jarifibrahim/go/deployments\", \"created_at\": \"2020-05-25T17:29:38Z\", \"updated_at\": \"2020-05-25T17:29:40Z\", \"pushed_at\": \"2020-05-26T19:59:58Z\", \"git_url\": \"git://github.com/jarifibrahim/go.git\", \"ssh_url\": \"git@github.com:jarifibrahim/go.git\", \"clone_url\": \"https://github.com/jarifibrahim/go.git\", \"svn_url\": \"https://github.com/jarifibrahim/go\", \"homepage\": \"https://golang.org\", \"size\": 215186, \"stargazers_count\": 0, \"watchers_count\": 0, \"language\": null, \"has_issues\": false, \"has_projects\": true, \"has_downloads\": true, \"has_wiki\": true, \"has_pages\": false, \"forks_count\": 0, \"mirror_url\": null, \"archived\": false, \"disabled\": false, \"open_issues_count\": 0, \"license\": { \"key\": \"other\", \"name\": \"Other\", \"spdx_id\": \"NOASSERTION\", \"url\": null, \"node_id\": \"MDc6TGljZW5zZTA=\" }, \"forks\": 0, \"open_issues\": 0, \"watchers\": 0, \"default_branch\": \"master\" } }, \"base\": { \"label\": \"golang:master\", \"ref\": \"master\", \"sha\": \"20160b37c6b7d12e25987baf2d95ba861b327a3b\", \"user\": { \"login\": \"golang\", \"id\": 4314092, \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjQzMTQwOTI=\", \"avatar_url\": \"https://avatars3.githubusercontent.com/u/4314092?v=4\", \"gravatar_id\": \"\", \"url\": \"https://api.github.com/users/golang\", \"html_url\": \"https://github.com/golang\", \"followers_url\": \"https://api.github.com/users/golang/followers\", \"following_url\": \"https://api.github.com/users/golang/following{/other_user}\", \"gists_url\": \"https://api.github.com/users/golang/gists{/gist_id}\", \"starred_url\": \"https://api.github.com/users/golang/starred{/owner}{/repo}\", \"subscriptions_url\": \"https://api.github.com/users/golang/subscriptions\", \"organizations_url\": \"https://api.github.com/users/golang/orgs\", \"repos_url\": \"https://api.github.com/users/golang/repos\", \"events_url\": \"https://api.github.com/users/golang/events{/privacy}\", \"received_events_url\": \"https://api.github.com/users/golang/received_events\", \"type\": \"Organization\", \"site_admin\": false }, \"repo\": { \"id\": 23096959, \"node_id\": \"MDEwOlJlcG9zaXRvcnkyMzA5Njk1OQ==\", \"name\": \"go\", \"full_name\": \"golang/go\", \"private\": false, \"owner\": { \"login\": \"golang\", \"id\": 4314092, \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjQzMTQwOTI=\", \"avatar_url\": \"https://avatars3.githubusercontent.com/u/4314092?v=4\", \"gravatar_id\": \"\", \"url\": \"https://api.github.com/users/golang\", \"html_url\": \"https://github.com/golang\", \"followers_url\": \"https://api.github.com/users/golang/followers\", \"following_url\": \"https://api.github.com/users/golang/following{/other_user}\", \"gists_url\": \"https://api.github.com/users/golang/gists{/gist_id}\", \"starred_url\": \"https://api.github.com/users/golang/starred{/owner}{/repo}\", \"subscriptions_url\": \"https://api.github.com/users/golang/subscriptions\", \"organizations_url\": \"https://api.github.com/users/golang/orgs\", \"repos_url\": \"https://api.github.com/users/golang/repos\", \"events_url\": \"https://api.github.com/users/golang/events{/privacy}\", \"received_events_url\": \"https://api.github.com/users/golang/received_events\", \"type\": \"Organization\", \"site_admin\": false }, \"html_url\": \"https://github.com/golang/go\", \"description\": \"The Go programming language\", \"fork\": false, \"url\": \"https://api.github.com/repos/golang/go\", \"forks_url\": \"https://api.github.com/repos/golang/go/forks\", \"keys_url\": \"https://api.github.com/repos/golang/go/keys{/key_id}\", \"collaborators_url\": \"https://api.github.com/repos/golang/go/collaborators{/collaborator}\", \"teams_url\": \"https://api.github.com/repos/golang/go/teams\", \"hooks_url\": \"https://api.github.com/repos/golang/go/hooks\", \"issue_events_url\": \"https://api.github.com/repos/golang/go/issues/events{/number}\", \"events_url\": \"https://api.github.com/repos/golang/go/events\", \"assignees_url\": \"https://api.github.com/repos/golang/go/assignees{/user}\", \"branches_url\": \"https://api.github.com/repos/golang/go/branches{/branch}\", \"tags_url\": \"https://api.github.com/repos/golang/go/tags\", \"blobs_url\": \"https://api.github.com/repos/golang/go/git/blobs{/sha}\", \"git_tags_url\": \"https://api.github.com/repos/golang/go/git/tags{/sha}\", \"git_refs_url\": \"https://api.github.com/repos/golang/go/git/refs{/sha}\", \"trees_url\": \"https://api.github.com/repos/golang/go/git/trees{/sha}\", \"statuses_url\": \"https://api.github.com/repos/golang/go/statuses/{sha}\", \"languages_url\": \"https://api.github.com/repos/golang/go/languages\", \"stargazers_url\": \"https://api.github.com/repos/golang/go/stargazers\", \"contributors_url\": \"https://api.github.com/repos/golang/go/contributors\", \"subscribers_url\": \"https://api.github.com/repos/golang/go/subscribers\", \"subscription_url\": \"https://api.github.com/repos/golang/go/subscription\", \"commits_url\": \"https://api.github.com/repos/golang/go/commits{/sha}\", \"git_commits_url\": \"https://api.github.com/repos/golang/go/git/commits{/sha}\", \"comments_url\": \"https://api.github.com/repos/golang/go/comments{/number}\", \"issue_comment_url\": \"https://api.github.com/repos/golang/go/issues/comments{/number}\", \"contents_url\": \"https://api.github.com/repos/golang/go/contents/{+path}\", \"compare_url\": \"https://api.github.com/repos/golang/go/compare/{base}...{head}\", \"merges_url\": \"https://api.github.com/repos/golang/go/merges\", \"archive_url\": \"https://api.github.com/repos/golang/go/{archive_format}{/ref}\", \"downloads_url\": \"https://api.github.com/repos/golang/go/downloads\", \"issues_url\": \"https://api.github.com/repos/golang/go/issues{/number}\", \"pulls_url\": \"https://api.github.com/repos/golang/go/pulls{/number}\", \"milestones_url\": \"https://api.github.com/repos/golang/go/milestones{/number}\", \"notifications_url\": \"https://api.github.com/repos/golang/go/notifications{?since,all,participating}\", \"labels_url\": \"https://api.github.com/repos/golang/go/labels{/name}\", \"releases_url\": \"https://api.github.com/repos/golang/go/releases{/id}\", \"deployments_url\": \"https://api.github.com/repos/golang/go/deployments\", \"created_at\": \"2014-08-19T04:33:40Z\", \"updated_at\": \"2020-05-28T16:04:10Z\", \"pushed_at\": \"2020-05-28T14:45:33Z\", \"git_url\": \"git://github.com/golang/go.git\", \"ssh_url\": \"git@github.com:golang/go.git\", \"clone_url\": \"https://github.com/golang/go.git\", \"svn_url\": \"https://github.com/golang/go\", \"homepage\": \"https://golang.org\", \"size\": 215283, \"stargazers_count\": 72984, \"watchers_count\": 72984, \"language\": \"Go\", \"has_issues\": true, \"has_projects\": true, \"has_downloads\": true, \"has_wiki\": true, \"has_pages\": false, \"forks_count\": 10459, \"mirror_url\": null, \"archived\": false, \"disabled\": false, \"open_issues_count\": 5897, \"license\": { \"key\": \"other\", \"name\": \"Other\", \"spdx_id\": \"NOASSERTION\", \"url\": null, \"node_id\": \"MDc6TGljZW5zZTA=\" }, \"forks\": 10459, \"open_issues\": 5897, \"watchers\": 72984, \"default_branch\": \"master\" } }, \"_links\": { \"self\": { \"href\": \"https://api.github.com/repos/golang/go/pulls/39245\" }, \"html\": { \"href\": \"https://github.com/golang/go/pull/39245\" }, \"issue\": { \"href\": \"https://api.github.com/repos/golang/go/issues/39245\" }, \"comments\": { \"href\": \"https://api.github.com/repos/golang/go/issues/39245/comments\" }, \"review_comments\": { \"href\": \"https://api.github.com/repos/golang/go/pulls/39245/comments\" }, \"review_comment\": { \"href\": \"https://api.github.com/repos/golang/go/pulls/comments{/number}\" }, \"commits\": { \"href\": \"https://api.github.com/repos/golang/go/pulls/39245/commits\" }, \"statuses\": { \"href\": \"https://api.github.com/repos/golang/go/statuses/0a1a504fc27f345bd37fd48713f8f4fa9bffcf2d\" } }, \"author_association\": \"NONE\" }, { \"url\": \"https://api.github.com/repos/golang/go/pulls/39224\", \"id\": 422272499, \"node_id\": \"MDExOlB1bGxSZXF1ZXN0NDIyMjcyNDk5\", \"html_url\": \"https://github.com/golang/go/pull/39224\", \"diff_url\": \"https://github.com/golang/go/pull/39224.diff\", \"patch_url\": \"https://github.com/golang/go/pull/39224.patch\", \"issue_url\": \"https://api.github.com/repos/golang/go/issues/39224\", \"number\": 39224, \"state\": \"open\", \"locked\": false, \"title\": \"net/http: adds ability to marshall cookiejar to struct\", \"user\": { \"login\": \"infixint943\", \"id\": 45997896, \"node_id\": \"MDQ6VXNlcjQ1OTk3ODk2\", \"avatar_url\": \"https://avatars2.githubusercontent.com/u/45997896?v=4\", \"gravatar_id\": \"\", \"url\": \"https://api.github.com/users/infixint943\", \"html_url\": \"https://github.com/infixint943\", \"followers_url\": \"https://api.github.com/users/infixint943/followers\", \"following_url\": \"https://api.github.com/users/infixint943/following{/other_user}\", \"gists_url\": \"https://api.github.com/users/infixint943/gists{/gist_id}\", \"starred_url\": \"https://api.github.com/users/infixint943/starred{/owner}{/repo}\", \"subscriptions_url\": \"https://api.github.com/users/infixint943/subscriptions\", \"organizations_url\": \"https://api.github.com/users/infixint943/orgs\", \"repos_url\": \"https://api.github.com/users/infixint943/repos\", \"events_url\": \"https://api.github.com/users/infixint943/events{/privacy}\", \"received_events_url\": \"https://api.github.com/users/infixint943/received_events\", \"type\": \"User\", \"site_admin\": false }, \"body\": \"\", \"created_at\": \"2020-05-23T13:08:52Z\", \"updated_at\": \"2020-05-26T19:11:54Z\", \"closed_at\": null, \"merged_at\": null, \"merge_commit_sha\": \"b248bc674ab5a1815dd15daa0d038fd8beea74de\", \"assignee\": null, \"assignees\": [], \"requested_reviewers\": [], \"requested_teams\": [], \"labels\": [ { \"id\": 831707000, \"node_id\": \"MDU6TGFiZWw4MzE3MDcwMDA=\", \"url\": \"https://api.github.com/repos/golang/go/labels/cla:%20yes\", \"name\": \"cla: yes\", \"color\": \"0e8a16\", \"default\": false, \"description\": \"Used by googlebot to label PRs as having a valid CLA. The text of this label should not change.\" } ], \"milestone\": null, \"draft\": false, \"commits_url\": \"https://api.github.com/repos/golang/go/pulls/39224/commits\", \"review_comments_url\": \"https://api.github.com/repos/golang/go/pulls/39224/comments\", \"review_comment_url\": \"https://api.github.com/repos/golang/go/pulls/comments{/number}\", \"comments_url\": \"https://api.github.com/repos/golang/go/issues/39224/comments\", \"statuses_url\": \"https://api.github.com/repos/golang/go/statuses/7d6d3660808a18cef05e1c1e8220e704235eb3d4\", \"head\": { \"label\": \"infixint943:master\", \"ref\": \"master\", \"sha\": \"7d6d3660808a18cef05e1c1e8220e704235eb3d4\", \"user\": { \"login\": \"infixint943\", \"id\": 45997896, \"node_id\": \"MDQ6VXNlcjQ1OTk3ODk2\", \"avatar_url\": \"https://avatars2.githubusercontent.com/u/45997896?v=4\", \"gravatar_id\": \"\", \"url\": \"https://api.github.com/users/infixint943\", \"html_url\": \"https://github.com/infixint943\", \"followers_url\": \"https://api.github.com/users/infixint943/followers\", \"following_url\": \"https://api.github.com/users/infixint943/following{/other_user}\", \"gists_url\": \"https://api.github.com/users/infixint943/gists{/gist_id}\", \"starred_url\": \"https://api.github.com/users/infixint943/starred{/owner}{/repo}\", \"subscriptions_url\": \"https://api.github.com/users/infixint943/subscriptions\", \"organizations_url\": \"https://api.github.com/users/infixint943/orgs\", \"repos_url\": \"https://api.github.com/users/infixint943/repos\", \"events_url\": \"https://api.github.com/users/infixint943/events{/privacy}\", \"received_events_url\": \"https://api.github.com/users/infixint943/received_events\", \"type\": \"User\", \"site_admin\": false }, \"repo\": { \"id\": 266337753, \"node_id\": \"MDEwOlJlcG9zaXRvcnkyNjYzMzc3NTM=\", \"name\": \"go\", \"full_name\": \"infixint943/go\", \"private\": false, \"owner\": { \"login\": \"infixint943\", \"id\": 45997896, \"node_id\": \"MDQ6VXNlcjQ1OTk3ODk2\", \"avatar_url\": \"https://avatars2.githubusercontent.com/u/45997896?v=4\", \"gravatar_id\": \"\", \"url\": \"https://api.github.com/users/infixint943\", \"html_url\": \"https://github.com/infixint943\", \"followers_url\": \"https://api.github.com/users/infixint943/followers\", \"following_url\": \"https://api.github.com/users/infixint943/following{/other_user}\", \"gists_url\": \"https://api.github.com/users/infixint943/gists{/gist_id}\", \"starred_url\": \"https://api.github.com/users/infixint943/starred{/owner}{/repo}\", \"subscriptions_url\": \"https://api.github.com/users/infixint943/subscriptions\", \"organizations_url\": \"https://api.github.com/users/infixint943/orgs\", \"repos_url\": \"https://api.github.com/users/infixint943/repos\", \"events_url\": \"https://api.github.com/users/infixint943/events{/privacy}\", \"received_events_url\": \"https://api.github.com/users/infixint943/received_events\", \"type\": \"User\", \"site_admin\": false }, \"html_url\": \"https://github.com/infixint943/go\", \"description\": \"The Go programming language\", \"fork\": true, \"url\": \"https://api.github.com/repos/infixint943/go\", \"forks_url\": \"https://api.github.com/repos/infixint943/go/forks\", \"keys_url\": \"https://api.github.com/repos/infixint943/go/keys{/key_id}\", \"collaborators_url\": \"https://api.github.com/repos/infixint943/go/collaborators{/collaborator}\", \"teams_url\": \"https://api.github.com/repos/infixint943/go/teams\", \"hooks_url\": \"https://api.github.com/repos/infixint943/go/hooks\", \"issue_events_url\": \"https://api.github.com/repos/infixint943/go/issues/events{/number}\", \"events_url\": \"https://api.github.com/repos/infixint943/go/events\", \"assignees_url\": \"https://api.github.com/repos/infixint943/go/assignees{/user}\", \"branches_url\": \"https://api.github.com/repos/infixint943/go/branches{/branch}\", \"tags_url\": \"https://api.github.com/repos/infixint943/go/tags\", \"blobs_url\": \"https://api.github.com/repos/infixint943/go/git/blobs{/sha}\", \"git_tags_url\": \"https://api.github.com/repos/infixint943/go/git/tags{/sha}\", \"git_refs_url\": \"https://api.github.com/repos/infixint943/go/git/refs{/sha}\", \"trees_url\": \"https://api.github.com/repos/infixint943/go/git/trees{/sha}\", \"statuses_url\": \"https://api.github.com/repos/infixint943/go/statuses/{sha}\", \"languages_url\": \"https://api.github.com/repos/infixint943/go/languages\", \"stargazers_url\": \"https://api.github.com/repos/infixint943/go/stargazers\", \"contributors_url\": \"https://api.github.com/repos/infixint943/go/contributors\", \"subscribers_url\": \"https://api.github.com/repos/infixint943/go/subscribers\", \"subscription_url\": \"https://api.github.com/repos/infixint943/go/subscription\", \"commits_url\": \"https://api.github.com/repos/infixint943/go/commits{/sha}\", \"git_commits_url\": \"https://api.github.com/repos/infixint943/go/git/commits{/sha}\", \"comments_url\": \"https://api.github.com/repos/infixint943/go/comments{/number}\", \"issue_comment_url\": \"https://api.github.com/repos/infixint943/go/issues/comments{/number}\", \"contents_url\": \"https://api.github.com/repos/infixint943/go/contents/{+path}\", \"compare_url\": \"https://api.github.com/repos/infixint943/go/compare/{base}...{head}\", \"merges_url\": \"https://api.github.com/repos/infixint943/go/merges\", \"archive_url\": \"https://api.github.com/repos/infixint943/go/{archive_format}{/ref}\", \"downloads_url\": \"https://api.github.com/repos/infixint943/go/downloads\", \"issues_url\": \"https://api.github.com/repos/infixint943/go/issues{/number}\", \"pulls_url\": \"https://api.github.com/repos/infixint943/go/pulls{/number}\", \"milestones_url\": \"https://api.github.com/repos/infixint943/go/milestones{/number}\", \"notifications_url\": \"https://api.github.com/repos/infixint943/go/notifications{?since,all,participating}\", \"labels_url\": \"https://api.github.com/repos/infixint943/go/labels{/name}\", \"releases_url\": \"https://api.github.com/repos/infixint943/go/releases{/id}\", \"deployments_url\": \"https://api.github.com/repos/infixint943/go/deployments\", \"created_at\": \"2020-05-23T13:02:05Z\", \"updated_at\": \"2020-05-23T13:05:11Z\", \"pushed_at\": \"2020-05-23T13:04:55Z\", \"git_url\": \"git://github.com/infixint943/go.git\", \"ssh_url\": \"git@github.com:infixint943/go.git\", \"clone_url\": \"https://github.com/infixint943/go.git\", \"svn_url\": \"https://github.com/infixint943/go\", \"homepage\": \"https://golang.org\", \"size\": 215185, \"stargazers_count\": 0, \"watchers_count\": 0, \"language\": \"Go\", \"has_issues\": false, \"has_projects\": true, \"has_downloads\": true, \"has_wiki\": true, \"has_pages\": false, \"forks_count\": 0, \"mirror_url\": null, \"archived\": false, \"disabled\": false, \"open_issues_count\": 0, \"license\": { \"key\": \"other\", \"name\": \"Other\", \"spdx_id\": \"NOASSERTION\", \"url\": null, \"node_id\": \"MDc6TGljZW5zZTA=\" }, \"forks\": 0, \"open_issues\": 0, \"watchers\": 0, \"default_branch\": \"master\" } }, \"base\": { \"label\": \"golang:master\", \"ref\": \"master\", \"sha\": \"20160b37c6b7d12e25987baf2d95ba861b327a3b\", \"user\": { \"login\": \"golang\", \"id\": 4314092, \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjQzMTQwOTI=\", \"avatar_url\": \"https://avatars3.githubusercontent.com/u/4314092?v=4\", \"gravatar_id\": \"\", \"url\": \"https://api.github.com/users/golang\", \"html_url\": \"https://github.com/golang\", \"followers_url\": \"https://api.github.com/users/golang/followers\", \"following_url\": \"https://api.github.com/users/golang/following{/other_user}\", \"gists_url\": \"https://api.github.com/users/golang/gists{/gist_id}\", \"starred_url\": \"https://api.github.com/users/golang/starred{/owner}{/repo}\", \"subscriptions_url\": \"https://api.github.com/users/golang/subscriptions\", \"organizations_url\": \"https://api.github.com/users/golang/orgs\", \"repos_url\": \"https://api.github.com/users/golang/repos\", \"events_url\": \"https://api.github.com/users/golang/events{/privacy}\", \"received_events_url\": \"https://api.github.com/users/golang/received_events\", \"type\": \"Organization\", \"site_admin\": false }, \"repo\": { \"id\": 23096959, \"node_id\": \"MDEwOlJlcG9zaXRvcnkyMzA5Njk1OQ==\", \"name\": \"go\", \"full_name\": \"golang/go\", \"private\": false, \"owner\": { \"login\": \"golang\", \"id\": 4314092, \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjQzMTQwOTI=\", \"avatar_url\": \"https://avatars3.githubusercontent.com/u/4314092?v=4\", \"gravatar_id\": \"\", \"url\": \"https://api.github.com/users/golang\", \"html_url\": \"https://github.com/golang\", \"followers_url\": \"https://api.github.com/users/golang/followers\", \"following_url\": \"https://api.github.com/users/golang/following{/other_user}\", \"gists_url\": \"https://api.github.com/users/golang/gists{/gist_id}\", \"starred_url\": \"https://api.github.com/users/golang/starred{/owner}{/repo}\", \"subscriptions_url\": \"https://api.github.com/users/golang/subscriptions\", \"organizations_url\": \"https://api.github.com/users/golang/orgs\", \"repos_url\": \"https://api.github.com/users/golang/repos\", \"events_url\": \"https://api.github.com/users/golang/events{/privacy}\", \"received_events_url\": \"https://api.github.com/users/golang/received_events\", \"type\": \"Organization\", \"site_admin\": false }, \"html_url\": \"https://github.com/golang/go\", \"description\": \"The Go programming language\", \"fork\": false, \"url\": \"https://api.github.com/repos/golang/go\", \"forks_url\": \"https://api.github.com/repos/golang/go/forks\", \"keys_url\": \"https://api.github.com/repos/golang/go/keys{/key_id}\", \"collaborators_url\": \"https://api.github.com/repos/golang/go/collaborators{/collaborator}\", \"teams_url\": \"https://api.github.com/repos/golang/go/teams\", \"hooks_url\": \"https://api.github.com/repos/golang/go/hooks\", \"issue_events_url\": \"https://api.github.com/repos/golang/go/issues/events{/number}\", \"events_url\": \"https://api.github.com/repos/golang/go/events\", \"assignees_url\": \"https://api.github.com/repos/golang/go/assignees{/user}\", \"branches_url\": \"https://api.github.com/repos/golang/go/branches{/branch}\", \"tags_url\": \"https://api.github.com/repos/golang/go/tags\", \"blobs_url\": \"https://api.github.com/repos/golang/go/git/blobs{/sha}\", \"git_tags_url\": \"https://api.github.com/repos/golang/go/git/tags{/sha}\", \"git_refs_url\": \"https://api.github.com/repos/golang/go/git/refs{/sha}\", \"trees_url\": \"https://api.github.com/repos/golang/go/git/trees{/sha}\", \"statuses_url\": \"https://api.github.com/repos/golang/go/statuses/{sha}\", \"languages_url\": \"https://api.github.com/repos/golang/go/languages\", \"stargazers_url\": \"https://api.github.com/repos/golang/go/stargazers\", \"contributors_url\": \"https://api.github.com/repos/golang/go/contributors\", \"subscribers_url\": \"https://api.github.com/repos/golang/go/subscribers\", \"subscription_url\": \"https://api.github.com/repos/golang/go/subscription\", \"commits_url\": \"https://api.github.com/repos/golang/go/commits{/sha}\", \"git_commits_url\": \"https://api.github.com/repos/golang/go/git/commits{/sha}\", \"comments_url\": \"https://api.github.com/repos/golang/go/comments{/number}\", \"issue_comment_url\": \"https://api.github.com/repos/golang/go/issues/comments{/number}\", \"contents_url\": \"https://api.github.com/repos/golang/go/contents/{+path}\", \"compare_url\": \"https://api.github.com/repos/golang/go/compare/{base}...{head}\", \"merges_url\": \"https://api.github.com/repos/golang/go/merges\", \"archive_url\": \"https://api.github.com/repos/golang/go/{archive_format}{/ref}\", \"downloads_url\": \"https://api.github.com/repos/golang/go/downloads\", \"issues_url\": \"https://api.github.com/repos/golang/go/issues{/number}\", \"pulls_url\": \"https://api.github.com/repos/golang/go/pulls{/number}\", \"milestones_url\": \"https://api.github.com/repos/golang/go/milestones{/number}\", \"notifications_url\": \"https://api.github.com/repos/golang/go/notifications{?since,all,participating}\", \"labels_url\": \"https://api.github.com/repos/golang/go/labels{/name}\", \"releases_url\": \"https://api.github.com/repos/golang/go/releases{/id}\", \"deployments_url\": \"https://api.github.com/repos/golang/go/deployments\", \"created_at\": \"2014-08-19T04:33:40Z\", \"updated_at\": \"2020-05-28T16:04:10Z\", \"pushed_at\": \"2020-05-28T14:45:33Z\", \"git_url\": \"git://github.com/golang/go.git\", \"ssh_url\": \"git@github.com:golang/go.git\", \"clone_url\": \"https://github.com/golang/go.git\", \"svn_url\": \"https://github.com/golang/go\", \"homepage\": \"https://golang.org\", \"size\": 215283, \"stargazers_count\": 72984, \"watchers_count\": 72984, \"language\": \"Go\", \"has_issues\": true, \"has_projects\": true, \"has_downloads\": true, \"has_wiki\": true, \"has_pages\": false, \"forks_count\": 10459, \"mirror_url\": null, \"archived\": false, \"disabled\": false, \"open_issues_count\": 5897, \"license\": { \"key\": \"other\", \"name\": \"Other\", \"spdx_id\": \"NOASSERTION\", \"url\": null, \"node_id\": \"MDc6TGljZW5zZTA=\" }, \"forks\": 10459, \"open_issues\": 5897, \"watchers\": 72984, \"default_branch\": \"master\" } }, \"_links\": { \"self\": { \"href\": \"https://api.github.com/repos/golang/go/pulls/39224\" }, \"html\": { \"href\": \"https://github.com/golang/go/pull/39224\" }, \"issue\": { \"href\": \"https://api.github.com/repos/golang/go/issues/39224\" }, \"comments\": { \"href\": \"https://api.github.com/repos/golang/go/issues/39224/comments\" }, \"review_comments\": { \"href\": \"https://api.github.com/repos/golang/go/pulls/39224/comments\" }, \"review_comment\": { \"href\": \"https://api.github.com/repos/golang/go/pulls/comments{/number}\" }, \"commits\": { \"href\": \"https://api.github.com/repos/golang/go/pulls/39224/commits\" }, \"statuses\": { \"href\": \"https://api.github.com/repos/golang/go/statuses/7d6d3660808a18cef05e1c1e8220e704235eb3d4\" } }, \"author_association\": \"NONE\" }]";

    @Override
    public PullRequests getPullRequests(String owner, String repo, String state) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<PullRequest>>() {
        }.getType();
        List<PullRequest> pullRequests = gson.fromJson(json, listType);
        List<PullRequestModel> datalist = new ArrayList<>();
        for (PullRequest pr : pullRequests) {
            PullRequestModel.Builder builder = new PullRequestModel.Builder();
            builder.setTitle(pr.getTitle())
                    .setUserName(pr.getUser().getLogin())
                    .setUserImage(pr.getUser().getAvatarUrl())
                    .setCreatedDate(pr.getCreatedAt())
                    .setClosedDate(pr.getClosedAt());
            datalist.add(builder.createPrModel());
        }
        PullRequests.Builder builder = new PullRequests.Builder();
        builder.setPullRequestModels(datalist);
        return builder.build();
    }

    @Override
    public PullRequests getNextPage(String nextPageUrl) {
        return null;
    }
}