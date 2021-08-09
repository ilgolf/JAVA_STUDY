package me.java.golf.study.step4.dashboard.domain;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.List;

public class Dashboard {
    public static final String REPOSITORY_PATH = "whiteship/live-study";
    private static String token = "토큰 값 입력";
    private final GitHub gitHub;
    private final GHRepository repository;

    public Dashboard() throws IOException {
        this.gitHub = init();
        this.repository = getRepo();
    }

    private GHRepository getRepo() throws IOException {
        return gitHub.getRepository(REPOSITORY_PATH);
    }

    private GitHub init() throws IOException {
        return new GitHubBuilder().withOAuthToken(token).build();
    }

    public int getIssueListSize() throws IOException {
        List<GHIssue> issues = getIssues();
        return issues.size();
    }

    private List<GHIssue> getIssues() throws IOException {
        return repository.listIssues(GHIssueState.ALL).toList();
    }

    public ParticipationStatus getParticipants() throws IOException {
        List<GHIssue> issues = getIssues();
        ParticipationStatus participationStatus = ParticipationStatus.of(issues.size());
        participationStatus.append(issues);

        return participationStatus;
    }
}
