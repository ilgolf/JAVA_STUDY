package me.java.golf.study.step4.dashboard.domain;

import me.java.golf.study.step4.dashboard.domain.dto.ParticipateIssueDTO;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

public class ParticipationStatus {
    private final int issueSize;
    private final Map<String, Participants> participantList;

    public ParticipationStatus(Map<String, Participants> map, int issueSize) {
        this.issueSize = issueSize;
        this.participantList = map;
    }

    public static ParticipationStatus of(int issueSize) {
        return new ParticipationStatus(new HashMap<>(), issueSize);
    }

    public int getIssueSize() {
        return issueSize;
    }

    public void append(List<GHIssue> issues) {
        issues.forEach(this::append);
    }

    private void append(GHIssue issue) {
        try {
            issue.getComments()
                    .forEach(appendConsumer(issue));
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }

    private Consumer<GHIssueComment> appendConsumer(GHIssue issue) {
        return ghIssueComment ->  {
            ParticipateIssueDTO issueDTO = null;
            try {
                issueDTO = new ParticipateIssueDTO(ghIssueComment.getUser().getName(),
                        issue.getNumber());
            } catch (IOException e) {
                e.printStackTrace();
            }
            append(issueDTO);
        };
    }

    public void append(ParticipateIssueDTO dto) {
        Participants participants = get(dto.getName());
        participants.checkingParticipate(dto.getIssueNo(), issueSize);
    }

    private Participants get(String name) {
        Participants participants = participantList.get(name);
        if(Objects.isNull(participants)) {
            Participants of = Participants.of(name);
            participantList.put(name, of);
        }

        return participantList.get(name);
    }

    public void forEachByParticipants(Consumer<Participants> action) {
        participantList.values()
                .forEach(action);
    }
}
